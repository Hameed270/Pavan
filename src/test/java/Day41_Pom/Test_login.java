package Day41_Pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class Test_login {
	
	WebDriver driver;
	
	@BeforeClass
	void setup()
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); 
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		
	}
	
	@Test
	void testlogin()
	{
		Page_login pg=new Page_login(driver);
		pg.setusername("Admin");
		pg.setPassword("admin123");
		pg.clickbtn();
		
		Assert.assertEquals(driver.getTitle(), "OrangeHRM");
		
	}
	
	@AfterClass
	void logout() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.quit();
	}
	

}
