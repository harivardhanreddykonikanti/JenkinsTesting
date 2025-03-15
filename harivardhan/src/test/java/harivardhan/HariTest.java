package harivardhan;

import org.testng.annotations.Test;

public class HariTest {
	@Test(groups = "smoke")
	public void harryTest() {
		System.out.println("harivardan successfully tested");
		String name = System.getProperty("name");
		System.out.println("name from the cmd line is "+name);
	}
	@Test(groups = "regression")
	public void potterTest() {
		System.out.println("Vardhan testing successfully tested");
	}

}
