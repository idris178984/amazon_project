package step_Definitions;

import Utilities.BrowserUtils;
import Utilities.ConfigurationReader;
import Utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import pages.amazonMainPage;

public class amazonMainPageStepDefs {

    Logger logger = (Logger) LogManager.getLogger(amazonMainPageStepDefs.class);

    amazonMainPage mainPage = new amazonMainPage();

    @Given("https:\\/\\/www.amazon.com.tr\\/ sitesi açılır.")
    public void https_www_amazon_com_tr_sitesi_açılır() {

        Driver.getDriver().get(ConfigurationReader.getProperty("amazon.url"));
        logger.info("The user opens amazon main page " + ConfigurationReader.getProperty("amazon.url"));
        logger.error("Error message is logged ", new NullPointerException("Null Error"));

    }

    @Then("Ana sayfanın açıldıgı kontrol edilir.")
    public void ana_sayfanın_açıldıgı_kontrol_edilir() {
        String expectedTitle = "Amazon.com.tr: Elektronik, bilgisayar, akıllı telefon, kitap, oyuncak, yapı " +
                "market, ev, mutfak, oyun konsolları ürünleri ve daha fazlası için internet alışveriş sitesi";
        BrowserUtils.verifyTitle(expectedTitle);
        logger.info("Login islemi teyit edildi.");
        logger.error("Error message is logged ", new RuntimeException("Null Error"));
    }

    @Then("Çerez tercihlerinden çerezler kabul et seçilir.")
    public void çerez_tercihlerinden_çerezler_kabul_et_seçilir() {
        mainPage.cerezlerikabulEt.click();
        logger.error("Error message is logged ", new NullPointerException("Null Error"));
    }

    @When("Siteye login olunur.")
    public void siteye_login_olunur() {
        mainPage.hoverHesabım.click();
        BrowserUtils.waitForVisibility(mainPage.email, 2);
        mainPage.email.sendKeys("QidrisA@gmail.com" + Keys.ENTER);
        mainPage.password.sendKeys("Virgosol12." + Keys.ENTER);

        logger.info("Login islemi basarılı.");
        logger.error("Error message is logged ", new Exception("Kayıtlı olmayan mail adresi"));
    }

    @Then("login işlemi kontrol edilir")
    public void login_işlemi_kontrol_edilir() {
        BrowserUtils.waitForVisibility(mainPage.siparişlerimText, 10);
        BrowserUtils.verifyTitle("Siparişlerim");
        logger.error("Bulunamayan gettext ", new NoSuchElementException("Null"));

    }
}
