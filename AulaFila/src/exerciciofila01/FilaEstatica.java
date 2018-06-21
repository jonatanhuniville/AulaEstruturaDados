package exerciciofila01;

public class FilaEstatica implements FilaInterface{

	private Object[] fila;
	private int cabeca;
	private int cauda;
	
	public FilaEstatica(int capacidade){
		fila = new Object[capacidade];
		cabeca = cauda = -1;
	}
	
	public void add(Object o) throws Exception {
		if(this.isFull()) {
			throw new Exception ("Fila cheia");
		}
		System.out.println("Adicionando " + o);
		cauda = (cauda+1) % fila.length;
		fila[cauda] = o;
		if(cabeca == -1){
			cabeca = cauda;
		}
	}

	public Object remove() throws Exception {
		if(this.isEmpty()){
			throw new Exception("Fila vazia");
		}
		Object o = fila[cabeca];
		if(cabeca == cauda){
			cabeca = cauda = -1;
		}else{
			fila[cabeca] = null;
			cabeca = (cabeca + 1) % fila.length;
		}
		System.out.println("Removendo " + o);
		return o;
	}

	public boolean isEmpty() {
		return cabeca == -1 && cauda == -1;
	}

	public boolean isFull() {
		return (cauda + 1) % fila.length == cabeca;
	}

	public void clear() {
		while(!this.isEmpty()){
			try{
				this.remove();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}

	public void show(){
		if(!this.isEmpty()){
			int i = cabeca;
			for(i=cabeca;i!=cauda;i=(i+1)%fila.length){
				System.out.println("Valor" + fila[i]);
			}
			System.out.println("Valor" + fila[i]);
		}
	}
}
