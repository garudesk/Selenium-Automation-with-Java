package SeleniumAutomationWithJava;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kanchan\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
        driver.get("https://jqueryui.com/droppable/");
        
        clickOn(driver, driver.findElement(By.xpath("//a[contains(text(),'About')]")), 20);
		
		
	}
	
	
	//this method will help in case of, when particular element has to be loaded fully until then wait for performing some action,
	//once the element is loaded now perform the action.
	//this method called for giving some time wait with that element is ready for usable and now perform action. 
	//here in this example we explicitly wait for ABOUT link.
	
	
	public static void clickOn(WebDriver driver,WebElement locator,int timeout) {
		
new WebDriverWait(driver,timeout).ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementToBeClickable(locator));
locator.click();	
	}
}
