package SeleniumProject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class Activity4 {

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
        
       String heading=  driver.findElement(By.xpath("(//h3)[5]")).getText();
       
       System.out.println("Heading is: "+heading);
       
       Assert.assertEquals("Email Marketing Strategies", heading);
                    

    }

    @AfterMethod
    public void afterMethod() {

        driver.quit();
    }


}
