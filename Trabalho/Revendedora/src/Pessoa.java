/**
 * 
 * @author Diogo, Leonardo e Thiago 
 * 
 * Pessoa é uma classe abstrata, utilizada diretamente por ClientePF e ClienetePJ.
 * 
 */
public abstract class Pessoa {
	
	private String nome;
	private int idade;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}	
}
