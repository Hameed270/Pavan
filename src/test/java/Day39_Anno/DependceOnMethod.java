package Day39_Anno;

import org.testng.annotations.*;

import junit.framework.Assert;

public class DependceOnMethod {
	
	@Test(priority=1)
	void openApp()
	{
		Assert.assertTrue(false);
	}
	
	@Test(priority=2 , dependsOnMethods = {"openApp"})
	void Login()
	{
		Assert.assertTrue(true);
	}
	
	@Test(priority=3 , dependsOnMethods = {"Login"})
	void Search()
	{
		Assert.assertTrue(true);
	}
	
	@Test(priority=4,dependsOnMethods = {"Search"})
	void Adsearch()
	{
		Assert.assertTrue(true);
	}
	
	@Test(priority=5 ,dependsOnMethods = {"Adsearch"})
	void Logout()
	{
		Assert.assertTrue(true);
	}

}
