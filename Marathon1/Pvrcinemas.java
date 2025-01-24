package Marathon1;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Pvrcinemas { 

	
		

			public static void main(String[] args) throws InterruptedException {
				// TODO Auto-generated method stub
				ChromeDriver driver = new ChromeDriver();
				//Maximize the browser
				driver.manage().window().maximize();	
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				// load the url
				driver.get("http://www.pvrcinemas.com");
				// click on the cinema
				driver.findElement(By.xpath("//span[text()='Cinema']")).click();
				driver.findElement(By.xpath("//span[text()='Select Cinema']")).click();
				          
                
                // select the cinema name
				
                driver.findElement(By.xpath("//span[text()='PVR Escape-Express Avenue Mall']")).click();

               // select the date
                
               // driver.findElement(By.xpath("//span[contains(text(),'Thu')]")).click();
                driver.findElement(By.xpath("//ul[@class='p-dropdown-items']/li[@class='p-dropdown-item']/span[contains(text(),'Tomorrow')]")).click();
                //select the movie
				// driver.findElement(By.xpath("//span[text()='Select Movie']")).click();
				//driver.findElement(By.xpath("//span[@class='p-dropdown-label p-inputtext' and text()='AMARAN']")).click();
                driver.findElement(By.xpath("//ul[@class='p-dropdown-items']/li[@class='p-dropdown-item']/span[text()='BABY JOHN']")).click();
                //driver.findElement(By.xpath("//ul[@class='p-dropdown-items']/li[@class='p-dropdown-item']/span[text()='MUFASA: THE LION KING']")).click();
               // listItem.click();
				//span[@class='p-dropdown-label p-inputtext' and text()='MUFASA: THE LION KING']

				driver.findElement(By.xpath("//ul[@class='p-dropdown-items']/li[@class='p-dropdown-item']/span/span[@class='mx-2' and text()='12:10 PM']")).click();
				driver.findElement(By.xpath("//button[@class='p-button p-component sc-dIUfKc iRVxoq bgColor filter-btn' and @type='submit' and @aria-label='Submit']/span[text()='Book']")).click();

                driver.findElement(By.xpath("//button[@class='sc-iBPTVF eafRB reject-terms' and text()='Accept']")).click();
                driver.findElement(By.xpath("//span[@id='EL.ELITE|H:12' and @class='seat-current-pvr' and text()='12']")).click();
                driver.findElement(By.xpath("//button[@class='sc-kfzCjt dzvwYk btn-proceeded' and text()='Proceed']")).click();

                System.out.println(driver.findElement(By.xpath("//div[@class='seat-info']/h6")).getText());
			    System.out.println(driver.findElement(By.xpath("//div[@class='ticket-value']/p")).getText());
			    System.out.println(driver.findElement(By.xpath("//div[@class='select-seat-number']/div[@class='seat-number']/p")).getText());
			    System.out.println(driver.findElement(By.xpath("//div[@class='grand-tota col-md-3']/h6")).getText());
			    System.out.println(driver.findElement(By.xpath("//div[@class='grand-tota col-md-3']/h6/span")).getText());
	          
			
			
	}

}
