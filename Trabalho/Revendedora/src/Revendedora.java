import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Revendedora implements _Revendedora {

	private ArrayList<ClientePF> listaClientePf;
	private ArrayList<ClientePJ> listaClientePj;
	private ArrayList<Vendedor> listaVendedor;
	private ArrayList<Veiculo> listaVeiculo;
	private ArrayList<Venda> listaVenda;
	private Integer numeroNf;
	private Scanner lerDados;


	public Revendedora() {
		listaClientePf = new ArrayList<ClientePF>();
		listaClientePj = new ArrayList<ClientePJ>();
		listaVendedor = new ArrayList<Vendedor>();
		listaVeiculo = new ArrayList<Veiculo>();
		listaVenda = new ArrayList<Venda>();
		numeroNf = 0;
	}

	public void cadastrarCliente() {
		Scanner lerDados = new Scanner(System.in);
		int op = -1;
		while (op != 5) {
			System.out
					.println("*****X-Car - Sistema de Vendas de Veículos*****");
			System.out
					.println("*****        CADASTRO DE CLIENTE          *****");
			System.out.println("*		1 ) Pessoa FÍSICA             *");
			System.out.println("* 		2 ) Pessoa JURÍDICA           *");
			System.out.println("* 		3 ) Listar PF		      *");
			System.out.println("* 		4 ) Listar PJ		      *");
			System.out.println("* 		5 ) MENU ANTERIOR             *");
			System.out
					.println("***********************************************");
			System.out.print("Selecione: ");

			op = validarSomenteInteiros();

			switch (op) {
			case 1:
				ClientePF novoPf = new ClientePF();
				System.out.print("Informe nome: ");
				novoPf.setNome(lerDados.next());
				System.out.print("Informe idade: ");
				novoPf.setIdade(lerDados.nextInt());
				System.out.print("Informe CPF: ");
				novoPf.setCpf(lerDados.next());
				System.out.print("Cliente Cadastrado com sucesso!\n");
				listaClientePf.add(novoPf);
				break;
			case 2:
				ClientePJ novoPj = new ClientePJ();
				System.out.print("Informe nome: ");
				novoPj.setNome(lerDados.next());
				System.out.print("Informe CNPJ: ");
				novoPj.setCnpj(lerDados.next());
				System.out.println("Cliente Cadastrado com sucesso!");
				listaClientePj.add(novoPj);
				break;
			case 3:
				if (op == 3)
					listarCliente(op);
				break;
			case 4:
				if (op == 4)
					listarCliente(op);
				break;
			default:
				System.out.println("Selecione uma das opções do MENU!");
			}
		}
	}

	public void cadastrarVeiculo() {
		lerDados = new Scanner(System.in);
		int op = -1;
		while (op != 3) {
			System.out
					.println("*****X-Car - Sistema de Vendas de Veículos*****");
			System.out
					.println("*****        CADASTRO DE VEÍCULOS         *****");
			System.out.println("*		1 ) Veiculo                   *");
			System.out.println("* 		2 ) Listar Veiculos	      *");
			System.out.println("* 		3 ) MENU ANTERIOR             *");
			System.out
					.println("***********************************************");
			System.out.print("Selecione: ");

			op = validarSomenteInteiros();

			switch (op) {
			case 1:
				Veiculo novoVeiculo = new Veiculo();
				System.out.print("Informe marca: ");
				novoVeiculo.setMarca(lerDados.next());
				System.out.print("Informe nome: ");
				novoVeiculo.setNome(lerDados.next());
				System.out.print("Informe cor: ");
				novoVeiculo.setCor(lerDados.next());
				System.out.print("Informe preço: ");
				novoVeiculo.setPreco(lerDados.nextDouble());
				listaVeiculo.add(novoVeiculo);
				System.out.print("Veículo Cadastrado com sucesso!\n");
				break;
			case 2:
				listarVeiculo(listaVeiculo);
				break;
			default:
				System.out.println("Selecione uma das opções do MENU!");
			}
		}
	}

	public void cadastrarFuncionario() {
		lerDados = new Scanner(System.in);
		int op = -1;
		while (op != 3) {
			System.out
					.println("*****X-Car - Sistema de Vendas de Veículos*****");
			System.out
					.println("*****        CADASTRO DE FUNCIONÁRIO      *****");
			System.out.println("*		1 ) Vendedor                  *");
			System.out.println("* 		2 ) Listar Funcionários       *");
			System.out.println("* 		3 ) MENU ANTERIOR             *");
			System.out
					.println("***********************************************");
			System.out.print("Selecione: ");

			op = validarSomenteInteiros();

			switch (op) {
			case 1:
				Vendedor novoVendedor = new Vendedor();
				System.out.print("Informe o codigo: ");
				novoVendedor.setCodFuncionario(lerDados.nextInt());
				System.out.print("Informe nome: ");
				novoVendedor.setNome(lerDados.next());
				System.out.print("Informe idade: ");
				novoVendedor.setIdade(lerDados.nextInt());
				System.out.print("Informe CPF: ");
				novoVendedor.setCpf(lerDados.next());
				System.out.print("Informe o salário: ");
				novoVendedor.setSalario(lerDados.nextDouble());
				System.out.print("Informe comissão: ");
				novoVendedor.setComissao(lerDados.nextDouble());
				System.out.print("Cliente Cadastrado com sucesso!\n");
				listaVendedor.add(novoVendedor);
				break;
			case 2:
				listarVendedor(listaVendedor);
				break;
			default:
				System.out.println("Selecione uma das opções do MENU!");
			}
		}
	}

	public void listarCliente(int opcao) {

		int cont = 1;

		if (opcao == 3) {
			for (ClientePF cliente : listaClientePf) {
				System.out.println(cont + " ) " + cliente.getNome() + " CPF: "
						+ cliente.getCpf());
				cont++;
			}
		}
		if (opcao == 4) {
			for (ClientePJ cliente : listaClientePj) {
				System.out.println(cont + " ) " + cliente.getNome() + " CNPJ: "
						+ cliente.getCnpj());
				cont++;
			}
		}
		
		
	}

	public void listarVeiculo(ArrayList<Veiculo> listaVeiculo) {
		int cont = 1;
		for (Veiculo veiculo : listaVeiculo) {
			System.out.println(cont + " ) " + veiculo.getMarca() + " Nome: "
					+ veiculo.getNome() + " Cor: " + veiculo.getCor()
					+ " Preço: R$ " + veiculo.getPreco());
			cont++;
		}
	}

	public void listarVendedor(ArrayList<Vendedor> listaVendedor) {
		int cont = 1;
		for (Vendedor vendedor : listaVendedor) {
			System.out.println(cont + " ) " + vendedor.getNome() + " CPF: " + vendedor.getCpf()
					+ " Comissão: "	+ vendedor.getComissao() + "%");
			cont++;
		}
	}

	/**
	 * Metodo responsavel por listar todas as vendas e apresentar o valor total 
	 * arrecadado.
	 */
	public void listarVendas() {
		Double valorTotalVendas = 0.00;
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("*****X-Car - Sistema de Vendas de Veículos*****");
		System.out.println("*****    RESUMO DE VENDAS REALIZADAS      *****");
		System.out.println("***********************************************");
		System.out.println(" ");
		int cont = 1;
		for (Venda venda : listaVenda) {
			System.out.println(cont++ +") CLIENTE:"+venda.getCliente().getNome());
			System.out.println("   CARRO:"+venda.getVeiculo().getNome());
			System.out.println("   VENDEDOR:"+ venda.getVendedor().getNome());
			System.out.println("   VALOR:"+ venda.getVeiculo().getPreco());
			System.out.println(" ");
			valorTotalVendas += venda.getVeiculo().getPreco();
		}
		System.out.println("***********************************************");
		System.out.println("   VALOR TOTAL DAS VENDAS: "+valorTotalVendas);
		System.out.println("***********************************************");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
	}

	/**
	 * metodo que valida somente numeros inteiros ao selecionar uma das opcoes
	 * do cadastro e menus gerais do sistema 
	 */
	public int validarSomenteInteiros() {
		Scanner lerDados = new Scanner(System.in);
		int op;
		try {
			op = lerDados.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("Insira somente números inteiros!");
			op = -1;
		}
		return op;
	}

	
	/**
	 * metodo que efetua venda e salva em uma lista de vendas
	 * fazer validacoes 
	 */
	public void efetuarVenda() {
		
		Scanner lerDados = new Scanner(System.in);
		int op = 0;
		int n = 0;
		Pessoa cliente;
		Pessoa vendedor;
		Veiculo veiculo;
		
do{
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("*****X-Car - Sistema de Vendas de Veículos*****");
		System.out.println("*****    ESCOLHA UM TIPO DE CLIENTE       *****");
		System.out.println("*		3 ) PESSOA FÍSICA             *");
		System.out.println("* 		4 ) PESSOA JURÍDICA           *");
		System.out.println("* 		0 ) DESISTIR DA VENDA         *");
		System.out.println("***********************************************");
		System.out.print("Selecione: ");
		n = op = validarSomenteInteiros();
}while(op != 3 && op != 4 && op != 0);

if(op != 0){ //IF 1
do{
	do{
			System.out.println(" ");
			System.out.println(" ");
			System.out.println(" ");
			System.out.println("*****X-Car - Sistema de Vendas de Veículos*****");
			System.out.println("*****        ESCOLHA UM CLIENTE           *****");
			listarCliente(n);
			System.out.println("0 ) DESISTIR DA VENDA");
			System.out.println("***********************************************");
			System.out.print("Selecione: ");
			op = validarSomenteInteiros();
	}while(op == -1 && op != 0);
		cliente = null;
		if(op != 0){	
			if(n == 3 && op <= listaClientePf.size() && listaClientePf.size() != -1){
				cliente = listaClientePf.get(op -1);
			}
			else if(n == 4 && op <= listaClientePj.size() && listaClientePj.size() != -1){
				cliente = listaClientePj.get(op -1);
			}
			else{
				cliente = null;
			}
		}
		
}while(cliente == null);
if(op != 0){ //IF 2	



do{
	do{
			System.out.println(" ");
			System.out.println(" ");
			System.out.println(" ");
			System.out.println("*****X-Car - Sistema de Vendas de Veículos*****");
			System.out.println("*****         LISTA DE VENDEDORES         *****");
			listarVendedor(listaVendedor);
			System.out.println("0 ) DESISTIR DA VENDA");
			System.out.println("***********************************************");
			System.out.print("Selecione: ");
			op = validarSomenteInteiros();
	}while(op == -1);
		vendedor = null;
		if(op != 0){
			if(op <= listaVendedor.size() && listaVendedor.size() != -1){
				vendedor = listaVendedor.get(op - 1);
			}else{
				vendedor = null;
			}
		}
}while(vendedor == null && op != 0);

if(op != 0){ //IF 3
do{
	do{		
			System.out.println(" ");
			System.out.println(" ");
			System.out.println(" ");
			System.out.println("*****X-Car - Sistema de Vendas de Veículos*****");
			System.out.println("*****         LISTA DE VEÍCULOS           *****");
			listarVeiculo(listaVeiculo);
			System.out.println("0 ) DESISTIR DA VENDA");
			System.out.println("***********************************************");
			System.out.print("Selecione: ");
			op = validarSomenteInteiros();
	}while(op == -1);
		veiculo = null;
		if(op != 0){
			if(op <= listaVendedor.size() && listaVendedor.size() != -1){
				veiculo = listaVeiculo.get(op - 1);
			}else{
				veiculo = null;
			}
		}
}while(veiculo == null && op != 0);
if(op != 0){ //IF 4			
		Venda minhaVenda = new Venda(cliente, vendedor, veiculo);
		listaVenda.add(minhaVenda);
		this.numeroNf++;
		NotaFiscal nota = new NotaFiscal(this.numeroNf, minhaVenda);
}//fim IF 4
}//fim IF 3
}//fim IF 2
}//fim IF 1		
	}
}
