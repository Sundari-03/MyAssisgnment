package Week2.Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateAccount {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		//Maximize the browser
		driver.manage().window().maximize();		
		// load the url
		driver.get("http://leaftaps.com/opentaps");
		//locate the userField
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		// locate the password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		// click the login button
		driver.findElement(By.className("decorativeSubmit")).click();
		// to get the detail of the webpage->getTitle() and returnType as string
		String title=driver.getTitle();
		System.out.println("The Tiltle is "+title);
		//locate the CRM/SFA and click
		driver.findElement(By.linkText("CRM/SFA")).click();
		System.out.println(driver.getTitle());
	   // Locate the account button and click
		driver.findElement(By.linkText("Accounts")).click();
		//locate the Create Account and click
		driver.findElement(By.linkText("Create Account")).click();
		// Locate the user name and enter
		driver.findElement(By.id("accountName")).sendKeys("Tester02");
		// Locate the description 
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		// Enter the number of Employees
		driver.findElement(By.name("numberEmployees")).sendKeys("2");
		// Enter the site name 
		driver.findElement(By.name("officeSiteName")).sendKeys("LeafTaps");
		// Click the create button
		driver.findElement(By.className("smallSubmit")).click();
		// get the title
		System.out.println(driver.getTitle());
		// set the wait time
		Thread.sleep(2000);
		//close the browser
		driver.close();
		
	}

}
