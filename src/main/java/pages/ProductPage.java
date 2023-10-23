package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage {

	public WebDriver driver;
	public ProductPage(WebDriver driver) {
		this.driver=driver; 	
	}
	
	public By addToCart = By.xpath("//button[@name='add-to-cart']");
	public By addToCartSuccess = By.xpath("//div[@class='woocommerce-message']");
	public By viewCart = By.xpath("//a[@tabindex='1' and @href='https://keyfood.ro/cart-2/']");
	
}
