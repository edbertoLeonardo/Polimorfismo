package com.exemplo.pizzaria;

public class PrepararPizza {

	public void fabricar(Pizza pizza) {

		System.out.println("Promo��o borda recheada");
		pizza.preparar();
		pizza.assar();
		pizza.cobrar();
	}
}
