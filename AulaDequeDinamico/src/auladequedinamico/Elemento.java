package auladequedinamico;

/*
 * Author: Jonatan Henrique Freudenborg - BSI 3º Ano - UNIVILLE
 * */
public class Elemento <E> {

	private Elemento<E> proximo;
	private Elemento<E> anterior;
	private E valor;
	
	public Elemento(Object v){
		valor = (E) v;
	}
	
	public Object getValor(){
		return this.valor;
	}
	
	public E getAnterior(){
		return (E) this.anterior;
	}
	
	public void setAnterior(E E){
		this.anterior = (Elemento<E>) E;
	}
	
	public E getProximo(){
		return (E) this.proximo;
	}
	
	public void setProximo(Elemento<E> E){
		this.proximo = (Elemento<E>) E;
	}
	
}
