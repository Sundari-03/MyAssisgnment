package cucumberStepDefinition;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

//import org.openqa.selenium.interactions.Actions;
////
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
//import io.cucumber.java.en.When;

//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;

public class SalesforceEdit extends SalesforceBase{	
	
	Actions action =new Actions(driver);
	
	@When("Click the App Launcher Icon")
	public void clickAppLaun () throws InterruptedException {
		driver.findElement(By.xpath("//button[@class='slds-button slds-context-bar__button slds-icon-waffle_container slds-show']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@aria-label='View All Applications' and text()='View All']")).click();
		Thread.sleep(2000);
	}
	
	
	
	@When("Select Accounts")
   public void selectAcco () throws InterruptedException {
		WebElement accounts = driver.findElement(By.xpath("//p[@class='slds-truncate' and text()='Accounts']"));
		Actions action =new Actions(driver);
		action.moveToElement(accounts).click().build().perform();
		Thread.sleep(2000);
	}
	
	@Given("enter account name in search box as {string}")
   public void  enteraccount(String aName) throws InterruptedException {
		
		driver.findElement(By.xpath("//input[@name='Account-search-input']")).sendKeys(aName,Keys.ENTER);
		Thread.sleep(2000);
		
	}
	
   @When("Click the dropdown icon next to the account")
	public void clickDropDown () throws InterruptedException {
	
	   List<WebElement> webElements = driver.findElements(By.xpath("//span[@class='slds-icon_container slds-icon-utility-down']"));
	   WebElement edit = webElements.get(0);
	   Actions action =new Actions(driver);
	   action.moveToElement(edit).click().build().perform();
		Thread.sleep(2000);
	}
   @When("Select Edit")
	public void selectedit () throws InterruptedException {
	   WebElement click = driver.findElement(By.xpath("//div[@class='forceActionLink' and text()='Edit']"));
	Actions action =new Actions(driver);	
   action.moveToElement(click).click().build().perform();
	 Thread.sleep(2000);
	}
   
   @When("Set Type to Technology Partner")
	public void selecttechnologyPartner () throws InterruptedException {
	   WebElement webElementType = driver.findElement(By.xpath("//label[text()='Type']/following-sibling::div"));
	   Actions action =new Actions(driver);	
		 action.moveToElement(webElementType).click().build().perform();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//label[text()='Type']/following-sibling::div")).click();
		 Thread.sleep(2000);
       driver.findElement(By.xpath("//lightning-base-combobox-item/span/span[text()='Technology Partner']")).click();
       Thread.sleep(2000);
	}
   
   @When("Set Industry to Healthcare")
	public void selectHealthcare () throws InterruptedException {
	   driver.findElement(By.xpath("//label[text()='Industry']/following-sibling::div")).click(); 
		Thread.sleep(2000);
		Actions action =new Actions(driver);	
		WebElement webElementIndustry = driver.findElement(By.xpath("//lightning-base-combobox-item/span/span[text()='Healthcare']"));
		 action.moveToElement(webElementIndustry).click().build().perform();
		 Thread.sleep(1000);
		
	}
   
   @Given("Enter the Billing Address as {string}")
	public void enterBillingAddre (String bAddress) {
	   driver.findElement(By.xpath("//label[@class='slds-form-element__label' and text()='Billing Street'] /following::div/textarea")).sendKeys("Billing Address1");
		 // Enter the Shipping Address (parameterized value) 
		
	}
   
   @Given("Enter the Shipping Address as {string}")
	public void enterShippingAddre (String sAddress) {
		 driver.findElement(By.xpath("//label[@class='slds-form-element__label' and text()='Shipping Street'] /following::div/textarea")).sendKeys(sAddress);

		
   }
   
   @When("Set Customer Priority to Low")
	public void setCustomerPriority () throws InterruptedException {
	   Actions action =new Actions(driver);	
	   WebElement webElementBillingZip = driver.findElement(By.xpath("//label[text()='Billing Country']/following::div/input"));
		 action.moveToElement(webElementBillingZip).click().build().perform();
       Thread.sleep(2000);
       driver.findElement(By.xpath("//label[text()='Customer Priority']/following-sibling::div")).click();
       Thread.sleep(1000);
       driver.findElement(By.xpath("//lightning-base-combobox-item/span/span[text()='Low']")).click();
       Thread.sleep(1000);
	}
   
   @When("Set SLA to Silver")
	public void SetSlaSilver () throws InterruptedException {
	   driver.findElement(By.xpath("//label[text()='SLA']/following-sibling::div")).click();
       driver.findElement(By.xpath("//lightning-base-combobox-item/span/span[text()='Silver']")).click();
       Thread.sleep(2000);
		
	}
   
   @When("Set Active to NO")
	public void setActive () throws InterruptedException {
//	   Actions action =new Actions(driver);	
//	   WebElement webElementUpsellOpportunity = driver.findElement(By.xpath("//label[text()='Upsell Opportunity']"));
//       action.sendKeys(Keys.TAB).build().perform();
       action.sendKeys(Keys.TAB).build().perform();
       action.sendKeys(Keys.TAB).build().perform();
       action.sendKeys(Keys.TAB).build().perform();
       action.sendKeys(Keys.TAB).build().perform();
//	   action.moveToElement(webElementUpsellOpportunity).click().build().perform();
       Thread.sleep(1000);
       driver.findElement(By.xpath("//label[text()='Active']/following::div/lightning-base-combobox")).click();
       Thread.sleep(1000);
       driver.findElement(By.xpath("//lightning-base-combobox-item[@id='combobox-button-335-1-335']/span/span[text()='No']")).click();
   }  
  
   @When("Set Upsell Opportunity to No")
   public void selectupsell() throws InterruptedException
   {
	   Thread.sleep(1000);
       driver.findElement(By.xpath("//label[text()='Upsell Opportunity']/following::div/lightning-base-combobox")).click();
       Thread.sleep(1000);
       driver.findElement(By.xpath("//lightning-base-combobox-item[@id='combobox-button-326-2-326']/span/span[text()='No']")).click();
   }   
   @Given("Enter the phone number")
   public void enterphno () throws InterruptedException {
	   
	   WebElement webElementPhoneNumber = driver.findElement(By.xpath("//label[text()='Phone']/following::div/input"));
		 //action.moveToElement(webElementPhoneNumber).click().build().perform();
     action.sendKeys(Keys.PAGE_UP).build().perform();
		 webElementPhoneNumber.sendKeys("9");
     Thread.sleep(2000);
   }
  
  @Then("verify the phone number")
  public void verifyphno()
  {
      System.out.println(driver.findElement(By.xpath("//span[@class='forceOutputPhone slds-truncate'][1]")).getText());		 
  }
	   
	   
       
//		
//	}
//
//   @Then("verify the phone number ")
//	public void verifyPhno () {
//		
//	}
   
}
