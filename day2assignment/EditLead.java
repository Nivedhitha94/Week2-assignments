package week2.day2assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver= new ChromeDriver();
		System.out.println(driver);
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoCSR");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		driver.findElement(By.xpath("//input[@id='ext-gen248']")).sendKeys("Nivedhitha");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		//to click on first resulting lead
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.xpath("//a[text()='16383']")).click();
		
		//to verify title of the page
		String title = driver.getTitle();
		System.out.println("The title of the page is " +title);
		
		//to click edit button
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
	
		//to change the company name
		driver.findElement(By.id("updateLeadForm_companyName")).clear();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("One Direction");
		
		//to update
		driver.findElement(By.xpath("//input[@class='smallSubmit'][1]")).click();
		
		System.out.println(driver.findElement(By.id("viewLead_companyName_sp")).getText());

		

	}

}
