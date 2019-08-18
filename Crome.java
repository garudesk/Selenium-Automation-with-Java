package SeleniumAutomationWithJava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Crome {

	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kanchan\\Downloads\\chromedriver_win32\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();
	
	driver.get("https://upsc.gov.in/");
	
	String url = driver.getCurrentUrl();
	
	System.out.println(url);
	
	String title = driver.getTitle();
	
	System.out.println(title);
	
	driver.quit();
	
	driver.close();
	
	}}