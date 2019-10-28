package com.Cybertek.tests;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class d3_webElement {

    /*
    Verify URL changed
open browser
go to http://practice.cybertekschool.com/forgot_password
enter any email
click on Retrieve password
verify that url changed to http://practice.cybertekschool.com/email_sent
     */
    public static void main(String[] args) {
        // open browser

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        //WebDriver driver1 = WebDriverFactory.getDriver("Chrome");
        // go to http://practice.cybertekschool.com/forgot_password

        driver.get("http://practice.cybertekschool.com/forgot_password");

        //enter any email
        WebElement emailInput = driver.findElement(By.name("email"));

        emailInput.sendKeys("fatihmeric06@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"form_submit\"]"));

        driver.quit();
    }


}


