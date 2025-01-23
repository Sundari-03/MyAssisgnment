package page;



import org.openqa.selenium.By;

import base.ProjectSpecificMethods;

public class ViewAccountPage extends ProjectSpecificMethods{
	
public ViewAccountPage clickonAssignButton () throws InterruptedException  {  
		
	driver.findElement(By.name("submitButton")).click();
	Thread.sleep(2000);
	return this;
	}
	

}
