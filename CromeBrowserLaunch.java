package SeleniumAutomationWithJava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CromeBrowserLaunch {

	public static void main(String[] args) {

		
 System.setProperty("webdriver.gecko.driver","C:\\Users\\Kanchan\\Downloads\\geckodriver-v0.24.0-win64\\geckodriver.exe");
  
  WebDriver  driver = new FirefoxDriver();
  
  driver.get("https://www.mahapariksha.gov.in/OnlinePortal/loginPage");
  
  driver.close();
	}
}

//C:\Users\Kanchan\Downloads\chromedriver_win32

//"C:\Users\Kanchan\Downloads\geckodriver-v0.24.0-win64\geckodriver.exe"

//"C:\Users\Kanchan\Downloads\chromedriver_win32\chromedriver.exe"
