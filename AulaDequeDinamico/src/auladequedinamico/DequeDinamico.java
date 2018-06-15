package auladequedinamico;

public class DequeDinamico <E>{

	private Elemento<E> cabeca;
	private Elemento<E> cauda;
	private Lambda print;
	
	public void add(Object objeto){
		print.lambdaAdd.run(objeto);
		Elemento<E> novoElemento = new Elemento(objeto);
		novoElemento.setAnterior((E) cauda);
		if(cauda != null){
			cauda.setProximo((Elemento<E>) novoElemento);
		}else{
			novoElemento.setAnterior((E) novoElemento);
		}
		cauda = novoElemento;
		if(cabeca == null){
			cabeca = novoElemento;
		}
		novoElemento.setProximo(cabeca);
		cabeca.setAnterior((E) novoElemento);
	}
	
	public void addFirst(Object objeto){
		print.lambdaAddFirst.run(objeto);
		Elemento novoElemento = new Elemento(objeto);
		if(cabeca == null){
			cabeca = cauda = novoElemento;
			novoElemento.setAnterior(novoElemento);
			novoElemento.setProximo(novoElemento);
		}else{
			novoElemento.setProximo(cabeca);
			novoElemento.setAnterior(cauda);
			cauda.setProximo(novoElemento);
			cabeca.setAnterior((E) novoElemento);
			cabeca = novoElemento;
		}
	}
	
	public Object remove() throws Exception{
		if(this.isEmpty()){
			throw new Exception("Fila vazia");
		}
		Object objeto = cabeca.getValor();
		cabeca = (Elemento<E>) cabeca.getProximo();
		if(cabeca == cabeca.getProximo()){
			cabeca = cauda = null;
		}else{
			cauda.setProximo(cabeca);
			cabeca.setAnterior((E) cauda);
		}		
		print.lambdaRemove.run(objeto);	
		return objeto;		
	}
	
	public Object removeLast() throws Exception{
		if(this.isEmpty()){
			throw new Exception("Fila vazia");
		}
		Object objeto = cauda.getValor();
		if(cauda != cabeca){
			cauda = (Elemento<E>) cauda.getAnterior();
			cauda.setProximo(cabeca);
			cabeca.setAnterior((E) cauda);
		}else{
			cabeca = cauda = null;
		}
		print.lambdaRemoveLast.run(objeto);
		return objeto;
	}
	
	public Boolean isEmpty(){
		if(cabeca == null && cauda == null){
			return true;
		}else{
			return false;
		}
	}
	
	public void clear() throws Exception{
		while(!this.isEmpty()){
			this.remove();
		}
	}
	
	public void list(Lambda lambda){
		Elemento elemento = cabeca;
		Lambda print = lambda;
		while(elemento != null){
			print.run(elemento.getValor());
			elemento = (Elemento) elemento.getProximo();
			if(cabeca == elemento){
				elemento = null;
			}
		}
	}

}
