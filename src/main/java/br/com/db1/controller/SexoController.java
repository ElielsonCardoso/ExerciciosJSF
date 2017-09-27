package br.com.db1.controller;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class SexoController {

	private Sexo sexo = Sexo.MASCULINO;

	public Sexo[] getListaSexo() {
		return Sexo.values();
	}

	public Sexo getSexo() {
		return sexo;
	}

}
