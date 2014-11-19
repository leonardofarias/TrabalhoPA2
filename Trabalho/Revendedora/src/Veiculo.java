/**
 * 
 * @author Diogo,Leonardo,Thiago
 * 
 * Classe que defini o objeto Veiculo com seus atributos
 * 
 */
public class Veiculo {
	
	private String nome;
	private String cor;
	private String marca;
	private double preco;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}	
}
