package Marathon1;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class Amazon {


	public static void main(String[] args) {
		// get the chrome driver
		ChromeDriver driver=new ChromeDriver();
		// maximize the driver
		driver.manage().window().maximize();
		// load the url
		driver.get("https://www.amazon.in");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		// click on the search
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Bags for boys");
		driver.findElement(By.id("nav-search-submit-button")).click();
		
				
		System.out.println(driver.findElement(By.xpath("//div[@class='sg-col-inner']//h2[@class='a-size-base a-spacing-small a-spacing-top-small a-text-normal']")).getText());
		driver.findElement(By.xpath("//li[@id='p_123/648962']//div[@class='a-checkbox a-checkbox-fancy s-navigation-checkbox aok-float-left']//label")).click();
		System.out.println(driver.findElement(By.xpath("//div[@class='sg-col-inner']//h2[@class='a-size-base a-spacing-small a-spacing-top-small a-text-normal']")).getText());
        driver.findElement(By.xpath("//li[@id='p_123/418063']//div[@class='a-checkbox a-checkbox-fancy s-navigation-checkbox aok-float-left']//label")).click();
      
       System.out.println(driver.findElement(By.xpath("//div[@class='sg-col-inner']//h2[@class='a-size-base a-spacing-small a-spacing-top-small a-text-normal']")).getText());
       driver.findElement(By.xpath("//span[@id='a-autoid-0-announce']")).click();
       driver.findElement(By.xpath("//ul[@class='a-nostyle a-list-link']//li[@class='a-dropdown-item']//a[@id='s-result-sort-select_4']")).click();
     //  System.out.println(driver.findElement(By.xpath("//div[@class='a-section a-spacing-mini a-text-left sf-refinement-heading']//span[@class='a-size-base a-color-base puis-bold-weight-text']")).getText());
       System.out.println(driver.findElement(By.xpath("//div[@data-asin='B0CZ44GZZ9']//div[@class='a-section a-spacing-none a-spacing-top-small s-title-instructions-style']")).getText());
       System.out.println(driver.findElement(By.xpath("//div[@data-asin='B0CZ44GZZ9']//div[@class='a-section a-spacing-none a-spacing-top-small s-price-instructions-style']")).getText());
       System.out.println(driver.getTitle());
       driver.close();
       }

}
