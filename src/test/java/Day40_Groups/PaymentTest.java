package Day40_Groups;

import org.testng.annotations.*;

public class PaymentTest {
	
	
	@Test(priority=1 , groups = {"sanity"})
	void signupByemail()
	{
		System.out.println("Sign up by email");
	}
	
	@Test(priority=2, groups= {"sanity","regression"})
	void signupByfacebook()
	{
		System.out.println("Sign up by facebook");
	}
	
	@Test(priority=3 , groups= {"regression"})
	void signupBytwitter()
	{
		System.out.println("Sign up by email");
	}
	

}
