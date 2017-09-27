package br.com.db1.controller;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class DinheiroController {
	
	private Integer valor;
	private String dinheiro;
	
	public void resultado() {
		dinheiro="R$ "+valor+",00";
	}
	
	public String getDinheiro() {
		return dinheiro;
	}

	public void setDinheiro(String dinheiro) {
		this.dinheiro = dinheiro;
	}
	
	public Integer getValor() {
		return valor;
	}

	public void setValor(Integer valor) {
		this.valor = valor;
	}
	
	
	
}
