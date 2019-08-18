package SeleniumAutomationWithJava;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowPopups {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kanchan\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
        driver.get("http://www.popuptest.com/goodpopups.html");
        
        driver.findElement(By.xpath("//a[contains(@class,'blu')]")).click();
        
             
        Set<String>  handle = driver.getWindowHandles();//gives you windows ids.
		
        Iterator<String> it = handle.iterator();//gives the pointing values of windows ids.
        
       String parent =  it.next();//it will point the first set of values that is parent id
       
       System.out.println("Parent window : "+parent);
       
       String child = it.next();//it will point the next set of values from parent id that is child.
       
       System.out.println("Child Window : "+child);
       
       Thread.sleep(5000);
       
       driver.switchTo().window(child);//switch the control to the child window from parent window.
       
       System.out.println(driver.getTitle());
       
       driver.close();//close the current windows that is child windows.
       
       Thread.sleep(5000);
       
       driver.switchTo().window(parent);
       
       System.out.println(driver.getTitle());
       
       
	}

}
