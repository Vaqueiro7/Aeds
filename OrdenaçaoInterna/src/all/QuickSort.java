package all;

public class QuickSort {

	private int pivoQ; //ja
	private long tempo; //ja
	private int contadorAQ; //ja
	private int trocas; //ja
	private int compQ; // ja

	public QuickSort(int[] vetor, int n) {
		System.out.println("QuickSort para : " + n);
		this.tempo = System.nanoTime();
		this.Quicksort(vetor,0, n - 1);
		this.tempo = System.nanoTime() - this.tempo;

	}

	public float gettempo() {
		return this.tempo / (float) 10000000;
	}

	public int getcontadorAQ() {
		return this.contadorAQ;
	}

	public int getpivoQ() {
		return this.pivoQ;
	}

	public int gettrocas() {
		return this.trocas;
	}

	public int getcompQ() {
		return this.compQ;
	}

	public void Quicksort(int[] vetor, int esq, int dir) {
		if (esq < dir) {
			int d = Divisao(vetor, esq, dir);
			Quicksort(vetor, esq, d);
			Quicksort(vetor, d + 1, dir);
			this.compQ++;
		}
	}

	public int Divisao(int[] vetor, int esq, int dir) {
		int meio = (int) (esq + dir) / 2;
		pivoQ ++;
		int pivo = vetor[meio];
		this.contadorAQ++;
		int i = esq - 1;
		int j = dir + 1;
		while (true) {
			do {
				i++;
				this.compQ++;
			} while (vetor[i] < pivo);
			this.contadorAQ++;
			do {
				j--;
				this.compQ++;
			} while (vetor[j] > pivo);
			this.contadorAQ++;
			this.compQ++;
			if (i >= j) {
				this.compQ++;
				return j;
			}
			int aux = vetor[i];
			vetor[i] = vetor[j];
			this.contadorAQ+=4;
			vetor[j] = aux;
			this.trocas++;
		}
	}
}
