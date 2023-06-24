package ItSutra.MavenGitIntegration1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class MavenGitTest {
	WebDriver _driver;

	@Test
	public void MavenGiT1() throws InterruptedException {

		_driver.get("https://www.google.com");
		Thread.sleep(5000);
		_driver.get("https://www.yahoo.com");
		Thread.sleep(5000);
		_driver.get("https://www.hotmail.com");
		Thread.sleep(5000);

	}

	@BeforeTest
	public void beforeTest() {
		_driver = new FirefoxDriver();
		_driver.get("www.google.com");

	}

	@AfterTest
	public void afterTest() {
		_driver.close();

	}

}
