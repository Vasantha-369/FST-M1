package SeleniumActivities;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity8_1 {
	

	    public static void main(String[] args) {
	        WebDriver driver = new FirefoxDriver();

	     
	        driver.get("https://training-support.net/selenium/tables");

	        List<WebElement> colnum = driver.findElements(By.xpath("//table[contains(@class, 'striped')]/tbody/tr[1]/td"));

	        List<WebElement> rownum = driver.findElements(By.xpath("//table[contains(@class, 'striped')]/tbody/tr"));

	
	        System.out.println("Number of columns are: " + colnum.size());

	        System.out.println("Number of rows are: " + rownum.size());

	   
	        List<WebElement> thirdRow = driver.findElements(By.xpath("//table[contains(@class, 'striped')]/tbody/tr[3]/td"));
	        for(WebElement cellValue : thirdRow) {
	            System.out.println("Cell Value in third row : " + cellValue.getText());
	        }


	        WebElement cellValue2_2 = driver.findElement(By.xpath("//table[contains(@class, 'striped')]/tbody/tr[2]/td[2]"));
	        System.out.println("Second row, second column value: " + cellValue2_2.getText());

	 
	        driver.close();
	    }
	}


