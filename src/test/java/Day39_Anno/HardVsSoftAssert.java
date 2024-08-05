package Day39_Anno;

import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

import junit.framework.Assert;

public class HardVsSoftAssert {
	
	//@Test
	void test_hardAssertions()
	{
		System.out.println("testing ...");
		System.out.println("testing...");
		
		Assert.assertEquals(1, 2);
		
		System.out.println("hard Assert complete");
		
		Assert.assertEquals(1, 1);
		
	}
	
	@Test
	void test_SoftAssertions()
	{
		System.out.println("testing ...");
		System.out.println("testing...");
		
		SoftAssert sa=new SoftAssert();
		sa.assertEquals(1, 2);
		
		
		System.out.println("hard Assert complete");
		
		sa.assertEquals(1, 1);
		sa.assertAll();
		
	}

}
