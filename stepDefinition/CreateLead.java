package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;

//import io.cucumber.java.en.Given;

import io.cucumber.java.en.When;

public class CreateLead extends BaseClass {
	
	@When("click on the crmsfa link")
	public void clickCrmsfaLink() {
		driver.findElement(By.linkText("CRM/SFA")).click();
	}
		@When("click on the leads tab")
		public void cliclkLeads() {
			
			driver.findElement(By.linkText("Leads")).click();
			
		}
		@When("click on the create lead link")
		public void clickCreateLead() throws InterruptedException {
			driver.findElement(By.linkText("Create Lead")).click();
			Thread.sleep(3000);
			
		}
		@Given ("enter the company name as {string}")
		public void enterCompanyName( String cname) {
			driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cname);
			
		}
       @Given ("enter the first name as {string}")
		public void enterFirstName(String fname) {
    	   driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
		}
		@Given ("enter the last name as {string}")
		public void enterLasrName(String lname ) {
			driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
			
		}
		
			
		
		@When("click on the submit button")
		public void clickSubmitButton() {
			driver.findElement(By.name("submitButton")).click();
		}
		
			
		}

