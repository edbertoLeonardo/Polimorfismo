package com.exemplo.entrega;

public class Compra {
	
	private Entrega entrega;
	
	public Compra(Entrega e) {
		entrega = e;
	}
	public void comprar(String produto) {
		entrega.entregar(produto);
	}

}
