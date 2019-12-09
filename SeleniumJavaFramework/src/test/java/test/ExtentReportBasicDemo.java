package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

//import com.aventstack.extentreports.ExtentReporter;

public class ExtentReportBasicDemo {

	private static WebDriver driver = null;

	public static void main(String[] args) {

		// start reporters
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extentReport.html");

		// create ExtentReports and attach reporter(s)
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(htmlReporter);

		// creates a toggle for the given test, adds all log events under it    
		ExtentTest test1 = extent.createTest("Google Search", "GS description");

		//Set the path of chrome driver
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/ChromeDriver/chromedriver.exe");
		driver = new ChromeDriver();
		test1.log(Status.INFO, "Starting Test case");

		driver.get("https://www.google.com/");
		test1.pass("Navigates to google.com");

		driver.findElement(By.name("q")).sendKeys("Autmoation");
		test1.pass("Entered text in Searchbox");

		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		test1.pass("Pressed keyboard enter key");

		driver.close();
		driver.quit();

		test1.pass("Closed the browser");
		test1.info("Test Completed");

		// creates a toggle for the given test, adds all log events under it    
		ExtentTest test2 = extent.createTest("Google Search", "GS description");

		//Set the path of chrome driver
		//String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/ChromeDriver/chromedriver.exe");
		driver = new ChromeDriver();
		test2.log(Status.INFO, "Starting Test case");

		driver.get("https://www.google.com/");
		test2.pass("Navigates to google.com");

		driver.findElement(By.name("q")).sendKeys("Autmoation");
		test2.pass("Entered text in Searchbox");

		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		test2.fail("Pressed keyboard enter key");

		driver.close();
		driver.quit();

		test2.pass("Closed the browser");
		test2.info("Test Completed");


		// calling flush writes everything to the log file
		extent.flush();
	}

}
