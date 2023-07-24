package test;

import org.testng.annotations.Test;

import base.BaseClass;
import page.CreatePage;

public class CreateTest extends BaseClass{
	@Test
	public void verifycreate() throws Exception
	{
		CreatePage cp=new CreatePage(driver);
		cp.click();
		Thread.sleep(3000);
		cp.setvalues();
		Thread.sleep(3000);
		cp.create();
		Thread.sleep(3000);
	}

}
