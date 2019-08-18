package SeleniumAutomationWithJava;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertWindows {

	public static void main(String[] args) throws InterruptedException {

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kanchan\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Alerts.html");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
		
	
		Alert alert= driver.switchTo().alert(); //control goes to the alert windows and then pass to alert object refrence.	
		
		System.out.println(alert.getText());
		
	    Thread.sleep(800);
		
	    if(alert.getText().equals("I am an alert box!")){
	    
	    	System.out.println("Correct massage displed !");
	    	
	    }
	    
	    else
	    {
	    	
	    	System.out.println("Not Correct massage displed");

	    }
	    
		alert.accept();
		Thread.sleep(800);
		
		driver.findElement(By.xpath("//a[contains(text(),'Alert with OK & Cancel')]")).click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		Thread.sleep(1000);
		Alert alert1 = driver.switchTo().alert();
		Thread.sleep(1000);
	    System.out.println(alert1.getText());
	    Thread.sleep(800);
	    alert1.dismiss();
	    
	    driver.findElement(By.xpath("//a[contains(text(),'Alert with Textbox')]")).click();
	    
		driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
		
		Alert alert3 = driver.switchTo().alert();
		
		System.out.println(alert3.getText());

		alert3.sendKeys("Suhas");
		
		alert3.accept();
	
	}

}
