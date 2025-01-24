package marathon3;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class DeleteLeadSales extends TestNG{
	
	
	@Test(dataProvider="sendData")
    public void CreateLead(String aname) throws InterruptedException {
	driver.findElement(By.xpath("//input[@placeholder='Search this list...']")).sendKeys(aname+ Keys.ENTER);
	Thread.sleep(2000);
	String noOfItems = driver.findElement(By.xpath("//span[@aria-label='Recently Viewed']")).getText();
	String[] s = noOfItems.split(" ");
	int countBeforeDelete = Integer.parseInt(s[0]);
	driver.findElement(By.xpath("//table/tbody/tr[1]/td[6]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[@title='Delete']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@title='Delete']")).click();
	Thread.sleep(2000);
	noOfItems = driver.findElement(By.xpath("//span[@aria-label='Recently Viewed']")).getText();
	s = noOfItems.split(" ");
	int countAfterDelete = Integer.parseInt(s[0]);


	Assert.assertTrue(countBeforeDelete==(countAfterDelete+1),"Verify the account has deleted");


	}
   
    
    @DataProvider
    public String[][] sendData() {
    	String[][] data= new String [2][1];
    	data [0][0] ="Sundari";
    	
    	data [1][0] ="Dhanu";
    	return data;
    			
    }



	}




