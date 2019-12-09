package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {
		googleSearch();
		//Thread.sleep(3000);
	}
	
	public static void googleSearch() {
		//Set the path of chrome driver
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/ChromeDriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	
			//Go to google.com 
		driver.get("https://www.google.com/");
		
			//Enter text into search textbox
		driver.findElement(By.name("q")).sendKeys("Automation Step by step");
			//Click on search button
		//driver.findElement(By.name("btnK")).click();
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
			//Close the browser
	//	driver.close();
		
		System.out.println("Test Completed");
	
	}
}
