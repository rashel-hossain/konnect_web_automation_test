package mypackage;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class myclass {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        // Website declaration
        driver.get("https://konnect.edu.bd/login");
        driver.manage().window().maximize();

        // login user and password
        driver.findElement(By.id("username")).sendKeys("01614033999");
        Thread.sleep(2000); // after 3s por password input filed bosbe
        driver.findElement(By.id("password")).sendKeys("123456");
        driver.findElement(By.id("pills-tabContent")).click();

        Thread.sleep(2000);
        // navigate to back page
        driver.navigate().back();
        // navigate to refresh or reload page
        driver.navigate().refresh();
        //navigate to forward page
        driver.navigate().forward();
        // navigate to specific
        driver.navigate().to("https://konnect.edu.bd/life-skill");

        // check website title
        String ExpectedTitle= "কিশোর বাতায়ন";
        String ActualTitle= driver.getTitle();
        if(ActualTitle.equals(ExpectedTitle)){
            System.out.println("Title match");
        }
        else {
            System.out.println("Title doesn't match!");
        }

        // Check website url
        String ExpectedURL= "https://konnect.edu.bd/";
        String ActualURL= driver.getCurrentUrl();
        if(ActualURL.equals(ExpectedURL)){
            System.out.println("URL Matched");
        }
        else {
            System.out.println("URL doesn't matched!");
        }
    }
}
