package com.exemplo.pagamento;

public class Programa {

	public static void main(String[] args) {
		
		Venda venda = new Venda();
		
		venda.vender(new Dinheiro(), 100.00);
		venda.vender(new CartaoDeCredito(), 100.00);
		venda.vender(new Boleto(), 100.00);
	}
}
