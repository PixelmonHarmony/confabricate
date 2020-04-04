# Confabricate

A mod that provides Configurate, plus useful utilities, for a Fabric environment.

## Fabric-specific features

### TypeSerializers for:

- `Identifier`s
- Any item stored in a `Registry`
- `Text` (as json)

### NBT ConfigurationLoader

Translates back and forth between Configurate nodes and Minecraft's own NBT `Tags`

### DataFixerUpper integration

Thanks to @i509VCB for providing an initial implementation of DynamicOps

- DynamicOps implementation for ConfigurationNodes
- Basic integration between ConfigurationTransformations and DataFixers

### Configuration per-mod

- Utility methods in `Confabricate` to get a HOCON-format configuration


## How to use

Jar-in-jar

Versioning is intended to include the version of Configurate being built against, while allowing for fabric-specific API breakages

Gradle:

```kotlin

dependencies {
    include("ca.stellardrift:confabricate:[...]")
    modImplementation("ca.stellardrift:confabricate:[...]")
}
```
