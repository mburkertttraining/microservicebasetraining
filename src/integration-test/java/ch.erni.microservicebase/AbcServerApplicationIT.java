package ch.erni.microservicebase;

import ch.erni.microservicebase.ExampleApplication;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {ExampleApplication.class})
public class AbcServerApplicationIT {

    @Test
    @Ignore
    public void contextLoads() {
    }

}
