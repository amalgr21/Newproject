package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreatePage {
WebDriver driver;
By icon= By.xpath("//a[@class='header__icon header__icon--account link focus-inset small-hide']");
By createaccount= By.xpath("/html/body/main/div/div[2]/form/a[2]");
By firstname= By.xpath("/html/body/main/div/form/div[1]/input");
By lastname= By.xpath("/html/body/main/div/form/div[2]/input");
By email= By.xpath("/html/body/main/div/form/div[3]/input");
By password= By.xpath("/html/body/main/div/form/div[4]/input");
By create= By.xpath("/html/body/main/div/form/button");


public CreatePage(WebDriver driver) {
	// TODO Auto-generated constructor stub
	this.driver=driver;
}
public void click()
{
	driver.findElement(icon).click();
	driver.findElement(createaccount).click();
	
}
public void setvalues() throws Exception 
{
	driver.findElement(firstname).sendKeys("anu");
	
	driver.findElement(lastname).sendKeys("jj");
	
	driver.findElement(email).sendKeys("abcd123@gmail.com");
	
	driver.findElement(password).sendKeys("Agr@#1234");
	
}
public void create()
{
	driver.findElement(create).click();
}

}
