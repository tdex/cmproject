package com.cmproject.model;

public enum TipoVeiculoENUM {
	Carro(1), Moto(2), Caminhão(3), Ônibus(4);
	
	public int valor;
	
	TipoVeiculoENUM(int valor){
		this.valor = valor;
	}
}
