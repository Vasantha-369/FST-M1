package SeleniumProject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity9 {

	WebDriver driver;

	@BeforeMethod
	public void beforeMethod() {

		driver = new FirefoxDriver();

		driver.get("https://alchemy.hguy.co/lms");
	}

	@Test
	public void exampleTestCase() {

		String title = driver.getTitle();

		System.out.println("Page title is: " + title);

		Assert.assertEquals("Alchemy LMS � An LMS Application", title);

		driver.findElement(By.xpath("//a[text()=\"My Account\"]")).click();
		String newtititle = driver.getTitle();

		System.out.println("Page title is: " + newtititle);

		Assert.assertEquals("My Account � Alchemy LMS", newtititle);

		driver.findElement(By.xpath("//a[contains(@class, \"login\")]")).click();

		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("root");

		driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("pa$$w0rd");

		driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();

		 driver.findElement(By.xpath("//*[text()=\"All Courses\"]")).click();
		 
		 driver.findElement(By.xpath("//h3[text()=\"Social Media Marketing\"]/following-sibling::p/a[text()=\"See more...\"]")).click();
		 
		 driver.findElement(By.xpath("//div[contains(text(),\"Developing Strategy\")]")).click();
		 
		 List<WebElement> count = driver.findElements(By.xpath("//div[contains(text(),\"Complete\")]"));
		 
		 if (count.size() == 0) {

				System.out.println("Course not completed");

			}

			else {
				System.out.println("Course completed");
			}
		 
	}

	@AfterMethod
	public void afterMethod() {

		driver.quit();
	}

}
