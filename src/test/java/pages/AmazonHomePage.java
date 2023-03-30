package pages;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonHomePage {

    public AmazonHomePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//h1[.='Siparişlerim']")
    public WebElement siparişlerimText;

    @FindBy(xpath ="//a[@id='nav-link-accountList']")
    public WebElement hesapListeler;

    @FindBy(xpath = "//span[.='Liste Oluşturun']")
    public WebElement listeOluştur;

    @FindBy(xpath = "//input[@value='Alışveriş Listesi']")
    public WebElement clearAVL;

    @FindBy(xpath = "(//input[@class='a-button-input a-declarative']) [2]")
    public WebElement YenilisteOluştur;

    @FindBy(css = "select#searchDropdownBox")
    public WebElement dropDownKatagoriler;

    @FindBy(xpath = "//div[@class='s-heavy cards_carousel_widget-suggestion-header']")
    public WebElement alışVerişeBaşla;

    @FindBy(css = "input#twotabsearchtextbox")
    public WebElement msi;

    @FindBy(xpath = "//a[@aria-label='2 sayfasına git']")
    public WebElement ikinciSayfa;

    @FindBy(xpath = "(//img[@class='s-image']) [2]")
    public WebElement ikinciÜrünseç;

    @FindBy(css = "input#add-to-wishlist-button")
    public WebElement ürünListeyeEkleIconu;

    @FindBy(xpath = "//a[@class='a-link-normal a-dropdown-link']")
    public WebElement ürünListeyeEkle;

    @FindBy(css = "div#huc-atwl-header-section")
    public WebElement ürünListeyeEkleTeyidi;
    ////span[.='cydeo liste']

    @FindBy(xpath = "(//span[@class='nav-text']) [2]")
    public WebElement CYDEO;

    @FindBy(linkText = "Listenizi Görüntüleyin")
    public WebElement ListeniziGoruntuleyin;

    @FindBy(name = "submit.deleteItem")
    public WebElement kaldırBtn;


    @FindBy(css = "span#profile-list-name")
    public WebElement alısVerisListesiTeyidi;

    @FindBy(xpath = "(//div[@class='a-alert-content']) [18]")
    public WebElement urunSilindiKontrolu;

    @FindBy(xpath = "//*[@id=\"nav-item-signout\"]/span")
    public WebElement cıkıs;



}
