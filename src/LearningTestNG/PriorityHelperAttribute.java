package LearningTestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class PriorityHelperAttribute {

	@Test(priority = 3)
	public void run()
	{
		Reporter.log("This is from run",true);
	}
	
	@Test(priority = 2)
	public void pause()
	{
		Reporter.log("This is from pause",true);
	}
	
	@Test(priority = 1)
	public void add()
	{
		Reporter.log("This is from add",true);
	}
}
