griffon.project.dependency.resolution = {
    inherits("global")
    log "warn" 
    repositories {
        def ant = new AntBuilder()
        ant.property(environment: 'env')
        def syntheticaHome = ant.antProject.properties.'env.SYNTHETICA_HOME'
        if(!syntheticaHome) {
            println '''
                Cannot locate Synthetica libraries.
                Define an environment variable $SYNTHETICA_HOME that points to a directory
                where Synthetica jar files can be located and try again.
           '''.stripIndent(16)
           System.exit(1)
        }

        griffonHome()
        String basePath = pluginDirPath? "${pluginDirPath}/" : ''
        flatDir name: "lookAndFeelSyntheticaLibDir", dirs: ["${syntheticaHome}/lookandfeel"]
    }
    dependencies {
        def ant = new AntBuilder()
        ant.property(environment: 'env')
        def syntheticaHome = ant.antProject.properties.'env.SYNTHETICA_HOME'
        File syntheticaLafDir = new File(syntheticaHome, 'lookandfeel')
        def nameVersionPattern = ~/^([\w][\w\.-]*)-([0-9][\w\.0-9\-]*)\.jar$/
        syntheticaLafDir.eachFileMatch(~/.*\.jar/) { jarFile ->
            def matcher = nameVersionPattern.matcher(jarFile.name)
            matcher.find()

              build("de.javasoft.synthetica:${matcher.group(1)}:${matcher.group(2)}")
            compile("de.javasoft.synthetica:${matcher.group(1)}:${matcher.group(2)}")
        }
    }
}

griffon {
    doc {
        logo = '<a href="http://griffon.codehaus.org" target="_blank"><img alt="The Griffon Framework" src="../img/griffon.png" border="0"/></a>'
        sponsorLogo = "<br/>"
        footer = "<br/><br/>Made with Griffon (@griffon.version@)"
    }
}

log4j = {
    // Example of changing the log pattern for the default console
    // appender:
    appenders {
        console name: 'stdout', layout: pattern(conversionPattern: '%d [%t] %-5p %c - %m%n')
    }

    error 'org.codehaus.griffon',
          'org.springframework',
          'org.apache.karaf',
          'groovyx.net'
    warn  'griffon'
}
