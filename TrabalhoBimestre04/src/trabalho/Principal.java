package trabalho;

import java.util.Random;

public class Principal<T extends Comparable<T>> {
    
    public Arvore<T> arvore10 = new Arvore<T>();
    public Arvore<T> arvore20 = new Arvore<T>();
    public Arvore<T> arvore30 = new Arvore<T>();
    public Arvore<T> arvore40 = new Arvore<T>();
    public Arvore<T> arvore50 = new Arvore<T>();
    public Arvore<T> arvore60 = new Arvore<T>();
    public Arvore<T> arvore70 = new Arvore<T>();
    public Arvore<T> arvore80 = new Arvore<T>();
    public Arvore<T> arvore90 = new Arvore<T>();
    public Arvore<T> arvore100 = new Arvore<T>();
    public Pilha pilha = new Pilha();
    
    public static void main(String args[]) throws Exception{
        Principal Principal = new Principal();
        Principal.start();
    }
    
    public void start() throws Exception{
        
    	
        int vetor10[] = new int[10];
        int vetor20[] = new int[20];
        int vetor30[] = new int[30];
        int vetor40[] = new int[40];
        int vetor50[] = new int[50];
        int vetor60[] = new int[60];
        int vetor70[] = new int[70];
        int vetor80[] = new int[80];
        int vetor90[] = new int[90];
        int vetor100[] = new int[100];
        
        vetor10 = populateArray(vetor10);
        vetor20 = populateArray(vetor20);
        vetor30 = populateArray(vetor30);
        vetor40 = populateArray(vetor40);
        vetor50 = populateArray(vetor50);
        vetor60 = populateArray(vetor60);
        vetor70 = populateArray(vetor70);
        vetor80 = populateArray(vetor80);
        vetor90 = populateArray(vetor90);
        vetor100 = populateArray(vetor100);
        
        //=========================================================ADICIONANDO & PERCORRENDO=================================================================//
        
        int vetor[] = new int[100];
        populateArray(vetor);
        
        for (int i=0; i<vetor.length; i++) {
            arvore10.adiciona((T) Integer.toString(vetor[i]));
            pilha.push(vetor[i]);
        }

        System.out.println("arvore adição: " + arvore10.contador);
        System.out.println("pilha adição: " + pilha.contador);
        arvore10.contador = 0;
        pilha.contador = 0;
        arvore10.localizar((T) Integer.toString(vetor[vetor.length-1]));
        System.out.println("arvore percorrer: " + arvore10.contador);
        pilha.percorrer();
        System.out.println("pilha percorrer: " + pilha.contador);
        arvore10.contador = 0;
        pilha.contador = 0;
        pilha.clear();
        
//        for (int i=0; i<vetor20.length; i++) {
//            arvore20.adiciona((T) Integer.toString(vetor20[i]));
//            pilha.push(vetor20[i]);
//        }
//        System.out.println("Total de operações na árvore usando um vetor de 20 posições na operação de adição: " + arvore20.contador);
//        System.out.println("Total de operações na pilha usando um vetor de 20 posições na operação de adição: " + pilha.contador);
//        arvore20.contador = 0;
//        pilha.contador = 0;
//        arvore20.localizar((T) Integer.toString(vetor20[0]));
//        System.out.println("Total de operações na árvore usando um vetor de 20 posições na operação de percorrer: " + arvore20.contador);
//        pilha.percorrer();
//        System.out.println("Total de operações na pilha usando um vetor de 20 posições na operação de percorrer: " + pilha.contador);
//        arvore20.contador = 0;
//        pilha.contador = 0;
//        pilha.clear();
//        
//        for (int i=0; i<vetor30.length; i++) {
//            arvore30.adiciona((T) Integer.toString(vetor30[i]));
//            pilha.push(vetor30[i]);
//        }
//        System.out.println("Total de operações na árvore usando um vetor de 30 posições na operação de adição: " + arvore30.contador);
//        System.out.println("Total de operações na pilha usando um vetor de 30 posições na operação de adição: " + pilha.contador);
//        arvore30.contador = 0;
//        pilha.contador = 0;
//        arvore30.localizar((T) Integer.toString(vetor30[0]));
//        System.out.println("Total de operações na árvore usando um vetor de 30 posições na operação de percorrer: " + arvore30.contador);
//        pilha.percorrer();
//        System.out.println("Total de operações na pilha usando um vetor de 30 posições na operação de percorrer: " + pilha.contador);
//        arvore30.contador = 0;
//        pilha.contador = 0;
//        pilha.clear();
//        
//        for (int i=0; i<vetor40.length; i++) {
//            arvore40.adiciona((T) Integer.toString(vetor40[i]));
//            pilha.push(vetor40[i]);
//        }
//        System.out.println("Total de operações na árvore usando um vetor de 40 posições na operação de adição: " + arvore40.contador);
//        System.out.println("Total de operações na pilha usando um vetor de 40 posições na operação de adição: " + pilha.contador);
//        arvore40.contador = 0;
//        pilha.contador = 0;
//        arvore40.localizar((T) Integer.toString(vetor40[0]));
//        System.out.println("Total de operações na árvore usando um vetor de 40 posições na operação de percorrer: " + arvore40.contador);
//        pilha.percorrer();
//        System.out.println("Total de operações na pilha usando um vetor de 40 posições na operação de percorrer: " + pilha.contador);
//        arvore40.contador = 0;
//        pilha.contador = 0;
//        pilha.clear();
//        
//        for (int i=0; i<vetor50.length; i++) {
//            arvore50.adiciona((T) Integer.toString(vetor50[i]));
//            pilha.push(vetor50[i]);
//        }
//        System.out.println("Total de operações na árvore usando um vetor de 50 posições na operação de adição: " + arvore50.contador);
//        System.out.println("Total de operações na pilha usando um vetor de 50 posições na operação de adição: " + pilha.contador);
//        arvore50.contador = 0;
//        pilha.contador = 0;
//        arvore50.localizar((T) Integer.toString(vetor50[0]));
//        System.out.println("Total de operações na árvore usando um vetor de 50 posições na operação de percorrer: " + arvore50.contador);
//        pilha.percorrer();
//        System.out.println("Total de operações na pilha usando um vetor de 50 posições na operação de percorrer: " + pilha.contador);
//        arvore50.contador = 0;
//        pilha.contador = 0;
//        pilha.clear();
//        
//        for (int i=0; i<vetor60.length; i++) {
//            arvore60.adiciona((T) Integer.toString(vetor60[i]));
//            pilha.push(vetor60[i]);
//        }
//        System.out.println("Total de operações na árvore usando um vetor de 60 posições na operação de adição: " + arvore60.contador);
//        System.out.println("Total de operações na pilha usando um vetor de 60 posições na operação de adição: " + pilha.contador);
//        arvore60.contador = 0;
//        pilha.contador = 0;
//        arvore60.localizar((T) Integer.toString(vetor60[0]));
//        System.out.println("Total de operações na árvore usando um vetor de 60 posições na operação de percorrer: " + arvore60.contador);
//        pilha.percorrer();
//        System.out.println("Total de operações na pilha usando um vetor de 60 posições na operação de percorrer: " + pilha.contador);
//        arvore60.contador = 0;
//        pilha.contador = 0;
//        pilha.clear();
//        
//        for (int i=0; i<vetor70.length; i++) {
//            arvore70.adiciona((T) Integer.toString(vetor70[i]));
//            pilha.push(vetor70[i]);
//        }
//        System.out.println("Total de operações na árvore usando um vetor de 70 posições na operação de adição: " + arvore70.contador);
//        System.out.println("Total de operações na pilha usando um vetor de 70 posições na operação de adição: " + pilha.contador);
//        arvore70.contador = 0;
//        pilha.contador = 0;
//        arvore70.localizar((T) Integer.toString(vetor70[0]));
//        System.out.println("Total de operações na árvore usando um vetor de 70 posições na operação de percorrer: " + arvore70.contador);
//        pilha.percorrer();
//        System.out.println("Total de operações na pilha usando um vetor de 70 posições na operação de percorrer: " + pilha.contador);
//        arvore70.contador = 0;
//        pilha.contador = 0;
//        pilha.clear();
//        
//        for (int i=0; i<vetor80.length; i++) {
//            arvore80.adiciona((T) Integer.toString(vetor80[i]));
//            pilha.push(vetor80[i]);
//        }
//        System.out.println("Total de operações na árvore usando um vetor de 80 posições na operação de adição: " + arvore80.contador);
//        System.out.println("Total de operações na pilha usando um vetor de 80 posições na operação de adição: " + pilha.contador);
//        arvore80.contador = 0;
//        pilha.contador = 0;
//        arvore80.localizar((T) Integer.toString(vetor80[0]));
//        System.out.println("Total de operações na árvore usando um vetor de 80 posições na operação de percorrer: " + arvore80.contador);
//        pilha.percorrer();
//        System.out.println("Total de operações na pilha usando um vetor de 80 posições na operação de percorrer: " + pilha.contador);
//        arvore80.contador = 0;
//        pilha.contador = 0;
//        pilha.clear();
//        
//        for (int i=0; i<vetor90.length; i++) {
//            arvore90.adiciona((T) Integer.toString(vetor90[i]));
//            pilha.push(vetor90[i]);
//        }
//        System.out.println("Total de operações na árvore usando um vetor de 90 posições na operação de adição: " + arvore90.contador);
//        System.out.println("Total de operações na pilha usando um vetor de 90 posições na operação de adição: " + pilha.contador);
//        arvore90.contador = 0;
//        pilha.contador = 0;
//        arvore90.localizar((T) Integer.toString(vetor90[0]));
//        System.out.println("Total de operações na árvore usando um vetor de 90 posições na operação de percorrer: " + arvore90.contador);
//        pilha.percorrer();
//        System.out.println("Total de operações na pilha usando um vetor de 90 posições na operação de percorrer: " + pilha.contador);
//        arvore90.contador = 0;
//        pilha.contador = 0;
//        pilha.clear();
//        
//        for (int i=0; i<vetor100.length; i++) {
//            arvore100.adiciona((T) Integer.toString(vetor100[i]));
//            pilha.push(vetor100[i]);
//        }
//        System.out.println("Total de operações na árvore usando um vetor de 100 posições na operação de adição: " + arvore100.contador);
//        System.out.println("Total de operações na pilha usando um vetor de 100 posições na operação de adição: " + pilha.contador);
//        arvore100.contador = 0;
//        pilha.contador = 0;
//        arvore100.localizar((T) Integer.toString(vetor100[0]));
//        System.out.println("Total de operações na árvore usando um vetor de 100 posições na operação de percorrer: " + arvore100.contador);
//        pilha.percorrer();
//        System.out.println("Total de operações na pilha usando um vetor de 10 posições na operação de percorrer: " + pilha.contador);
//        arvore100.contador = 0;
//        pilha.contador = 0;
//        pilha.clear();
        //==========================================================================================================================================//
    }
    
    public int[] populateArray (int array[]) {
        Random random = new Random();

        for (int i=0; i<array.length; i++) {
            array[i] = random.nextInt(100);
        }
        
        return array;
    }
}
