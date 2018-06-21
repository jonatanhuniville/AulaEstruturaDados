package PacotePilha;

public class PilhaEstatica {

	private Object[] pilha;	
	private int topo;
	
	public PilhaEstatica(int tamanho){
		pilha = new Object[tamanho];
		topo = 0;
	}
	
	public void push(Object elemento){
		this.pilha[topo] = elemento;
		topo++;
		System.out.println("Adicionando elemento pilha: "+ pilha[topo-1]);
	}
	
	public Object objectPop(){		
		System.out.println("Retirando elemen"
				+ "to da pilha: "+ pilha[topo-1]);
		return this.pilha[--topo];
	}
	
	public boolean isFull(){
		if(pilha[topo] == null){
			return false;
		}else{
			return true;
		}
	}
	
	public boolean isEmpty(){
		if(this.topo == 0){
			return true;
		}else{
			return false;
		}
	}
	
	public void clear(){

		while(!isEmpty()){
			this.objectPop();
		}
	}
	
}


