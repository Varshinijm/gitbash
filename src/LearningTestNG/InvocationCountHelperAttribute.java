package LearningTestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class InvocationCountHelperAttribute {

	@Test(priority = 3,invocationCount = 2)
	public void run()
	{
		Reporter.log("This is from run",true);
	}
	
	@Test(priority = 2,invocationCount = 1)
	public void pause()
	{
		Reporter.log("This is from pause",true);
	}
	
	@Test(priority = 1,invocationCount = 0)
	public void add()
	{
		Reporter.log("This is from add",true);
	}
}
