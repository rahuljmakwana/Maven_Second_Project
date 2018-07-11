package Page_Objects;

import Reusable_Classes.Utils;
import org.openqa.selenium.By;

public class Checkout_Gest_Page extends Utils {

    ShoppingCart_Page shoppingCart_page = new ShoppingCart_Page();

    public  void userShouldAbleFillGestPage(){

        shoppingCart_page.userShouldAbleToFillAForm();

        clickElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[1]/div[3]/input[1]"));

    }



}
