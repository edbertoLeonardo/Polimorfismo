package com.exemplo.pizzaria;

public class Programa {

	public static void main(String[] args) {
		
		PrepararPizza prepararPizza = new PrepararPizza();
		
		Calabresa calabresa = new Calabresa();
		Napolitana napolitana = new Napolitana();
		AlhoEBacon alhoEBacon = new AlhoEBacon();
		
		prepararPizza.fabricar(calabresa);
		prepararPizza.fabricar(napolitana);
		prepararPizza.fabricar(alhoEBacon);
		

	}

}
