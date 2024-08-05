package Day40_Groups;

import org.testng.annotations.*;

import junit.framework.Assert;

public class LoginTests {
	
	
	@Test(priority=1 , groups = {"sanity","regression"})
	void loginByEmail()
	{
		System.out.println("Login byEmail");
	}

	@Test(priority=2 , groups= {"sanity"})
	void loginByFaceBook()
	{
		System.out.println("Login by FaceBook");
		Assert.fail();
	}
	
	@Test(priority=2, groups= {"sanity"})
	void loginByTwitter()
	{
		System.out.println("Login by Twitter");
	}


}
