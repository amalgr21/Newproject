package test;

import org.testng.annotations.Test;

import page.ProductPage;

public class ProductTest extends LoginTest {
@Test(priority=2)
public void verifyproduct() throws Exception
{
	ProductPage pp=new ProductPage(driver);
	Thread.sleep(2000);
	pp.click();
	Thread.sleep(2000);
}
}
