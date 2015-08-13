package com.cmproject.model;

public enum StatusENUM {
	Disponível(1), Indisponível(2);
	
	public int valor;
	
	StatusENUM(int valor){
		this.valor = valor;
	}
}
