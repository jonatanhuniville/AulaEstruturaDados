package filahospital;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) throws Exception {
		FilaEstatica fila = new FilaEstatica(10);
		Scanner teclado = new Scanner(System.in);
		int aux = -1;
		int opcao;
		int y = 0;
		do{
			System.out.println("===============Menu Hospital===============");
			System.out.println("Selecione sua opção: ");
			System.out.println("1-) Adicionar paciente na fila");
			System.out.println("2-) Atender paciente");
			System.out.println("3-) Sair :(");
			opcao = teclado.nextInt();
			switch(opcao){
			case 1:
				y++;
				if(y<=10){
					fila.add(y);
				}else{
					System.out.println("Número máximo de atendimentos atingido!");
				}
				break;
				
			case 2:
				fila.remove();
				break;
				
			case 3:
				aux = 1;
				break;
				
			default:
				System.out.println("Opção inválida!");			
			}
		}while(aux < 0);
		System.out.println("Obrigado, tenha um bom dia!");
	}
}

