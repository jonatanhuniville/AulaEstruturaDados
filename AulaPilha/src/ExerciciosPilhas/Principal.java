package ExerciciosPilhas;

public class Principal {

	public static void main(String[] args) {
		Pilha pilha = new Pilha(5);
		Pilha pilha2 = new Pilha(5);
		int aux;
		for(int i=1;i<=5;i++){
			pilha.push(i);
		}
		System.out.println("------------------------------");
		for(int i=0;i<5;i++){
			aux = pilha.getTopo();			
			pilha2.push(aux);
			pilha.pop();
		}
		
	
				
	}

}
