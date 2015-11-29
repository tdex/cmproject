package com.cmproject.model;

public enum TipoVeiculoENUM {
	Carro(0), Moto(1), Caminhão(2), Ônibus(3);
	
	public int valor;
	
	TipoVeiculoENUM(int valor){
		this.valor = valor;
	}
}
