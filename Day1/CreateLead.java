package Week2.Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {

	public static void main(String[] args) {
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
		// Locate the Leads
		driver.findElement(By.linkText("Leads")).click();
		// Locate the create lead
		driver.findElement(By.linkText("Create Lead")).click();
		// Enter the first name
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Sundari");
		// Enter the last name
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("D");
		// Enter the company name
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		// Enter the company name
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Tester");
		// Click the create button
		driver.findElement(By.name("submitButton")).click();
		// get the title
		System.out.println(driver.getTitle());
		// Close the browser
		driver.close();
		
		
	}

}
