package com.cmproject.model;

public enum StatusENUM {
	Disponível(0), Indisponível(1);
	
	public int valor;
	
	StatusENUM(int valor){
		this.valor = valor;
	}
}
