package week2day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EdgeDriver driver=new EdgeDriver();
	    driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("democsr");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		 driver.findElement(By.className("decorativeSubmit")).click();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		  driver.findElement(By.className("crmsfa")).click();
		  driver.findElement(By.linkText("Accounts")).click();
		  driver.findElement(By.linkText("Create Account")).click();
		  driver.findElement(By.id("accountName")).sendKeys("Sivanesh");
		  driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		  
		  WebElement Name = driver.findElement(By.name("industryEnumId"));
			Select opt=new Select(Name); 
			opt.selectByIndex(2);
			
			WebElement Name1 = driver.findElement(By.name("ownershipEnumId"));
			Select opt1=new Select(Name1);
			opt1.selectByVisibleText("S-Corporation");
			WebElement Name2 = driver.findElement(By.name("dataSourceId"));
			Select opt2=new Select(Name2);
			opt2.selectByValue("LEAD_EMPLOYEE");
				 WebElement Name3 = driver.findElement(By.id("marketingCampaignId"));
					Select opt3=new Select(Name3);
					opt3.selectByValue("9000");
				WebElement Name4 = driver.findElement(By.name("generalStateProvinceGeoId"));
				Select opt4=new Select(Name4);
				opt4.selectByValue("TX");
			
		
		   driver.findElement(By.className("smallSubmit")).click();
		
		  String title= driver.getTitle();
			 System.out.println(title);
		  driver.close();

	}

}
