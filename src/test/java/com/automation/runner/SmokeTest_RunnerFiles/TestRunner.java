package com.automation.runner.SmokeTest_RunnerFiles;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


/**
 * @author Purna
 * This is a TestRunnerclass
 */
@RunWith(Cucumber.class)

@CucumberOptions(
        features = "Features",
<<<<<<< HEAD
        tags = {"@Test9UAT"},
       // ={"json:targt/cucumber.json"},
=======
        tags = {"@Test2UAT"},
       // ={"json:target/cucumber.json"},
>>>>>>> 3c90d523a147957de4f17e725899bbaffbb10d85
        plugin={"json:target/cucumber.json"},

        glue = {"com/automation/stepDefinations"},
        monochrome = true,
        strict = true,
       dryRun = false


)


public class TestRunner{



}

