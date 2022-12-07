package week2.day2assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver= new ChromeDriver();
		System.out.println(driver);
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		//wait time
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.id("username")).sendKeys("DemoCSR");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		//to click on phone
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		//to enter phone number
		driver.findElement(By.xpath("//input[@id='ext-gen270']")).sendKeys("9867362334 ");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		//Click First Resulting lead
		driver.findElement(By.xpath("//a[text()='13675']")).click();
		//to delete phone number
		driver.findElement(By.xpath("//a[@href='javascript:document.deleteContactMechForm0.submit()']/img")).click();
		//click find leads link
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		//to click on phone
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		//enter phone number
		driver.findElement(By.xpath("//input[@id='ext-gen270']")).sendKeys("9867362334");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
				
		System.out.println(driver.findElement(By.xpath("//div[@id='ext-gen437']")).getText());

		
		

	}

}
