package auladequedinamico;

/*
 * Author: Jonatan Henrique Freudenborg - BSI 3� Ano - UNIVILLE
 * */
public interface Lambda {
	
	Lambda lambdaAdd = (Object recebido) -> System.out.println("Adicionando ao final da fila " + recebido);
	Lambda lambdaRemove = (Object recebido) -> System.out.println("Removendo do in�cio da fila " + recebido);
	Lambda lambdaAddFirst = (Object recebido) -> System.out.println("Adicionando ao in�cio da fila " + recebido);
	Lambda lambdaRemoveLast = (Object recebido) -> System.out.println("Removendo do fim da fila " + recebido);
	
	public void run(Object objeto);

}
