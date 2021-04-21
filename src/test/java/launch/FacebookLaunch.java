package launch;

import java.util.Date;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FacebookLaunch {

	@BeforeClass
	private void launch() {
		System.out.println("launch browser");
	}
	@AfterClass
	private void end() {
		System.out.println("quit browser");
	}
	
	@BeforeMethod
	private void startDate() {
		Date d =new Date();
		System.out.println("startDate="+d);
		
	}
		@AfterMethod
		private void endDate() {
			Date d = new Date();
			System.out.println("endDate="+d);
		}
		


    @Test
    private void tc1() {
    	System.out.println("test 1");
    	
    }

@Test
private void tc3() {
	System.out.println("test 3");
	
}

@Test
private void tc2() {
	System.out.println("test 2");
}
}

