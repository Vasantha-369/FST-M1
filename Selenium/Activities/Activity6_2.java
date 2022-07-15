package SeleniumActivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity6_2 {
	public static void main(String[] args) throws InterruptedException {
	
	  WebDriver driver = new FirefoxDriver();
	  driver.get("https://www.training-support.net/selenium/ajax");
	  System.out.println("The title of the page is: " + driver.getTitle());
	  driver.findElement(By.xpath("//button[text()=\"Change Content\"]")).click();
	  WebDriverWait wait = new WebDriverWait(driver,30);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id=\"ajax-content\"]/h1")));
	  System.out.println(driver.findElement(By.xpath("//div[@id=\"ajax-content\"]/h1")).getText());
	  System.out.println(driver.findElement(By.xpath("//div[@id=\"ajax-content\"]/h3")).getText());
	  
	  Thread.sleep(3000);
	  
	  System.out.println(driver.findElement(By.xpath("//div[@id=\"ajax-content\"]/h1")).getText());
	  System.out.println(driver.findElement(By.xpath("//div[@id=\"ajax-content\"]/h3")).getText());

      driver.close();
	  
	}

}
