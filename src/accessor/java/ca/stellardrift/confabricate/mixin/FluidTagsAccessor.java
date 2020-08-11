package ca.stellardrift.confabricate.mixin;

import net.minecraft.fluid.Fluid;
import net.minecraft.tag.FluidTags;
import net.minecraft.tag.RequiredTagList;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(FluidTags.class)
public interface FluidTagsAccessor {

    @Accessor("REQUIRED_TAGS")
    static RequiredTagList<Fluid> getRequiredTags() {
        throw new AssertionError();
    }

}
