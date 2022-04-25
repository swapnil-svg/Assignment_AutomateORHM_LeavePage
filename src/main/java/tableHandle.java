import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class tableHandle {
	public static WebDriver driver;
	
	public static WebElement preClose(String indces) {
		WebElement preCloseValue = driver.findElement(By.xpath("//a[contains(.,'"+ indces +"')]/parent::td/../td[2]"));
		return preCloseValue;
	}
	
	public static WebElement lastTrade(String indces) {
		WebElement preCloseValue = driver.findElement(By.xpath("//a[contains(.,'"+ indces +"')]/parent::td/../td[3]"));
		return preCloseValue;
	}
	
	public static WebElement changePts(String indces) {
		WebElement preCloseValue = driver.findElement(By.xpath("//a[contains(.,'"+ indces +"')]/parent::td/../td[4]//font"));
		return preCloseValue;
	}
	
	public static WebElement changesPercentage(String indces) {
		WebElement preCloseValue = driver.findElement(By.xpath("//a[contains(.,'"+ indces +"')]/parent::td/../td[5]//font"));
		return preCloseValue;
	}
	
	
	public static void main(String[] args) {
		
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
			driver.get("https://money.rediff.com/indices");

			System.out.println("pre close value" + preClose("S&P BSE Sensex").getText());
			System.out.println("LastTrade value" + lastTrade("S&P BSE 100").getText());
			System.out.println("ChangePTS value" + changePts("S&P BSE 200").getText());
			System.out.println("Change Percentage value" + changesPercentage("S&P BSE 500").getText());
			
			driver.quit();
	}

}
