package Cadastro;

import java.util.Scanner;

import Cardapio.Pizza;

public class TesteCadastro {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int opcao;
		Cadastro login = new Cadastro();
		Pizza pizza = new Pizza(0);
			
		login.menuCadastro();
		opcao = scan.nextInt();
		
		do {
			switch (opcao) {
			case 1:
			System.out.println("Login Selecionado");
			System.out.println("\nNome de usu�rio: ");
			login.setNome(scan.next());
			System.out.println("Senha: ");
			login.setSenha(scan.next());
			System.out.println("\nLogin feito. ");
			break;
			case 2:
				System.out.println("Cadastro selecionado");
				System.out.println("\nDigite seu nome: ");
				login.setNome(scan.next());
				System.out.println("Endere�o: ");
				login.setEndereco(scan.next());
				System.out.println("Senha: ");
				login.setSenha(scan.next());
				System.out.println("\nUsu�rio Cadastrado.");
				break;
			default:
				login.telaFechamento();
				
						break;
			}
			break;
		} while (opcao != 3);
		
}
}		