package exerciciofiladinamica01;

public class Principal {

	public static void main(String[] args) throws Exception {
		FilaDinamica fila = new FilaDinamica();
		fila.add(20.0);
		fila.add(20.8);
		fila.add(20.3);
		fila.add(44.5);
		fila.add(33.33);
		fila.add(20.9);
		fila.list();
		for(int i=0;i<2;i++){
			fila.remove();
		}
		fila.list();
		//fila.clear();
	}
}
