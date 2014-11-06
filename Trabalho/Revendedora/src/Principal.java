public class Principal {

	public static void main(String[] args) {
		
		Revendedora xcar = new Revendedora();

		int op = -1;
		while (op != 6) {
			
			System.out
					.println("*****X-Car - Sistema de Vendas de Ve�culos*****");
			System.out
					.println("****************  M E N U  ********************");
			System.out.println("*		1 ) Cadastro de Cliente	      *");
			System.out.println("*		2 ) Cadastro de Ve�culos      *");
			System.out.println("*		3 ) Cadastro de Funcion�rio   *");
			System.out.println("*		4 ) Efetuar Venda             *");
			System.out.println("*		5 ) Listar Vendas             *");
			System.out.println("*		6 ) Sair do Sistema           *");
			System.out
					.println("***********************************************");
			System.out.print("Selecione: ");
			
			
			op = xcar.validarSomenteInteiros();

			switch (op) {
			
			case 1:
				xcar.cadastrarCliente();
				break;
			case 2: 
				xcar.cadastrarVeiculo();
				break;
			case 3: 
				xcar.cadastrarFuncionario();
				break;
			case 4: 
				xcar.efetuarVenda();
				break;
			case 5:
				xcar.listarVendas();
				break;
			case 6:
				System.out.println("Sistema Finalizado!");
				break;
			default:
				if (op != 6)
					System.out.println("Selecione uma das op��es do MENU!");
				break;
			}
		}
	}
}
