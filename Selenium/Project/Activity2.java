package SeleniumProject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity2 {
	

		
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
	        
	       String heading=  driver.findElement(By.xpath("//h1")).getText();
	       
	       System.out.println("Heading is: "+heading);
	       
	       Assert.assertEquals("Learn from Industry Experts", heading);
	                    

	    }

	    @AfterMethod
	    public void afterMethod() {

	        driver.quit();
	    }

	}


