package week3day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class MarathonAmazon {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//div[@class='nav-search-field ']/input[@id='twotabsearchtextbox']")).sendKeys("Bags for boys");
		driver.findElement(By.xpath("(//span[@id='nav-search-submit-text'])")).click();
		
		
		driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[4]")).click();
		
		driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[2]")).click();
		
		
		driver.findElement(By.xpath("(//span[text()='Featured'])")).click();
		driver.findElement(By.xpath("(//a[text()='Newest Arrivals'])")).click();
		
	
		String text = driver.findElement(By.xpath("//h2[@class='a-size-base-plus a-spacing-none a-color-base a-text-normal']")).getText();
		System.out.println("Product  :"+text);
		
	    String title= driver.getTitle();
		 System.out.println(title);
		 
		String text1 = driver.findElement(By.xpath("(//span[text()='1,199'])")).getText();
		System.out.println("Price  :"+text1);
		  driver.close();
	}

}
