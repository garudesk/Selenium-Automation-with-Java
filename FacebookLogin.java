package SeleniumAutomationWithJava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookLogin {

	public static void main(String[] args) {
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kanchan\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.name("firstname")).sendKeys("suhas");
		driver.findElement(By.name("lastname")).sendKeys("garude");
		driver.findElement(By.xpath("//input[@id='u_0_q']")).sendKeys("garudesk@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("garudesk@gmail.com");
		driver.findElement(By.xpath("//input[@id='u_0_x']")).sendKeys("Suhas8020");
     	Select sc = new Select(driver.findElement(By.id("day")));
     	sc.selectByVisibleText("17");
     	Select sc1 = new Select(driver.findElement(By.id("month")));
     	sc1.selectByVisibleText("Sept");
     	Select sc2 = new Select(driver.findElement(By.id("year")));
     	sc2.selectByVisibleText("1990");	
     	WebElement click = driver.findElement(By.id("u_0_6"));
     	
     	//driver.findElement(By.id("u_0_6")).click();;
     	click.click();
        WebElement click1 =   driver.findElement(By.xpath("//button[@id='u_0_15']"));;
     	click1.click();
  
		//driver.quit();
		
		
	}

}
