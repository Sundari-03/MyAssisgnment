package page;

import org.openqa.selenium.By;

import base.ProjectSpecificMethods;

public class LoginPage extends ProjectSpecificMethods {
	
	public LoginPage enterUsername () {
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
			// use return type for page navigation
		// we can use these four steps for return type
//		LoginPage lp = new LoginPage(); or 
//		return lp; or
//		return new LoginPage(); or 
		return this; // stay on the same page
	}
	
   public LoginPage enterPassword() {
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		return this; // stay on the same page
	
	}
	
   public WelcomePage clickLoginButton() throws InterruptedException {
		
		driver.findElement(By.className("decorativeSubmit")).click();
		Thread.sleep(2000);
		return new WelcomePage();  // navigate to next page
	}
} 
