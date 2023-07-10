package step_Definitions;


import Utilities.Driver;
import io.cucumber.java.After;

import io.cucumber.java.Scenario;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;


public class Hooks {


    @After(order = 1)
    public void teardownScenario(Scenario scenario) {


        if (scenario.isFailed()) {

            byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());

        }


        Driver.closeDriver();

    }

}
