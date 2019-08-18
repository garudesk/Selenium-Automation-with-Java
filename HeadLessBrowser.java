package SeleniumAutomationWithJava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.support.ui.Select;

public class HeadLessBrowser {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kanchan\\Downloads\\chromedriver_win32\\chromedriver.exe");
	//	WebDriver driver = new HtmlUnitDriver();
		
		
		ChromeOptions option = new ChromeOptions();
		
		//option.addArguments("window-size=1400,800");
		
		option.addArguments("headless");
		
		WebDriver driver = new ChromeDriver(option);
		
		driver.get("https://www.facebook.com/");
		System.out.println("Title of the page Before Login -- " +driver.getTitle());
		System.out.println("\n URL of the page Before Login --- " +driver.getCurrentUrl());
		driver.findElement(By.name("firstname")).sendKeys("mayur");
		driver.findElement(By.name("lastname")).sendKeys("suryavanshi");
		driver.findElement(By.xpath("//input[@id='u_0_q']")).sendKeys("skg8020@gmail.com");
	//	driver.findElement(By.name("reg_email_confirmation__")).sendKeys("skg8020@gmail.com");
		driver.findElement(By.xpath("//input[@id='u_0_x']")).sendKeys("Suhas8020");
     	Select sc = new Select(driver.findElement(By.id("day")));
     	sc.selectByVisibleText("17");
     	Select sc1 = new Select(driver.findElement(By.id("month")));
     	sc1.selectByVisibleText("Sept");
     	Select sc2 = new Select(driver.findElement(By.id("year")));
     	sc2.selectByVisibleText("1990");	
     	WebElement click = driver.findElement(By.xpath("//input[@id='u_0_6']"));
     	click.click();
        WebElement click1 = driver.findElement(By.xpath("//button[@id='u_0_15']"));;
     	click1.click();
  
     	System.out.println("\n Title of the page After Login --- "+driver.getTitle());
		System.out.println("\n URL of the page After Login --- " +driver.getCurrentUrl());

     	if(driver.getTitle().equals("Sign up for Facebook")) {
     		
     		System.out.println("\n Sign Up is Successful");
     		
     	}else {
     		System.out.println("\n Sign Up is Not Successful");
     	}
     	

	}

}
