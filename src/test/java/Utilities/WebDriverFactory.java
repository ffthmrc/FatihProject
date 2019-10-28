package Utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverFactory {
    // you guys write a static method that takes a string parameter
    // based on  the value of the parameter
    // the method must return ChromeDriver or Firefoxdriver object
    public static void main(String[] args) {
getDriver("Chrome");
getDriver("ie");
getDriver("firefox");
    }

    // name : getDriver

    public static WebDriver getDriver(String browsertype) {

        WebDriver driver = null;
        switch (browsertype.toLowerCase()){

            case "chrome":
                WebDriverManager.chromedriver().setup();
                 driver = new ChromeDriver();
                 break;
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;
            case "safari":
                driver = null;
                break;
            case "ie":
                WebDriverManager.edgedriver().setup();
                driver= new EdgeDriver();
                break;



        }
        return driver;


//        if (browsertype.equalsIgnoreCase("Chrome")) {
//            WebDriverManager.chromedriver().setup();
//            WebDriver driver = new ChromeDriver();
//        }
//        if (browsertype.equalsIgnoreCase("Firefox")) {
//            WebDriverManager.firefoxdriver().setup();
//            WebDriver driver = new FirefoxDriver();
//        }
//        return null;
    }
}





