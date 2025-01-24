package marathon3;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class CreateLeadSales extends TestNG {
	
 
	
    @Test(dataProvider="sendData")
    public  void CreateLead(String aname) throws InterruptedException {	
		
		
	
	driver.findElement(By.xpath("//button[@class='slds-button slds-context-bar__button slds-icon-waffle_container slds-show']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[text()='View All']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//p[text()='Sales']/ancestor::a")).click();
	Thread.sleep(2000);
	WebElement element =driver.findElement(By.xpath("//a[@title='Accounts']"));
	JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("arguments[0].click();", element);
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[@title='New']")).click();
	String accountName = aname;
	driver.findElement(By.xpath("//label[text()='Account Name']/following::input")).sendKeys(accountName);
	WebElement ownershipDD = driver.findElement(By.xpath("//button[@aria-label='Ownership']"));
	driver.executeScript("arguments[0].click()",ownershipDD);
	driver.findElement(By.xpath("//span[@class='slds-truncate'  and text()='Public']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
	Thread.sleep(2000);
	String toastMessage = driver.findElement(By.xpath("//span[@class='toastMessage slds-text-heading--small forceActionsText']")).getText();
	System.out.println(toastMessage);
	Assert.assertTrue(toastMessage.contains(accountName),"Verify the Account name");
	}

    @DataProvider
    public String[][] sendData() {
    	String[][] data= new String [2][1];
    	data [0][0] ="Sundari";
    	
    	data [1][0] ="Dhanu";
    	return data;
    			
    }
}
	



