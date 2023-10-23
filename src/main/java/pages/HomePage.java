package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

	public WebDriver driver;
	public HomePage(WebDriver driver) {
		this.driver=driver; 	//obiectul de la nivelul clasei linia 7 va primi valoarea din constructor
	}
	
	public By goToLoginButton = By.xpath("//div[@class='button-icon']/i[@class='klbth-icon-user']");
	public By myAccount = By.xpath("//a[contains(text(),'My account')]");
	public By keyFoodLogo = By.xpath("//a[@title='KeyFood']/img[@class='desktop-logo hide-mobile']");
	public By searchForProd = By.xpath("//input[@id='dgwt-wcas-search-input-1']");
	//public By pretzelProduct = By.xpath("//a[@href='https://keyfood.ro/product/rold-gold-tiny-twists-pretzels/']");
	public By selectProd = By.xpath("//div[@class='dgwt-wcas-content-wrapp']");
	public By shoppingCartButton = By.xpath("//i[@class='klbth-icon-shopping-bag']");
	
	public void navigateTo(By locator) {
		driver.findElement(locator).click();
	}
}
