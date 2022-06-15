package SeleniumProject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity5 {
	
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
        
      driver.findElement(By.xpath("//a[text()=\"My Account\"]")).click();
      String newtititle = driver.getTitle();
      
      
      System.out.println("Page title is: " + newtititle);

      Assert.assertEquals("My Account – Alchemy LMS", newtititle);

                    

    }

    @AfterMethod
    public void afterMethod() {

        driver.quit();
    }

}
