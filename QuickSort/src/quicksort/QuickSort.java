package quicksort;

public class QuickSort {

	public int quickSort(int array[], int inicio, int fim){
		int i = inicio;
		int j = fim - 1;
		int pivo = array[(inicio + fim) / 2];
		int aux;
		int cont = 0;
		
		while(i <= j){
			cont++;
			while(array[i] < pivo && i < fim){
				cont++;
				i++;
			}
			while(array[j] > pivo && j > inicio){
				cont++;
				j--;
			}
			if(i <= j){
				cont++;
				aux = array[i];
				array[i] = array[j];
				array[j] = aux;
				i++;
				j--;
			}
			
			if(j > inicio){
				cont++;
				this.quickSort(array, inicio, j+1);
			}
				
			if(i < fim){
				cont++;
				this.quickSort(array, i, fim);
			}
		}
		return cont;
	}

}
