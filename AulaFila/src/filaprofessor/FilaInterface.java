package filaprofessor;

public interface FilaInterface {
	public void add(Object o) throws Exception;
	public Object remove() throws Exception;
	public boolean isEmpty();
	public boolean isFull();
	public void clear();
}
