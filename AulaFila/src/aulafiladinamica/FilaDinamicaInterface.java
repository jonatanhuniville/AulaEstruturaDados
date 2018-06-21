package aulafiladinamica;

public interface FilaDinamicaInterface {

	public void add(Object o);
	public Object remove() throws Exception;
	public boolean isFull();
	public boolean isEmpty();
	public void clear();
	public void list();
	
}
