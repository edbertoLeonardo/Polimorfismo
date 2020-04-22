package com.exemplo.entrega;

public class Programa {

	public static void main(String[] args) {
	 
		Compra blueRay = new Compra(new EntregaPAC());
		blueRay.comprar("O Hobbit");
		
		Compra livro = new Compra(new Sedex());
		livro.comprar("O Hobbit");

	}

}
