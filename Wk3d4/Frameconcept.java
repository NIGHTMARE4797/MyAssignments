package week3day4;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frameconcept {
			public static void main(String[] args) throws InterruptedException {

				ChromeDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
				
			driver.switchTo().frame("iframeResult");
				driver.findElement(By.xpath("(//button[text()='Try it'])")).click();
				
				Alert alert = driver.switchTo().alert();
				
		
				alert.accept();
				
				
				String text = driver.findElement(By.xpath("//p[@id='demo']")).getText();
				System.out.println(text);

	}
	}

