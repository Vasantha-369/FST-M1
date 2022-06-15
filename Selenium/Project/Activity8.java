package SeleniumProject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity8 {
	   WebDriver driver;
	    
	    @BeforeMethod
	    public void beforeMethod() {

	        driver = new FirefoxDriver();
	 
	        driver.get("https://alchemy.hguy.co/lms");
	    }

	    @Test
	    public void exampleTestCase() {
	   
	        String title = driver.getTitle();
	            
	 
	        System.out.println("Page title is: " + title);

	        Assert.assertEquals("Alchemy LMS – An LMS Application", title);
	        
	        driver.findElement(By.xpath("//*[text()=\"Contact\"]")).click();
	        
	        driver.findElement(By.xpath("//*[text()=\"Full Name \"]/following-sibling::input")).sendKeys("Vasantha");
	        
	        driver.findElement(By.xpath("//*[text()=\"Email \"]/following-sibling::input")).sendKeys("test@gmail.com");
	        
	        driver.findElement(By.xpath("//*[text()=\"Subject\"]/following-sibling::input")).sendKeys("feedback");
	        
	        driver.findElement(By.xpath("//*[text()=\"Comment or Message \"]/following-sibling::textarea")).sendKeys("xxxxxxxxxx");
	        
	        driver.findElement(By.xpath("//button[text()=\"Send Message\"]")).click();
	        
	   String message =     driver.findElement(By.xpath("//div[contains(@class,\"confirmation\")]")).getText();
	   
	   System.out.println("Confirmation message is: "+message);
	        
	     
	                    

	    }

	    @AfterMethod
	    public void afterMethod() {

	        driver.quit();
	    }

}
