package PacotePilha;

import PacotePilhaDinamica.Elemento;
import PacotePilhaDinamica.PilhaDinamica;

public class Principal {

	public static void main(String[] args) {
		PilhaDinamica pilha = new PilhaDinamica();
		pilha.push(1);
		pilha.push(2);
		pilha.push(3);
		pilha.push(4);
		pilha.push(5);
		
		Elemento elemento = new Elemento();
		Object o = null;
		elemento.setValor(o);
		System.out.println(elemento.getValor());
		pilha.clear();
				
	}

}
