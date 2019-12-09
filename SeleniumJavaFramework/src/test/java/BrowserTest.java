import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserTest {

		public static void main(String[] args) {
			
			String projectPath = System.getProperty("user.dir");
			System.out.println("projectPath" + projectPath);
				//Run URL On Fireforx
				System.setProperty("webdriver.gecko.driver", projectPath+"/drivers/geckodriver/geckodriver.exe");
				WebDriver driver = new FirefoxDriver();
				driver.get("http://lifecharger.org/"); 
				
				//System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/ChromeDriver/chromedriver.exe");
				//WebDriver driver = new ChromeDriver();
				//driver.get("http://lifecharger.org/");
			 
				//System.setProperty("webdriver.ie.driver", projectPath+ "/drivers/iedriver/IEDriverServer.exe");
				//WebDriver driver = new InternetExplorerDriver();
				driver.get("http://lifecharger.org/");
				driver.close();
				driver.quit();
		}
}
