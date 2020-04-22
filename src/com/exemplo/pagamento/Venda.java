package com.exemplo.pagamento;

public class Venda {

	public void vender(TipoPagamento tipoPgto, double valor) {
		tipoPgto.pagar(valor);
	}
}
