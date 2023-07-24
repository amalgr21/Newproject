package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage {
WebDriver driver;
By product= By.xpath("/html/body/div[3]/sticky-header/header/nav/ul/li[3]/a");
By leathershoe= By.xpath("/html/body/main/div[2]/div/div/div/div/ul/li[2]/div/div/div[2]/div[1]/h3/a");
By shoesize= By.xpath("/html/body/main/section[1]/section/div/div[2]/div/variant-radios/fieldset[1]/label[5]"); 
By quantity= By.xpath("/html/body/main/section[1]/section/div/div[2]/div/div[6]/quantity-input/button[2]");




public ProductPage(WebDriver driver) {
	// TODO Auto-generated constructor stub
	this.driver=driver;
}


public void click() throws Exception 
{
driver.findElement(product).click();

driver.findElement(leathershoe).click();

driver.findElement(shoesize).click();

driver.findElement(quantity).click();

}
}

