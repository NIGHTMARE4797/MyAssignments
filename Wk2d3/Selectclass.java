package week2day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selectclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
	    driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Create new account")).click();
		  driver.findElement(By.name("firstname")).sendKeys("Sivanesh");
		  driver.findElement(By.name("lastname")).sendKeys("Kasimani");
		  WebElement Name = driver.findElement(By.name("birthday_day"));
			Select opt=new Select(Name); 
			opt.selectByIndex(30);
			
			WebElement Name1 = driver.findElement(By.name("birthday_month"));
			Select opt1=new Select(Name1); 
			opt1.selectByIndex(6);
			WebElement Name2 = driver.findElement(By.name("birthday_year"));
			Select opt2=new Select(Name2); 
			opt2.selectByValue("1997");
			driver.findElement(By.name("reg_email__")).sendKeys("ksivanesh4@gmail.com");
			driver.findElement(By.name("reg_passwd__")).sendKeys("Siva4797@");
			
			
			driver.findElement(By.xpath("(//input[@id='sex'])[2]")).click();
			
			
			


	}

}
