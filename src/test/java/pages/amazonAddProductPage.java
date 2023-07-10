package pages;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class amazonAddProductPage {

    public amazonAddProductPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//img[@class='s-image']) [2]")
    public WebElement ikinciÜrünseç ;

    @FindBy(css = "input#add-to-wishlist-button")
    public WebElement ürünListeyeEkleIconu;

    @FindBy(xpath = "(//div[@class='a-fixed-left-grid-col a-col-right']) [2]")
    public WebElement selectVirgosol;

    @FindBy(css = "div#huc-atwl-header-section")
    public WebElement ürünListeyeEkleTeyidi;

    @FindBy(linkText = "Listenizi Görüntüleyin")
    public WebElement ListeniziGoruntuleyin;
}
