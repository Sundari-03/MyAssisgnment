package testcase;

import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import page.LoginPage;

public class TC_001_LoginPage extends ProjectSpecificMethods{
	
	@Test
	public void runlogin() throws InterruptedException 
	{
		LoginPage lp = new LoginPage();
		lp.enterUsername()
		.enterPassword()
		.clickLoginButton()
		.clickcrmsbutton()
		.clickonAccounts()
		.clickonCreateAccounttab()
		.enterAccountName()
		.enterPhno()
		.clickonCreatAccountbutton()
		.clickonAssignButton();	
		
		
	}

}
