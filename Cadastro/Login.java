package Cadastro;

public class Login {

	private String nome;
	private String senha;
	
	public Login (String nome, String senha)  { 
		this.nome = nome;
		this.senha = senha;
	}
	
	
	// GETTERS E SETTERS
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	// MÉTODOS
	
	public void menuCadastro() {
		System.out.print("##--PIZZARIA GENERATION BRASIL--##\n\n");
        System.out.print("|------------[Login]------------|\n");
        System.out.print("|[1] - Login                    |\n");
        System.out.print("|[2] - Cadastro                 |\n");
        System.out.print("|[3] - Sair                     |\n");
        System.out.print("|-------------------------------|\n");
        System.out.print("\nDigite uma opção: ");
	}
	
	public void telaAdeus () {
		System.out.println("        r==\r\n"
    			+ "        _  //\r\n"
    			+ "       |_)//(''''':\r\n"
    			+ "         //  \\_____:_____.-----.P\r\n"
    			+ "        //   | ===  |   /        \\\r\n"
    			+ "    .:'//.   \\ \\=|   \\ /  .:'':.\r\n"
    			+ "   :' // ':   \\ \\ ''..'--:'-.. ':\r\n"
    			+ "   '. '' .'    \\:.....:--'.-'' .'\r\n"
    			+ "    ':..:'      ATÉ LOGO            ':..:'\n");
	}

	
}
