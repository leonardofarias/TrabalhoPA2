/**
 * 
 * @author Diogo,Leonardo,Thiago
 * Classe específica para definir um vendedor, classe filha de funcionário
 */
public class Vendedor extends Funcionario {
	
	private double salario;
	private double comissao;
	
	public double getSalario() {
		return salario;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public double getComissao() {
		return comissao;
	}
	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
}
