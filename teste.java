package TESTE;

import java.util.concurrent.TimeUnit;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class teste {
	private WebDriver driver;
	
	@Before
	public void abrirNavegador() {
		System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	}
	
	@Test 
	public void testeNavegador() {
		driver.get("https://sp.senai.br/cursos/");
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.id("titulopesquisa")).sendKeys("gestão");
		driver.findElement(By.id("btnSearch")).click();
	}

}