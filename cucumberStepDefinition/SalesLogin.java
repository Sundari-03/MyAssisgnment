package cucumberStepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class SalesLogin extends SalesforceBase {
	
	@Given("setup the salesforce environment")
	public void setupenvnt() {
		driver = new ChromeDriver();
		driver.get("https://login.salesforce.com");
		driver.manage().window().maximize();
	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	
	@Given("enter the salesforce username as {string}")
	public void enterUsername(String uName)
	{
		driver.findElement(By.id("username")).sendKeys(uName);

	}
	@Given("enter the salesforce password as {string}")
	public void enterpassword(String pwd)
	{
		driver.findElement(By.id("password")).sendKeys(pwd);

	}
	
	@Then("click on login")
	public void clicklogin() {
		
		driver.findElement(By.id("Login")).click();
	}

}
