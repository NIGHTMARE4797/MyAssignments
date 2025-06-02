package week4day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class WindowHandlingandInteractionAutomation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		EdgeDriver driver=new EdgeDriver();
	    driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		  driver.findElement(By.className("crmsfa")).click();
		  
		driver.findElement(By.xpath("(//a[text()='Contacts'])")).click();
		driver.findElement(By.xpath("(//a[text()='Merge Contacts'])")).click();
		
		
		
		
		
		driver.findElement(By.xpath("(//img[@src='/images/fieldlookup.gif'])")).click();
		
		Set<String> allWindow = driver.getWindowHandles();
		List<String> getWindow=new ArrayList<String>(allWindow);
		driver.switchTo().window(getWindow.get(1));
		
	
		driver.findElement(By.xpath("(//a[text()='DemoCustomer'])")).click();
		
		
		
		driver.switchTo().window(getWindow.get(0));
		
		driver.findElement(By.xpath("(//img[@src='/images/fieldlookup.gif'])[2]")).click();
		
		Set<String> allWindow1 = driver.getWindowHandles();
		List<String> getWindow1 =new ArrayList<String>(allWindow1);
		driver.switchTo().window(getWindow1.get(1));
		
		
		driver.findElement(By.xpath("(//a[text()='DemoLBCust'])")).click();
		
		driver.switchTo().window(getWindow1.get(0));
		driver.findElement(By.xpath("(//a[text()='Merge'])")).click();
		
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		String title= driver.getTitle();
		System.out.println(title);
		driver.close();
	}

}
