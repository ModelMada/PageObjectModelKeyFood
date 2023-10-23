package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PlaceOrderPage {

	public WebDriver driver;
	public PlaceOrderPage(WebDriver driver) {
		this.driver=driver; 	
	}
	
	public By termsAndCond = By.xpath("//input[@type='checkbox']");
	public By placeOrderButton = By.xpath("//button[@id='place_order']");
	public By ordersHeader = By.xpath("//h3[@id='order_review_heading']");
	public By orderNumber = By.xpath("//li[@class='woocommerce-order-overview__order order']");
}
