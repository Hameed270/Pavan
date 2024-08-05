package Day38_TestNg;

import org.testng.annotations.Test;

import dev.failsafe.Timeout;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class OrangeHRMLogin {
 
	WebDriver driver;
	
    @Test(priority=1)
	void openApp()
	{
	    driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 
		
		
		
	}
    @Test(priority=2)
	void testLogo()
	{
		boolean display = driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
		
		System.out.println(display);
	}
    @Test(priority=3)
	void testLogin()
	{
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
    @Test(priority=4)
	void closeApp() throws InterruptedException
	{
	
    	Thread.sleep(3000);
    	driver.close();
	}
}
