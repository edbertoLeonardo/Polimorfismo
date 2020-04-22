package com.exemplo.pizzaria;

public class AlhoEBacon implements Pizza {

	@Override
	public void preparar() {
		System.out.println("molho, alho, bacon");
	}

	@Override
	public void assar() {
		System.out.println("10 minnutos");
	}

	@Override
	public void cobrar() {
		System.out.println("15 conto \n");
	}

}
