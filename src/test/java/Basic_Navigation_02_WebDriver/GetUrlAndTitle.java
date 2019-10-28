package Basic_Navigation_02_WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetUrlAndTitle {

    public static void main(String[] args) throws InterruptedException {
        // set up chrome driver
        WebDriverManager.chromedriver().setup();

        // open chrome browser
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
       // driver.get("http://practice.cybertekschool.com/");

        driver.get("https://www.jetbrains.com/idea/download/");
        // get the title of the page

        String title = driver.getTitle();
        System.out.println("title = "+ title);

        // getCurrentUrl(); ---> gets url of this page
        String url = driver.getCurrentUrl();
        System.out.println("url = " + url);

        // getPageSource  ---- >   get
        String pageSourse = driver.getPageSource();
        System.out.println("pageSourse = " + pageSourse);
Thread.sleep(4000);
        driver.findElement(By.xpath("//*[@id=\"section\"]/div/div[1]/div[1]/div[1]/div[2]/div/div[1]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"js-menu-main\"]/div/div/div[5]")).click();
      //  driver.navigate().to("http://amazon.com");
        //driver.navigate().back();

    }
}
