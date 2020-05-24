/*
 * Copyright 2020 zml
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package ca.stellardrift.confabricate;

import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.MapLike;
import ninja.leaping.configurate.ConfigurationNode;

import java.util.stream.Stream;

/**
 * View of a configuration node in its map representation.
 */
final class NodeMaplike implements MapLike<ConfigurationNode> {

    private final ConfigurationNode node;

    NodeMaplike(final ConfigurationNode node) {
        this.node = node;
    }

    @Override
    public ConfigurationNode get(final ConfigurationNode key) {
        return this.node.getNode(ConfigurateOps.keyFrom(key));
    }

    @Override
    public ConfigurationNode get(final String key) {
        return this.node.getNode(key);
    }

    @Override
    public Stream<Pair<ConfigurationNode, ConfigurationNode>> entries() {
        return this.node.getChildrenMap().entrySet().stream()
                .map(ent -> Pair.of(ConfigurationNode.root(this.node.getOptions()).setValue(ent.getKey()), ent.getValue()));
    }

}
