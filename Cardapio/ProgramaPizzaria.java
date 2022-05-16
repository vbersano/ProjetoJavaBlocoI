package Cardapio;

import java.util.ArrayList;
import java.util.Scanner;

import Cadastro.Cadastro;
import Cadastro.Entrega;
import Cadastro.Login;

public class ProgramaPizzaria {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		Pizza pizza1 = new Pizza(0);
		
		ArrayList<Double> valorPedidos = new ArrayList<>();
		
		Cadastro cadastro1 = new Cadastro("jaozinho", "245247", "Rua da Abolição, N°134", "19 943495770");	
				
		Login login = new Login (cadastro1.getNome(), cadastro1.getSenha());
		
		String inputNome;
		String inputSenha;
		
		
		
		do {
			
			System.out.println("Digite seu nome: ");
			inputNome = ler.nextLine();
			System.out.println("Digite sua senha: ");
			inputSenha = ler.nextLine();
			System.out.println();
			
		} while (inputSenha == cadastro1.getSenha() && inputNome == cadastro1.getNome());
		
		
		
		
		int contadorPedidos = 0;
		double somaTotalValores = 0;
		boolean loopPedido;
		
		//loop pedido
		do {
			
			//DEFINICAO SABOR PIZZA
			//sist confirmacao
			boolean loopbreaker = false;
			int idSabor;
			double valSabor=0;
			contadorPedidos++;
			System.out.printf("PEDIDO N° "+ contadorPedidos);
			
			
			//SISTEMA ESCOLHA SABOR PIZZA
			do {
				System.out.println();
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
				
				System.out.println("Você gostaria de adicionar borda recheada à sua pizza?"
						+ "\n[1]SIM\n[QQR INPUT]NÃO");
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
				
				System.out.println("Confirma sua escolha?\n[1]SIM\n[QQR INPUT]NÃO, QUERO ALTERAR");
				int confirmacao;
				confirmacao = ler.nextInt();
				
				
				if (confirmacao == 1) {
					loopbreaker = false;
				} else {
					loopbreaker = true;
				}

				
			} while (loopbreaker);
			//FIM SISTEMA ESCOLHA DA BORDA
			
				valFinal = valSabor + valBorda;
				pizza1.setValorFinal(valFinal);
				System.out.printf("\nValor Final da Pizza: %.2f%n", pizza1.getValorFinal());
				
			int i = 0;
			i++;
			//atribuindo valor aos indices do arraylist
			for (int x = 0; x < i; x++) {
				valorPedidos.add(valFinal);
			}
			
			
			 
			loopPedido = true;
			System.out.println("Gostaria de Finalizar seu Pedido?"
					+ "\n[1]SIM\n[2]Adicionar +1 Pizza\n[QQR INPUT]NÃO, QUERO ALTERAR");
			int confirmacao;
			confirmacao = ler.nextInt();
			
			if (confirmacao == 1) {
				loopPedido = false;
			} else if (confirmacao == 2) {
				loopPedido = true;
				System.out.println();
				
			} else {
				loopPedido = true;
			}
	
			System.out.println(somaTotalValores);
			System.out.println();
			
			//VALOR TOTAL DO PEDIDO
//			for (int x = 0; x < i; x++) {
//				somaTotalValores = somaTotalValores + valorPedidos.
//			}
//			
			System.out.println("PEDIDOS: "+valorPedidos);
			
			System.out.println("Valor total a Pagar: "+ somaTotalValores);
			
			
		} while (loopPedido);
		
		// METODO DE ENTREGA
		// RETIRAR NA PIZZARIA
		// DELIVERY IFOOD
		
		Entrega frete = new Entrega();
		
		try {
			
		boolean retirada;
		System.out.println("Digite true para retirar o pedido na loja e false para receber em casa:\n");
		int escolha = ler.nextInt();
		
		//Definição da escolha
		if (escolha == 1) {
			retirada = true;
			frete.setRetirada(retirada);
			
	
		} else {
			retirada = false;
			frete.setRetirada(retirada);
		}
		
		
		} catch (Exception erro) {
			System.out.println("Você digitou um caráter inválido. Digite apenas números." );
		}
		
		
		
	}

}
