package Cybertek;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverBasicFatih {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        System.setProperty("webdriver.gecko.driver","C:\\Users\\19732\\Downloads/geckodriver.exe");
        WebDriver driver =new ChromeDriver();

        driver.manage().window().fullscreen();
        driver.get("http://www.google.com");
        String  title = driver.getTitle();
        System.out.println(title);

            if(title.equalsIgnoreCase("google")){
                System.out.println("correct title");
            }else {
                System.out.println("in correct title");
            }

        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getPageSource());
        Thread.sleep(1000);
        driver.close();

    }
}
