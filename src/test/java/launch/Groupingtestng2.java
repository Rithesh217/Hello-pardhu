package launch;

import org.testng.annotations.Test;

public class Groupingtestng2 {

@Test(groups="@sanity")
private void tc4() {
	System.out.println("Test 4");
}

@Test
private void tc5() {
	System.out.println("Test 5");
}

@Test(groups="@smoke")
private void tc6() {
	System.out.println("Test 6");
}

}
