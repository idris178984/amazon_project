package step_Definitions;

import Utilities.BrowserUtils;
import Utilities.ConfigurationReader;
import Utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.AmazonLoginPage;

public class amazonLoginStepDefinitions {

    AmazonLoginPage amazonLoginPage=new AmazonLoginPage();

    @Given("https:\\/\\/www.amazon.com.tr\\/ sitesi açılır.")
    public void https_www_amazon_com_tr_sitesi_açılır() {

        //Driver.getDriver().get("https://www.amazon.com.tr/");

       Driver.getDriver().get(ConfigurationReader.getProperty("amazon.url"));

    }
    @Then("Ana sayfanın açıldıgı kontrol edilir.")
    public void ana_sayfanın_açıldıgı_kontrol_edilir() {
        String expectedTitle="Amazon.com.tr: Elektronik, bilgisayar, akıllı telefon, kitap, oyuncak, yapı " +
                "market, ev, mutfak, oyun konsolları ürünleri ve daha fazlası için internet alışveriş sitesi";

       // String actualTitle=Driver.getDriver().getTitle();

       // System.out.println("actualTitle = " + actualTitle);
       // System.out.println("expectedTitle = " + expectedTitle);

       // Assert.assertEquals(expectedTitle,actualTitle);

        BrowserUtils.verifyTitle(expectedTitle);


    }
    @Then("Çerez tercihlerinden çerezler kabul et seçilir.")
    public void çerez_tercihlerinden_çerezler_kabul_et_seçilir() {
        amazonLoginPage.cerezlerikabulEt.click();



    }
    @When("Siteye login olunur.")
    public void siteye_login_olunur() {
        amazonLoginPage.hoverHesabım.click();
        BrowserUtils.sleep(5);
        amazonLoginPage.email.sendKeys("eylul178984@gmail.com"+ Keys.ENTER);
        amazonLoginPage.password.sendKeys("Saliheren44."+Keys.ENTER);
    }


}
