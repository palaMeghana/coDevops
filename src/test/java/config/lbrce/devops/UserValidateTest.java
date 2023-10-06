package config.lbrce.devops;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.lbrce.devops.UserValidation;

public class UserValidateTest {
	@Test
	public  void testCase1()
	{
		UserValidation uv=new UserValidation();
		Assert.assertEquals(false,uv.check("meghana", "meghana@123"));
	}
	@Test
	public  void testCase2()
	{
		UserValidation uv=new UserValidation();
		Assert.assertEquals(false,uv.check("meghana", "meghana@123"));
	}
	@Test
	public  void testCase3()
	{
		UserValidation uv=new UserValidation();
		Assert.assertEquals(true,uv.check("vishnu", "vishnu@123"));
	}
	public  void testCase4()
	{
		UserValidation uv=new UserValidation();
		Assert.assertEquals(false,uv.check("meghana", "meghana@123"));
	}

}
