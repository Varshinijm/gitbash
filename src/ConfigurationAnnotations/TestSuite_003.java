package ConfigurationAnnotations;

import org.testng.Reporter;
import org.testng.annotations.Test;

import utility.BaseClass;

public class TestSuite_003 extends BaseClass{

	@Test
	public void login()
	{
		Reporter.log("from test suite003 login",true);
	}
	
	@Test
	public void login1()
	{
		Reporter.log("from test suite003 login1",true);
	}
}