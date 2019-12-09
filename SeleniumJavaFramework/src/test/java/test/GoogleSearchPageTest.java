package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.GoogleSearchPageObjects;

public class GoogleSearchPageTest {

	private static WebDriver driver = null;
	public static void main(String[] args) {
		googleSearchTest();

	}
	public static void googleSearchTest() {

		//Set the path of chrome driver
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/ChromeDriver/chromedriver.exe");
		driver = new ChromeDriver();
		
		GoogleSearchPageObjects searchPageObj = new GoogleSearchPageObjects(driver);
		
		//Actual Test
		driver.get("https://google.com");
		
		searchPageObj.searchTextInSearchBox("A B C D");
		searchPageObj.clickSearchButton();
		driver.close();
	}

}
