package Page_Objects;

import Reusable_Classes.Utils;
import org.openqa.selenium.By;

public class Conform_Peymant_Page extends Utils {

    Visa_Card_Page visa_card_page = new Visa_Card_Page();

    public void userShouldAbleToClickOnConfirmButtonSuccessful()  {

        visa_card_page.userShouldAbleToFillAllDetailsOfVIsaCard();


        scrollPagep(0,300);
        try {
            thread();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        clickElement(By.xpath("//*[@id=\"confirm-order-buttons-container\"]/input"));
    }

}
