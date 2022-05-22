package org.example.njain51;



import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/features/BeerCans.feature",
                   "src/test/resources/features/multiplication.feature",
        "src/test/resources/features/login.feature",
                "src/test/resources/features/login2.feature"},
        glue = "org.example.njain51.steps")
public class RunCucumberTest {
}
