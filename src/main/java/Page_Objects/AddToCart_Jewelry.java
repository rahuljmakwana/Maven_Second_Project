package Page_Objects;

import Reusable_Classes.BasePage;
import Reusable_Classes.Utils;
import org.openqa.selenium.By;

public class AddToCart_Jewelry extends Utils {

    Home_Page home_page = new Home_Page();

    public void UserShouldAbleToAddTwoItemsInShoppingCart(){

        home_page.userShouldAbleToClickOnJewelery();

        clickElement(By.xpath("/html/body/div[6]/div[3]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div/div[2]/div[3]/div[2]/input[1]"));

        try {
            thread();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

         clickElement(By.xpath("/html/body/div[6]/div[3]/div[2]/div[2]/div/div[2]/div[3]/div/div[3]/div/div[2]/div[3]/div[2]/input[1]"));

         clickElement(By.xpath("//span[contains(text(),'Shopping cart')]"));
    }
}
