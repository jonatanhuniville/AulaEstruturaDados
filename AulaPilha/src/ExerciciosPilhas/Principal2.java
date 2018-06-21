package ExerciciosPilhas;

import java.util.Scanner;

public class Principal2 {

	public static void main(String[] args) {
		Pilha pilha = new Pilha(50);
		Scanner teclado = new Scanner(System.in);
		int cont = 0;
		String string = "((A + B) * C)";
		String aux;
		
		for(cont=0;cont<string.length();cont++){
			aux = Character.toString(string.charAt(cont));
			if(aux == "(" || aux == ")"){

			}
		}
		
		
	}

}
