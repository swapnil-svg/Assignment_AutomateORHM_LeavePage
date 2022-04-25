import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

//Headless Browser
public class WBDriverSe {

	static WebDriver driver;
	public static void main(String[] args) {
		
		//WebDriverManager.chromedriver().setup();
		//driver = new ChromeDriver();
		//driver.get("http://demo.automationtesting.in/Register.html");
		//driver.close();
		
		/*
		 * WebDriverManager.chromedriver().setup(); ChromeOptions option = new
		 * ChromeOptions(); option.setHeadless(true); driver = new ChromeDriver(option);
		 * driver.get("http://demo.automationtesting.in/Register.html"); driver.close();
		 */
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions option = new ChromeOptions();
		option.setHeadless(true);
		driver = new ChromeDriver(option);
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.close();

	}

}
