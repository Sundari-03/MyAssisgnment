package week6.Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;


public class Salesforce {
	
	  ChromeDriver driver ;
	  @Parameters({"url", "username", "password"})
    @BeforeMethod
	public  void precondition(String url,String username,String password)throws Exception
	
	{
		// TODO Auto-generated method stub
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.id("Login")).click();
		Thread.sleep(2000);

       // Click on the toggle menu button from the left corner 

		
		driver.findElement(By.xpath("//button[@class='slds-button slds-context-bar__button slds-icon-waffle_container slds-show']")).click();
		Thread.sleep(2000);
		// Click on View All
		driver.findElement(By.xpath("//button[@aria-label='View All Applications']")).click();
       //  Click Legal Entities from App Launcher
		Actions action = new Actions(driver);
		Thread.sleep(2000);
		WebElement legal = driver.findElement(By.xpath("//p[@class='slds-truncate' and text()='Legal Entities']"));
		action.moveToElement(legal).click().build().perform();
        Thread.sleep(2000);
		// - Click on the Dropdown icon in the legal Entities tab
		driver.findElement(By.xpath("//span[@class='slds-truncate' and text()='Legal Entities']/parent::a/following::one-app-nav-bar-item-dropdown")).click();
		//driver.findElement(By.xpath("//span[@class='slds-truncate' and text()='Legal Entities']/following::one-app-nav-bar-item-dropdown")).click();
		Thread.sleep(2000);
		 
		// click new legal entity
		WebElement legalEntity = driver.findElement(By.xpath("(//a[@tabindex='-1'and @role='menuitem'])[1]"));
		action.moveToElement(legalEntity).click().build().perform();

	}
	


    @AfterMethod
	public void postcondition()
	{
		driver.close();
		
	}
}
