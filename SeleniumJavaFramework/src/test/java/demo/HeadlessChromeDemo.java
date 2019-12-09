package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessChromeDemo {

	public static void main(String[] args) {
		test();
	}

	public static void test() {
		//String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pujak\\Desktop\\Selenium\\SeleniumJavaFramework\\drivers\\ChromeDriver\\chromedriver.exe");

		ChromeOptions options = new ChromeOptions(); //Headless browser code
		options.addArguments("--headless");
		options.addArguments("-	-headless");
		options.addArguments("windows-size=1366,768");
		
		WebDriver driver = new ChromeDriver(options); //here passing options

		driver.get("https://google.com");
		System.out.println(driver.getTitle());
		driver.findElement(By.name("q")).sendKeys("Automation");
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);

		driver.close();
		driver.quit();
		System.out.println("Completed");
	}
}