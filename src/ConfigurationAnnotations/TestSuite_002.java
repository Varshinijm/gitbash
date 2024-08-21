package ConfigurationAnnotations;

import org.testng.Reporter;
import org.testng.annotations.Test;

import utility.BaseClass;

public class TestSuite_002 extends BaseClass{

	@Test
	public void login()
	{
		Reporter.log("from test suite002",true);
	}
}