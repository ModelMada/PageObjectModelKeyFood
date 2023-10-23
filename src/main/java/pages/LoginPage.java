package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	public WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver=driver; 	//obiectul de la nivelul clasei linia 7 va primi valoarea din constructor
	}
	
	//locatorii
	public By username = By.xpath("//input[@id='username']");
	public By password = By.xpath("//input[@id='password']");
	public By loginButton = By.xpath("//button[@name='login']");
	public By logoutButtonVisible = By.xpath("//a[contains(text(),'Log out')]");
	
	public void loginInApp(String user, String pass) {
		driver.findElement(username).clear();
		driver.findElement(username).sendKeys(user);
		driver.findElement(password).clear();
		driver.findElement(password).sendKeys(pass);
		driver.findElement(loginButton).click();
	}
	
	public boolean checkLoginMessageIsDisplayed(By locator) {
		return driver.findElement(locator).isDisplayed();
	}
}
