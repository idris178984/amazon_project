package step_Definitions;

import Utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.junit.Assert;
import org.openqa.selenium.NoSuchElementException;
import pages.amazonDeleteProductPage;

public class amazonDeleteProductStepDefs {

    Logger logger = (Logger) LogManager.getLogger(amazonDeleteProductStepDefs.class);

    amazonDeleteProductPage deleteProductPage = new amazonDeleteProductPage();

    @Then("{string} sayfası açıldıgı kontrol edilir.")
    public void sayfasıAçıldıgıKontrolEdilir(String arg0) {
        BrowserUtils.waitForVisibility(deleteProductPage.alışVerişLİstTeyidi, 10);
        Assert.assertEquals("Virgosol Liste", deleteProductPage.alışVerişLİstTeyidi.getText());

        logger.info("Sayfa basarılı bir şekilde acıldı");
        logger.error("Error message is logged ", new RuntimeException("Null"));
    }

    @And("Eklenen ürün {string} sinden silinir.")
    public void eklenenÜrünSindenSilinir(String VirgosolListe) {
        deleteProductPage.kaldırBtn.click();

        logger.info("Eklenen urun Virgosol listesinden silindi");
        logger.error("Error message is logged ", new NoSuchElementException("Null"));
    }

    @Then("Silme işleminin gerçekleştiği kontrol edilir.")
    public void silmeIşlemininGerçekleştiğiKontrolEdilir() {
        String expectedUrunSilindi = "Silindi";
        BrowserUtils.waitForVisibility(deleteProductPage.urunSilindiKontrolu, 5);
        String actualUrunSilindi = deleteProductPage.urunSilindiKontrolu.getText();
        BrowserUtils.waitForVisibility(deleteProductPage.urunSilindiKontrolu, 5);
        Assert.assertEquals("Silindi", deleteProductPage.urunSilindiKontrolu.getText());

        logger.error("Error message is logged ", new RuntimeException("Time out"));
    }


}
