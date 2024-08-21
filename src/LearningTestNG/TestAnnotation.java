package LearningTestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestAnnotation {

	@Test
	public void run()
	{
		Reporter.log("This is from run",true);
	}
	
}
