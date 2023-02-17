package assignment2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Duplicatelead {

	public static void main(String[] args) throws InterruptedException {
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
	       driver.findElement(By.linkText("Email")).click();
	       driver.findElement(By.name("emailAddress")).sendKeys("malathymalu04@gmail.com");
	       driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	       Thread.sleep(2000);
	        WebElement loadA = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));
	        String first =loadA.getText();
	        loadA.click();
	        driver.findElement(By.linkText("Duplicate Lead")).click();
	        String title = driver.getTitle();
			System.out.println(title);
		    driver.findElement(By.className("smallSubmit")).click();
	        WebElement loadB = driver.findElement(By.xpath("//span[text()='TCS (12423)']"));
	        String second= loadB.getText();
			if(first==second) {
				System.out.println("same");
			}
			else {
				System.out.println("not same");
			}
			
	      
	}

}
