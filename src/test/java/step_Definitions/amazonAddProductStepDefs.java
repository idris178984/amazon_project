package step_Definitions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.amazonAddProductPage;

public class amazonAddProductStepDefs {

    amazonAddProductPage addProductPage = new amazonAddProductPage();

    @And("{int}.sayfanın açıldıgı kontrol edilir.")
    public void sayfanınAçıldıgıKontrolEdilir(int arg0) {

    }

    @Then("Sayfadaki ikinci ürün, oluşturulan {string} listesine eklenir.")
    public void sayfadakiIkinciÜrünOluşturulanListesineEklenir(String VirgosolListe) {
        addProductPage.ikinciÜrünseç.click();
        addProductPage.ürünListeyeEkleIconu.click();
        addProductPage.selectVirgosol.click();


    }

    @And("{int}.ürünün listeye eklendiği kontrol edilir.")
    public void ürününListeyeEklendiğiKontrolEdilir(int arg0) {
        String expectedText = "1 ürün şuraya eklendi:Virgosol Liste";
        String actualText = addProductPage.ürünListeyeEkleTeyidi.getText();
        System.out.println("expectedText = " + expectedText);
        System.out.println("actualText = " + actualText);
        Assert.assertEquals("1 ürün şuraya eklendi:Virgosol Liste", addProductPage.ürünListeyeEkleTeyidi.getText());
        addProductPage.ListeniziGoruntuleyin.click();
    }
}
