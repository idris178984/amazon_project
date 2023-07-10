package pages;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class amazonBasePage {

    public amazonBasePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(className = "layoutToolbarPadding")
    public WebElement hoverHesabım;

    @FindBy(xpath = "//input[@type='email']")
    public WebElement email;

    @FindBy(xpath = "//input[@type='password']")
    public WebElement password ;

    @FindBy(id = "sp-cc-accept")
    public WebElement cerezlerikabulEt;

    @FindBy(xpath ="//a[@id='nav-link-accountList']")
    public WebElement hesapListeler;
}
