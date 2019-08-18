package SeleniumAutomationWithJava;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kanchan\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://jqueryui.com/droppable/");
		
		driver.switchTo().frame(0);		
		Actions action = new Actions(driver);
		
		action.clickAndHold(driver.findElement(By.xpath("//div[@id='draggable']")))
				.moveToElement(driver.findElement(By.xpath("//div[@id='droppable']"))).release().build().perform();
		
	
		
	}

}
