package InfosPagamento;

public class NotaFiscal {

	public NotaFiscal (String endereco, boolean delivery, int tempoEntrega, double valorTotalPedido) {

		if (delivery = true ) {
			System.out.println(
					 "\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-="
					+"\n        INFORMA��ES DA ENTREGA"
					+"\nENDERE�O DE ENTREGA: \n" + endereco
					+"\nOP��O DE DELIVERY: ENTREGA" 
					+"\nTempo de Entrega: " + tempoEntrega + " min"
					+"\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-="
					+" \n        INFORMA��ES DO PEDIDO"
					+"\n"
					+"\nVALOR DELIVERY R$ 10"
					+"\nVALOR FINAL R$" + valorTotalPedido+10
					+ "\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
				
			
			
		} else {
			System.out.println(
					 "\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-="
					+"\n        INFORMA��ES DA ENTREGA"
					+"\nENDERE�O DE ENTREGA: \n" + endereco
					+"\nOP��O DE DELIVERY: BUSCAR NO ESTABELECIMENTO" 
					+"\nTempo de Entrega: " + tempoEntrega + " min"
					+"\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-="
					+"\n        INFORMA��ES DO PEDIDO"
					+"\n"
					+"\nVALOR DELIVERY R$ 0,00"
					+"VALOR FINAL R$" + valorTotalPedido );
		}
		
	}

}
