package utils;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//aici scriem metodele care sunt generice pentru mai multe clase
//le putem reutiliza si pt alte elemente

public class SeleniumWrappers extends BaseTest {

	public void click(By locator) {
		
		try {
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
			wait.until(ExpectedConditions.elementToBeClickable(locator));
			WebElement element = driver.findElement(locator);
			element.click();
		}catch(Exception e) {
			
		}
	}
	
	public void scrollByPixels(int x, int y) throws InterruptedException {
		Actions action = new Actions(driver);
		action.scrollByAmount(x, y).perform();	
	}
	
	public WebElement returnElement(By locator) {
		return driver.findElement(locator);
	}
	
	public void sendKeys(By locator, String text) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		//driver.findElement(locator).clear();
		driver.findElement(locator).sendKeys(text);
	
	}
	
	public String getElementText(By locator) {
		return driver.findElement(locator).getText();
	}
	
	public void scrollVertically(int y) {
		Actions action = new Actions(driver);
		action.scrollByAmount(0, y).perform();	
	}
	
	public void scrollHorizontally(int x) {
		Actions action = new Actions(driver);
		action.scrollByAmount(x, 0).perform();	
	}
	
	public boolean verifyIfDisplayed(By locator) {
		return driver.findElement(locator).isDisplayed();
	}
	
	public void dragAndDropSlider(By locator, int x, int y) {
		WebElement element = driver.findElement(locator);
		Actions action = new Actions(driver);
		action.moveToElement(element).clickAndHold(element).moveByOffset(x,y).release().perform();
		
	}
	
	
}
