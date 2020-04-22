package com.exemplo.entrega;

public class EntregaPAC implements Entrega {

	@Override
	public void entregar(String produto) {
		System.out.println("Entrega via Pac = " + produto + ", 15 dias");

	}

}
