package assignment2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateContact {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver(); 
	      driver.get("http://leaftaps.com/opentaps/contol/login");
        driver.manage().window().maximize();
        driver.findElement(By.id("username")).sendKeys("demoSalesManager");
        driver.findElement(By.id("password")).sendKeys("crmsfa");
        driver.findElement(By.className("decorativeSubmit")).click();
        driver.findElement(By.linkText("CRM/SFA")).click();
	    driver.findElement(By.className("x-panel-header")).click();
	    driver.findElement(By.linkText("Create Contact")).click();
	    driver.findElement(By.id("firstNameField")).sendKeys("Infanteena");
        driver.findElement(By.id("lastNameField")).sendKeys("A");
        driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Infanteena");
	    driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("A");
        driver.findElement(By.id("createContactForm_departmentName")).sendKeys("ECE");
        driver.findElement(By.id("createContactForm_description")).sendKeys("hi this is me");
        driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("infanteena123@gmail.com");
        WebElement selectprovince = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
        Select op=new Select(selectprovince);
        op.selectByVisibleText("New York");
	    driver.findElement(By.className("smallSubmit")).click();
	    System.out.println("the tile is "+ driver.getTitle());
		

	}

}
