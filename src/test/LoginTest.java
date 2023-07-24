package test;

import org.testng.annotations.Test;

import base.BaseClass;
import page.LoginPage;

public class LoginTest extends BaseClass {
	@Test
	public void verifylogin() throws Exception
	{
		LoginPage lp=new LoginPage(driver);
		lp.icon();
		Thread.sleep(2000);
		lp.setvalue();
		Thread.sleep(3000);
		lp.clickloginbutton();
		Thread.sleep(2000);
	}

}

