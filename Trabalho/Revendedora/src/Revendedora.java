import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

//mexendo no git na aula de banco

public class Revendedora implements _Revendedora {

	private ArrayList<ClientePF> listaClientePf;
	private ArrayList<ClientePJ> listaClientePj;
	private ArrayList<Vendedor> listaVendedor;
	private ArrayList<Veiculo> listaVeiculo;
	private ArrayList<Venda> listaVenda;
	private Scanner lerDados;

	public Revendedora() {
		listaClientePf = new ArrayList<ClientePF>();
		listaClientePj = new ArrayList<ClientePJ>();
		listaVendedor = new ArrayList<Vendedor>();
		listaVeiculo = new ArrayList<Veiculo>();
		listaVenda = new ArrayList<Venda>();
	}

	public void cadastrarCliente() {
		Scanner lerDados = new Scanner(System.in);
		int op = -1;
		while (op != 5) {
			System.out
					.println("*****X-Car - Sistema de Vendas de Veículos*****");
			System.out
					.println("*****        CADASTRO DE CLIENTE          *****");
			System.out.println("*		1 ) Pessoa Física             *");
			System.out.println("* 		2 ) Pessoa Jurídica           *");
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
			System.out.println("*		1 ) Veículo                   *");
			System.out.println("* 		2 ) Listar Veículos	      *");
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
				System.out.print("Cliente Cadastrado com sucesso!\n");
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
			System.out.println("* 		2 ) Listar Funcionários	      *");
			System.out.println("* 		3 ) MENU ANTERIOR             *");
			System.out
					.println("***********************************************");
			System.out.print("Selecione: ");

			op = validarSomenteInteiros();

			switch (op) {
			case 1:
				Vendedor novoVendedor = new Vendedor();
				System.out.print("Informe o código: ");
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
				novoVendedor.setComissao(lerDados.nextInt());
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
			System.out.println(cont  + " ) "
					+ vendedor.getNome() + " Idade: " + vendedor.getIdade()
					+ " CPF: " + vendedor.getCpf() + " Salário: R$ "
					+ vendedor.getSalario() + " Comissão: "
					+ vendedor.getComissao() + "%");
			cont++;
		}
	}

	//formatar de uma forma melhor
	public void listarVendas(){
		for(Venda venda : listaVenda){
			System.out.println(venda.getCliente().getNome() + " " + venda.getVendedor().getNome() 
					+ " " + venda.getVeiculo().getNome());
		}
	}
	
	//método que valida somente números ao selecionar uma das opções
	//do cadastro e menus gerais do sistema
	public int validarSomenteInteiros() {
		Scanner lerDados = new Scanner(System.in);
		int op;
		try {
			op = lerDados.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("Insira somente numeros!");
			op = 0;
		}
		return op;
	}

	//método que efetua venda e salva em uma lista de vendas
	//fazer validações
	public void efetuarVenda() {
		// TODO Auto-generated method stub
		Scanner lerDados = new Scanner(System.in);
		
		System.out.println("3 ) Pessoa Física");
		System.out.println("4 ) Pessoa Jurídica");
		
		System.out.print("Selecione tipo de Pessoa pelo número: ");
		int n = lerDados.nextInt();
		
		System.out.println("******Lista de Clientes*******");
		listarCliente(n);
		
		System.out.print("Selecione um dos clientes pelo número: ");
		int op = lerDados.nextInt();
		Pessoa cliente = (n == 3) ?  listaClientePf.get(op-1) :
						 (n == 4) ?  listaClientePj.get(op-1): null;
		
		System.out.println("Lista de Vendedores");				 
		listarVendedor(listaVendedor);
		
		System.out.print("Selecione um vendedor:");
		op = lerDados.nextInt();
		
		Vendedor vendedor = listaVendedor.get(op-1);
		
		System.out.println("Lista de Veículos");
		listarVeiculo(listaVeiculo);
		
		System.out.print("Selecione um veículo: ");
		op = lerDados.nextInt();
		
		Veiculo veiculo = listaVeiculo.get(op-1);
		
		Venda minhaVenda = new Venda(cliente,vendedor,veiculo);
		
		listaVenda.add(minhaVenda);
		
	}
}
