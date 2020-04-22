package com.exemplo.pizzaria;

public class Calabresa implements Pizza {
	
	public void preparar() {
		System.out.println("molho, calabresa, cebola");
	}

	public void assar() {
		System.out.println("10 minutos");
	}
	
	public void cobrar() {
		System.out.println("R$ 10,00 \n");
	}
}
