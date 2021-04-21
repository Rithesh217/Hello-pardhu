package launch;

import org.testng.annotations.Test;

public class Groupingtestng1 {
	
	@Test(groups="@smoke")
	private void tc1() {
		System.out.println("Test 1");
	}
	
		@Test(groups="@Reg")
		private void tc3() {
			System.out.println("Test 3");
		}
		
		@Test
		private void tc2() {
			System.out.println("Test 2");
		}
		
		
		
	
}


