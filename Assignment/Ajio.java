package week4.Assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ajio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new  ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ajio.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//div[@class='react-autosuggest__container react-autosuggest__container--open']/input")).sendKeys("bags");
		driver.findElement(By.xpath("//div[@class='searchbar-view']/button")).click();
		driver.findElement(By.xpath("//ul[@class='rilrtl-list ']/li[@class='rilrtl-list-item'][2]/div[@class='facet-linkfref ']")).click();
		driver.findElement(By.xpath("//input[@id='Men - Fashion Bags']/parent::div/parent::div[@class='facet-linkfref ']/parent::li/parent::ul/li[3]")).click();
		System.out.println(driver.findElement(By.xpath("//div[@class='filter']/div/strong")).getText());
		
		List<WebElement> webElements = driver.findElements(By.xpath("//div[@class='contentHolder']/div/Strong"));
		System.out.println("");
		System.out.println("-------- Product brand name as given below ------------");


		for(int i=0;i<webElements.size();i++)
		{
			WebElement webElement=webElements.get(i);
			String brand = webElement.getText();
			System.out.println(brand);
		}
		System.out.println("");
		List<WebElement> productWebElements = driver.findElements(By.xpath("//div[@class='contentHolder']/div[@class='nameCls']"));
		System.out.println("-------- Product name as given below ------------");
		for(int i=0;i<productWebElements.size();i++)
		{
			WebElement productWebElement = productWebElements.get(i);
			String Product = productWebElement.getText();
			System.out.println(Product);
		}
		
	
	}

}
