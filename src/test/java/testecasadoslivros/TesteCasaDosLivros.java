package testecasadoslivros;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesteCasaDosLivros {
	private WebDriver driver;
	
	@Before
	public void AbrirNavegador() {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@Test
	public void TesteNavegador() {
		driver.get("http://localhost:4200/login");
		driver.findElement(By.xpath("//*[@id=\"menubar\"]/a[4]")).click();
		
		WebElement inputEmail = driver.findElement(By.id("e-Mail"));
		WebElement inputSenha = driver.findElement(By.id("Passw"));
		WebElement inputSubmit = driver.findElement(By.id("Entrar"));
		String [] listaEmails = {"MatheusTcavalcanti@hotmail.com", "MatheusCavalcanti3@Hotmail.com"};
		String [] listaSenhas = {"Senha01", "123456789"};
		
		for (int tentativas = 0; tentativas < listaSenhas.length; tentativas++) {
			try {
				//Limpando Inputs
				inputEmail.clear();
				inputSenha.clear();
				
				inputEmail.sendKeys(listaEmails[tentativas]);
				inputSenha.sendKeys(listaSenhas[tentativas]);
				inputSubmit.click();
				Thread.sleep(3000);
		}catch (InterruptedException error) {
			error.printStackTrace();
	}
			}
		}
	}

