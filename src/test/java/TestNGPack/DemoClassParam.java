package TestNGPack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoClassParam {
	
	public static WebDriver driver;
	@BeforeTest
	public static void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}
	@Test
	@Parameters({"username","password"})
	public static void login(String username, String password) throws InterruptedException {
		driver.findElement(By.name("txtUsername")).sendKeys(username);
		Thread.sleep(1000);
		driver.findElement(By.id("txtPassword")).sendKeys(password);
		Thread.sleep(1000);
		driver.findElement(By.id("btnLogin")).click();
		
		driver.findElement(By.xpath("//a[.='Leave']")).click();
		
		//FROM DATE
		driver.findElement(By.xpath("//input[@id='calFromDate']")).click();
		
		WebElement month = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
		Select selmonth = new Select(month);
		selmonth.selectByIndex(11);
		//Thread.sleep(2000);
		//selmonth.selectByVisibleText("Dec");
		
		WebElement year = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		Select selyear = new Select(year);
		selyear.selectByIndex(99);
		//Thread.sleep(2000);
		//selectByVisibleText("2021");
		
		driver.findElement(By.xpath("//td[@data-handler='selectDay']/a[text()='13']")).click();
		
		//TO DATE
		driver.findElement(By.xpath("//input[@id='calToDate']")).click();
		
		WebElement toMonth = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
		Select selTomonth = new Select(toMonth);
		selTomonth.selectByIndex(11);
		
		WebElement toYear = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		Select selToyear = new Select(toYear);
		selToyear.selectByIndex(99);
		
		driver.findElement(By.xpath("//td[@data-handler='selectDay']/a[text()='23']")).click();
		
		//Checkbox click
		driver.findElement(By.xpath("//label[text()='Taken']")).click();
		
		//EmployeeName
		driver.findElement(By.xpath("//input[@id='leaveList_txtEmployee_empName']")).sendKeys("Orange Test");
		
		//Search Button click
		driver.findElement(By.xpath("//input[@name='btnSearch']")).click();
		
		//driver.quit();
	}

}
