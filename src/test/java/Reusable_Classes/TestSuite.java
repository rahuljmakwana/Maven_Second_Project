package Reusable_Classes;

import static Reusable_Classes.Utils.getTextFromeElement;
import static org.junit.Assert.assertTrue;

import Page_Objects.*;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.testng.Assert;


public class TestSuite extends BaseTest{

    Home_Page home_page = new Home_Page();
    AddToCart_Jewelry addToCart_jewelry = new AddToCart_Jewelry();
    ShoppingCart_Page shoppingCart_page = new ShoppingCart_Page();
    Checkout_Gest_Page checkout_gest_page = new Checkout_Gest_Page();
    ShoppingCart_Register shoppingCart_register = new ShoppingCart_Register();
    Checkout_Page checkout_page = new Checkout_Page();
    CreditCard_Page creditCard_page = new CreditCard_Page();
    Visa_Card_Page visa_card_page = new Visa_Card_Page();
    Conform_Peymant_Page conform_peymant_page = new Conform_Peymant_Page();

    @Test(priority = 0)
    public void verifyUserShodBeOnHomePage(){

        Assert.assertEquals(getTextFromeElement(By.linkText("Register")),"Register");
    }

    @Test
    public void userShouldAbleToNavigateJewelry(){

        home_page.userShouldAbleToClickOnJewelery();

        Assert.assertEquals(getTextFromeElement(By.xpath("//a[contains( text(),'Jewelry')]")),"Jewelry");
    }

    @Test
    public void userShouldAddToCart(){

        addToCart_jewelry.UserShouldAbleToAddTwoItemsInShoppingCart();

        Assert.assertEquals(getTextFromeElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[1]/h1")),"Shopping cart");
    }
    @Test
    public void userShouldAbleToPutItemInShoppingCart(){

        shoppingCart_page.userShouldAbleToFillAForm();
    }

    @Test
    public  void userShouldAbleToChechoutAsGest(){

        checkout_gest_page.userShouldAbleFillGestPage();

        Assert.assertEquals(getTextFromeElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[1]/h1")),"Checkout");
    }

    @Test
    public void userShoulAbleToFillAFormOfRegisterSuccessfully(){

        shoppingCart_register.userShouldAbleToFilRegisterPage();

        Assert.assertEquals(getTextFromeElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[1]/h1")),"Checkout");
    }

    @Test
    public void UserShouldAbleToClickOnSecondDay(){

        checkout_page.userShouldAbleToClickOnSecontDayAir();

        Assert.assertEquals(getTextFromeElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[1]/h1")),"Checkout");
    }

    @Test
    public void userShouldAbbleToClickOnCreditCardSuccesfully(){

        creditCard_page.userShouldAbleToClickOnCreditCardButton();

        Assert.assertEquals(getTextFromeElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[1]/h1")),"Checkout");
    }
    @Test
    public void userShouldAbleToFillDetailsOfVisaCard(){

        visa_card_page.userShouldAbleToFillAllDetailsOfVIsaCard();

        Assert.assertEquals(getTextFromeElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[1]/h1")),"Checkout");
    }
    @Test
    public void userShouldAbleToClickOnConformButton(){

        conform_peymant_page.userShouldAbleToClickOnConfirmButtonSuccessful();

        Assert.assertEquals(getTextFromeElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div/div[1]/strong")),"Your order has been successfully processed!");



    }



}

