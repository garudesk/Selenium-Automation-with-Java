package SeleniumAutomationWithJava;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicGoogleSearch {

	public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kanchan\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
        driver.get("http://www.google.com");
        
        driver.findElement(By.xpath("//input[@name='q']")).sendKeys("movies");
                
        List<WebElement> list = driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='sbl1']"));//imp line we use here findelements not findelement.
        
        System.out.println("No of suggesions ---- "+list.size());
       
        for(WebElement eb :list) //we iterate the elements one by one from list this is advance FOR loop.
         {
        	
        	System.out.println(eb.getText());//printing the all elements
        
        }       
        
        for(WebElement eb1:list)
        {
        if(eb1.getText().trim().equals("movies download"))//finding particular search and clicking that.
        {
           eb1.click();
           break;
        }
        }
  
	}

}
