package week3day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class MarathonPVR {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.pvrcinemas.com/");
		
		
		driver.findElement(By.xpath("(//span[text()='Cinema'])")).click();
		driver.findElement(By.xpath("(//span[text()='Select Cinema'])")).click();
		driver.findElement(By.xpath("(//span[text()='INOX National,Virugambakkam Chennai'])")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[text()='Select Date'])")).click();
	
		driver.findElement(By.xpath("(//span[contains(text(),'Tomorr')])")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[text()='KARATE KID LEGENDS'])[2]")).click();
		
	
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[text()='Select Timing'])")).click();
		
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[contains(text(),'06:50')])")).click();
		

		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@type='submit'])")).click();
		
		
		
		driver.findElement(By.xpath("(//button[text()='Accept'])")).click();
		driver.findElement(By.id("SL.SILVER|C:1")).click();
		
		driver.findElement(By.className("(//button[@ext='Proceed'])")).click();
	
		driver.findElement(By.xpath("(//button[@ext='Continue'])")).click();
		
	    String title= driver.getTitle();
		 System.out.println(title);
		  driver.close();

	}

}
