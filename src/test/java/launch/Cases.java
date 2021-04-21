package launch;

import org.testng.annotations.Test;

public class Cases {

	@Test
	private void tc5() {
		System.out.println("test 5="+Thread.currentThread().getId());
	}

	@Test
	private void tc4() {
		System.out.println("test 4="+Thread.currentThread().getId());
	}
	@Test
	private void tc6() {
		System.out.println("test 6="+Thread.currentThread().getId());
	}
}
