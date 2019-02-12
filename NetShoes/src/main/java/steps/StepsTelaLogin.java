package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import screens.TelaLogin;

public class StepsTelaLogin {
	
	private WebDriver driver;
	private WebDriverWait wait;
	private TelaLogin telaLogin;

	@Before
	public void configuracao() {
		System.setProperty("chromedriver","C:\\Users\\ariadne.santos\\Desktop\\chromedriver.exe");
		this.driver = new ChromeDriver();
		this.driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, 30);
		this.wait = wait;
		this.telaLogin = new TelaLogin(driver,wait);
	}
	@Given("que eu esteja na pagina Net Shoes")
	public void entrarNaPaginaNetShoes() {
		telaLogin.acessarPaginaNetShoes();
	}
	
	@And("cliclo em entrar opcao login")
	public void clicarEmLogin() {
		telaLogin.clicarLogin();
	}
	
	@And("digito o CPF")
	public void digitarNaPaginaNetShoesCPF() {
		telaLogin.digitarCpf("67230728711");
	}
	
	@And("digito a senha")
	public void digitarNaPaginaNetShoesSenha() {
		telaLogin.digitarSenha("rsi123456");
	}
		
	@And("clico Acessar Conta")
	public void clicarEmAcessarConta() {
		telaLogin.clicarAcessarConta();
	}
	
	@And("clico em sair")
	public void clicarSair() {
		telaLogin.clicarEmSair();
	}
	
/*	@Then("verifico se foi feito o logout")
	public void validaSair() {
		telaLogin.validarSaida();
	}  */

}
