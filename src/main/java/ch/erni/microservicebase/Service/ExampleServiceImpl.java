package ch.erni.microservicebase.Service;

import ch.erni.microservicebase.Model.Example;
import org.springframework.stereotype.Service;

@Service
public class ExampleServiceImpl implements ExampleService {

    //TODO 02 remove all formatting errors manually or if you are able to do so remove them with the eclipse formatter
    //TODO 04 remove all Bugs and technical debts findbugs tell you to do.

    public Example getCompletedExample(String uncompleteExample) {
        Example example;
        if (uncompleteExample != null) {
            String completedExample = uncompleteExample.replaceAll("an", "");
            example = new Example();
            example.setCompletedExample(completedExample);
            return example;
        } else {
            throw new NullPointerException();
        }
    }

}
