package week6.Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class CreateCompany extends Salesforce {
    @Test
	public  void company() throws InterruptedException {
		// TODO Auto-generated method stub
		
		driver.findElement(By.xpath("//input[@name='CompanyName']")).sendKeys("Testleaf");
		Thread.sleep(2000);

//		 - Enter Description as 'Salesforces'. 
		driver.findElement(By.xpath("//div[@class='slds-form-element__control slds-grow textarea-container']/parent::lightning-textarea/following::textarea")).sendKeys("Salesforces");
//		 - Select Status as 'Active' 
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); 
		WebElement modal = wait.until(ExpectedConditions.visibilityOfElementLocated( By.className("isModal")));
		WebElement scrollableContainer = modal.findElement(By.className("actionBody"));
		JavascriptExecutor js = (JavascriptExecutor) driver; 
		js.executeScript("arguments[0].scrollTop = arguments[0].scrollHeight;", scrollableContainer);
		Thread.sleep(2000);
        driver.findElement(By.xpath("//lightning-combobox")).click();
		Thread.sleep(2000);	
	    driver.findElement(By.xpath("//lightning-base-combobox-item/span/span[text()='Active']")).click();
	    Thread.sleep(2000);	
	    // Click on Save 
	    driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
	    
	    String alert = driver.findElement(By.xpath("//ul[@class='errorsList slds-list_dotted slds-m-left_medium']/li/a")).getText();
	    System.out.println(alert);
	}

}
