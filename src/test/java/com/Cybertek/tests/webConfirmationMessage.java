package com.Cybertek.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webConfirmationMessage {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/forgot_password");

        WebElement emailInput= driver.findElement(By.name("email"));

        // sendKeys ---> enters given text
        String expectedEmail = "fatihmeric06@gmail.com";
        emailInput.sendKeys(expectedEmail);

        // veriffy that email is display in the inut box
        // . getAttribute("value")  ---> get text from input box

        String actualEmail = emailInput.getAttribute("value");

        if (expectedEmail==emailInput.getText()){
            System.out.println("PASS");
        } else{
            System.out.println("FAIL");
            System.out.println("Expexted email " + expectedEmail);
            System.out.println("Actual email " + actualEmail);
        }

        WebElement retrievePassword = driver.findElement(By.id("form_submit"));
        retrievePassword.click();

driver.quit();

    }
}
