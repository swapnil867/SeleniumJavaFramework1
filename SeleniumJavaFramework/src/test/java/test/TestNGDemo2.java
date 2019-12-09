package test;

//import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGDemo2 {

	static WebDriver driver = null;

	@BeforeTest
	public void setUpTest() {

		//Set the path of chrome driver
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/ChromeDriver/chromedriver.exe");
		driver = new ChromeDriver();

	}

	@Test
	public static void googleSearch2() {


		//Go to google.com 
		driver.get("https://www.google.com/");

		//Enter text into search textbox
		driver.findElement(By.name("q")).sendKeys("Automation Step by step");
		//Click on search button
		//driver.findElement(By.name("btnK")).click();
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);

	}
	
	@Test
	public static void googleSearch3() {


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
		driver.close();
		driver.quit();
		System.out.println("Test Completed");
	}
}
