package Testscripts;

import org.testng.annotations.Test;
import Generic.Generic_Login;

import POM.Login_page;

public class Test1 extends Generic_Login {

	@Test
	public void test_login() throws InterruptedException
	{
	 
		
		Login_page lp = new Login_page(driver);
		lp.setUsername("admin");
		lp.setpwd("manager");
		lp.loginbutton();
		
	} 
}
