package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumWaitDemo {
	public static void main(String[] args) {

		seleniumWait();
	}

	public static void seleniumWait() {
		String projectPath =System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath + "/drivers/ChromeDriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
			//IMPLICIT WAIT
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //250 ms
		driver.get("https://google.com");
		driver.findElement(By.name("q")).sendKeys("Automation step by step");
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		
		
		//EXPLICIT WAIT
		/*WebDriverWait wait = new WebDriverWait(driver, 20); //explicit wait creation
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.name("abcdef")));
		*/
		driver.findElement(By.name("abcd")).click();
		driver.close();
		driver.quit();
	}
}
