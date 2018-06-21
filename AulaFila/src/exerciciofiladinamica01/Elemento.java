package exerciciofiladinamica01;

public class Elemento {

	private Elemento proximo;
	private Object valor;
	
	public Elemento(Object v){
		valor = v;
	}
	
	public Elemento getProximo(){
		return this.proximo;
	}
	
	public void setProximo(Elemento elemento){
		valor = elemento;
	}
	
	public Object getValor(){
		return valor;
	}
	
}
