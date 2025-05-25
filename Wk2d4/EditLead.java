package week2day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EdgeDriver driver=new EdgeDriver();
	    driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		 driver.findElement(By.className("decorativeSubmit")).click();
		
		  driver.findElement(By.className("crmsfa")).click();
		 
		  driver.findElement(By.linkText("Create Lead")).click();
		  driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("KTNS");
		  
		  driver.findElement(By.xpath("//input[contains(@id,'Form_first')]")).sendKeys("Sivanesh");
		  driver.findElement(By.xpath("//input[contains(@id,'Form_last')]")).sendKeys("Kasimani");
		  driver.findElement(By.xpath("//input[@name='firstNameLocal']")).sendKeys("Siva");
		  driver.findElement(By.xpath("//input[contains(@id,'departmentName')]")).sendKeys("Mech");
		 
		  
		  driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("Hi team");
		  driver.findElement(By.xpath("//input[contains(@id,'Form_primaryEmail')]")).sendKeys("ksivanes4@gmail.com");
		  
		  
		  
		  WebElement Name1 = driver.findElement(By.name("generalStateProvinceGeoId"));
			Select opt1=new Select(Name1);
			opt1.selectByVisibleText("Hawaii");
			driver.findElement(By.className("smallSubmit")).click();
			driver.findElement(By.className("subMenuButton")).click();
			driver.findElement(By.xpath("//textarea[@name='description']")).clear();
			driver.findElement(By.xpath("//textarea[@name='importantNote']")).sendKeys("Hi team");
			driver.findElement(By.className("smallSubmit")).click();
		  
		  
		  
		
			 String title= driver.getTitle();
			 System.out.println(title);		  
			 driver.close();

	
		
		
	}

}
