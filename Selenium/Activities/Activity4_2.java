package SeleniumActivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_2 {
    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();

        driver.get("https://www.training-support.net/selenium/simple-form");

    
        String pageTitle = driver.getTitle();
        System.out.println(pageTitle);

         driver.findElement(By.xpath("//input[@id = 'firstName']")).sendKeys("Vasantha");
         driver.findElement(By.xpath("//input[@id = 'lastName']")).sendKeys("Kumari");

        driver.findElement(By.xpath("//input[@id = 'email']")).sendKeys("test@example.com");

        driver.findElement(By.xpath("//input[@id = 'number']")).sendKeys("9087653421");

        driver.findElement(By.xpath("//textarea")).sendKeys("This is text message");

   
        driver.findElement(By.xpath("//input[@type='submit']")).click();
    }
}
