package marathon2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Tatacliq {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Load the url
		driver.get(" https://www.tatacliq.com/");
		Thread.sleep(2000);
		// MouseHover on 'Brands'
		WebElement brands = driver.findElement(By.xpath("//div[text()='Brands']"));
		Actions action = new Actions(driver);
		action.moveToElement(brands).perform();

		WebElement watches = driver.findElement(By.xpath("//div[text()='Watches & Accessories']"));

		action.moveToElement(watches).perform();

		driver.findElement(By.xpath("//div[text()='Casio']")).click();
		Thread.sleep(2000);
		WebElement newArrival = driver.findElement(By.xpath("//select[@class='SelectBoxDesktop__hideSelect']"));

		Select newarri = new Select(newArrival);
		newarri.selectByVisibleText("New Arrivals");

		driver.findElement(By.xpath("//div[text()='Men']")).click();
		Thread.sleep(5000);
		List<WebElement> prices = driver.findElements(By.xpath("//div[@class='ProductDescription__priceHolder']/h3"));
		int size = prices.size();

		System.out.println("Total Count = " + size);
		for (WebElement allPrices : prices)

		{
			String price = allPrices.getText();
			System.out.println(price);
		}
		String price1 = prices.get(1).getText();

		Thread.sleep(2000);
		// click on the item
		List<WebElement> watcheslist = driver.findElements(By.xpath("//div[@class='ProductModule__dummyDiv']"));
		int size1 = watcheslist.size();
		System.out.println("Total Count = " + size1);
		watcheslist.get(1).click();

		Thread.sleep(2000);
		// takescreen shot
		File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		// Specify the location to save the screenshot
		File destination = new File("C:/TestLeaf/path2/to/save/screenshot.png"); // Save the screenshot
		FileUtils.copyFile(screenshot, destination);
		Thread.sleep(2000);
		Set<String> window = driver.getWindowHandles();
		List<String> lstWindows = new ArrayList<String>(window);
		driver.switchTo().window(lstWindows.get(1));
		Thread.sleep(2000);
		String selectedProductprice = driver.findElement(By.xpath("//div[@class='ProductDetailsMainCard__price']/h3"))
				.getText();
		System.out.println(selectedProductprice);
		selectedProductprice = selectedProductprice.replace("MRP: ", "");
		System.out.println(selectedProductprice);
		// compare the first window price and second window price
		if (price1.equals(selectedProductprice)) {
			System.out.println("both prices are equal");
		} else {
			System.out.println("both prices are not equal");
		}

		// add the item to bag
		driver.findElement(By.xpath("//span[contains(text(),'ADD TO BAG')]")).click();
		// get count from the cart icon.
		System.out.println(
				"Cart Count =" + driver.findElement(By.xpath("//span[@class='DesktopHeader__cartCount']")).getText());
		// click on the cart
		driver.findElement(By.xpath("//span[@class='DesktopHeader__cartCount']")).click();

		driver.close();
       	driver.switchTo().window(lstWindows.get(0));
        	driver.close();
		
	}

}

//Tatacliq Testcase:
//==================
//1. Load the url as https://www.tatacliq.com/
//2. MouseHover on 'Brands'
//3. MouseHover on 'Watches & Accessories'
//4. Choose the first option from the 'Featured brands'.
//5. Select sortby: New Arrivals
//6. choose men from catagories filter.
//7. print all price of watches
//8. click on the first resulting watch.
//9. Handle Alert Pop Up
//9. compare two price are similar
//10. click Add to cart and get count from the cart icon.
//11. Click on the cart
//12. Take a snap of the resulting page. 
//13. Close All the opened windows one by one.