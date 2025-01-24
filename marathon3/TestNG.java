package marathon3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;



public class TestNG {
	
	ChromeDriver driver;
	
	@Parameters({"url", "username", "password"})
	@BeforeMethod
	
	public  void preCondition(String url,String uname,String Pwd) throws InterruptedException {
		
	
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--disable-notifications");
	driver = new ChromeDriver(options);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get(url);
	driver.findElement(By.id("username")).sendKeys(uname);
	driver.findElement(By.id("password")).sendKeys(Pwd);
	driver.findElement(By.id("Login")).click();
	driver.findElement(By.xpath("//button[@class='slds-button slds-context-bar__button slds-icon-waffle_container slds-show']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[text()='View All']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//p[text()='Sales']/ancestor::a")).click();
	Thread.sleep(2000);
	WebElement element =driver.findElement(By.xpath("//a[@title='Accounts']"));
	JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("arguments[0].click();", element);
	Thread.sleep(2000);
	}
	
	@AfterMethod
	public void postCondition() {
		driver.close();
	}
	
}

