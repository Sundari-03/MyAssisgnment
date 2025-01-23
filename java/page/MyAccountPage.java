package page;

import org.openqa.selenium.By;

import base.ProjectSpecificMethods;

public class MyAccountPage extends ProjectSpecificMethods {
	

	
	
public CreateAccountPage clickonCreateAccounttab () throws InterruptedException  {
	
	driver.findElement(By.linkText("Create Account")).click();
	Thread.sleep(2000);
	return new CreateAccountPage();
	
		
	}
	
		
	
	

}
