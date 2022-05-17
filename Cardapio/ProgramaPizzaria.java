package Cardapio;

import java.util.ArrayList;
import java.util.Scanner;

import Cadastro.Cadastro;
import Cadastro.Login;
import InfosPagamento.NotaFiscal;
import InfosPagamento.Pagamento;

public class ProgramaPizzaria {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
		
		Pizza pizza1 = new Pizza(0);
		
		ArrayList<Double> valorPedidos = new ArrayList<>();
		
		Cadastro cadastro1 = new Cadastro("jaozinho", "245247", "Rua da Abolição, N°134", "19 943495770");	
				
		Login login = new Login (cadastro1.getNome(), cadastro1.getSenha());
		
		
		try {
			
			boolean loopbreak=true; 
			login.menuCadastro();
			int opcao = ler.nextInt();
			
			do {
				switch (opcao) {
				case 1:
				System.out.println("Login Selecionado");
				System.out.println("\nNome de usuário: ");
				login.setNome(ler.next());
				System.out.println("Senha: ");
				login.setSenha(ler.next());
				System.out.println("\nLogin feito. ");
				
				break;
				case 2:
					System.out.println("Cadastro selecionado");
					System.out.println("\nDigite seu nome: ");
					login.setNome(ler.next());
					System.out.println("Endereço: ");
					login.setEndereco(ler.next());
					System.out.println("Senha: ");
					login.setSenha(ler.next());
					System.out.println("\nUsuário Cadastrado.");
				
					break;
				case 3:
					
					System.out.println("Informe seu Endereço:");
					String endereco = ler.nextLine();
					cadastro1.setEndereco(endereco);
					loopbreak=false;
					break;
				}	
			} while (loopbreak = false);
			
			System.out.println("\n"+cadastro1.getEndereco()+"\n");
			
			
		} catch (Exception erro) {
			System.out.println("Coloque uma input válida");
		}
			
		
		System.out.println();
	
		
		int contadorPedidos = 0;
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
			//SISTEMA ESCOLHA SABOR PIZZA
			
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
	
			System.out.println(valorPedidos);
		
			
			
		} while (loopPedido); //FIM SISTEMA PEDIDO
		
		
		//VALOR TOTAL DO PEDIDO
		double somaTotalValores = 0;
		int limiteArray;
		limiteArray = valorPedidos.size();
		
		for (int x = 0; x < limiteArray; x++) {
			somaTotalValores = somaTotalValores + valorPedidos.get(x);
		}
		System.out.println("Valor total a Pagar: "+ somaTotalValores);
		System.out.println();
		//FINAL VALOR TOTAL

		
		// DELIVERY IFOOD
		boolean loopDelivery=true;
		int tempoEntrega;
		boolean unlockEntrega;
		do {

			System.out.println("Qual sua opção de entrega:\n[1]Delivery\n[QQR INPUT]Buscar Pedido no estabelecimento");
			int opcaoEntrega = ler.nextInt(); 
			
			if (opcaoEntrega == 1 ) {
				unlockEntrega = true;
				tempoEntrega = (contadorPedidos*30 + contadorPedidos*5);
				System.out.println("Delivery Confirmado\n");
				System.out.println("A pizza estará na sua mesa em: "+ (tempoEntrega + contadorPedidos*5) +" min");
				System.out.println(cadastro1.getEndereco());
				System.out.println();
				
			} else {
				unlockEntrega = false;
				tempoEntrega = (contadorPedidos*30);
				System.out.println("Delivery Confirmado\n");
				System.out.println("A pizza estará pronta para buscar em: "+ tempoEntrega +" min");
			}
			
			
			System.out.println();
			System.out.println("Confirma sua escolha?\n[1]SIM\n[QQR INPUT]NÃO, QUERO ALTERAR");
			int confirmacao;
			confirmacao = ler.nextInt();
			
			if (confirmacao == 1) {
				loopDelivery = false;
			} else {
				loopDelivery = true;
			}
			
			
		} while (loopDelivery);
		//SISTEMA DE DELIVERY
		
		
		//SISTEMA DE PAGAMENTO
		Pagamento pagamentoMetodo = new Pagamento();
		
		System.out.println("Qual sua opção de pagamento?\n[1]CREDITO\n[2]A VISTA");
		int opcaoEspecie = ler.nextInt(); 
		boolean credito = true;
		
		if (opcaoEspecie ==1) {
			credito = true;
			
		} else {
			credito = false;
		}
		
		if (credito == true) {
			pagamentoMetodo.pagamentoMetodo(credito);
		} else {
			System.out.println("FORMAS DE PAGAMENTO A VISTA:");
			System.out.println("[1] DÉBITO");
			System.out.println("[QQR INPUT] PIX");
			System.out.println();
			pagamentoMetodo.pagamentoMetodo(credito);
			System.out.println();
			opcaoEspecie = ler.nextInt();
			pagamentoMetodo.pagamentoMetodo(opcaoEspecie);
			System.out.println("\nOPÇÃO ESCOLHIDA ["+ opcaoEspecie+"]");
			System.out.println();
		}
		
		System.out.println("OPÇÃO DE PAGAMENTO: " + pagamentoMetodo.getOpcaoPagamento());
		if (opcaoEspecie == 2) {
			System.out.println("CHAVE PIX DA PIZZARIA: pizzaria.GenTMNT@hotmail.com");
		}
		//FIM SISTEMA DE PAGAMENTO
		
		//SISTEMA NOTA FISCAL
		
		NotaFiscal notaFiscal = new NotaFiscal (cadastro1.getEndereco(), unlockEntrega, tempoEntrega, somaTotalValores);
		System.out.println();
		
		
		
	}

}
