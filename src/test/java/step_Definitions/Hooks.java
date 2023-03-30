package step_Definitions;

import Utilities.BrowserUtils;
import Utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import pages.AmazonHomePage;

public class Hooks {

AmazonHomePage amazonHomePage=new AmazonHomePage();
    @After(order =0)
    public void removelist() {
//amazonHomePage.CYDEO.clear();

    }

    @After(order=1)
    public void teardownScenario(Scenario scenario) {

        //scenario.isFailed() --> if scenario fails this method will return TRUE boolean value

        if (scenario.isFailed()){

            byte [] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());

        }



        Driver.closeDriver();

        // System.out.println("====Closing browser using cucumber @After");
        // System.out.println("====Scenario ended/ Take screenshot if failed!");

    }

}
