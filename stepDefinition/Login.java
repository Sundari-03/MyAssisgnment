package stepDefinition;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login extends BaseClass {
	

	
	@Given("setup the environment")
	public void setupEnvironment()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	@Given("enter the username as {string}")
	public void enterUsername (String uname) {
		driver.findElement(By.id("username")).sendKeys(uname);
			
	}
	@Given("enter the password as {string}")
	public void enterPassword(String pwd) {
		
		driver.findElement(By.id("password")).sendKeys(pwd);
	}
	
	@When("click on the login button")
	public void clickLoginButton() {
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
	}
	
	@Then("verify the login is success")
	public void verifyLogin()
	{
		String actulaResult = driver.findElement(By.xpath("//div[@id='form']/h2")).getText();
		System.out.print(actulaResult);
			
	}


}
