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


public class MergeSort {
    
        //atributos do algoritmo Merge Sort
        private long tempo;
	private int contadorAM;
	private int compM;
        private int[] ordenado;

	public MergeSort(int[] vetor, int n) {
            
                //Método que irá ordenar os vetor com o algoritmo Merge Sort e calculará o tempo gasto em milisegundos
                System.out.println("\nOrdenação com o Merge Sort: " + n + " valores.");
                this.ordenado = CriaVetor.copiarVetor(vetor, n);
		this.tempo = System.nanoTime();
		ordenaVetorMergeSort(ordenado, n );
		this.tempo = System.nanoTime() - this.tempo;
        }

        //Função para calcular o tempo gasto para a ordenação
	public float gettempo() {
            return this.tempo / (float) 1000000;
	}
        //Função para calcular o número de acessos do Merge Sort
	public int getcontadorA() {
    	return this.contadorAM;
	}
        //Função para calcular o número de Comparações do Merge Sort
	public int getcompM() {
            return this.compM;
	}
        //Função para pegar o vetor "ordenado", que será o vetor original ordenado
        public int[] getOrdenado(){
            return this.ordenado;
        }
        //desenvolvimento do algoritmo (ordenação dos 'n' primeiros valores do vetor)
	public void ordenaVetorMergeSort(int[] vetor, int n) {

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
		ordenaVetorMergeSort(esquerda, meio);
		ordenaVetorMergeSort(direita, n - meio);
		merge(vetor, esquerda, direita, meio, n - meio);
	}

        //função que realiza as ordenações de forma recursiva e calcula o número de comparações e acessos
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
