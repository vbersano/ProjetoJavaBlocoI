package InfosPagamento;


public class Pagamento implements Extrato {
	
	private String opcaoPagamento;

	@Override
	public void pagamentoMetodo(boolean pagamentoCredito) {
		if (pagamentoCredito == true) {
			this.opcaoPagamento = "CREDITO";
		} else {
			System.out.println("ESCOLHA UMA FORMA DE PAGAMENTO A VISTA");
		}
	}
	
	
	public String getOpcaoPagamento() {
		return opcaoPagamento;
	}


	public void setOpcaoPagamento(String opcaoPagamento) {
		this.opcaoPagamento = opcaoPagamento;
	}


	//SOBRECARGA
	public void pagamentoMetodo(int opcaoDebito) {
	
		if (opcaoDebito==1) {
			this.opcaoPagamento = "DEBITO";
			
		} else {
			this.opcaoPagamento = "PIX";
			
		}
		
	}
	
	
}	