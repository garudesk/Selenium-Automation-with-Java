package SeleniumAutomationWithJava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMovement {

	public static void main(String[] args) throws InterruptedException {

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kanchan\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();

		
		driver.get("http://demo.automationtesting.in/Windows.html");
		
				
		Actions action = new Actions(driver);// Action class is being accessed for using different methods like "moveToElement".
		
		action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'SwitchTo')]"))).build().perform();//Actuallly curser is moved to target object.
		
//		Thread.sleep(1000);
		
	    driver.findElement(By.xpath("//ul[@class='dropdown-menu']//a[contains(text(),'Frames')]")).click();
		
	}

}
