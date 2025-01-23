package page;

import org.openqa.selenium.By;

import base.ProjectSpecificMethods;

public class WelcomePage extends ProjectSpecificMethods{
	
	
	
	public MyHomePage clickcrmsbutton () throws InterruptedException  {
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		Thread.sleep(2000);
		return new MyHomePage ();
	}

}
