package utils;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class BaseTest {

	public BasePage app; //app poate sa cheme toate metodele din Base Page
	public static WebDriver driver;		//obiectul va fi instantiat inainte de instantierea claselor, va avea aceeasi valoarea in toate clasele//vreau sa fie accesibil obiectul , este null, reprezinta browseru nostru
	
	@Parameters({"appURL"})
	@BeforeClass(alwaysRun = true)
	public void setup() {
		
		driver = new ChromeDriver();		
		driver.manage().window().maximize();		//face maximize la browser
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	//setupul se propaga pe toata rularea, orice findElem va activa implicit wait. se pune in base test ca best practice, nu are sens sa il folosim in test
		driver.get("https://keyfood.ro/");	
		app = new BasePage(); //creez obiectele inainte,
	}
	
	@AfterClass (alwaysRun = true)
	public void tearDown() throws InterruptedException {
		Thread.sleep(4000);			//ca sa se inchida browseru dupa 4 secunde -- este bad practice
		//driver.close();	//inchide tabul curent
		driver.quit();//inchide browserul indiferent de cate tab uri are deschise
	}
}
