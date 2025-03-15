package harivardhan;

import org.testng.annotations.Test;

public class VardhanTest {
	@Test(groups = "smoke")
	public void additionTest() {
		System.out.println("this is addition method of smoke suite");
	}
	@Test(groups = "regression")
	public void subTest() {
		System.out.println("this is subraction method present in regression suite");
	}

}
