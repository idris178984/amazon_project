package pages;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonLoginPage {

    public AmazonLoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(className = "layoutToolbarPadding")
    public WebElement hoverHesabım;

    @FindBy(id = "sp-cc-accept")
    public WebElement cerezlerikabulEt;

    @FindBy(xpath = "//input[@type='email']")
    public WebElement email;

    @FindBy(xpath = "//input[@type='password']")
    public WebElement password;






}
