package bubble;

import java.util.Random;
import java.util.Scanner;

public class Bubble {

	public static void main(String[] args) {
//		Random number = new Random();
//		Scanner teclado = new Scanner(System.in);
//		int tamanho = 0;
//		
//		System.out.println("Digite o tamanho do vetor: ");
//		tamanho = teclado.nextInt();
//		int vetor[] = new int[tamanho];
//		teclado.close();
//		for(int i=0;i<tamanho;i++){
//			vetor[i] = number.nextInt(100000);
//		}
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
		for(int i=0;i<entrada.length-1;i++){
			for(int j=i+1;j<entrada.length;j++){
				cont++;
				if(entrada[i] > entrada[j]){
					int aux = entrada[i];
					entrada[i] = entrada[j];
					entrada[j] = aux;
				}
			}
		}
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
