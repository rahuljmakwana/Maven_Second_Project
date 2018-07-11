package Page_Objects;

import Reusable_Classes.LoadProp;
import Reusable_Classes.Utils;
import com.google.common.base.Utf8;
import org.openqa.selenium.By;

public class ShoppingCart_Page extends Utils {

    AddToCart_Jewelry addToCart_jewelry = new AddToCart_Jewelry();

    LoadProp loadProp = new LoadProp();

    public void userShouldAbleToFillAForm(){


        addToCart_jewelry.UserShouldAbleToAddTwoItemsInShoppingCart();

         scrollPagep(0,300);

        selectByVisibleText(By.id("checkout_attribute_1"),"No");

        scrollPagep(0,100);

        selectByValue(By.id("CountryId"),"1");

         clearAndEnterText(By.xpath("//*[@id=\"ZipPostalCode\"]"),loadProp.getProperty("postcode"));

         clickElement(By.id("checkout"));

         clickElement(By.xpath("/html/body/div[7]/div[1]/button"));

         clickElement(By.id("termsofservice"));

         clickElement(By.id("checkout"));







    }
}
