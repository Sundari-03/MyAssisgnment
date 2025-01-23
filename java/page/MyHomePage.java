package page;

import org.openqa.selenium.By;

import base.ProjectSpecificMethods;

public class MyHomePage extends ProjectSpecificMethods{
	
public MyAccountPage clickonAccounts () throws InterruptedException  {
	
	
	driver.findElement(By.linkText("Accounts")).click();
	Thread.sleep(2000);
	return new MyAccountPage();
		
	}
	



}
