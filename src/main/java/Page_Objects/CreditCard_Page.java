package Page_Objects;

import Reusable_Classes.Utils;
import org.openqa.selenium.By;

public class CreditCard_Page extends Utils {

    Checkout_Page checkout_page = new Checkout_Page();

    public  void userShouldAbleToClickOnCreditCardButton(){

        checkout_page.userShouldAbleToClickOnSecontDayAir();

        clickElement(By.id("paymentmethod_1"));

        clickElement(By.xpath("//*[@id=\"payment-method-buttons-container\"]/input"));
    }

}
