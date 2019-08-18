package SeleniumAutomationWithJava;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FileProperties {
	
	static WebDriver driver;
	
	
	public static void main(String[] args) throws IOException {
		
	Properties pro = new Properties();
	
	FileInputStream in = new FileInputStream("C:\\Eclips instalation setup\\JavaBasics\\src\\SeleniumAutomationWithJava\\InputData.properties");
	
	pro.load(in);
	
	String url = pro.getProperty("URL");
	
	String browser = pro.getProperty("Browser");
	
	
	if(browser.equals("Crome")) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kanchan\\Downloads\\chromedriver_win32\\chromedriver.exe");
	
	driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	}else if (browser.equals("FF")) {
	
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Kanchan\\Downloads\\geckodriver_win32\\geckodriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
	}else if(browser.equals("IE")) {
		
		System.setProperty("webdriver.IE.driver", "C:\\Users\\Kanchan\\Downloads\\internetexplorardriver_win32\\internetexplorardriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
	}
	
      driver.get(url);
      
      driver.findElement(By.xpath(pro.getProperty("firstname_xpath"))).sendKeys(pro.getProperty("Firstname"));
      
      driver.findElement(By.xpath(pro.getProperty("lastname_xpath"))).sendKeys(pro.getProperty("Lastname"));
	
	 driver.findElement(By.xpath(pro.getProperty("male_click_xpath"))).click();
	 
	 driver.findElement(By.xpath(pro.getProperty("movies_checkbox_xpath"))).click();
	 
	 Select sc = new Select(driver.findElement(By.xpath(pro.getProperty("country_dropdown_xpath"))));
	 
	 sc.selectByVisibleText(pro.getProperty("selected_value_for_DD"));
	 
	// driver.close();
	 
	
	}

	}


