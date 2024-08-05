package Day40_Groups;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import junit.framework.Assert;

public class DataProviderDemo {
	
	
	WebDriver driver;
	
	
	
	@BeforeClass
	void Setup()
	{
		driver=new ChromeDriver();
	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	
	@Test(dataProvider = "dp")
	void login( String email, String pwd)
	{
		driver.get("https://www.nopcommerce.com/en/login?returnUrl=%2Fen");
		driver.findElement(By.xpath("//input[@type'checkbox']")).click();
		driver.findElement(By.xpath("//input[@class='username']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@class='password']")).sendKeys(pwd);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		String act="nopcommerce demo store";
		String exp=driver.getTitle();
		
		Assert.assertEquals(act, exp);
		
		
		
	}
	
	@AfterClass
	void Logout() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.quit();
	}
	
	@DataProvider(name="dp")
	
	String [][] loginData()
	
	{
		String str[][]= {
				
				{"abc@gmail.com","test123"},
				{"pavanol@gmail.com","test@123"},
				{"pavanoltraining@gmail.com","test3"},
				{"pavanoltraining@gmail.com","test@123"},
				{"pavanoltraining@gmail.com","test@123"}
				
		};
		return str;
	}
	
	

}
