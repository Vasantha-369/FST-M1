package SeleniumActivities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity11_1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();

		driver.get("https://www.training-support.net/selenium/javascript-alerts");

		driver.findElement(By.xpath("//button[@id=\"simple\"]")).click();

		Alert alertbox = driver.switchTo().alert();

		String alertText = alertbox.getText();
		System.out.println("Alert text is: " + alertText);

		alertbox.accept();

		driver.close();
	}
}
