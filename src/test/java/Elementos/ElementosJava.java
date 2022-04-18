package Elementos;

import org.openqa.selenium.By;

public class ElementosJava {

	private By BtnAbrirConta = By.xpath("/html/body/div[2]/nav[2]/div[2]/div[4]/a");
	private By BtnPf = By.id("bt1");
	private By CampoNome = By.id("nome");
	private By CampoCelular = By.id("telefone");
	private By CampoEmail = By.id("email");
	private By CampoCpf = By.id("cpf");
	private By BtnEnviar = By.id("btnEnviar");
	
	
	public By getBtnAbrirConta() {
		return BtnAbrirConta;
	}
	public By getBtnPf() {
		return BtnPf;
	}
	public By getCampoNome() {
		return CampoNome;
	}
	public By getCampoCelular() {
		return CampoCelular;
	}
	public By getCampoEmail() {
		return CampoEmail;
	}
	public By getCampoCpf() {
		return CampoCpf;
	}
	public By getBtnEnviar() {
		return BtnEnviar;
	}
	
	
	
}
