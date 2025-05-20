package week2day2;

import org.openqa.selenium.By;

import org.openqa.selenium.edge.EdgeDriver;

public class CreateAccount {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		EdgeDriver driver=new EdgeDriver();
	    driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("democsr");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		 driver.findElement(By.className("decorativeSubmit")).click();
		 Thread.sleep(4000);
		 
		  driver.findElement(By.className("crmsfa")).click();
		  
		  driver.findElement(By.linkText("Accounts")).click();
		  driver.findElement(By.linkText("Create Account")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.id("accountName")).sendKeys("Sivanesh");
		  Thread.sleep(2000);
		  driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		  Thread.sleep(2000);
		  driver.findElement(By.id("numberEmployees")).sendKeys("4");
		  Thread.sleep(2000);
		  driver.findElement(By.id("officeSiteName")).sendKeys("LeafTaps");
		  Thread.sleep(2000);
		  
		   driver.findElement(By.className("smallSubmit")).click();
		  Thread.sleep(8000);
		  String title= driver.getTitle();
			 System.out.println(title);
		  driver.close();
	}

}
