package com.exemplo.pizzaria;

public class Napolitana implements Pizza {

	@Override
	public void preparar() {
		System.out.println("molho, prsunto, queijo, tomate e oregano");
		
	}

	@Override
	public void assar() {
		System.out.println("15 minutos");		
	}

	@Override
	public void cobrar() {
		System.out.println("R$ 18,00 \n");
		
	}

	
}
