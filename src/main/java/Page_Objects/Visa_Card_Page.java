package Page_Objects;

import Reusable_Classes.LoadProp;
import Reusable_Classes.Utils;
import org.openqa.selenium.By;

public class Visa_Card_Page extends Utils {

    LoadProp loadProp = new LoadProp();

    CreditCard_Page creditCard_page = new CreditCard_Page();

    public void userShouldAbleToFillAllDetailsOfVIsaCard(){

        creditCard_page.userShouldAbleToClickOnCreditCardButton();

        selectByValue(By.id("CreditCardType"),"visa");

        clearAndEnterText(By.id("CardholderName"),loadProp.getProperty("name"));

        clearAndEnterText(By.id("CardNumber"),loadProp.getProperty("cardnumber"));

        selectByValue(By.id("ExpireMonth"),"4");

        selectByValue(By.id("ExpireYear"),"2020");

        clearAndEnterText(By.id("CardCode"),loadProp.getProperty("cardcode"));

        clickElement(By.xpath("//*[@id=\"payment-info-buttons-container\"]/input"));



    }
}
