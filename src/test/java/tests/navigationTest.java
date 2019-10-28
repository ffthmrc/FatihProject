package tests;

import Utilities.StringUtulities;
import Utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;

public class navigationTest {
    public static void main(String[] args) {
      //  chrome("chrome");
        firefox("firefox");
        ie("");
    }
   public static void chrome(String browser){
       WebDriver driver = WebDriverFactory.getDriver(browser);
       driver.get("https://www.amazon.com");
       String  gtitle = driver.getTitle();
      driver.navigate().to("https://etsy.com");
      // driver.get("https://etsy.com");
       String etitle1 = driver.getTitle();
       driver.navigate().back();

       StringUtulities.verifyEquals(gtitle,driver.getTitle());
        driver.navigate().forward();
        StringUtulities.verifyEquals(etitle1,driver.getTitle());

        driver.quit();
   }

    public static void firefox(String browser){
        WebDriver driver = WebDriverFactory.getDriver(browser);
        driver.get("https://www.amazon.com");
        String  gtitle = driver.getTitle();
        driver.navigate().to("https://etsy.com");
        // driver.get("https://etsy.com");
        String etitle1 = driver.getTitle();
        driver.navigate().back();

        StringUtulities.verifyEquals(gtitle,driver.getTitle());
        driver.navigate().forward();
        StringUtulities.verifyEquals(etitle1,driver.getTitle());

        driver.quit();
    }
    public static void ie(String browser){
        WebDriver driver = WebDriverFactory.getDriver(browser);
        driver.get("https://www.amazon.com");
        String  gtitle = driver.getTitle();
        driver.navigate().to("https://etsy.com");
        // driver.get("https://etsy.com");
        String etitle1 = driver.getTitle();
        driver.navigate().back();

        StringUtulities.verifyEquals(gtitle,driver.getTitle());
        driver.navigate().forward();
        StringUtulities.verifyEquals(etitle1,driver.getTitle());

        driver.quit();
    }
}
