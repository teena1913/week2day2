package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateElements {

	public static void main(String[] args) {
	    ChromeDriver driver=new ChromeDriver(); 
		driver.get("http://leaftaps.com/opentaps");
	       driver.manage().window().maximize();
	       driver.findElement(By.id("username")).sendKeys("demoSalesManager");
	       driver.findElement(By.id("password")).sendKeys("crmsfa");
	       driver.findElement(By.className("decorativeSubmit")).click();
	       driver.findElement(By.linkText("CRM/SFA")).click();
	      String title=driver.getTitle();
	      System.out.println(title);
	      driver.close();

	}

}
