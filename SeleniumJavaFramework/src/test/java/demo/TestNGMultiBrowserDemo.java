package demo;

//import org.junit.runners.Parameterized.Parameters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

//import com.beust.jcommander.Parameter;

public class TestNGMultiBrowserDemo {

	WebDriver driver = null;
	String projectPath = System.getProperty("user.dir");

	@org.testng.annotations.Parameters("browserName")
	@BeforeTest
	//@Parameters("browserName")
	public void setUp(String browserName) {

		System.out.println("Browser name is: " + browserName );
		System.out.println("Thread id is: " + Thread.currentThread().getId());

		if(browserName.equalsIgnoreCase("chrome")) {

			System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/ChromeDriver/chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if (browserName.equalsIgnoreCase("firefox")) {

			System.setProperty("webdriver.gecko.driver", projectPath+"/drivers/geckodriver/geckodriver.exe");
			driver = new FirefoxDriver(); //while running with fire fox don't add "driver.quit();" at the end.
		}
		else if (browserName.equalsIgnoreCase("IE")) {

			System.setProperty("webdriver.ie.driver", projectPath+ "/drivers/iedriver/IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}

	}

	@Test
	public void test1() throws Exception {
		driver.get("https://google.com");
		Thread.sleep(4000);
	}

	@AfterTest	
	public void teardown() {
		driver.close();
		//driver.quit();
		System.out.println("Test completed successfully");

	}
}
