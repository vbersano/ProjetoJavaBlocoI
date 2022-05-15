package Programa;

public class Cadastro {
	
	//ATTS
	private String nome;
	private String email;
	private String senha;
	private String endereco;
	private int idade;
	
	//METODO CONSTRUTIVOS
	
	public Cadastro (String nome, String email, String senha, String endereco, int idade) {
		this.nome=nome;
		this.email=email;
		this.senha=senha;
		this.endereco=endereco;
		this.idade = idade;
	}
	
	//METODOS
	public void navegadorCadastro() {
			System.out.print("##--PIZZARIA GENERATION BRASIL--##\n\n");
	        System.out.print("|-------------------------------|\n");
	        System.out.print("| Opção 1 - Novo Cadastro       |\n");
	        System.out.print("| Opção 2 - Método de pagamento |\n");
	        System.out.print("| Opção 3 - Sair                |\n");
	        System.out.print("|-------------------------------|\n");
	        System.out.print("\nDigite uma opção: ");
	}       
	
	
	
	
}
