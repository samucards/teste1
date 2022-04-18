package Metodos;

import org.openqa.selenium.By;

import Elementos.ElementosJava;
import Page.PageJava;

public class MetodosJava {

	ElementosJava e = new ElementosJava();
	PageJava p = new PageJava();
	
	public void selecionarBotaoAbrirConta() {
		
	p.clicar(e.getBtnAbrirConta());	
		
		
		
	}
	public void selecionarTipoPessoa() {
		p.clicar(e.getBtnPf());
		
	}
	
	public void preencherCampo() {
		p.preencher(e.getCampoNome(), "Samuel Rodrigues");
		p.preencher(e.getCampoCelular(), "11111111111");
		p.preencher(e.getCampoEmail(), "Teste@teste.com.br");
		p.preencher(e.getCampoCpf(), "37395648905");
		
		
		
		
	}
	public void BotaoAbrirConta() {
		
		p.clicar(e.getBtnEnviar());
		
	}
	
	public void abrirUrl(String site) {
		p.abrirNavegador(site);
		
	}
}
