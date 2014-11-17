
public class Venda {

	private Pessoa Vendedor;
	private Veiculo veiculo;
	private Pessoa cliente;
	
	public Venda(Pessoa cliente, Pessoa vendedor, Veiculo veiculo){
		this.cliente = cliente;
		this.Vendedor = vendedor;
		this.veiculo = veiculo;
	}	
	public Pessoa getCliente() {
		return cliente;
	}
	
	public Pessoa getVendedor() {
		return Vendedor;
	}
	
	public Veiculo getVeiculo() {
		return veiculo;
	}

}
