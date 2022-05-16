package Cadastro;

import java.util.*;

public class Entrega extends Login{
	
	Scanner leia = new Scanner(System.in);
	
	private double frete;
	private boolean retirada;
	private int cep;

	
	
	public double getFrete() {
		return frete;
	}



	public void setFrete(double frete) {
		this.frete = frete;
	}



	public boolean isRetirada() {
		return retirada;
	}



	public void setRetirada(boolean retirada) {
		this.retirada = retirada;
	}



	public int getCep() {
		return cep;
	}



	public void setCep(int cep) {
		this.cep = cep;
	}


	
	public void opcaoEntrega() {
		if (retirada==true) {
			System.out.println("O endereço para retirada é: Rua da Felicidade, 1910.");
		}
		else {
			this.calcularFrete();
		}
	}
	

	public void calcularFrete() {
		 
		
		
		
	}
}
