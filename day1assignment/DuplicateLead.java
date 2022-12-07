package week2.day1assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {

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
				driver.findElement(By.linkText("Create Lead")).click();
				driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
				driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Nivedhitha");
				driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Nithi");
				driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Nive");
				driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("CS");
				driver.findElement(By.id("createLeadForm_description")).sendKeys("3 years course");
				driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("nivedhitha@gmail.com");
				driver.findElement(By.className("smallSubmit")).click();
				
				
				driver.findElement(By.className("subMenuButton")).click();
				driver.findElement(By.id("createLeadForm_companyName")).clear();
				driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Leaftaps");
				driver.findElement(By.id("createLeadForm_firstName")).clear();
				driver.findElement(By.id("createLeadForm_firstName")).sendKeys("NivedhithaRohithRam");
				driver.findElement(By.className("smallSubmit")).click();
				String title = driver.getTitle();
				System.out.println(title); 


	}

}
