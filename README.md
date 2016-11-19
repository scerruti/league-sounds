League Sounds
=============

This project provides a jar with sound files for use in student projects.

#Usage
## Add Dependency
To make use of this file include the dependency in your pom.xml
```xml
<dependency>
    <groupId>org.jointheleague.resources</groupId>
    <artifact.id>league-sounds</artifact.id>
    <version>1.0</version>
</dependency>
```
##Add and Configure Plugin
Next, add the following plugin to your `<build>` block to incorporate these sounds in your project.
```xml
<plugin>
    <groupId>org.apache.maven.plugins</groupId>
    <artifactId>maven-remote-resources-plugin</artifactId>
    <version>1.5</version>
    <configuration>
        <resourceBundles>
            <resourceBundle>org.jointheleague.resources:league-sounds:0.1.1-SNAPSHOT</resourceBundle>
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
##Add Repository
You may also need to add the League's repository manager. **(Not currently available.)**
```xml
<repositories>
    <repository>
      <id>league-repository</id>
      <name>Nexus Join the League</name>
      <url>http://nexus.jointheleague.org:8081</url>
    </repository>
</repositories>
```