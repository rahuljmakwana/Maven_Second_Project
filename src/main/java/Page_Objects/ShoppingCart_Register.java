package Page_Objects;

import Reusable_Classes.LoadProp;
import Reusable_Classes.Utils;
import org.openqa.selenium.By;

public class ShoppingCart_Register extends Utils {

    LoadProp loadProp = new LoadProp();

    Checkout_Gest_Page checkout_gest_page = new Checkout_Gest_Page();


    public  void userShouldAbleToFilRegisterPage(){

        checkout_gest_page.userShouldAbleFillGestPage();


        clearAndEnterText(By.id("BillingNewAddress_FirstName"),loadProp.getProperty("firstname"));

        clearAndEnterText(By.id("BillingNewAddress_LastName"),loadProp.getProperty("lastname"));

        clearAndEnterText(By.id("BillingNewAddress_Email"),loadProp.getProperty("email").toLowerCase()+randomNumber()+"@gmail.com");

        selectByValue(By.id("BillingNewAddress_CountryId"),"1");

        selectByValue(By.id("BillingNewAddress_StateProvinceId"),"21");

        clearAndEnterText(By.id("BillingNewAddress_City"),loadProp.getProperty("city"));

        clearAndEnterText(By.id("BillingNewAddress_Address1"),loadProp.getProperty("address"));

        clearAndEnterText(By.id("BillingNewAddress_ZipPostalCode"),loadProp.getProperty("postcode"));

        clearAndEnterText(By.id("BillingNewAddress_PhoneNumber"),loadProp.getProperty("phonenumber"));

        clickElement(By.xpath("//*[@id=\"billing-buttons-container\"]/input"));


    }
}
