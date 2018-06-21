package aulafiladinamica;

public class FilaDinamica implements FilaDinamicaInterface{

	private Elemento cabeca;
	private Elemento cauda;
	
	public FilaDinamica(){
		cabeca = null;
		cauda = null;
	}
	
	@Override
	public void add(Object objeto){
		System.out.println("Adicionando " + objeto);
		Elemento e = new Elemento(objeto);
		if(cauda != null){
			cauda.setProximo(e);
		}
		if(cabeca == null){
			cabeca = e;
		}
	}
	
	@Override
	public Object remove() throws Exception{
		if(this.isEmpty()) throw new Exception("Fila vazia");
		Object o = cabeca.getValor();
		cabeca = cabeca.getProximo();
		if(cabeca == null){
			cauda = null;
		}
		System.out.println("Removendo " + o);
		return o;
	}
	
	@Override
	public boolean isFull(){
			return false;
	}
	
	@Override
	public boolean isEmpty(){
		return cabeca == null && cauda == null;
	}
	
	@Override
	public void clear(){
		while(!isEmpty()){
			try {
				remove();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	@Override
	public void list(){
		Elemento e = cabeca;
		while(e != null){
			System.out.println("Valor " + e.getValor());
			e = e.getProximo();
		}
	}
	
}
