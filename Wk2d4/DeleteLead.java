package week2day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class DeleteLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EdgeDriver driver=new EdgeDriver();
	    driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 driver.findElement(By.className("decorativeSubmit")).click();
		
		  driver.findElement(By.className("crmsfa")).click();
		  driver.findElement(By.linkText("Create Lead")).click();
		 
		  driver.findElement(By.linkText("Find Leads")).click();
		  
		  
		  driver.findElement(By.xpath("//span[text()='Phone']")).click();
			driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("8807789604");
			driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		    
		    
			WebElement noRecords = driver.findElement(By.xpath("//div[text()='No records to display']"));
			if(noRecords.isDisplayed());
			{ System.out.println("No records to display");
			}
			
			driver.close();
		  
		  
		 
		  
	}

}
