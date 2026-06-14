# bi-range-sum-lib

Maven Repository
1.  https://central.sonatype.com/namespace/io.github.sandeep-being-infinity
2.  https://central.sonatype.com/artifact/io.github.sandeep-being-infinity/bi-range-sum-lib/versions


## Use in your code

Pre-Requisites:  JAVA and MAVEN should be installed.

1. Create a maven project (Terminal/CmdPrompt)
   ```
   mvn -B archetype:generate \
    -DgroupId=com.example \
    -DartifactId=my-app \
    -DarchetypeArtifactId=maven-archetype-quickstart \
    -DarchetypeVersion=1.5
    ```
2.  Switch to project directory
    ```
    cd my-app
    ```
3.  Add Dependency in pom.xml
    ```
    <dependency>
        <groupId>io.github.sandeep-being-infinity</groupId>
        <artifactId>bi-range-sum-lib</artifactId>
        <version>2.0.0</version>
    </dependency>
    ```
4.  Add code in App.java
    ```
    package com.example;
    import io.github.sandeepbi.*;

    public class App {
        public static void main( String[] args){
            int a[] = {10, 20, -11, 21, -90, 2, 11, -9, -10};
            int n = a.length;
            IRangeQueries irq = new PrefixSumRangeQueries(a);
            System.out.println(irq.rangeSum(5));
            System.out.println(irq.rangeSum(3, 7));
        }
    }
    ```
5.  Run Project
    ```
    mvn clean compile exec:java -Dexec.mainClass="com.example.App" -q
    ```