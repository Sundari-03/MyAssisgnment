package week6.Assignment2;



import org.openqa.selenium.By;


import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateCompany extends DynamicParameters  {
	
    @Test(dataProvider="sendData")
	public  void companyname(String name) throws Exception {
		
    	// Enter the name
    	driver.findElement(By.xpath("//input[@id='input-152']")).sendKeys("Salesforce Automation by  " + name);
//		 
       	    // Click on Save 
	    driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
	    
//	    String alert = driver.findElement(By.xpath("//ul[@class='errorsList slds-list_dotted slds-m-left_medium']/li/a")).getText();
//	    System.out.println(alert);
	    
	    String verifydata = driver.findElement(By.xpath("//span[@class='toastMessage slds-text-heading--small forceActionsText']")).getText();
	    
	    if(verifydata.contains("Legal Entity \"Salesforce Automation by Sundari\" was created."))
	    {
     System.out.print("pass");
	    }
	    else
	    {
	    	throw new Exception("This is not varified.");
	    }
    	
    }  	
    @DataProvider
    public String[][] sendData() {
    	String[][] data= new String [2][1];
    	data [0][0] ="Sundari";
    	
    	data [1][0] ="Sundari R";
    	return data;
    			
    }
}
