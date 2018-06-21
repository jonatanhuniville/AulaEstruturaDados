package exerciciofila01;

public class Principal {

	public static void main(String[] args) throws Exception {
		FilaEstatica fila = new FilaEstatica(6);
		fila.add(20.0);
		fila.add(20.8);
		fila.add(20.3);
		fila.add(44.5);
		fila.add(33.33);
		fila.add(20.9);
		fila.show();
		for(int i=0;i<2;i++){
			fila.remove();
		}
		fila.show();
		fila.clear();
	}
}
