package ch.erni.microservicebase.Service;

import ch.erni.microservicebase.Model.Example;
import org.springframework.stereotype.Service;

@Service
public class ExampleServiceImpl implements ExampleService {

    //_TODO 02 remove all formatting errors manually or if you are able to do so remove them with the eclipse formatter
    //_TODO 04 remove all Bugs and technical debts findbugs tell you to do.

    public Example getCompletedExample(String uncompleteExample) {
//        Example example = new Example();
        if (uncompleteExample != null) {
            String completedExample = uncompleteExample.replaceAll("un", "");
            Example example = new Example();
            example.setCompletedExample(completedExample);
            return example;
        } else {
            throw new NullPointerException();
        }
    }

}
