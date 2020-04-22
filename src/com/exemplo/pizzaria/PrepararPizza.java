package com.exemplo.pizzaria;

public class PrepararPizza {

	public void fabricar(Pizza pizza) {

		System.out.println("Promoção borda recheada");
		pizza.preparar();
		pizza.assar();
		pizza.cobrar();
	}
}
