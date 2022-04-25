package TestNGPack;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationDemo {
	
	@BeforeTest
	public void launchBrowser() {
		
		System.out.println("Launching the browser");
	}
	
	@Test(priority = 1)
	public void login() {
		
		System.out.println("Login the app");
	}
	
	@Test(priority = 2)
	public void addproduct() {
		
		System.out.println("Add product ");
	}
	
	@Test(priority = 3)
	public void logout() {
		
		System.out.println("logout");
	}
	
	
}
