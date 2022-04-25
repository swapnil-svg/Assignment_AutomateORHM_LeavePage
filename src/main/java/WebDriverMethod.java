import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;
import okio.Timeout;

public class WebDriverMethod {

	static WebDriver driver;
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		driver.get("http://demo.automationtesting.in/Register.html");
	
		WebElement fname = driver.findElement(By.xpath(""));
		
		WebDriverWait wait = new WebDriverWait(driver, 0)
		
		System.out.println(driver.getTitle());
		
		driver.close();
		driver.quit();
	}

}
