import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;


public class NotaFiscal {

	private Pessoa Vendedor;
	private Veiculo veiculo;
	private Pessoa cliente;
	private Integer numeroNf;
	
	private String getDataHoraAtual(){
		DateFormat formatoDataNf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date date = new Date();
		return formatoDataNf.format(date);
	}
	
	public NotaFiscal(Integer numeroNf, Pessoa cliente, Pessoa vendedor, Veiculo veiculo){
		this.cliente = cliente;
		this.Vendedor = vendedor;
		this.veiculo = veiculo;
		this.numeroNf = numeroNf;
		
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("*****X-Car - Sistema de Vendas de VeIculos*****");
		System.out.println("**************   NOTA FISCAL   ****************");
		System.out.println("*                                             *");
		System.out.println("*No.:"+String.format("%06d", this.numeroNf)+"          DATA:"+getDataHoraAtual()+" *");
		System.out.println("*                                             *");
		System.out.println("*	CLIENTE:"+this.cliente.getNome()+"");
		System.out.println("*	VENDEDOR:"+this.Vendedor.getNome()+"");
		System.out.println("*                                             *");
		System.out.println("****************  VEICULO  ********************");
		System.out.println("*	MARCA:"+this.veiculo.getMarca()+"MODELO:"+this.veiculo.getNome());
		System.out.println("*	COR:"+this.veiculo.getCor()+"PLACA:"+this.veiculo.getCor());
		System.out.println("*	VALOR:"+this.veiculo.getPreco());
		System.out.println("*                                             *");
		System.out.println("*                           VALOR TOTAL NOTA  *");
		System.out.println("*                           R$"+this.veiculo.getPreco()	+"");
		System.out.println("***********************************************");
		System.out.println("");
		System.out.println("");
		System.out.println("");
	}	
	
}
