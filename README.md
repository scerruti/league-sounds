League Sounds
=============

This project provides a jar with sound files for use in student projects.

#Usage

To make use of this file include the dependency in your pom.xml
```xml
<dependency>
    <groupId>org.jointheleague.resources</groupId>
    <artifact.id>league-sounds</artifact.id>
    <version>1.0</version>
</dependency>
```

You make need to also add the League's repository manager.
```xml
<repositories>
    <repository>
      <id>league-repository</id>
      <name>Nexus Join the League</name>
      <url>http://nexus.jointheleague.org:8081</url>
    </repository>
</repositories>
```

Next, add the following plugin to your `<build>` block to incorporate these sounds in your project.
```xml
<plugin>
    <groupId>org.apache.maven.plugins</groupId>
    <artifactId>maven-remote-resources-plugin</artifactId>
    <version>1.5</version>
    <configuration>
        <resourceBundles>
            <resourceBundle>org.test:shared-resources:${project.version}</resourceBundle>
        </resourceBundles>
    </configuration>
    <executions>
        <execution>
            <goals>
                <goal>process</goal>
            </goals>
        </execution>
    </executions>
</plugin>
```