package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Locatedropdown {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver(); 
		driver.get("http://leaftaps.com/opentaps");
       driver.manage().window().maximize();
       driver.findElement(By.id("username")).sendKeys("demoSalesManager");
       driver.findElement(By.id("password")).sendKeys("crmsfa");
       driver.findElement(By.className("decorativeSubmit")).click();
       driver.findElement(By.linkText("CRM/SFA")).click();
       driver.findElement(By.linkText("Leads")).click();
       driver.findElement(By.linkText("Create Lead")).click();
  WebElement MarketingCampaign = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
  Select op=new Select(MarketingCampaign);
  op.selectByVisibleText("Car and Driver");

}
}
