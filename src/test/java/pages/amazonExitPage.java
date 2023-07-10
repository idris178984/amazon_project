package pages;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class amazonExitPage extends amazonBasePage {

    public amazonExitPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }



    @FindBy(xpath = "//*[@id=\"nav-item-signout\"]/span")
    public WebElement cıkıs;
}
