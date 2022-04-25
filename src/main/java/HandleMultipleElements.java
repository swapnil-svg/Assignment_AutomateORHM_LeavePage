import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleMultipleElements {

	static WebDriver driver;
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		driver.get("http://demo.automationtesting.in/Register.html");
		
		WebElement searchBox = driver.findElement(By.xpath(null));
		searchBox.sendKeys("selenium");
		List<WebElement> results = driver.findElements(By.xpath("//input[@name='q']"));
		
		for (WebElement webElement : results) {
			System.out.println(webElement.getText("//Span[contains()]"));
			
			
			//Handle elements
			
		}
			

	}

}
