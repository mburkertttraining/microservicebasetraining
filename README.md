# microservicebasetraining

This Project is to train how to build up a basic spring boot microservice with 
automated local quality controll. There are tod`os inside the code to explain further
workingsteps.

System requirements:

Operation Systems: 		Windows (7, 8, 10), Linux Ubuntu, Mint
Java:					Java 8 (version upgrade to nine still not complete)
Maven: 					at least Maven 3 or higher


What we will do in this training:

In this training we will start to understand, why a proper setup is so important and how it is benefiting us in microservices as well as in other application approaches.

1. First we will start in the Pom File and activating the checkstyle again. After we activate the build. It should fail. Let us check why it fails. Why do you think a on this behalf forced stylecheck makes sence ?

2. Ok them let us fix the checkstyle ishues we have (they hide in the ExampleServiceImpl class). After fixing this we should have a stable build again.

3. Ok now we can do the next step, this will take us back to the pom file. We will activate the findbugs plugin. Now please do another build. It should fail. Lets see what the problem is, and think about, why a static code analysis already in the local build makes sence.

4. Fix the finbugs ishues (they hide in the ExampleServiceImpl class) and run the build again. Why is it an advantage to check this in such a early state?

5. Reactivate the the tests in the example controller test. They should be sucessful.

6. Check ExampleControllerTests for the last doing and answer the question.


