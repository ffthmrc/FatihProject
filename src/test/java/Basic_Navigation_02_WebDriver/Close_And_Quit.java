package Basic_Navigation_02_WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Close_And_Quit {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        //  driver.get("http://practice.cybertekschool.com/");
        // Thread.sleep(1000);
        // driver.close();  // close() ---> close the current tab/window

        driver.get("http://practice.cybertekschool.com/open_new_tab");
        Thread.sleep(5000);
        driver.close();

    }
}
