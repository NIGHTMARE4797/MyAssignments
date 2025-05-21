package week2day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		EdgeDriver driver=new EdgeDriver();
	    driver.get("https://www.telerik.com/contact");
		driver.manage().window().maximize();
	
		WebElement Name = driver.findElement(By.id("Dropdown-1"));
		Select opt=new Select(Name);
		opt.selectByIndex(5);
		
		WebElement Name1 = driver.findElement(By.id("Dropdown-2"));
		Select opt1=new Select(Name1);
		
	
		opt1.selectByVisibleText("UI for React");
		
		Thread.sleep(2000);
		
		
		
		driver.findElement(By.id("Textbox-1")).sendKeys("Sivanesh");
		driver.findElement(By.id("Textbox-2")).sendKeys("Kasimani");
		
		 driver.findElement(By.id("Email-1")).sendKeys("ksivanesh4@gmail.com");
		 driver.findElement(By.id("Textbox-3")).sendKeys("KTNS");
		
		 WebElement Name2 = driver.findElement(By.id("Country-1"));
			Select opt2=new Select(Name2);
			
			opt2.selectByValue("France");
			
		 Thread.sleep(2000);
		 
		 driver.findElement(By.id("Textbox-4")).sendKeys("8807789604");
		 driver.findElement(By.id("Textarea-1")).sendKeys("HELLO");
		  
		  Thread.sleep(2000);
	}

}
