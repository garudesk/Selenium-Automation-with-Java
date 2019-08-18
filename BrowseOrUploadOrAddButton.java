package SeleniumAutomationWithJava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowseOrUploadOrAddButton {

	public static void main(String[] args) {

	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kanchan\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Register.html");
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
	 //   driver.findElement(By.xpath("//input[@id='input_resumeParser']")).sendKeys("E:\\MPSC Interview Transcripts.pdf");
		
	    driver.findElement(By.xpath("//input[@id='imagesrc']")).sendKeys("E:\\MPSC Interview Transcripts.pdf");

		
		//driver.findElement(By.id("fileUploadButton")).sendKeys("C:\\Users\\Public\\Pictures\\Sample Pictures\\Chrysanthemum.jpg");
		
		
	}

}
