package TestNGPack;
import org.testng.annotations.Test;

public class PriorityDemo {

	@Test(priority = 1, enabled = false)
	 public void A() {
		 
		 System.out.println("Test A");
	 }
	
	@Test(priority = 2, alwaysRun = true )
	 public void B () {
		 
		 System.out.println("Test B");
	 }
	
	@Test(priority = -1)
	 public void C () {
		 
		 System.out.println("Test C");
	 }
}
