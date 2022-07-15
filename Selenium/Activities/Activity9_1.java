package SeleniumActivities;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Activity9_1 {

	public static void main(String[] args) {
	
        WebDriver driver = new FirefoxDriver();

        driver.get("https://www.training-support.net/selenium/selects");
        
        Select s = new Select(driver.findElement(By.xpath("//select[@id=\"single-select\"]")));
        s.selectByVisibleText("Option 2");
        s.selectByIndex(2);
        s.selectByValue("4");
        List<WebElement> allOptions =  s.getOptions();
       for(WebElement optionvalues : allOptions) {
    	   
    	   System.out.println(optionvalues.getText());
    	   
       }
        
       driver.close(); 

	}

}
