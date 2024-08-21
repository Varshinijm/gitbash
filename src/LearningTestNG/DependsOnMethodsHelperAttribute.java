package LearningTestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOnMethodsHelperAttribute {

	@Test(priority=1)
	public void openAccount()
	{
		int i=1/0;
		Reporter.log("Account created",true);
	}
	@Test(priority=5)
	public void deleteAccount()
	{
		Reporter.log("Account deleted",true);
	}
	@Test(priority=2)
	public void updateMobileNumber()
	{
		Reporter.log("Updated Mobile number",true);
	}
	@Test(priority=4,dependsOnMethods = {"openAccount","addBenificiary"})
	public void amountTransfer()
	{
		Reporter.log("Transferring amount",true);
	}
	@Test(priority=3)
	public void addBenificiary()
	{
		Reporter.log("Added Beneficiary",true);
	}
}
