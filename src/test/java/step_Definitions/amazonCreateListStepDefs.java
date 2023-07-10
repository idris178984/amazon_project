package step_Definitions;

import Utilities.BrowserUtils;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.openqa.selenium.NoSuchElementException;
import pages.amazonCreateListPage;

public class amazonCreateListStepDefs {

    Logger logger = (Logger) LogManager.getLogger(amazonCreateListStepDefs.class);

    amazonCreateListPage listeOlusturPage= new amazonCreateListPage();

    @When("Hesabım bölümünden {string} isimli yeni bir liste oluşturulur.")
    public void hesabımBölümündenIsimliYeniBirListeOluşturulur(String VirgosolListe) {

        BrowserUtils.hover(listeOlusturPage.hesapListeler);

        BrowserUtils.waitForVisibility(listeOlusturPage.listeOluştur,5);
        listeOlusturPage.listeOluştur.click();
        BrowserUtils.waitForVisibility(listeOlusturPage.create_List,5);
        listeOlusturPage.create_List.click();
        BrowserUtils.waitForVisibility(listeOlusturPage.clearAVL,5);
        listeOlusturPage.clearAVL.clear();
        listeOlusturPage.clearAVL.sendKeys(VirgosolListe);
        BrowserUtils.waitForVisibility(listeOlusturPage.YenilisteOluştur,5);
        listeOlusturPage.YenilisteOluştur.click();

        logger.info("Liste basarılı bir sekilde create edildi");
        logger.error("Error message is logged ", new NoSuchElementException("Null Error"));

    }

}
