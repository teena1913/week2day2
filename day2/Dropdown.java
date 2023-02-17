package week2.day2;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	driver.get("https://www.leafground.com/select.xhtml");	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
WebElement f1 = driver.findElement(By.xpath("//select[@class='ui-selectonemenu']"));
Select dd=new Select(f1);
List<WebElement> option = dd.getOptions();
	int size = option.size();
	System.out.println(size);
	for (int i = 0; i < option.size(); i++)
	{
		Thread.sleep(2000);
		if(i==1|| i==3)
	option.get(i).click();	
	}
	driver.findElement(By.xpath("//label[text()='Select Country']")).click();
	driver.findElement(By.xpath("//li[text()='Brazil']")).click();
	Thread.sleep(2000);
	 driver.findElement(By.xpath("//label[text()='Select City']")).click();
	driver.findElement(By.xpath("//li[text()='Salvador']")).click();
driver.findElement(By.xpath("//input[@placeholder='Choose Course']")).click();
	driver.findElement(By.xpath("//button[contains(@class, 'ui-autocomplete-dropdown')]")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//li[@data-item-label='Appium']")).click();
	driver.findElement(By.xpath("//label[text()='Select Language']")).click();
	driver.findElement(By.xpath("//li[contains(@data-label,'Tamil')]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//label[text()='Select Values']")).click();
	driver.findElement(By.xpath("//li[@data-label='Three']")).click();

	}

}
