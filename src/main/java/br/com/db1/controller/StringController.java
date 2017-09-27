package br.com.db1.controller;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class StringController {

	private String palavra;
	private String resultado;
	
	public void letrasMaisculas() {
		resultado=palavra.toUpperCase();
	}
	
	public void letrasMinusculas() {
		resultado=palavra.toLowerCase();
	}

	public String getResultado() {
		return resultado;
	}

	public void setResultado(String resultado) {
		this.resultado = resultado;
	}

	public String getPalavra() {
		return palavra;
	}

	public void setPalavra(String palavra) {
		this.palavra = palavra;
	}
	
}
