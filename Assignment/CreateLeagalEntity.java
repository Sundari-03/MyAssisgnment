package week6.Assignment;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class CreateLeagalEntity extends Salesforce{
    @Test
	public  void legalEntity() throws Exception
	{
		// TODO Auto-generated method stub
		driver.findElement(By.xpath("//input[@id='input-152']")).sendKeys("Sundari");
		
		// Click save
		
		  driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
		  
		  String verifydata = driver.findElement(By.xpath("//span[@class='toastMessage slds-text-heading--small forceActionsText']")).getText();
		  
		  // verify the name
		    
	    if(verifydata.contains("Legal Entity \"Sundari\" was created."))
	    {
		    System.out.print("pass");
	    }
	    else
	    {
		    	throw new Exception("This is not varified.");
		    }
		    

	}

}
