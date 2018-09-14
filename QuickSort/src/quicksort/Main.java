package quicksort;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		QuickSort sort = new QuickSort();
		int qtdOperacoes = 0;
		Random number = new Random();

		int array[] = new int[1000];
		
		for(int i=0;i<1000;i++){
			array[i] = number.nextInt(100000);
		}
		
		System.out.println("===============VETOR DESORDENADO===============");
		for(int i = 0; i < 1000; i++)
		{
			System.out.print(array[i] + " - ");
		}
		System.out.println();
		qtdOperacoes = sort.quickSort(array, 0, 1000);
		System.out.println("===============VETOR JA ORDENADO===============");
		for(int i = 0; i < 1000; i++)
		{
			System.out.print(array[i] + " - ");
		}
		System.out.println();
		System.out.println("===============TOTAL DE OPERAÇÕES===============");
		System.out.println("==============="+ qtdOperacoes +"===============");
	}
	
}
