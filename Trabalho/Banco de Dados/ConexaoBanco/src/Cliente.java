
public class Cliente {
	private char[] cod_cli;
	private char[] nome;
	private char[] uf;
	private char[] telefone;
	private char[] status;
	private float limite;
	
	public char[] getCod_cli() {
		return cod_cli;
	}
	public void setCod_cli(char[] cod_cli) {
		this.cod_cli = cod_cli;
	}
	public char[] getNome() {
		return nome;
	}
	public void setNome(char[] nome) {
		this.nome = nome;
	}
	public char[] getUf() {
		return uf;
	}
	public void setUf(char[] uf) {
		this.uf = uf;
	}
	public char[] getTelefone() {
		return telefone;
	}
	public void setTelefone(char[] telefone) {
		this.telefone = telefone;
	}
	public char[] getStatus() {
		return status;
	}
	public void setStatus(char[] status) {
		this.status = status;
	}
	public float getLimite() {
		return limite;
	}
	public void setLimite(float limite) {
		this.limite = limite;
	}
}
