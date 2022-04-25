import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameHandle {
	static WebDriver driver;
	
			public static void main(String[] args) throws InterruptedException {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
			driver.get("http://demo.automationtesting.in/Frames.html");
			
			WebElement iframe = driver.findElement(By.xpath("//iframe[@id='singleframe']"));
			driver.switchTo().frame(iframe);
			
			driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Hello");
	}

}
