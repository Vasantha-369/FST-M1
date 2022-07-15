package SeleniumActivities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity10_3 {
    public static void main(String[] args) throws InterruptedException {
    
    	// Declare new WebDriver
        WebDriver driver = new FirefoxDriver();
        
   
        WebDriverWait wait = new WebDriverWait(driver,30);
        
     
        driver.get("https://training-support.net/selenium/drag-drop");
        
   
        wait.until(ExpectedConditions.elementToBeClickable(By.id("draggable")));
   
        WebElement ball = driver.findElement(By.id("draggable"));
        WebElement drop1 = driver.findElement(By.id("droppable"));
        WebElement drop2 = driver.findElement(By.id("dropzone2"));
        
     
        Actions a = new Actions(driver);
        a.dragAndDrop(ball, drop1).build().perform();
        
    
        wait.until(ExpectedConditions.attributeToBeNotEmpty(drop1, "background-color"));
        System.out.println("ENTERED DROPZONE 1");
     
        a.dragAndDrop(ball, drop2).build().perform();
        wait.until(ExpectedConditions.attributeToBeNotEmpty(drop2, "background-color"));
        System.out.println("ENTERED DROPZONE 2");
        
        driver.close();
    }
}
