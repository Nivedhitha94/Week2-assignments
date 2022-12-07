package week2.day2assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver= new ChromeDriver();
		System.out.println(driver);
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.linkText("Create New Account")).click();
		driver.findElement(By.xpath("//div[@class='_5dbb']/input")).sendKeys("Nivedhitha");
		driver.findElement(By.xpath("//div[text()='Surname']/following-sibling::input")).sendKeys("Nithi");
		driver.findElement(By.xpath("//div[text()='Mobile number or email address']/following-sibling::input")).sendKeys("987654321");
		driver.findElement(By.xpath("//div[text()='New password']/following-sibling::input")).sendKeys("jinx");
		
		WebElement date = driver.findElement(By.xpath("//span/select[1]"));
		Select day = new Select (date);
		day.selectByIndex(2);
		
		WebElement Month = driver.findElement(By.xpath("//span/select[2]"));
		Select mon = new Select (Month);
		mon.selectByValue("12");
		
		WebElement year = driver.findElement(By.xpath("//span/select[3]"));
		Select y = new Select (year);
		y.selectByVisibleText("1994");
		
		driver.findElement(By.xpath("//span/label[1]")).click();
		
		
	}

}
