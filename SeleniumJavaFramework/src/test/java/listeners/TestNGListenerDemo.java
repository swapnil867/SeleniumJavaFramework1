package listeners;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import junit.framework.Assert;

//@Listeners(listeners.TestNGListeners.class)  //Multiple classes can be add using commas
public class TestNGListenerDemo { 

	@Test
	public void test1() {
		System.out.println("I am inside Test 1");
	}
	@Test
	public void test2() {
		System.out.println("I am inside Test 2");
		//Assert.assertTrue(false);

		String projectPath = System.getProperty("user.dir");
		System.out.println("projectPath" + projectPath);

		System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/ChromeDriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://google.com/"); 
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("ABCD");
		driver.findElement(By.xpath("//input[@name='abc']")).sendKeys("ABCD");

		driver.close();
		driver.quit();
	}
	@Test
	public void test3() {
		System.out.println("I am inside Test 3");
		throw new SkipException("This test is Skipped"); 
	}
}
