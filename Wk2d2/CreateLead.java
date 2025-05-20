package week2day2;

import org.openqa.selenium.By;

import org.openqa.selenium.edge.EdgeDriver;

public class CreateLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		EdgeDriver driver=new EdgeDriver();
	    driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("democsr");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		Thread.sleep(4000);
		 driver.findElement(By.className("decorativeSubmit")).click();
		 Thread.sleep(4000);
		 
		  driver.findElement(By.className("crmsfa")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.linkText("Create Lead")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Sivanesh");
		  Thread.sleep(2000);
		  driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Kasimani");
		  Thread.sleep(2000);
		  driver.findElement(By.id("createLeadForm_companyName")).sendKeys("KTNS");
		  Thread.sleep(2000);
		  driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Employee");
		  Thread.sleep(2000);
		  driver.findElement(By.className("smallSubmit")).click();
		  Thread.sleep(8000);
		  
		  String title= driver.getTitle();
			 System.out.println(title);
		  
		  driver.close();
	}

}
