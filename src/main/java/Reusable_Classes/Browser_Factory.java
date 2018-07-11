package Reusable_Classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import javax.jws.soap.SOAPBinding;


public class Browser_Factory extends BasePage {

    public void selectBrowser(String browser) {

        if (browser.equalsIgnoreCase("Chrome")) {

            System.setProperty("webdriver.chrome.driver", "src\\Resources\\java\\Driver_Resources\\chromedriver.exe");

            driver = new ChromeDriver();

        } else if (browser.equalsIgnoreCase("ie")) {

            System.setProperty("webdriver.ie.driver", "src\\Resources\\java\\Driver_Resources\\IEDriverServer.exe");

            driver=new InternetExplorerDriver();

        } else if (browser.equalsIgnoreCase("firefox")) {

            System.setProperty("webdriver.gecko.driver", "src\\Resources\\java\\Driver_Resources\\geckodriver.exe");

            driver = new FirefoxDriver();

        } else {

            System.out.println("Invalid browser");
        }
}

}

