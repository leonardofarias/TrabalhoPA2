import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;


public class NotaFiscal {

	private Venda venda;
	private Integer numeroNf;
	
	
	/**
	 * Metodo responsavel por retornar a data e hora atual já formatada.
	 * @author Diogo, Leonardo e Thiago
	 * @return date
	 */
	private String getDataHoraAtual(){
		DateFormat formatoDataNf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date date = new Date();
		return formatoDataNf.format(date);
	}
	
	/**
	 * Metodo responsavel por montar a NF e exibir ao usuário
	 * @author Diogo, Leonardo e Thiago
	 * @param numeroNf
	 * @param minhaVenda
	 */
	public NotaFiscal(Integer numeroNf, Venda minhaVenda){
		this.venda = minhaVenda;
		this.numeroNf = numeroNf;
		
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("*****X-Car - Sistema de Vendas de Veículos*****");
		System.out.println("**************   NOTA FISCAL   ****************");
		System.out.println("*                                             *");
		System.out.println("*No.:"+String.format("%06d", this.numeroNf)+"          DATA:"+getDataHoraAtual()+" *");
		System.out.println("*                                             *");
		System.out.println("*	CLIENTE:"+this.venda.getCliente().getNome()+"");
		System.out.println("*	VENDEDOR:"+this.venda.getVendedor().getNome()+"");
		System.out.println("*                                             *");
		System.out.println("****************  VEÍCULO  ********************");
		System.out.println("*	MARCA:"+this.venda.getVeiculo().getMarca()+" MODELO:"+this.venda.getVeiculo().getNome());
		System.out.println("*	COR:"+this.venda.getVeiculo().getCor());
		System.out.println("*	VALOR:"+this.venda.getVeiculo().getPreco());
		System.out.println("*                                             *");
		System.out.println("*                           VALOR TOTAL NOTA  *");
		System.out.println("*                           R$"+this.venda.getVeiculo().getPreco()	+"");
		System.out.println("***********************************************");
		System.out.println("");
		System.out.println("");
		System.out.println("");
	}	
	
}
