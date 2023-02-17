package week2.day2;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Textbox {

		public static void main(String[] args) throws InterruptedException  {
			ChromeDriver driver = new ChromeDriver();
			driver.get("https://www.leafground.com/input.xhtml");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath("//div[@class='col-12']/input")).sendKeys("teena");
			driver.findElement(By.xpath("(//div[@class='col-12']/input)[2]")).sendKeys("INDIA");
			boolean display = driver.findElement(By.xpath("(//div[@class='col-12']/input)[3]")).isEnabled();
			System.out.println(display);
			driver.findElement(By.xpath("(//div[@class='col-12']/input)[4]")).clear();
			System.out.println(driver.findElement(By.xpath("(//div[@class='col-12']/input)[5]")).getAttribute("value"));
			driver.findElement(By.xpath("(//div[@class='col-12']/input)[6]")).sendKeys("xxxyyy@gmail.com");
			driver.findElement(By.xpath("(//div[@class='col-12']/input)[6]")).sendKeys(Keys.TAB);
			driver.findElement(By.xpath("//textarea[@placeholder='About yourself']")).sendKeys("BRILLIANT GIRL");
			driver.findElement(By.xpath("//div[@class='ql-editor ql-blank']/p")).sendKeys("hi");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[@class='col-12 mb-2 lg:col-8']/input")).sendKeys("BYE");
			driver.findElement(By.xpath("//span[@class='ui-float-label']/input")).click();
			driver.findElement(By.xpath("//li[@class='ui-autocomplete-input-token']/input")).sendKeys("ENJOY");
			Thread.sleep(2000);
	        driver.findElement(By.xpath("(//li[@class='ui-autocomplete-item ui-autocomplete-list-item ui-corner-all']/span)[4]")).click();
			driver.findElement(By.xpath("//input[@class='ui-inputfield ui-keyboard-input ui-widget ui-state-default ui-corner-all is-keypad']")).sendKeys("trust the process");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[text()='Close']")).click();
			driver.close();

		}

	}


