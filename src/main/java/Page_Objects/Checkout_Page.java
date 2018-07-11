package Page_Objects;

import Reusable_Classes.Utils;
import org.openqa.selenium.By;

public class Checkout_Page extends Utils {

    ShoppingCart_Register  shoppingCart_register = new ShoppingCart_Register();

    public void userShouldAbleToClickOnSecontDayAir(){

        shoppingCart_register.userShouldAbleToFilRegisterPage();

        clickElement(By.id("shippingoption_2"));

        clickElement(By.xpath("//*[@id=\"shipping-method-buttons-container\"]/input"));
    }
}
