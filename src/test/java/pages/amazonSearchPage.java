package pages;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class amazonSearchPage {

    public amazonSearchPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(css = "select#searchDropdownBox")
    public WebElement dropDownKatagoriler;

    @FindBy(css = "input#twotabsearchtextbox")
    public WebElement msi;

    @FindBy(xpath = "//a[@aria-label='2 sayfasına git']")
    public WebElement ikinciSayfa;


}
