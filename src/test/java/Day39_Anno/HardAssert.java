package Day39_Anno;

import org.testng.Assert;
import org.testng.annotations.*;

public class HardAssert {
	
	@Test
	void login()
	{
		String str="Hameed";
		
		Assert.assertEquals(str,"hameed"); //fail
		//Assert.assertTrue(false);//fail
		//Assert.assertTrue(true); //true
		//Assert.assertFalse(false);//true
		//Assert.assertFalse(true);//false
		//Assert.fail(); //Assert.assertTrue(false);//fail
	}

}
