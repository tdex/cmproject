package com.cmproject.model;

public enum TipoUsuarioENUM {
	VISITANTE(0), COLABORADOR(1);
	
	public int valor;
	
	TipoUsuarioENUM(int valor) {
		this.valor = valor;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}
}
