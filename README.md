Buildship Test Szenario: 

Preconditions: 

A Empty local Maven Repo, before 
Eclipse -> Preferences -> Download Artifact Sources is unchecked

Enviroment:

Eclipse Oxygen.2 Release (4.7.2)

m2e 1.8.2.20171007-021

Buildship 2.2.1.v20180125-1441

Gradle 4.3.1

Note: I had the same szeanrio in other Enviroments

Steps: 

1. First import test-m2e into Eclipse 
2. Then  import test-gradle into Eclipse 

Expectation:

When navigating /test-gradle/src/main/java/TestCli.java to the declaration example org.apache.commons.cli.Options to see the source code, which isn't the case.

Only after doing a Maven Update of /test-m2e the source code is downloaded.
