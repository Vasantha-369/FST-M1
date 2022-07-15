package SeleniumActivities;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.Keys;

public class Activity10_2 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        Actions a = new Actions(driver);
        String pressedKeyText;

        driver.get("https://www.training-support.net/selenium/input-events");
        WebElement pressedKey = driver.findElement(By.id("keyPressed"));
    
        a.sendKeys("V").build().perform();
        pressedKeyText = pressedKey.getText();
        System.out.println("Pressed key is: " + pressedKeyText);
        
        a.sendKeys(Keys.chord(Keys.CONTROL, "a"));
        a.sendKeys(Keys.chord(Keys.CONTROL, "c"));
        
    
        pressedKeyText = pressedKey.getText();
        System.out.println("Pressed key is: " + pressedKeyText);

        
        driver.close();
    }
}
