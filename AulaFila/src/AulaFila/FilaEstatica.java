package AulaFila;

public class FilaEstatica {

	private Object fila[];
	private int cabeca;
	private int cauda;
	
	public FilaEstatica(int tamanho){
		fila = new Object[tamanho];
		cabeca = -1;
		cauda = -1;
	}
	
	public void add(Object elemento){
		if(!isFull()){
			this.fila[cauda = (cauda+1)%fila.length] = elemento;		
			System.out.println("Adicionando elemento: " + elemento);
			if(cabeca == -1){
				cabeca = cauda;
			}		
		}
	}
	
	public Object remove(){
		Object valor = null;
		if(!isEmpty()){
			valor = fila[cabeca];
			if(cabeca == cauda){
				cabeca = cauda = -1;
			}else{
				cabeca = (cabeca + 1) % fila.length;
			}
			System.out.println("Retirando elemento: " + valor);			
		}
		return valor;
	}
	
	public boolean isFull(){
		if((cauda+1)%fila.length == cabeca){
			return true;
		}else{
			return false;
		}
	}
	
	public boolean isEmpty(){
		if(cabeca == -1 || cauda == -1){
			return true;
		}else{
			return false;
		}
	}
	
	public void clear(){
		while(!isEmpty()){
			remove();
		}
	}
	
	public int getCabeca() {
		return cabeca;
	}
	public void setCabeca(int cabeca) {
		this.cabeca = cabeca;
	}
	public int getCauda() {
		return cauda;
	}
	public void setCauda(int cauda) {
		this.cauda = cauda;
	}	
}
