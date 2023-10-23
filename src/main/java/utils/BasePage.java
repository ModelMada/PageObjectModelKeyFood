package utils;

import pages.HomePage;
import pages.ViewCartPage;
import pages.LoginPage;
import pages.PlaceOrderPage;
import pages.ProductPage;
public class BasePage extends SeleniumWrappers {

	public HomePage homePage = new HomePage(driver);
	public LoginPage loginPage = new LoginPage(driver);
	public ProductPage productPage = new ProductPage(driver);
	public ViewCartPage viewCartPage = new ViewCartPage(driver);
	public PlaceOrderPage placeOrderPage = new PlaceOrderPage(driver);
	
	

	
}
