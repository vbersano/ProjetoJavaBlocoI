package Cadastro;

public class Cadastro extends Login {
	
	private String endereco;
	private String numTelefone;

	public Cadastro(String nome, String senha, String endereco, String numTelefone) {
		super(nome, senha);
		this.endereco = endereco;
		this.numTelefone = numTelefone;
		
	}
	
	
	
	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getNumTelefone() {
		return numTelefone;
	}

	public void setNumTelefone(String numTelefone) {
		this.numTelefone = numTelefone;
	}
	
	
}