package ch.erni.microservicebase.Service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by buma on 19.01.2017.
 */
@RunWith(MockitoJUnitRunner.class)
public class ExampleServiceTests {


    private ExampleService exampleService = new ExampleServiceImpl();

    @Test
    public void getCompletedExample_with_correct_input_string_must_deliver_correct_output_message() {
        String testString = "I am an uncompleted example!";
        assertThat(exampleService.getCompletedExample(testString).getCompletedExample()).isEqualTo("I am  uncompleted example!");
    }

    @Test
    public void getCompletedExample_with_incorrect_input_string_must_deliver_correct_output_message() {
        String testString = "I am an full uncompleted example!";
        assertThat(exampleService.getCompletedExample(testString).getCompletedExample()).isNotEqualTo("I am an completed example!");
    }

    @Test(expected = NullPointerException.class)
    public void getCompletedExample_with_null_as_input_string_must_deliver_correct_output_message() {
        String testString = null;
        assertThat(exampleService.getCompletedExample(testString).getCompletedExample()).isNotEqualTo("I am an completed example!");
    }
}
