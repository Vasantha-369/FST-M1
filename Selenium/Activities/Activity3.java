package SeleniumActivities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity3 {

    public static void main(String[] args) {
    	 	
    
       
    	 	WebDriver driver = new FirefoxDriver();
	
        driver.get("https://training-support.net/selenium/simple-form");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        
        System.out.println("The title of the page is: " + driver.getTitle());
        
        driver.findElement(By.id("firstName")).sendKeys("Vasantha");
        
       driver.findElement(By.id("lastName")).sendKeys("kumari");
       driver.findElement(By.id("email")).sendKeys("test@example.com");
      
       driver.findElement(By.id("number")).sendKeys("90867564356");
 
       driver.findElement(By.cssSelector(".ui.green.button")).click();
		
  
        driver.close();
    }

}
