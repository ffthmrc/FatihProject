package com.Cybertek.tests;

import Utilities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webelementClass {
    /*
    Verify URL not changed
    open browser
    go to http://practice.cybertekschool.com/forgot_password
    click on Retrieve password
    verify that url did not change
     */


    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        WebDriver driver1 = WebDriverFactory.getDriver("chrome");

        driver.get("http://practice.cybertekschool.com/forgot_password");
        // save the expected Url
        String expectedUrl = driver.getCurrentUrl();

        // click Retrieve password
        WebElement retrievePassword = driver.findElement(By.xpath("//*[@id=\"form_submit\"]/i"));
        retrievePassword.click();


    }
}
