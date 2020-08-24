package base;


import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.HomePage;

public class BaseTest {
	
	private static WebDriver driver;
	protected HomePage homePage;
	
	@BeforeAll
	public static void inicializar() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vinic\\eclipse-workspace\\testewebiterasysmaraula4ten\\ecommerce_prestashop\\drivers\\chromedriver.exe");
	
		driver = new ChromeDriver();
		
	}
	
	@BeforeEach
	public void carregarPaginaInicial() {
		driver.get("https://marcelodebittencourt.com/demoprestashop/");
		homePage = new HomePage(driver);
		
	}
	
	@AfterAll
	public static void finalizar() {
		driver.quit();
		
	}
	
}
