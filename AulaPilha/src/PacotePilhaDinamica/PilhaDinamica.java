package PacotePilhaDinamica;

public class PilhaDinamica {

	private Elemento topo;
	
	public void push(Object o){
		Elemento elemento = new Elemento();
		elemento.setValor(o);
		elemento.setAnterior(topo);
		topo = elemento;
		System.out.println("Adicionando elemento pilha: "+ o);
	}
	
	public Object pop(){
		Elemento elemento = topo;
		topo = elemento.getAnterior();
		System.out.println("Retirando elemento da pilha: "+ elemento.getValor());
		return elemento.getValor();	
	}
	
	public boolean isFull(){
		return false;
	}
	
	public boolean isEmpty(){
		if(topo == null){
			return true;
		}else{
			return false;
		}
	}
	
	public void clear(){
		while(!isEmpty()){
			this.pop();
		}
	}
}
