package harivardhan;

import org.testng.annotations.Test;

public class HariTest {
	@Test(groups = "smoke")
	public void harryTest() {
		System.out.println("harivardan successfully tested");
		String url=System.getProperty("url");
		String username = System.getProperty("username");
		String password = System.getProperty("password");
		String browser = System.getProperty("browser");
		System.out.println("the url is "+url);
		System.out.println("the username is "+username);
		System.out.println("the password is "+password);
		System.out.println("the browser is "+browser);
	}
	@Test(groups = "regression")
	public void potterTest() {
		System.out.println("Vardhan testing successfully tested");
	}

}
