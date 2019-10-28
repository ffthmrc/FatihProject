package tests;

import Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VyTruck {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://qa2.vytrack.com/user/login");
        logIn(driver,"User4","UserUser123");

    }

    public static WebDriver logIn(WebDriver driver,String userName,String password){
        WebElement uName = driver.findElement(By.name("_username"));
        uName.sendKeys(userName);
        WebElement pass = driver.findElement(By.name("_password"));
        pass.sendKeys(password);
        WebElement login = driver.findElement(By.id("_submit"));
        login.click();
        return driver;
    }
}
