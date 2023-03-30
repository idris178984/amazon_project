package step_Definitions;

import Utilities.BrowserUtils;
import Utilities.ConfigurationReader;
import Utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import pages.AmazonHomePage;

public class amazonHomeStepDefinitions {

    AmazonHomePage amazonHomePage=new AmazonHomePage();

    @Then("login işlemi kontrol edilir")
    public void login_işlemi_kontrol_edilir() {
         BrowserUtils.waitForVisibility(amazonHomePage.siparişlerimText,10);
        BrowserUtils.verifyTitle("Siparişlerim");

    }

    @When("Hesabım bölümünden {string} isimli yeni bir liste oluşturulur.")
    public void hesabımBölümündenIsimliYeniBirListeOluşturulur(String cydeoList) {
        BrowserUtils.hover(amazonHomePage.hesapListeler);

        BrowserUtils.waitForVisibility(amazonHomePage.listeOluştur,5);
        amazonHomePage.listeOluştur.click();
        BrowserUtils.waitForVisibility(amazonHomePage.clearAVL,5);
        amazonHomePage.clearAVL.clear();
        amazonHomePage.clearAVL.sendKeys(cydeoList);
        amazonHomePage.YenilisteOluştur.click();

    }

    @Then("Arama butonu yanındaki katagoriler tabından bilgisayr seçilir.")
    public void aramaButonuYanındakiKatagorilerTabındanBilgisayrSeçilir() {
        Select select =new Select(amazonHomePage.dropDownKatagoriler);
        BrowserUtils.waitFor(5);

        select.selectByVisibleText("Bilgisayarlar");

    }

    @And("Bilgisayar kategorisi seçildiği kontrol edilir.")
    public void bilgisayarKategorisiSeçildiğiKontrolEdilir() {


    }

   

    @When("Arama alanına {string} yazılır ve arama yapılır.")
    public void aramaAlanınaYazılırVeAramaYapılır(String msi) {
        amazonHomePage.msi.sendKeys(msi+ Keys.ENTER);
    }

    @Then("Arama yapıldıgı kontrol edilir.")
    public void aramaYapıldıgıKontrolEdilir() {

        BrowserUtils.verifyTitle("Amazon.com.tr : msi");
    }



    @When("Arama sonuçları sayfasından {int}.sayfa seçilir.")
    public void aramaSonuçlarıSayfasındanSayfaSeçilir(int arg0) {
        amazonHomePage.ikinciSayfa.click();
    }

    @And("{int}.sayfanın açıldıgı kontrol edilir.")
    public void sayfanınAçıldıgıKontrolEdilir(int arg0) {

    }

    @Then("Sayfadaki ikinci ürün, oluşturulan {string} listesine eklenir.")
    public void sayfadakiIkinciÜrünOluşturulanListesineEklenir(String arg0) {
        amazonHomePage.ikinciÜrünseç.click();
        amazonHomePage.ürünListeyeEkleIconu.click();
        amazonHomePage.ürünListeyeEkle.click();


    }

    @And("{int}.ürünün listeye eklendiği kontrol edilir.")
    public void ürününListeyeEklendiğiKontrolEdilir(int arg0) {
        String expectedText="1 ürün şuraya eklendi:cydeo list";
        String actualText=amazonHomePage.ürünListeyeEkleTeyidi.getText();
        System.out.println("expectedText = " + expectedText);
        System.out.println("actualText = " + actualText);
        Assert.assertEquals("1 ürün şuraya eklendi:cydeo list",amazonHomePage.ürünListeyeEkleTeyidi.getText());
        amazonHomePage.ListeniziGoruntuleyin.click();
    }

    @When("Hesabım> Alışveriş listesi sayfasına gidilir.")
    public void hesabımAlışverişListesiSayfasınaGidilir() {
        BrowserUtils.hover(amazonHomePage.hesapListeler);
        BrowserUtils.waitForVisibility(amazonHomePage.CYDEO,5);
        amazonHomePage.CYDEO.click();
        
    }

    @Then("{string} sayfası açıldıgı kontrol edilir.")
    public void sayfasıAçıldıgıKontrolEdilir(String arg0) {
        Assert.assertEquals("cydeo list",amazonHomePage.alısVerisListesiTeyidi.getText());

    }

    @And("Eklenen ürün {string} sinden silinir.")
    public void eklenenÜrünSindenSilinir(String arg0) {
        amazonHomePage.kaldırBtn.click();
    }

    @Then("Silme işleminin gerçekleştiği kontrol edilir.")
    public void silmeIşlemininGerçekleştiğiKontrolEdilir() {
        String expectedUrunSilindi="Silindi";
        String actualUrunSilindi=amazonHomePage.urunSilindiKontrolu.getText();
        BrowserUtils.waitForVisibility(amazonHomePage.urunSilindiKontrolu,5);
        Assert.assertEquals("Silindi",amazonHomePage.urunSilindiKontrolu.getText());
    }

    @Then("Üye çıkış işlemi yapılır.")
    public void üyeÇıkışIşlemiYapılır() {
        BrowserUtils.hover(amazonHomePage.hesapListeler);
        BrowserUtils.waitForVisibility(amazonHomePage.cıkıs,3);
        amazonHomePage.cıkıs.click();
        
    }

    @And("Çıkış işleminin yapıldıgı kontrol edilir.")
    public void çıkışIşlemininYapıldıgıKontrolEdilir() {
        BrowserUtils.verifyTitle("Amazon Giriş Yap");
    }
}
