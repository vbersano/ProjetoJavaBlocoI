package Cardapio;

import java.util.Scanner;

import Programa.Cadastro;

public class ProgramaPizzaria {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		Cadastro cliente = new Cadastro ("Cleber Santana", "clebinho.santana@gmail.com", "cleber2008", "RUA TREBSON, BAIRRO XERBAS, N°007", 18);
		
		Pizza pizza1 = new Pizza(0);
		
		
	//DEFINICAO SABOR PIZZA
	//sist confirmacao
	boolean loopbreaker = false;
	int idSabor;
	double valSabor=0;
	do {
		loopbreaker = true;
		
		pizza1.menuPizza();
		idSabor = ler.nextInt();
		pizza1 = new Pizza(idSabor);
		pizza1.billingPizza(idSabor);
		valSabor = pizza1.getValorSabor();
		
		System.out.println("Confirma sua escolha?\n[1]SIM\n[2]NÃO, QUERO ALTERAR");
		int confirmacao;
		confirmacao = ler.nextInt();
		
		if (confirmacao == 1) {
			loopbreaker = false;
		} else if (confirmacao == 2) {
			loopbreaker = true;
		}
		
		
	} while (loopbreaker);
	
	
	//SISTEMA ESCOLHA DA BORDA
	
	int idBorda;
	double valBorda = 0;
	double valFinal;
	do {
		
		loopbreaker = true;
		
		System.out.println("Você gostaria de adicionar borda recheada à sua pizza?\n[1]SIM\n[QQR INPUT]NÃO");
		int opcaoBorda = ler.nextInt();
		
		if (opcaoBorda == 1) {
			pizza1.menuBorda();
			
			idBorda = ler.nextInt();
			pizza1 = new Pizza(idBorda);
			pizza1.billingBorda(idBorda);
			valBorda = pizza1.getValorBorda();
			
		} else {
			pizza1.billingBorda(1);
		}	
		
		System.out.println();
		valFinal = valSabor + valBorda;
		System.out.printf("Valor Atual da Pizza: %.2f%n\n", valFinal);
		
		System.out.println("Confirma sua escolha?\n[1]SIM\n[2]NÃO, QUERO ALTERAR");
		int confirmacao;
		confirmacao = ler.nextInt();
		
		
		if (confirmacao == 1) {
			loopbreaker = false;
		} else if (confirmacao == 2) {
			loopbreaker = true;
		}

		
	} while (loopbreaker);
	//FIM SISTEMA ESCOLHA DA BORDA
	
	valFinal = valSabor + valBorda;
	System.out.printf("\nValor Final da Pizza: %.2f%n", valFinal);
	
	
	}

}
