package filaprofessor;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) throws Exception {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o tamanho da fila:");
		int aux = teclado.nextInt();
		
		FilaEstatica fila = new FilaEstatica(aux);
		for(int i=0;i<aux;i++){
			fila.add(i);
		}
		fila.clear();
	}
}
