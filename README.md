# microservicebasetraining

This Project is to train how to build up a basic spring boot microservice with 
automated local quality controll. There are tod`os inside the code to explain further
workingsteps.

#### System requirements:


* Operation Systems: 		Windows (7, 8, 10), Linux Ubuntu, Mint
* Java:					Java 8 (version upgrade to nine still not complete)
* Maven: 					at least Maven 3 or higher

#### Install Java:

http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html

With windows you have simply to download and install the java jdk from the link and it is done.
After the installation you have to set the JAVA_HOME environment variable.
Here is a nice tutorial for this on windows
https://www.mkyong.com/java/how-to-set-java_home-on-windows-10/
Here is the same for Linux
https://askubuntu.com/questions/175514/how-to-set-java-home-for-java
When this is done we need Maven next.

#### Install Maven:

https://maven.apache.org/install.html you will find Maven here.
You have to unpack your package (like for Java you have to set the MAVEN_HOME also.
Heres a Tutorial to set the maven home: https://www.mkyong.com/maven/how-to-install-maven-in-windows/
here is one with also the linux way to do it: http://www.baeldung.com/install-maven-on-windows-linux-mac


# What we will do in this training:

In this training we will start to understand, why a proper setup is so important and how it is benefiting us in microservices as well as in other application approaches.

* 1. First we will start in the Pom File and activating the checkstyle again. After we activate the build. It should fail. Let us check why it fails. Why do you think a on this behalf forced stylecheck makes sence ?

* 2. Ok them let us fix the checkstyle ishues we have (they hide in the ExampleServiceImpl class). After fixing this we should have a stable build again.

* 3. Ok now we can do the next step, this will take us back to the pom file. We will activate the findbugs plugin. Now please do another build. It should fail. Lets see what the problem is, and think about, why a static code analysis already in the local build makes sence.

* 4. Fix the finbugs ishues (they hide in the ExampleServiceImpl class) and run the build again. Why is it an advantage to check this in such a early state?

* 5. Reactivate the the tests in the example controller test. They should be sucessful.

* 6. Check ExampleControllerTests for the last doing and answer the question.


Try Pull Request