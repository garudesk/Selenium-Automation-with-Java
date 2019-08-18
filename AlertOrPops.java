package SeleniumAutomationWithJava;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertOrPops {

	public static void main(String[] args) {
	
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kanchan\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.name("proceed")).click();
		
		Alert alert = driver.switchTo().alert();
		
        System.out.println(alert.getText());
		
		String str = alert.getText();
		
		if(str.equals("Please enter a valid user name"));
		
		{
			System.out.println("Message correct printed");
		}
		
	//	else
			
		//{	
			//System.out.println("Message does not correct printed");
	
	    //}
		
		
	    alert.accept();
		
		

	}

}
