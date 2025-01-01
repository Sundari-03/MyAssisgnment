package week4.Day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Frame {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		driver.switchTo().frame("iframeResult");
	    driver.findElement(By.xpath("//button[contains(text(),'Try it')]")).click();
	    
	    Thread.sleep(2000);
	    
	    Alert alert = driver.switchTo().alert(); 
	    
	    // Get the text from the alert 
	    String alertText = alert.getText(); 
	    System.out.println("Alert text: " + alertText);
	    alert.sendKeys("dhana");
	    alert.accept();	     
	    System.out.println(driver.findElement(By.xpath("//p[@id='demo']")).getText());
	    
	    driver.findElement(By.xpath("//button[contains(text(),'Try it')]")).click();
//	    alert.sendKeys("Sundari");
//	    String alertText1 = alert.getText(); 
//	    System.out.println("Alert text: " + alertText1);
	    alert.dismiss();
	    System.out.println(driver.findElement(By.xpath("//p[@id='demo']")).getText());
	    

	}

}

