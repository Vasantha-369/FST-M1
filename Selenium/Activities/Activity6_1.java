package SeleniumActivities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity6_1 {
	 public static void main(String[] args) {

	        WebDriver driver = new FirefoxDriver();
	        WebDriverWait wait = new WebDriverWait(driver,15);

	        driver.get("https://www.training-support.net/selenium/dynamic-controls");

	        WebElement checkboxInput = driver.findElement(By.xpath("//input[@type='checkbox']"));
	    

	        driver.findElement(By.id("toggleCheckbox")).click();
	        wait.until(ExpectedConditions.invisibilityOf(checkboxInput));
	        
	        driver.findElement(By.id("toggleCheckbox")).click();
	        wait.until(ExpectedConditions.visibilityOf(checkboxInput));
	        
	        checkboxInput.click();

	

	        driver.close();
	 }

}
