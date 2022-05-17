package Cardapio;

//Classe mãe cardapio
public abstract class Cardapio {
	
	private double preco;
	private int idSabor;
	private int idBorda;
	
	public Cardapio(int idSabor) {
		this.idSabor = idSabor;
	}

	//GETTERS E SETTERS ATTS
	double getPreco() {
		return preco;
	}
	
	void setPreco(double preco) {
		this.preco = preco;
	}


	public int getIdSabor() {
		return idSabor;
	}


	public void setIdSabor(int idSabor) {
		this.idSabor = idSabor;
	}


	public int getIdBorda() {
		return idBorda;
	}


	public void setIdBorda(int idBorda) {
		this.idBorda = idBorda;
	}
	
	

}