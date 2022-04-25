import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandle {

		static WebDriver driver;
		public static void main(String[] args) throws InterruptedException {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
			driver.get("http://demo.automationtesting.in/Windows.html");
			
			//Open new tabbed window--------------
			//driver.findElement(By.xpath("(//button[normalize-space()='click'])[1]")).click();
			
			//Open new seprate window-----------
//			driver.findElement(By.xpath("//li[.='Open New Seperate Windows']")).click();
	//		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();

		//Open Seprate multiple window
			driver.findElement(By.xpath("//li[.='Open Seperate Multiple Windows']")).click();
			
		Set<String> win= driver.getWindowHandles();
		Iterator<String> it = win.iterator();
		String parentWin = it.next();
		String childWin = it.next();
		
//1		driver.switchTo().window(childWin);
//		driver.findElement(By.xpath("//span[text()='Downloads']")).click();
		
		
		
		driver.switchTo().window(childWin);
		driver.findElement(By.xpath("//span[text()='Downloads']")).click();
		
		driver.close();
			
			
			

	}

}
