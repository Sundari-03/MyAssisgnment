package marathon3;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class EditLeadSales extends TestNG{

	    @Test(dataProvider="sendData")
		public  void main(String baddress,String saddress) throws InterruptedException {
		
		Actions action = new Actions(driver);
		WebElement edit = driver.findElement(By.xpath("//span[@class='slds-icon_container slds-icon-utility-down']"));
		action.moveToElement(edit).click().build().perform();
	
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@title='Edit']")).click();
		Thread.sleep(2000);
		WebElement typeDD = driver.findElement(By.xpath("//button[@aria-label='Type']"));
		driver.executeScript("arguments[0].click()",typeDD);
		driver.findElement(By.xpath("//lightning-base-combobox-item[@data-value='Technology Partner']")).click();
		Thread.sleep(2000);
		WebElement industryDD = driver.findElement(By.xpath("//button[@aria-label='Industry']"));
		driver.executeScript("arguments[0].click()",industryDD);
		driver.findElement(By.xpath("//lightning-base-combobox-item[@data-value='Healthcare']")).click();
		Thread.sleep(2000);
		WebElement biilingStreet = driver.findElement(By.xpath("//label[text()='Billing Street']/following::div/textarea"));
		biilingStreet.clear();
		Thread.sleep(1000);
		biilingStreet.sendKeys(baddress);
		Thread.sleep(2000);
		
		WebElement shippingStreet = driver.findElement(By.xpath("//label[text()='Shipping Street']/following::div/textarea"));
		shippingStreet.clear();
		Thread.sleep(1000);
		shippingStreet.sendKeys(saddress);
		WebElement priorityDD = driver.findElement(By.xpath("//button[@aria-label='Customer Priority']"));
		driver.executeScript("arguments[0].click()",priorityDD);
		driver.findElement(By.xpath("//lightning-base-combobox-item[@data-value='Low']")).click();
		driver.findElement(By.xpath("//button[@aria-label='SLA']")).click();
		driver.findElement(By.xpath("//lightning-base-combobox-item[@data-value='Silver']")).click();
		WebElement activeDD = driver.findElement(By.xpath("//button[@aria-label='Active']"));
		driver.executeScript("arguments[0].click()",activeDD);
		driver.findElement(By.xpath("//lightning-base-combobox-item[@data-value='No']")).click();
		int randomNum1 = (int)(Math.random()*999999);
		int randomNum2 = (int)(Math.random()*999999);
		String phno = ""+randomNum1+randomNum2;
		phno = phno.substring(0,10);
		System.out.println(phno);
		WebElement phnoField = driver.findElement(By.xpath("//input[@name='Phone']"));
		phnoField.clear();
		phnoField.sendKeys(phno);
		WebElement upsellOpportunityDD = driver.findElement(By.xpath("//button[@aria-label='Upsell Opportunity']"));
		driver.executeScript("arguments[0].click()",upsellOpportunityDD);
		driver.findElement(By.xpath("//lightning-base-combobox-item[@data-value='No']")).click();
		driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
		Thread.sleep(2000);
		String phnoStr = driver.findElement(By.xpath("//table/tbody/tr[1]/td[4]")).getText();
		System.out.println(phnoStr);
		Assert.assertTrue(phnoStr.contains(phno),"Verify the phone name");
        
		}

	   @DataProvider
	    public String[][] sendData(){
	    	String[][] data= new String [2][1];
	    	data [0][0] = "billing adress1";
	        data [0][1] = "shipping address1";
	        
	    	
	        data [1][0] = "billing adress2";
	        data [1][1] = "shipping address2";
	        
	    	
	    	return data;
	    	
	    			
	    }

		}



	
