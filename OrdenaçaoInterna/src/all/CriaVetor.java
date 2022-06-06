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

import java.util.Random;


public class CriaVetor {
    
        //criação da variável "vetor"
	public int[] Vetor30;
	public CriaVetor(int[] vetor) {
		Vetor30 = this.copiarVetor(vetor,30000 );	
	}
	
	//função para imprimir o vetor quando chamado
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
	}
	
        //função para preencher o vetor com valores aleatórios
	public static void preencherVetor(int[] vetor) {

		Random random = new Random();

		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = random.nextInt(30000);
		}
	}
        //função para copiar o vetor quando necessário
	public static int[] copiarVetor(int[] vetor, int n) {

		int retorno[] = new int[n];

		for(int i = 0; i < n; i++) {
			retorno[i] = vetor[i];
		}
		return retorno;
	}
}

