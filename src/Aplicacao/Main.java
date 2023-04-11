package Aplicacao;

import java.lang.reflect.Array;

public class Main {

	static void quicksort(int[] vetor, int esquerda, int direita) {
		if (esquerda < direita) {
			int p = particao(vetor, esquerda, direita);
			quicksort(vetor, esquerda, p);
			quicksort(vetor, p + 1, direita);
		}
	}
	
	static int particao(int[] vetor, int esquerda, int direita) {
		int meio = (int) (esquerda + direita)/2 ;
		int pivot = vetor[meio];
		int i = esquerda - 1;
		int j = direita + 1;
		
		while(true) {
			do {
				i++;
			}while(vetor[i] < pivot);
			do{
				j--;
			}while(vetor[j] > pivot);
			if (i >= j) {
				return j;
			}
			int aux = vetor[i];
			vetor[i] = vetor[j];
			vetor[j] = aux;
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] vetor = {5, 1, 9, 2, 8, 7, 6, 3, 4, 0};
		System.out.println("Desordenado: ");
		for (int i : vetor) {
			System.out.print(vetor[i] + " ");
		}
		
		quicksort(vetor, 0, vetor.length - 1);
		System.out.println("\nOrdenado: ");
		for (int i : vetor) {
			System.out.print(vetor[i] + " ");
		}
			
	}
}
