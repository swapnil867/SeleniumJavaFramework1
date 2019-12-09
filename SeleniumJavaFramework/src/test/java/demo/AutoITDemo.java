package demo;

import java.awt.RenderingHints.Key;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoITDemo {
	
	public static void main(String[] args) throws Exception {
		test();
	}

		public static void test() throws Exception  {
			String projectPath = System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/ChromeDriver/chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			
			driver.get("http://www.tinyupload.com/");
			
			driver.findElement(By.name("uploaded_file")).sendKeys(Keys.RETURN);
			
			Runtime.getRuntime().exec("C:/Users/pujak/Desktop/Selenium/AutoIT_Scripts/File2.txt");
			
			Thread.sleep(3000);
			driver.close();
		}
}
