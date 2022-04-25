import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstMavenClass {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		//To maximize chrome window.
		driver.manage().window().maximize();

		//To launch the website in chrome
		driver.get("https://www.saucedemo.com/");
		
		//To send the key in textbox
		WebElement element = driver.findElement(By.id("user-name"));
		element.sendKeys("problem_user");
		
		WebElement pswd = driver.findElement(By.name("password"));
		pswd.sendKeys("secret_sauce");
		
		WebElement loginbtn = driver.findElement(By.id("login-button"));
		loginbtn.click();
		
		WebElement addToCart = driver.findElement(By.xpath("(//button[text()='Add to cart'])[2]"));
		addToCart.click();
		
		WebElement addToCart1 = driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']"));
		addToCart1.click();
		
		
		
		Thread.sleep(5000);
		driver.close();
		
	}

}
