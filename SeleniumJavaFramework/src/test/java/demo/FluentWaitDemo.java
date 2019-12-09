package demo;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.base.Function;

public class FluentWaitDemo {

	public static void main(String[] args) throws Exception {
		test();
	}

	public static void test() throws Exception {

		String projectPath =System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath + "/drivers/ChromeDriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();	

		driver.get("https://google.com");
		driver.findElement(By.name("q")).sendKeys("Abcd");
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		driver.findElement(By.className("gNO89b")).sendKeys(Keys.RETURN);

		//driver.findElement(By.linkText("Home - ABCD DentalABCD Dental")).click();

		// Waiting 30 seconds for an element to be present on the page, checking
		// for its presence once every 5 seconds.
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(30, TimeUnit.SECONDS)
				.pollingEvery(2, TimeUnit.SECONDS)
				.ignoring(NoSuchElementException.class);

		WebElement element = wait.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver) {
				WebElement linkElement= driver.findElement(By.linkText("Home - ABCD DentalABCD Dental"));

				if(linkElement.isEnabled()) {
					System.out.println("Element Found");

				}
				return linkElement;
			}
		});
		element.click();
		Thread.sleep(3000);
		driver.close();
		driver.quit();

	}

}