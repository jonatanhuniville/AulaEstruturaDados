package aulafiladinamica;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		FilaDinamica fila = new FilaDinamica();
		for(int i=0;i<5;i++){
			fila.add("Objeto " + (i+1));
		}	
	}
}
