package pages;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class amazonDeleteProductPage {

    public amazonDeleteProductPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(css = "div[class='wl-list-entry-row-wrapper']")
    public WebElement alışVerişLİstTeyidi;


    @FindBy(name = "submit.deleteItem")
    public WebElement kaldırBtn;

    @FindBy(xpath = "(//div[.='Silindi']) [3]")
    public WebElement urunSilindiKontrolu;

}
