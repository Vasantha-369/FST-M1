package SeleniumActivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity7_2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
        
        
        driver.get("https://training-support.net/selenium/dynamic-attributes");
        System.out.println("The title of the page is :" +driver.getTitle());
        
        driver.findElement(By.xpath("(//label[text()=\"Username\"]/following-sibling::input)[2]")).sendKeys("test");
        driver.findElement(By.xpath("(//label[text()=\"Password\"]/following-sibling::input)[2]")).sendKeys("password");
        driver.findElement(By.xpath("//label[text()='Confirm Password']/following-sibling::input")).sendKeys("password");
        driver.findElement(By.xpath("//label[text()='Email']/following-sibling::input")).sendKeys("test");
        
      driver.findElement(By.xpath("//button[text()='Sign Up']")).click();
      
      
      String loginMessage = driver.findElement(By.id("action-confirmation")).getText();
      
      System.out.println("Login message is :" +loginMessage);
      
      driver.close();
      

	}
	

}
