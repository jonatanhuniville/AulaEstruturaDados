package PacotePilhaDinamica;

public class Elemento {

	private Elemento anterior;
	private Object valor;
	
	public Object getValor(){
		return valor;
	}

	public void setValor(Object valor) {
		this.valor = valor;
	}
	
	public Elemento getAnterior(){
		return anterior;
	}
	
	
	public void setAnterior(Elemento anterior) {
		this.anterior = anterior;
	}
		
}
