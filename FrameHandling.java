package SeleniumAutomationWithJava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandling {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kanchan\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Frames.html");
		
		//driver.switchTo().frame("Invest with us");
		
		driver.switchTo().frame("SingleFrame");//frame identification with frame "name".
		
		//driver.switchTo().frame(0);//frame identification by index
		
		driver.findElement(By.xpath("//div[@class='col-xs-6 col-xs-offset-5']//input")).sendKeys("Suhas");
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//a[contains(text(),'Iframe with in an Iframe')]")).click();
		

	    driver.switchTo().frame(1);//frame identification with indexing.
	    
	    driver.switchTo().frame(0);
		
		driver.findElement(By.xpath("//div[@class='col-xs-6 col-xs-offset-5']//input")).sendKeys("Inside the frame");
		
		
	}

}
