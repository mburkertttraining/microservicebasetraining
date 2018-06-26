package ch.erni.microservicebase.Controller;

import ch.erni.microservicebase.Model.Example;
import ch.erni.microservicebase.Service.ExampleService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by buma on 19.01.2017.
 */
@RunWith(MockitoJUnitRunner.class)
public class ExampleControllerTests {

    @Mock
    private ExampleService exampleService;

    private ExampleController exampleController;

    @Before
    public void setUp() {
        exampleController = new ExampleController(exampleService);
    }


    @Test
    public void exampleController_returns_correct_message() {
        Example testExample = new Example();
        testExample.setCompletedExample("I am a completed example!");
        Mockito.when(exampleService.getCompletedExample(Mockito.anyString())).thenReturn(testExample);

        String testResult = exampleController.exampleController();

        assertThat(testResult).isEqualTo("I am a completed example!");
    }

    @Test
    public void exampleController_returns_wrong_message() {
        Example testExample = new Example();
        testExample.setCompletedExample("I am a completed example to trick you!");
        Mockito.when(exampleService.getCompletedExample(Mockito.anyString())).thenReturn(testExample);

        String testResult = exampleController.exampleController();

        assertThat(testResult).isNotEqualTo("I am a completed example!");
    }
}
