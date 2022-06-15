package SeleniumProject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity7 {
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
	        
	        driver.findElement(By.xpath("//*[text()=\"All Courses\"]")).click();
	        
	        List<WebElement> count = driver.findElements(By.xpath("//div[contains(@class,\"ld-course-list-items row\")]/div"));
	        
	        int NoofCourses = count.size();
	        
	        System.out.println("NoofCourses: "+NoofCourses);
	                    

	    }

	    @AfterMethod
	    public void afterMethod() {

	        driver.quit();
	    }

}
