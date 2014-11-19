/**
 * 
 * @author Diogo,Leonardo,Thiago
 * 
 * classe abstrata utilizada por classe filha Vendedor e que herda
 * 
 * atributos de ClientePF
 *
 */
public abstract class Funcionario extends ClientePF {
	
	private int codFuncionario;
	
	public int getCodFuncionario() {
		return codFuncionario;
	}

	public void setCodFuncionario(int codFuncionario) {
		this.codFuncionario = codFuncionario;
	}

}
