package SeleniumActivities;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Activity9_2 {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();

		driver.get("https://training-support.net/selenium/selects");

		Select s = new Select(driver.findElement(By.xpath("//select[@id=\"multi-select\"]")));

		if (s.isMultiple()) {

			s.selectByVisibleText("Javascript");

			s.selectByValue("node");

			for (int i = 4; i <= 6; i++) {
				s.selectByIndex(i);
			}

			s.deselectByValue("node");

			s.deselectByIndex(7);

			List<WebElement> allOptions = s.getOptions();

			for (WebElement selectedOption : allOptions) {
				System.out.println("Dropdown Values: " + selectedOption.getText());
			}

			s.deselectAll();

		}

		driver.close();
	}
}
