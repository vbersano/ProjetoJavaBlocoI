package Cardapio;

public class Pizza extends Cardapio {
	
	private double valorSabor;
	private double valorBorda;
	
	//METODO CONST. SUPERCLASSE CARDAPIO: super(sabor, preco);
	//METODO CONST. SUBCLASSE PIZZASALGADA
	public Pizza(int idSabor) {
		super(idSabor);
	}
	
	//METODOS MENU -> DEFINIÇÕES
	
	public double getValorSabor() {
		return valorSabor;
	}

	public void setValorSabor(double valorSabor) {
		this.valorSabor = valorSabor;
	}

	public double getValorBorda() {
		return valorBorda;
	}

	public void setValorBorda(double valorBorda) {
		this.valorBorda = valorBorda;
	}

	public void billingPizza(int idSabor) {
		
		this.obterIdSabor(idSabor);		
		
		for (int i = 0; i < idSabor; i++) {
			
			int addValor = 25+(5*i);
			this.valorSabor = addValor;
			setValorSabor(this.valorSabor);
				
		}
		System.out.println("Valor da Pizza R$: "+ getValorSabor());
		
	}
	
	public void menuPizza () {
		System.out.println("|-------------[Menu Pizzas]-------------|");
		System.out.println("|-----Escolha um sabor para a pizza-----|");
		System.out.println("|-[1]Mozzarella-----------------R$ 25,00|");
		System.out.println("|-[2]Margherita-----------------R$ 30,00|");
		System.out.println("|-[3]Peperoni-------------------R$ 35,00|");
		System.out.println("|-[4]Havaiana-------------------R$ 40,00|");
		System.out.println("|---------------------------------------|");
		
	}
	
	public void menuBorda () {
			
		System.out.println("|---------[Menu Bordas]---------|");
		System.out.println("|-Escolha um sabor para a borda-|");
		System.out.println("|-[1]Sem Borda-------- +R$ 00,00|");
		System.out.println("|-[2]Catupiry--------- +R$ 05,00|");
		System.out.println("|-[3]Cheddar---------- +R$ 10,00|");
		System.out.println("|-------------------------------|");
			
	}
	
	public void billingBorda(int idBorda) {
		
		this.obterIdBorda(idBorda);		
		
		for (int i = 0; i < idBorda; i++) {
			
			int addValor = (5*i);
			this.valorBorda = addValor;
			setValorBorda(this.valorBorda);
				
		}
		System.out.println("Valor da Borda +R$: "+getValorBorda());
		
	}	
	
	
	
	public void obterIdSabor(int idSabor) {
		this.setIdSabor(idSabor);
	}
	
	public void obterIdBorda (int idBorda) {
		this.setIdBorda(idBorda);
		
	}
	
}
