
package ch.erni.microservicebase.Service;

import org.springframework.stereotype.Service;

import ch.erni.microservicebase.Model.Example;

@Service
public class ExampleServiceImpl implements ExampleService {

  // TODO 02 remove all formatting errors manually or if you are able to do so remove them with the eclipse formatter
  // TODO 04 remove all Bugs and technical debts findbugs tell you to do.

  @Override
  public Example getCompletedExample(String uncompleteExample) {
    if (uncompleteExample != null) {
      String completedExample = uncompleteExample.replaceAll("an", "");
      Example example = new Example();
      example.setCompletedExample(completedExample);
      return example;
    } else {
      throw new NullPointerException();
    }
  }
}
