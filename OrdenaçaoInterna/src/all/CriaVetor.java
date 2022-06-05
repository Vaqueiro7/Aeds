package all;

import java.util.Random;

public class CriaVetor {
	
	
	public int[] Vetor5;
	public int[] Vetor10;
	public int[] Vetor30;
	
	public CriaVetor(int[]vetor) {
		
		Vetor5 = this.copiarVetor(vetor,5000 );
		Vetor10 = this.copiarVetor(vetor,10000 );
		Vetor30 = this.copiarVetor(vetor,30000 );
		
	}
	
	
	public static void imprimeVetor(int vetor[], int n) {
		System.out.println();
		System.out.print("[ ");
		
		for (int i = 0; i < n; i++) {
			System.out.print(vetor[i] + " ");
			if(i != n - 1) {
				System.out.print(", ");
			}
		}
		System.out.print(" ]");
		System.out.println();
	}
	

	public static void preencherVetor(int[] vetor) {

		Random random = new Random();

		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = random.nextInt(30000);
		}
	}

	public int[] copiarVetor(int[] vetor, int n) {

		int retorno[] = new int[n];

		for (int i = 0; i < n; i++) {
			retorno[i] = vetor[i];
		}
		return retorno;
	}

}
