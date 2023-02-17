package assignment2.day2;

import java.time.Duration;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

public class Deleteleads {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver(); 
		   driver.get("http://leaftaps.com/opentaps/contol/login");
	       driver.manage().window().maximize();
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	       driver.findElement(By.id("username")).sendKeys("demoSalesManager");
	       driver.findElement(By.id("password")).sendKeys("crmsfa");
	       driver.findElement(By.className("decorativeSubmit")).click();
	       driver.findElement(By.linkText("CRM/SFA")).click();
	       driver.findElement(By.linkText("Leads")).click();
	       driver.findElement(By.linkText("Find Leads")).click();
	       driver.findElement(By.linkText("Phone")).click();
	       driver.findElement(By.name("phoneNumber")).sendKeys("8610490396");
	       driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	       String text = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
			System.out.println(text);
	       driver.findElement(By.linkText("10973")).click();
	       driver.findElement(By.linkText("Delete")).click();
	       driver.findElement(By.linkText("Find Leads")).click();
	       driver.findElement(By.linkText("Name and ID")).click();
	       driver.findElement(By.xpath("//input[@name='id']")).sendKeys("10971");
	      driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	      driver.close();
	      
	}

}
