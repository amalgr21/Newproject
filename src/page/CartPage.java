package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class CartPage {
WebDriver driver;
By addtocart= By.xpath("//button[@class='product-form__submit button button--full-width button--secondary']");
By iconcart=By.xpath("/html/body/div[3]/cart-notification/div/div/div[3]/a");

By checkout =By.xpath("//button[@class='cart__checkout-button button']");

By firstname= By.xpath("/html/body/div[1]/div/div/div/div[1]/div/div[2]/div/div/div/div[2]/div/div/div/main/form/div[1]/div/div[2]/div[1]/div/section/div/div/div[1]/div/div[1]/div[2]/div[1]/div/div/input");
By lastname = By.xpath("/html/body/div[1]/div/div/div/div[1]/div/div[2]/div/div/div/div[2]/div/div/div/main/form/div[1]/div/div[2]/div[1]/div/section/div/div/div[1]/div/div[1]/div[2]/div[2]/div/div/input");
By address= By.xpath("/html/body/div[1]/div/div/div/div[1]/div/div[2]/div/div/div/div[2]/div/div/div/main/form/div[1]/div/div[2]/div[1]/div/section/div/div/div[1]/div/div[1]/div[3]/div/div/div/div/div/input");
By city=By.xpath("/html/body/div[1]/div/div/div/div[1]/div/div[2]/div/div/div/div[2]/div/div/div/main/form/div[1]/div/div[2]/div[1]/div/section/div/div/div[1]/div/div[1]/div[5]/div[1]/div/div/input");
By state=By.xpath("/html/body/div[1]/div/div/div/div[1]/div/div[2]/div/div/div/div[2]/div/div/div/main/form/div[1]/div/div[2]/div[1]/div/section/div/div/div[1]/div/div[1]/div[5]/div[2]/div/div/select");
By picode=By.xpath("/html/body/div[1]/div/div/div/div[1]/div/div[2]/div/div/div/div[2]/div/div/div/main/form/div[1]/div/div[2]/div[1]/div/section/div/div/div[1]/div/div[1]/div[5]/div[3]/div/div/div/input");
By phnum=By.xpath("/html/body/div[1]/div/div/div/div[1]/div/div[2]/div/div/div/div[2]/div/div/div/main/form/div[1]/div/div[2]/div[1]/div/section/div/div/div[1]/div/div[1]/div[6]/div/div/div/input");
By contshipping= By.xpath("/html/body/div[1]/div/div/div/div[1]/div/div[2]/div/div/div/div[2]/div/div/div/main/form/div[1]/div/div[2]/div[2]/div/button");
By email=By.xpath("/html/body/div[1]/div/div/div/div[1]/div/div[2]/div/div/div/div[2]/div/div/div/main/form/div[1]/div/div[2]/div[1]/section/div/div[2]/div[1]/div/div/input");
By payment=By.xpath("/html/body/div[1]/div/div/div/div[1]/div/div[2]/div/div/div/div[2]/div/div/div/main/form/div[1]/div/div/div[2]/div[1]/button");

public CartPage(WebDriver driver) {
	// TODO Auto-generated constructor stub
	this.driver=driver;
}
public void cart()
{
driver.findElement(addtocart).click();	
}
public void iconcar() 
{
	driver.findElement(iconcart).click();
}
public void checkout()
{
	driver.findElement(checkout).click();
}
public void setvalues() throws Exception

{
	driver.findElement(email).sendKeys("abcd12@gamil.com");
	driver.findElement(firstname).sendKeys("Anu");
	Thread.sleep(2000);
	driver.findElement(lastname).sendKeys("jj");
	Thread.sleep(2000);
	driver.findElement(address).sendKeys("Anu bhavan");
	Thread.sleep(2000);
	driver.findElement(city).sendKeys("kottayam");
	Thread.sleep(2000);
	driver.findElement(picode).sendKeys("691520");
	Thread.sleep(2000);
	driver.findElement(phnum).sendKeys("1234554321");
	
}
public void state()
{
	Select sl=new Select(driver.findElement(state));
	sl.selectByVisibleText("Kerala");
}
public void contshipping() 
{
	driver.findElement(contshipping).click();
}
public void pymnt()
{
	driver.findElement(payment).click();
}
}