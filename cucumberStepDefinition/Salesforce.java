package cucumberStepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Salesforce extends SalesforceBase {
	
	
	
	@When("Click on toggle menu")
	public void clickToggle() throws InterruptedException
	{
		driver.findElement(By.xpath("//button[@class='slds-button slds-context-bar__button slds-icon-waffle_container slds-show']")).click();
		Thread.sleep(2000);

	}
	
	@When("Click view All")
	public void clickviewAll()
	{
		driver.findElement(By.xpath("//button[@aria-label='View All Applications']")).click();

	}
	
	Actions action = new Actions(driver);
	@When("click Sales from App Launcher")
	public void clicksales() throws InterruptedException {
		
		
		Thread.sleep(2000);
		WebElement legal = driver.findElement(By.xpath("//p[@class='slds-truncate' and text()='Sales']"));
		action.moveToElement(legal).click().build().perform();
		
	}
	
	@When("Click on Accounts tab")
	public void clickAccounts() {
		WebElement account = driver.findElement(By.xpath("//span[@class='slds-truncate' and text()='Accounts']"));
		action.moveToElement(account).click().build().perform();
		
	}
	
	@When("Click on New button")
	public void clicknewButton()
	{
		driver.findElement(By.xpath("//div[@title='New' and text()='New']")).click();

	}
	
	@Given("Enter the account name as {string}")
	public void enteraccountname(String aName)
	{
		driver.findElement(By.xpath("//input[@name='Name']")).sendKeys(aName);
	}
	
	@When("Select Ownership as Public")
	public void selectpublic() throws InterruptedException
	{
		WebElement element = driver.findElement(By.xpath("//label[text()='Ticker Symbol']"));
		//action.moveToElement(element).click().build().perform();
	    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    	Thread.sleep(2000);
//		
		////label[text()='Ownership']/following-sibling::div
		
		 driver.findElement(By.xpath("//label[text()='Ownership']/following-sibling::div")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//lightning-base-combobox-item/span/span[text()='Public']")).click();
		 Thread.sleep(2000);
	}
	
	@When("Click save")
	public void save()
	{
		driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
	}
	
	@Then("verify Account name")
	public void verifyaccount()
	{
	    System.out.println(driver.findElement(By.xpath("//span[@class='toastMessage slds-text-heading--small forceActionsText']")).getText());

	}
}

