package step_Definitions;

import Utilities.BrowserUtils;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import pages.amazonMyAccountPage;

public class amazonMyAccountStepDefs {

    Logger logger = (Logger) LogManager.getLogger(amazonMyAccountStepDefs.class);

    amazonMyAccountPage hesabımPage = new amazonMyAccountPage();

    @When("Hesabım> Alışveriş listesi sayfasına gidilir.")
    public void hesabımAlışverişListesiSayfasınaGidilir() {
        BrowserUtils.hover(hesabımPage.hesapListeler);
        BrowserUtils.waitForVisibility(hesabımPage.VirgosolListe, 5);
        hesabımPage.VirgosolListe.click();

        logger.error("Error message is logged ", new RuntimeException("Null"));
        logger.info("Alış veriş sayfasına gidildi");

    }
}
