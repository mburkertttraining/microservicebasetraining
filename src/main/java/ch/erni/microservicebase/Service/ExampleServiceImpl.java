package ch.erni.microservicebase.Service;

import ch.erni.microservicebase.Model.Example;
import org.springframework.stereotype.Service;

@Service
public class ExampleServiceImpl implements ExampleService {

    public Example getCompletedExample(String uncompleteExample) {
        if (uncompleteExample == null) {
            throw new NullPointerException("uncompleteExample is null");
        }
        Example example = new Example();
        example.setCompletedExample(uncompleteExample.replaceAll("an", ""));
        return example;
    }

}
