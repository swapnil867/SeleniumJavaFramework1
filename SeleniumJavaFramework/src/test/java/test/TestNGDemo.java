package test;

//import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import config.PropertiesFile;

public class TestNGDemo {


	static WebDriver driver = null;
	public static String browserName= null;

	@BeforeTest
	public void setUpTest() {

		//Set the path of chrome driver
		String projectPath = System.getProperty("user.dir");
		PropertiesFile.getProperties();
		if(browserName.equalsIgnoreCase("Chrome")) {

			System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/ChromeDriver/chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.gecko.driver", projectPath+"/drivers/geckodriver/geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
		}

	}

	@Test
	public static void googleSearch() {


		//Go to google.com 
		driver.get("https://www.google.com/");

		//Enter text into search textbox
		driver.findElement(By.name("q")).sendKeys("Automation Step by step");
		//Click on search button
		//driver.findElement(By.name("btnK")).click();
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);

	}

	@AfterTest
	public void tearDownTest() {

		//Close the browser
		//driver.close();
		driver.quit();
		System.out.println("Test Completed");
		PropertiesFile.setProperties();
	}
}
