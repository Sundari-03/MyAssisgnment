package page;

import org.openqa.selenium.By;

import base.ProjectSpecificMethods;

public class CreateAccountPage extends ProjectSpecificMethods{
	
public CreateAccountPage enterAccountName ()  {
	
	driver.findElement(By.id("accountName")).sendKeys("Sundari1 R");
		return this;
	}
public CreateAccountPage enterPhno ()  {
	
	driver.findElement(By.id("primaryPhoneNumber")).sendKeys("97");
	return this;
	}
	
public ViewAccountPage clickonCreatAccountbutton () throws InterruptedException  {
	
	
	driver.findElement(By.className("smallSubmit")).click();
	Thread.sleep(2000);
	 return new ViewAccountPage();
	
}


}
