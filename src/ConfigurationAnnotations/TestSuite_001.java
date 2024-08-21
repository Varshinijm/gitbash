package ConfigurationAnnotations;

import org.testng.Reporter;
import org.testng.annotations.Test;

import utility.BaseClass;

public class TestSuite_001 extends BaseClass{

	@Test
	public void login()
	{
		Reporter.log("from test suite001",true);
	}
}