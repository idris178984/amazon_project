package pages;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class amazonCreateListPage {

    public amazonCreateListPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@id='nav-link-accountList']")
    public WebElement hesapListeler;

    @FindBy(xpath ="(//span[.='Bir liste oluştur']) [3]")
    public WebElement create_List;

    @FindBy(xpath = "//span[.='Liste Oluşturun']")
    public WebElement listeOluştur;

    @FindBy(xpath = "//input[@value='Alışveriş Listesi']")
    public WebElement clearAVL;

    @FindBy(xpath = "//span[@class='a-button a-button-primary']")
    public WebElement YenilisteOluştur;


}
