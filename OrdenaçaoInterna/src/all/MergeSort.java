package all;

public class MergeSort {

	//

	private long tempo;
	private int contadorAM;
	private int compM; 

	public MergeSort(int[] vetor, int n) {
		System.out.println("MergeSort para : " + n);
		this.tempo = System.nanoTime();
		mergeSort(vetor, n - 1);
		this.tempo = System.nanoTime() - this.tempo;

	}

	public float gettempo() {
		return this.tempo / (float) 10000000;
	}

	public int getcontadorA() {
		return this.contadorAM;
	}

	public int getcompM() {
		return this.compM;
	}

	public void mergeSort(int[] vetor, int n) {

		if (n < 2) {
			this.compM++;
			return;
			
		}

		int meio = n / 2;
		int[] esquerda = new int[meio];
		int[] direita = new int[n - meio];

		for (int i = 0; i < meio; i++) {
			esquerda[i] = vetor[i];
			this.contadorAM++;
		}

		for (int i = meio; i < n; i++) {
			direita[i - meio] = vetor[i];

		}

		mergeSort(esquerda, meio);
		mergeSort(direita, n - meio);
		merge(vetor, esquerda, direita, meio, n - meio);
	}

	public void merge(int[] vetor, int[] esquerda, int[] direita, int left, int right) {

		int i = 0, j = 0, k = 0;
		while (i < left && j < right) {
			if (esquerda[i] <= direita[j]) {
				vetor[k++] = esquerda[i++];
				this.contadorAM++;
				this.compM++;
			} else {
				vetor[k++] = direita[j++];
				this.contadorAM++;
			}
		}
		while (i < left) {
			vetor[k++] = esquerda[i++];
			this.contadorAM++;
			this.compM++;
		}
		while (j < right) {
			vetor[k++] = direita[j++];
			this.contadorAM++;
			this.compM++;
		}

	}

}
