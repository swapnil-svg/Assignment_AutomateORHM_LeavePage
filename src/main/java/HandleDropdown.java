import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleDropdown {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		driver.get("http://demo.automationtesting.in/Register.html");
		
		WebElement skill = driver.findElement(By.id("Skills"));
		Select selskill = new Select(skill);
		selskill.selectByIndex(1);
		selskill.selectByVisibleText("Adobe InDesign");
		
		Thread.sleep(2000);
		driver.close();
	}

}
