package filaprocessos;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) throws Exception {
		FilaEstatica filaProcessos = new FilaEstatica(1000);
		Scanner teclado = new Scanner(System.in);
		int aux = -1;
		int opcao;
		int y = 0;
		do{
			System.out.println("===============Menu de processos===============");
			System.out.println("Selecione sua opção: ");
			System.out.println("1-) Inserir processo na fila");
			System.out.println("2-) Executar processo da fila");
			System.out.println("3-) Exibir conteúdo da fila");
			System.out.println("4-) Sair :(");
			opcao = teclado.nextInt();
			switch(opcao){
			case 1:
				y++;
				filaProcessos.add(y);
				break;
				
			case 2:
				filaProcessos.remove();
				break;
				
			case 3:
				filaProcessos.show();
				break;
				
			case 4:
				aux = 1;
				break;
				
			default:
				System.out.println("Opção inválida!");			
			}
		}while(aux < 0);
		System.out.println("Obrigado, tenha um bom dia!");
		teclado.close();
	}
}
