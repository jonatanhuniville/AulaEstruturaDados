package bubble;

import java.util.Random;
import java.util.Scanner;

public class BubbleMelhorado {

	public static void main(String[] args) {
//		Random number = new Random();
//		Scanner teclado = new Scanner(System.in);
//		int tamanho = 0;
//		
//		System.out.println("Digite o tamanho do primeiro vetor: ");
//		tamanho = teclado.nextInt();
//		int vetor[] = new int[tamanho];
//		for(int i=0;i<tamanho;i++){
//			vetor[i] = number.nextInt(100000);
//		}
//		System.out.println("Digite o tamanho do segundo vetor: ");
//		tamanho = teclado.nextInt();
//		int vetor2[] = new int[tamanho];
//		for(int i=0;i<tamanho;i++){
//			vetor2[i] = number.nextInt(100000);
//		}
//		teclado.close();
//		sort(vetor);
//		sort(vetor2);
		
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
		Boolean troca;
		do{
			troca = false;
			for(int i=0;i<entrada.length-1;i++){
				if(entrada[i] > entrada[i+1]){
					cont++;
					int aux = entrada[i];
					entrada[i] = entrada[i+1];
					entrada[i+1] = aux;
					troca = true;
				}
			}
		}while(troca);
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
