import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ORHMAssignment {

	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
	driver.get("https://opensource-demo.orangehrmlive.com/");
	driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	driver.findElement(By.xpath("//input[@class='button']")).click();
	
	
 
	driver.close();
	}
}
