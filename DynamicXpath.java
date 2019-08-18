package SeleniumAutomationWithJava;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicXpath {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kanchan\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://jqueryui.com/droppable/");
		
		//driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Suhas");///DXPath -1
		
		//driver.findElement(By.xpath("//input[@name='s']")).sendKeys("Suhas111");///DXPath - 2
		
	//	driver.findElement(By.xpath("//input[contains(@name,'s')]")).sendKeys("Suhas3333");///DXPath - 3 with contains variable

		driver.findElement(By.xpath("//input[starts-with(@name,'s')]")).sendKeys("Suhas3333");///DXPath - 3 with "starts-with" variable

		
		
		
		
		
	}

}
