package TestCases;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import Utils.GerenciamentoDriver;

public class Ze {
	
	private WebDriver driver;
	GerenciamentoDriver gerenciamentoDriver;
	
	@Before
	public void setup() {
		gerenciamentoDriver = new GerenciamentoDriver();
		driver = GerenciamentoDriver.browser("firefox");
	}
	
	@Test
	public void ze() {
		
		driver.get("https://www.ze.delivery/");
		
	}
	
	@After
	public void fim( ) {
		//driver.quit();
	}
}
