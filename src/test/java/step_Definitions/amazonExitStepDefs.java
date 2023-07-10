package step_Definitions;

import Utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import pages.amazonExitPage;

public class amazonExitStepDefs {

    Logger logger = (Logger) LogManager.getLogger(amazonExitStepDefs.class);

    amazonExitPage exitPage = new amazonExitPage();

    @Then("Üye çıkış işlemi yapılır.")
    public void üyeÇıkışIşlemiYapılır() {
        BrowserUtils.hover(exitPage.hesapListeler);
        BrowserUtils.waitForVisibility(exitPage.cıkıs, 3);
        exitPage.cıkıs.click();

        logger.error("Error message is logged ", new RuntimeException("Null"));

    }

    @And("Çıkış işleminin yapıldıgı kontrol edilir.")
    public void çıkışIşlemininYapıldıgıKontrolEdilir() {
        BrowserUtils.verifyTitle("Amazon Giriş Yap");

        logger.info("Good job");
    }
}
