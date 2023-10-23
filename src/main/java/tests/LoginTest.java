package tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pages.LoginPage;
import utils.BaseTest;

public class LoginTest extends BaseTest{
	//@Parameters({"appURL"})
	@Test
	public void loginTest() throws InterruptedException {
		//navigam catre login page
		app.homePage.navigateTo(app.homePage.myAccount);
		
		//adaugam user, pass si dam click pe login		
		app.sendKeys(app.loginPage.username, "customer");
		app.sendKeys(app.loginPage.password, "customer@123");
		app.click(app.loginPage.loginButton);
		Thread.sleep(2000);
		assertTrue(app.loginPage.checkLoginMessageIsDisplayed(app.loginPage.logoutButtonVisible));
		
		//navigam la homepage pt a cauta produsul
		app.click(app.homePage.keyFoodLogo);
		app.sendKeys(app.homePage.searchForProd, "Pretzels");
		app.click(app.homePage.selectProd);
		
		//add to cart + message check
		app.click(app.productPage.addToCart);
		
		//assertEquals(app.getElementText(app.productPage.addToCartSuccess), " “Rold Gold Tiny Twists Pretzels” has been added to your cart.	");
		app.click(app.productPage.viewCart);
		app.click(app.viewCartPage.changeQtyAdd);
		Thread.sleep(3000);
		assertEquals(app.getElementText(app.viewCartPage.totalPrice),"$5.98");
		
		//proceed to checkout
		app.click(app.viewCartPage.checkoutButton);
		app.scrollVertically(200);
		assertTrue(driver.findElement(app.placeOrderPage.ordersHeader).isDisplayed());
		assertTrue(driver.findElement(app.placeOrderPage.termsAndCond).isDisplayed());
		Thread.sleep(2000);
		app.click(app.placeOrderPage.termsAndCond);
		Thread.sleep(2000);
		app.click(app.placeOrderPage.placeOrderButton);
		Thread.sleep(2000);
		assertTrue(app.returnElement(app.placeOrderPage.orderNumber).isDisplayed());
		
		
		//la final de rulare verificam daca sunt elem in cos si le stergem pt a rula clean urmatoarea data
		app.homePage.navigateTo(app.homePage.shoppingCartButton);
		app.viewCartPage.checkBasket(app.viewCartPage.removeProduct);
	}
}
