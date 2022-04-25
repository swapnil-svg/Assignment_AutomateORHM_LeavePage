import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PopupHandle {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		driver.get("http://demo.automationtesting.in/Alerts.html");
		
		//driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();		
		//driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		
		//driver.findElement(By.xpath("//li[.='Alert with OK & Cancel ']")).click();
		//driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();		
		
		driver.findElement(By.xpath("//li[.='Alert with Textbox ']")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
		
		Alert al =driver.switchTo().alert();
		Thread.sleep(5000);
		al.sendKeys("Dreamnil");		
		//al.dismiss();
		al.accept();
		Thread.sleep(10000);
		driver.close();
		
	}

}
