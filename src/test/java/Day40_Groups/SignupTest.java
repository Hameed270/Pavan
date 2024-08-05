package Day40_Groups;

import org.testng.annotations.*;

import junit.framework.Assert;

public class SignupTest {
	
	
	@Test(priority =1, groups= {"sanity","regression"})
	void pymentbyrupees()
	{
	
		System.out.println("Payment by Rupees");
	}
	
	@Test(priority =2, groups= {"regression"})
	void pymentbyDoller()
	{
	
		System.out.println("Payment by Rupees");
	
	}
	
	@Test(priority =3, groups= {"regression"})
	void pymentReturnbyBank()
	{
	
		System.out.println("Payment by Rupees");
	}

}
