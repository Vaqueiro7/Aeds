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

public class ordenaVetorInsertionSort {
    //Atributos da classe de ordenação do algoritmo Insertion Sort
    private int contadorAI;
    private long tempo;
    private int compI;
    private int contadorTroca;
    private int contadorInsI;
    private int[] ordenado;
    
    //Método que irá ordenar os 'n' primeiros valores do vetor com o algoritmo Insertion Sort e calculará o tempo gasto em milisegundos
    public ordenaVetorInsertionSort(int[] vetor, int n) {
		
            System.out.println("\nOrdenação com o Insertion Sort: " + n + " valores.");
            this.ordenado = CriaVetor.copiarVetor(vetor, n);
            this.tempo = System.nanoTime();
            insertionSort(this.ordenado, n-1);
            this.tempo = System.nanoTime() - this.tempo;

	}
        //Função para calcular o tempo gasto para a ordenação
        public float gettempo() {
            return this.tempo / (float) 1000000;
	}
        //Função para calcular o número de acessos do Insertion Sort
	public int getcontadorAI() {
            return this.contadorAI;
	}
        //Função para calcular o número de Inserções do Insertion Sort
        public int getcontadorInsI() {
            return this.contadorInsI;
	}
        //Função para calcular o número de Comparações do Insertion Sort
	public int getcompI() {
            return this.compI;
	}
        //Função para pegar o vetor "ordenado", que será o vetor original ordenado
        public int[] getOrdenado(){
            return this.ordenado;
        }
    
    //desenvolvimento da lógica do algoritmo Insertion Sort com os contadores de maneira recursiva 
    public void insertionSort(int vet[], int aux) {  
          
        for (int j = 1; j < aux; j++) {  
            int key = vet[j]; 
            int variavel = j - 1; 
            contadorAI++;
            
            while(key < vet[variavel] && variavel >= 0 ){
                compI++;
                vet[variavel + 1] = vet[variavel];
                contadorAI=+3;
                contadorInsI++;
                key--;
                        }
            vet[variavel + 1] = key;
            contadorInsI++;
            contadorTroca++;
            contadorAI++;
        } 
    }
}
