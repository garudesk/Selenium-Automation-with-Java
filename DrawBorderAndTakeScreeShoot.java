package SeleniumAutomationWithJava;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DrawBorderAndTakeScreeShoot {

	
	public static void main(String[] args) throws IOException {

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kanchan\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
        driver.get("http://www.globalsqa.com");
        
        WebElement sbc = driver.findElement(By.xpath("//li[@id='menu-item-1513']//a[contains(text(),'Home')]"));
	
        DrawBorder(sbc,driver);
        
        File scr =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scr, new File("C:\\Eclips instalation setup\\JavaBasics\\src\\SeleniumAutomationWithJava\\sample.png"));
        
		
	}
	
	public static void DrawBorder(WebElement element,WebDriver driver)
	
	{

       JavascriptExecutor js = ((JavascriptExecutor)driver);
       
       js.executeScript("arguments[0].style.border='3px solid red'", element);
       
    
	}
	
}
	
