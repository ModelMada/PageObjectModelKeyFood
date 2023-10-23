package pages;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ViewCartPage {

	public WebDriver driver;
	public ViewCartPage(WebDriver driver) {
		this.driver=driver; 	
	}
	
	
	public By removeProduct = By.xpath("//td[@class='product-remove']");
	public By changeQtyAdd = By.xpath("//div[@class='quantity-button plus']");	
	public By totalPrice = By.xpath("//td[@data-title='Total']//span[@class='woocommerce-Price-amount amount']");
	public By checkoutButton = By.xpath("//a[@class='checkout-button button alt wc-forward']");
	
	// cum il fac sa nu mai crape daca e cosul gol
	public void checkBasket(By locator) {
		boolean basketnotEmpty = driver.findElement(locator).isDisplayed();
		if(basketnotEmpty) {
			driver.findElement(locator).click();
		}
	}
}
	
	

