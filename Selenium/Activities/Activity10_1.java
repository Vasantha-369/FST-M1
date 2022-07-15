package SeleniumActivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity10_1 {

	public static void main(String[] args) {
	
		WebDriver driver = new FirefoxDriver();

		 driver.get("https://www.training-support.net/selenium/input-events");
		 
		 Actions a = new Actions(driver);
		 
		 WebElement dice = driver.findElement(By.xpath("//div[@class='dice']"));
		 a.click(dice);
	        WebElement cubeVal = driver.findElement(By.className("active"));
	        System.out.println("Left Click: " + cubeVal.getText());
		 
	        a.doubleClick(dice).perform();
	        cubeVal = driver.findElement(By.className("active"));
	        System.out.println("Double Click: " + cubeVal.getText());
	        
	              
	        a.contextClick(dice).perform();
	        cubeVal = driver.findElement(By.className("active"));
	        System.out.println("Right Click: " + cubeVal.getText());
	 
	       
	        driver.close();

	}

}
