package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Createlead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver(); 
		driver.get("http://leaftaps.com/opentaps/contol/login");
       driver.manage().window().maximize();
       driver.findElement(By.id("username")).sendKeys("demoSalesManager");
       driver.findElement(By.id("password")).sendKeys("crmsfa");
       driver.findElement(By.className("decorativeSubmit")).click();
       driver.findElement(By.linkText("CRM/SFA")).click();
       driver.findElement(By.linkText("Leads")).click();
       driver.findElement(By.linkText("Create Lead")).click();
       driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TESLA");
       driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Infanteena");
       driver.findElement(By.id("createLeadForm_lastName")).sendKeys("A");
        driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("teena");
       driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("ECE");
       driver.findElement(By.id("createLeadForm_description")).sendKeys("hi this is Infanteena");
       driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("infanteena123@gmail.com");
       WebElement selectprovince = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
       Select op=new Select(selectprovince);
       op.selectByVisibleText("New York");
       driver.findElement(By.className("smallSubmit")).click();
	      System.out.println("the tile is "+ driver.getTitle());
	     driver.close();

       
 
      
	}

}
