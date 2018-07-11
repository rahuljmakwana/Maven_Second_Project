package Page_Objects;

import Reusable_Classes.LoadProp;
import Reusable_Classes.Utils;
import org.openqa.selenium.By;

public class Home_Page extends Utils {
    LoadProp loadProp = new LoadProp();

    public void userShouldAbleToClickOnJewelery(){
        clickElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[6]/a"));

    }
}
