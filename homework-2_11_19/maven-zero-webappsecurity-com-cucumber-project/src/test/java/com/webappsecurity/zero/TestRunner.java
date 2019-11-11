package com.webappsecurity.zero;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = ".",
        plugin = {"pretty","html:target/cucumber-report"},
        dryRun = false
   //     monochrome = true,
    //    tags = "@Sanity"
)
public class TestRunner {
}
