package com.exemplo.entrega;

public class Sedex implements Entrega {

	@Override
	public void entregar(String produto) {
		System.out.println("Enrega via sedex = " + produto + "24 horas");
	}

}
