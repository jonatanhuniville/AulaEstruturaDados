package auladequedinamico;

public class Principal {

	public static <E> void main(String[] args) throws Exception {
		DequeDinamico<E> deque = new DequeDinamico<E>();
		Lambda lambdaList = (Object recebido) -> System.out.println("Valor do objeto -> " + recebido);
		
		deque.add("1");
		deque.add("2");
		deque.add("3");
		deque.add("4");
		deque.list(lambdaList);
		deque.remove();
		deque.remove();
		deque.list(lambdaList);
		deque.clear();
		deque.list(lambdaList);
		//---------------------------------------------
		deque.addFirst(1);
		deque.addFirst(2);
		deque.addFirst(3);
		deque.addFirst(4);
		deque.list(lambdaList);
		deque.removeLast();
		deque.removeLast();
		deque.removeLast();
		deque.removeLast();
		
	}

}
