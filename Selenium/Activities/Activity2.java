package SeleniumActivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity2 {

    public static void main(String[] args) {
    	 	
    
       
    	 	WebDriver driver = new FirefoxDriver();
	
        driver.get("https://www.training-support.net");
        
        System.out.println("The title of the page is: " + driver.getTitle());
        
        String text = driver.findElement(By.id("about-link")).getText();
        
   
       String text2 = driver.findElement(By.cssSelector("#about-link")).getText();
        
        System.out.println(text2);
        String text3 = driver.findElement(By.linkText("About Us")).getText();
        
        System.out.println(text3);
		
  
        driver.close();
    }

}
