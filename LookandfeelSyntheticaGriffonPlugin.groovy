/*
 * Copyright 2011-2012 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
 * @author Andres Almiray
 */
class LookandfeelSyntheticaGriffonPlugin {
    // the plugin version
    String version = '0.3'
    // the version or versions of Griffon the plugin is designed for
    String griffonVersion = '0.9.5 > *'
    // the other plugins this plugin depends on
    Map dependsOn = [lookandfeel: '0.6']
    // resources that are included in plugin packaging
    List pluginIncludes = []
    // the plugin license
    String license = 'Apache Software License 2.0'
    // Toolkit compatibility. No value means compatible with all
    // Valid values are: swing, javafx, swt, pivot, gtk
    List toolkits = ['swing']
    // Platform compatibility. No value means compatible with all
    // Valid values are:
    // linux, linux64, windows, windows64, macosx, macosx64, solaris
    List platforms = []
    // URL where documentation can be found
    String documentation = ''
    // URL where source can be found
    String source = 'https://github.com/griffon/griffon-lookandfeel-syntehtica-plugin'

    List authors = [
        [
            name: 'Andres Almiray',
            email: 'aalmiray@yahoo.com'
        ]
    ]
    String title = 'Pluggable Look & Feel based on Synthetica'
    String description = '''
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
'''
}
