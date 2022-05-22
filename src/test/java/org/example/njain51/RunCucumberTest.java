package org.example.njain51;/**
 * @author : Nitin Jain
 * @mailto : official.nitinjain@gmail.com
 * @created : 5/22/2022, Sunday
 **/

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"classpath:features/BeerCans.feature"},
        glue = {"org.example.njain51.steps"})
public class RunCucumberTest {
}
