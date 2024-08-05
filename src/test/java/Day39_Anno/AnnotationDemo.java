package Day39_Anno;

import org.testng.annotations.*;

public class AnnotationDemo {

	@BeforeMethod
	void Login()
	{
		System.out.println("Login into App");
	}
	@Test(priority =1)
	void search()
	{
		System.out.println("Search details");
	}
	@Test(priority=2)
	void Adsearch()
	{
		System.out.println("Advance search");
		
	}
	@AfterMethod
	void logout()

	{
		System.out.println("Logout app");
	}
}
