package com.exemplo.pagamento;

public class CartaoDeCredito implements TipoPagamento {

	@Override
	public void pagar(double valor) {
		double taxa = valor * 0.2;
		System.out.println("Pagamento com c/c. Taxa  de: " + taxa);

	}

}
