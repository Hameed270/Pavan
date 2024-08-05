package Day41_Pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page_login {
	
	WebDriver driver;
	
	//Constructor
	Page_login(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	//Locators
	
	@FindBy(xpath="//input[@name='username']") WebElement txt_username;
	
	//By txt_username=By.xpath("//input[@placeholder='Email Address']");
	
	@FindBy(xpath="//input[@type='password']") WebElement txt_password;
	
	@FindBy(xpath="//button[@type='submit']")  WebElement btn_enter;
	
	
	
	//Action Methods
	
	public void setusername(String user)
	{
		txt_username.sendKeys(user);
	}
	
	public void setPassword(String pwd)
	{
		txt_password.sendKeys(pwd);
	}
	
	public void clickbtn()
	{
		btn_enter.click();
	}

}
