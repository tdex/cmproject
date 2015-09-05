package com.cmproject.model;

public enum TipoAcessoENUM {
	COLABORADOR(1), FUNCIONARIO(2);
	
	public int valor;
	
	TipoAcessoENUM(int valor) {
		this.valor = valor;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}
}
