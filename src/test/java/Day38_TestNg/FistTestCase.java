package Day38_TestNg;

import org.testng.annotations.Test;

/*
 * Open App
 * Login App
 * Logout
 */
public class FistTestCase {
	
	
	@Test(priority =3)
	void Logout()
	{
		System.out.println("Logout Application");
	}
	
	@Test(priority=1)
	
	void OpenApp()
	{
		System.out.println("Open Application");
	}
	
	@Test(priority =2)
	void Login()
	{
		System.out.println("Login Application");
	}
	
	
	
	

}
