package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) {
	 ChromeDriver driver=new ChromeDriver(); 
	driver.get("https://en-gb.facebook.com/");
    driver.manage().window().maximize(); 
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    driver.findElement(By.xpath("//a[@rel='async']")).click();
    driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Hope");
    driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Mikelson");
    driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("7639070107");
    driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("Tiny1300");
     WebElement day=driver.findElement(By.xpath("//select[@title='Day']"));
    Select op1=new Select(day);
    op1.selectByVisibleText("9");
    WebElement month=driver.findElement(By.xpath("//select[@title='Month']"));
    Select op2=new Select(month);
    op2.selectByVisibleText("Feb");
    WebElement year=driver.findElement(By.xpath("//select[@title='Year']"));
    Select op3=new Select(year);
    op3.selectByVisibleText("1998");
    driver.findElement(By.xpath("//input[@class='_8esa']")).click();

}

}