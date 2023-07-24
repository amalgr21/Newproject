package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
WebDriver driver;

By login= By.xpath("/html/body/main/div/div[2]/form/button");
By emailid= By.xpath("/html/body/main/div/div[2]/form/div[1]/input");
By seanwrpassword= By.name("customer[password]");
By icon=By.xpath("//a[@class='header__icon header__icon--account link focus-inset small-hide']");

	
public LoginPage(WebDriver driver2) {
	// TODO Auto-generated constructor stub
	this.driver=driver2;
}
public void icon()
{
	driver.findElement(icon).click();
}
public void setvalue() throws Exception
{
driver.findElement(emailid).sendKeys("abcd123@gamil.com");
Thread.sleep(2000);

driver.findElement(seanwrpassword).sendKeys("Agr@#1234");


}
public void clickloginbutton()
{
	driver.findElement(login).click();
}
}
