# 3.3.1.3) Package Manager

A package manager or package-management system is a collection of software tools that automates the process of installing, upgrading, configuring, and removing computer programs for a computer's operating system in a consistent manner.

For Java, refering to this question on Stackoverflow: **Is there a package manager for Java like easy_install for Python?**

The most upvoted answer is: **Maven**!

<details open>
<summary>Table of Contents</summary>
<br>

[Maven](#h1)

[Creating a Project](#h2)

[The POM](#h3)

[Build the Project](#h4)

[Compile the Project](#h5)

[Running Maven Tools](#h6)

[Generating the Site](#h7)

[USEFULL LINKS](#h8)

</details>

<a name="h1"/>

**Maven:**

Apache Maven is a software project management and comprehension tool. Based on the concept of a project object model (POM), Maven can manage a project's build, reporting and documentation from a central piece of information.

After downloading and following the installation instructions, try the following command at cmd:
```
mvn --version
```

It should output:

![alt text](https://raw.githubusercontent.com/guidias1212/road_to_fullstack/master/images/maven.png)

<a name="h2"/>

**Creating a Project:**

You will need somewhere for your project to reside, create a directory somewhere and start a shell in that directory. On your command line, execute the following Maven goal:
```
mvn archetype:generate -DgroupId=com.mycompany.app -DartifactId=my-app -DarchetypeArtifactId=maven-archetype-quickstart -DarchetypeVersion=1.4 -DinteractiveMode=false
```

Obs.: Don't forget to choose the correct directory that you want the project to be created by using the "cd" command.

Under this directory you will notice the following standard project structure:

![alt text](https://raw.githubusercontent.com/guidias1212/road_to_fullstack/master/images/maven2.png)

You executed the Maven goal archetype:generate, and passed in various parameters to that goal. The prefix archetype is the plugin that provides the goal. If you are familiar with Ant, you may conceive of this as similar to a task. This archetype:generate goal created a simple project based upon a maven-archetype-quickstart archetype. Suffice it to say for now that a plugin is a collection of goals with a general common purpose. For example the jboss-maven-plugin, whose purpose is "deal with various jboss items".

The src/main/java directory contains the project source code, the src/test/java directory contains the test source, and the pom.xml file is the project's Project Object Model, or POM.

<a name="h3"/>

**The POM:**

The pom.xml file is the core of a project's configuration in Maven. It is a single configuration file that contains the majority of information required to build a project in just the way you want. The POM is huge and can be daunting in its complexity, but it is not necessary to understand all of the intricacies just yet to use it effectively.

<a name="h4"/>

**Build the Project:**

On the command line, at the same directory as POM.xml, type:
```
mvn package
```

Unlike the first command executed (archetype:generate) you may notice the second is simply a single word - package. Rather than a goal, this is a phase. A phase is a step in the build lifecycle, which is an ordered sequence of phases. When a phase is given, Maven will execute every phase in the sequence up to and including the one defined.

<a name="h5"/>

**Compile the Project:**

If we execute the compile phase, the phases that actually get executed are:

* validate
* generate-sources
* process-sources
* generate-resources
* process-resources
* compile

Compile command:
```
mvn compile
```

You may test the newly compiled and packaged JAR with the following command:
```
java -cp target/my-app-1.0-SNAPSHOT.jar com.mycompany.app.App
```

The output is:
```
Hello World!
```

<a name="h6"/>

**Running Maven Tools:**

These are the most common default lifecycle phases executed:

* **validate:** validate the project is correct and all necessary information is available
* **compile:** compile the source code of the project
* **test:** test the compiled source code using a suitable unit testing framework. These tests should not require the code be packaged or deployed
* **package:** take the compiled code and package it in its distributable format, such as a JAR.
* **integration-test:** process and deploy the package if necessary into an environment where integration tests can be run
* **verify:** run any checks to verify the package is valid and meets quality criteria
* **install:** install the package into the local repository, for use as a dependency in other projects locally
* **deploy:** done in an integration or release environment, copies the final package to the remote repository for sharing with other developers and projects.

<a name="h7"/>

**Generating the Site:**

```
mvn site
```

This phase generates a site based upon information on the project's pom. You can look at the documentation generated under target/site.

<a name="h8"/>

**USEFUL LINKS**

**Maven:**

https://maven.apache.org/

**Maven setup and tutorial:**

https://maven.apache.org/guides/getting-started/maven-in-five-minutes.html

**Recomended package manager for Java:**

https://stackoverflow.com/questions/2710266/is-there-a-package-manager-for-java-like-easy-install-for-python