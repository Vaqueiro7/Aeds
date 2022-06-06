/*************************************************************/
/* Alunos: Eduardo Henrique de Castro Cotta e Bruno Emanuel Benjamim da Silva */
/* Matrícula: 2021008757 e 2021008640*/
/* Curso: Ciência da Computação */
/* 1º Trabalho Prático -- Ordenação Interna */
/* DCC288 -- 2022 -- IFSEMG, 3o. */
/* Prof. Flávio Augusto de Freitas */
/* Compilador: Apache NetBeans versão 13 */
/* Sistema Operacional: Windows 11 */
/*************************************************************/
package all;

public class QuickSort {
    
    //atributos do algoritmo Quick Sort
    private int pivoQ; 
	private long tempo; 
	private int contadorAQ; 
	private int trocas; 
	private int compQ; 
        private int[] ordenado;

	public QuickSort(int[] vetor, int n) {
		
            //Método que irá ordenar o vetor com o algoritmo Quick Sort e calculará o tempo gasto em milisegundos
                System.out.println("\nOrdenação com o Quick Sort: " + n + " valores.");
                this.ordenado = CriaVetor.copiarVetor(vetor, n);
		this.tempo = System.nanoTime();
		this.Quicksort(ordenado,0, n - 1);
		this.tempo = System.nanoTime() - this.tempo;

	}
        //Função para calcular o tempo gasto para a ordenação
	public float gettempo() {
            return this.tempo / (float) 1000000;
	}
        //Função para calcular o número de acessos do Quick Sort
	public int getcontadorAQ() {
            return this.contadorAQ;
	}
        //Função para calcular o número de pivôs selecionados entre os elementos do Quick Sort
	public int getpivoQ() {
            return this.pivoQ;
	}
        //Função para calcular o número de trocas entre os elementos do Quick Sort
	public int gettrocas() {
            return this.trocas;
	}
        //Função para calcular o número de Comparações do Quick Sort
	public int getcompQ() {
            return this.compQ;
	}
        //Função para pegar o vetor "ordenado", que será o vetor original ordenado
        public int[] getOrdenado(){
            return this.ordenado;
        }

        //Desenvolvimento do algoritmo
	public void Quicksort(int[] vetor, int esq, int dir) {
		if (esq < dir) {
			int d = Divisao(vetor, esq, dir);
			Quicksort(vetor, esq, d);
			Quicksort(vetor, d + 1, dir);
			this.compQ++;
		}
	}
        
        //função que calculará as divisões do vetor para ordenar de acordo com o algoritmo de maneira recursiva
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
