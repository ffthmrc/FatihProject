package Basic_Navigation_02_WebDriver;

import Utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;

public class CallThefactory {

    public static void main(String[] args) {
        //WebDriverManager.chromedriver().setup();
       // WebDriver driver = new ChromeDriver();

        WebDriver driver = WebDriverFactory.getDriver("chrome");


    }
}
