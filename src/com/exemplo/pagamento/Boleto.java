package com.exemplo.pagamento;

public class Boleto implements TipoPagamento {

	@Override
	public void pagar(double valor) {
		System.out.println("Pagamento com boleto. Taxa de R$ 2,00");
		
	}

}
