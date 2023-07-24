package test;

import org.testng.annotations.Test;

import page.CartPage;

public class CartTest  extends ProductTest{
	@Test(priority=3)
	public void verifycart() throws Exception
	{
		CartPage cp=new CartPage(driver);
		Thread.sleep(3000);
		cp.cart();
		Thread.sleep(4000);
		cp.iconcar();
		cp.checkout();
		cp.setvalues();
		cp.state();
		cp.contshipping();
		Thread.sleep(2000);
		cp.pymnt();
		Thread.sleep(2000);
		
		
	}

}
