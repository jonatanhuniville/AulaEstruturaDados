package insertion;

import java.util.Random;

public class InsertionSort {

	public static void main(String[] args) {
//		int vetor[] = {5,3,7,4};
//		sort(vetor);
		Random number = new Random();
		int array[] = new int[1000];
		for(int i=0;i<1000;i++){
			array[i] = number.nextInt(100000);
		}
		
		sort(array);
	}
	
	public static void sort(int entrada[]){
		System.out.println("===============VETOR DESORDENADO===============");
		for(int i=0;i<entrada.length;i++){
			System.out.print(entrada[i]+" || ");
		}
		int cont = 0;
		int pivo = 0;
		int aux = 0;
		int troca = 0;
		
		for(int i=1;i<entrada.length;i++){
			pivo = entrada[i];
			for(int j=i-1;j>=0;j--){
				if(pivo < entrada[j]){
					cont++;
					aux = entrada[i];
					entrada[j+1] = entrada[j];
					troca = j;
				}
			}
			entrada[troca] = entrada[i]; 
		}
		
		//////////////////////////////////////////////////////////////////////
		System.out.println();
		System.out.println("===============VETOR JA ORDENADO===============");
		for(int i=0;i<entrada.length;i++){
			System.out.print(entrada[i]+" || ");
		}
		System.out.println();
		System.out.println("===============TOTAL DE OPERAÇÕES===============");
		System.out.println("==============="+ cont +"===============");
	}

}
