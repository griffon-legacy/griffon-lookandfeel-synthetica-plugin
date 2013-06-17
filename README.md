
Pluggable Look & Feel based on Synthetica
-----------------------------------------

Plugin page: [http://artifacts.griffon-framework.org/plugin/lookandfeel-synthetica](http://artifacts.griffon-framework.org/plugin/lookandfeel-synthetica)


Pluggable Look & Feel based on [Synthetica][1].

Usage
-----

This plugin requires a local installation of the Synthetica libraries following a naming convention. First, there must be a
root directory for Synthetica that is readable, for example `/usr/local/synthetica`. Next there must be a subdirectory name
`lookandfeel` that contains the synthetica.jar and any Synthetica theme jar. Each jar must follow a naming convention too,
which is `${name}-${version}.jar`. Finally, there must be an environment variable name $SYNTHETICA_HOME that points to the
synthetica root directory.

Jyloo distributes all of its jars without a version number. However the number is found in the packaging file (typically a zip file).

Refer to the [lookandfeel][2] plugin to find out how setup `lookAndFeel` and `theme` properties in the configuration.

LookAndFeel and Themes
----------------------

| *LookAndFeel* | *Theme*         |
| ------------- | --------------- |
| Synthetica    | Synthetica      |
|               | Black Eye       |
|               | Black Moon      |
|               | Black Star      |
|               | Blue Ice        |
|               | Blue Moon       |
|               | Blue Steel      |
|               | Classy          |
|               | Green Dream     |
|               | Mauve Metallic  |
|               | Orange Metallic |
|               | Silver Moon     |
|               | Simple2D        |
|               | Sky Metallic    |

[1]: http://www.jyloo.com/synthetica/
[2]: /plugin/lookandfeel

