package screens;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TelaLogin {
	
	private WebDriver driver;
	private WebDriverWait wait;

	public TelaLogin(WebDriver driver, WebDriverWait wait) {
		this.driver = driver;
		this.wait = wait;
	}

	public void acessarPaginaNetShoes() {
		//this.driver.navigate().to("https://www.netshoes.com.br=/");
		this.driver.get("https://www.netshoes.com.br/");
	}
	public void clicarLogin() {
		driver.findElement(By.className("ns-icon-user-ico")).click();
		driver.findElement(By.xpath("//*[@id=\'header-user-anonymous\']/ul/li[1]/a")).click();
	}
	
	public void digitarCpf(String cpf) {
		wait.until(ExpectedConditions.elementToBeClickable(By.name("username")));
		driver.findElement(By.name("username")).sendKeys(cpf);			
	}
	
	public void digitarSenha(String senha) {
		wait.until(ExpectedConditions.elementToBeClickable(By.name("password")));
		driver.findElement(By.name("password")).sendKeys(senha);	
	}
		
	public void clicarAcessarConta() {
		driver.findElement(By.xpath("//*[@id=\'login-button']")).click();
	}
	
	public void clicarEmSair() {
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@href='#header-user-logged']")));
		driver.findElement(By.xpath("//*[@href='#header-user-logged']")).click();
		driver.findElement(By.xpath("//*[@id=\"header-user-logged\"]/ul/li[4]/a")).click();
	}
	
	/*public void validarSaida() {
		boolean saiu;
		try {
			driver.findElement(By.xpath("//*[contains(text(),'Ruan Jorge')]"));
			saiu = false;
		} catch (Exception e) {
			saiu = true;
		}
		assertTrue("Não fez logout", saiu);
	} */

	
}
