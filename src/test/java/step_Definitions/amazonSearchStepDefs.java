package step_Definitions;

import Utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.ui.Select;
import pages.amazonSearchPage;

public class amazonSearchStepDefs {

    Logger logger = (Logger) LogManager.getLogger(amazonSearchStepDefs.class);

    amazonSearchPage searchPage = new amazonSearchPage();

    @Then("Arama butonu yanındaki katagoriler tabından bilgisayr seçilir.")
    public void aramaButonuYanındakiKatagorilerTabındanBilgisayrSeçilir() {
        Select select = new Select(searchPage.dropDownKatagoriler);
        BrowserUtils.waitFor(5);
        select.selectByVisibleText("Bilgisayarlar");

        logger.info("Dropdown işlemi başarılı");
        logger.error("Error message is logged ", new NoSuchElementException("Null"));

    }

    @And("Bilgisayar kategorisi seçildiği kontrol edilir.")
    public void bilgisayarKategorisiSeçildiğiKontrolEdilir() {



    }


    @When("Arama alanına {string} yazılır ve arama yapılır.")
    public void aramaAlanınaYazılırVeAramaYapılır(String msi) {
        searchPage.msi.sendKeys(msi + Keys.ENTER);

    }

    @Then("Arama yapıldıgı kontrol edilir.")
    public void aramaYapıldıgıKontrolEdilir() {

        BrowserUtils.verifyTitle("Amazon.com.tr : msi");
    }


    @When("Arama sonuçları sayfasından {int}.sayfa seçilir.")
    public void aramaSonuçlarıSayfasındanSayfaSeçilir(int arg0) {
        searchPage.ikinciSayfa.click();

        logger.info("2. sayfa seçildi");
        logger.error("Error message is logged ", new RuntimeException());
    }
}
