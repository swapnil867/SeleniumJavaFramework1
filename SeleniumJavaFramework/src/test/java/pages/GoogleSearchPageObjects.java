package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

//Locating object here.

public class GoogleSearchPageObjects {
	
	WebDriver driver = null;
	
	By texbox_search = By.name("q");
	By button_search = By.name("btnK");
	
	public GoogleSearchPageObjects(WebDriver driver){
		this.driver = driver;
	}
	
	public void searchTextInSearchBox(String text) {
		
		driver.findElement(texbox_search).sendKeys(text);
		
	}
	
	public void clickSearchButton() {
		
		driver.findElement(button_search).sendKeys(Keys.RETURN);
	}

}
