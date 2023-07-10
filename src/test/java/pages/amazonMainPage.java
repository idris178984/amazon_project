package pages;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class amazonMainPage extends amazonBasePage{

    public amazonMainPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//h1[.='Siparişlerim']")
    public WebElement siparişlerimText;

}
