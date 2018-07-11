package Reusable_Classes;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class BaseTest  extends BasePage{

    LoadProp loadProp = new LoadProp();
    Browser_Factory browser_factory = new Browser_Factory();

    @BeforeMethod
    public void openBrowser(){
        browser_factory.selectBrowser(loadProp.getProperty("browser"));
        driver.get(loadProp.getProperty("baseUrl"));
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());

    }




















    @AfterMethod
    public void closeBrowser(){

        driver.quit();
    }






}
