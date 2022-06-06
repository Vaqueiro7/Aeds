package all;

public class Tabela {

	public static void imprimeResultados() {
		// criação de variáveis
		int[] original = new int[30000];
		int[] copiarOriginal = new int[20];

		// chamada do vetor aleatório em relação às variáveis
		CriaVetor.preencherVetor(copiarOriginal);

		// criação de um vetor auxiliar
		CriaVetor auxiliar = new CriaVetor(original);

		// cabeçalho com os dados dos alunos
		System.out.println("/******************************************************************************/");
		System.out.println("/* Alunos: Eduardo Henrique de Castro Cotta e Bruno Emanuel Benjamim da Silva */");
		System.out.println("/* Matrícula: 2021008757 e 2021008640*/");
		System.out.println("/* Curso: Ciência da Computação */");
		System.out.println("/* 1º Trabalho Prático -- Ordenação Interna */");
		System.out.println("/* DCC288 -- 2022 -- IFSEMG, 3o. */");
		System.out.println("/* Prof. Flávio Augusto de Freitas */");
		System.out.println("/* Compilador: Apache NetBeans IDE versão 13 */");
		System.out.println("/* Sistema Operacional: Windows 11 */");
		System.out.println("/******************************************************************************/");

		// Ordenação dos vetores de 5000, 10000 e 30000 posições com o uso do Insertion
		// Sort, respectivamente
		ordenaVetorInsertionSort i5k = new ordenaVetorInsertionSort(auxiliar.Vetor30, 5000);
		ordenaVetorInsertionSort i10k = new ordenaVetorInsertionSort(auxiliar.Vetor30, 10000);
		ordenaVetorInsertionSort i30k = new ordenaVetorInsertionSort(auxiliar.Vetor30, 30000);
		// Ordenação do vetor de 20 posições com o uso do Merge Sort
		MergeSort m20 = new MergeSort(copiarOriginal, 20);

		// Ordenação dos vetores de 5000, 10000 e 30000 posições com o uso do Merge
		// Sort, respectivamente
		MergeSort m5k = new MergeSort(auxiliar.Vetor30, 5000);
		MergeSort m10k = new MergeSort(auxiliar.Vetor30, 10000);
		MergeSort m30k = new MergeSort(auxiliar.Vetor30, 30000);

		// Ordenação dos vetores de 5000, 10000 e 30000 posições com o uso do Quick
		// Sort, respectivamente
		QuickSort Q5k = new QuickSort(auxiliar.Vetor30, 5000);
		QuickSort Q10k = new QuickSort(auxiliar.Vetor30, 10000);
		QuickSort Q30k = new QuickSort(auxiliar.Vetor30, 30000);

		// Chamada do vetor original desordenado
		System.out.print("Vetor original:");
		CriaVetor.imprimeVetor(copiarOriginal, 20);
		System.out.println("...");

		// Chamada do vetor original ordenado
		System.out.print("\nVetor ordenado: ");
		CriaVetor.imprimeVetor(m20.getOrdenado(), 20);
		System.out.println("...");

		// Tabela com os resultados
		System.out.println(
				"\n           ORDENAÇÃO                                                               VETOR                                             ");
		System.out.println(
				"--------------------------------    -------------------------------------------------------------------------------------------------  ");
		System.out.println(
				"MÉTODO         TEMPO TOTAL (ms)         ACESSOS            COMPARAÇÕES            TROCAS             INSERÇÕES             PIVÔS       ");
		System.out.println(
				"            5000   10000   30000    5000 10000 30000    5000 10000 30000     5000 10000 30000    5000 10000 30000    5000 10000 30000");
		System.out.println(
				"---------   ----   -----   -----    ---- ----- -----    ---- ----- -----     ---- ----- -----    ---- ----- -----    ---- ----- ----- ");

		System.out.println("Insertion   " + i5k.gettempo() + " " + i10k.gettempo() + " " + i30k.gettempo() + "  "
				+ i5k.getcontadorAI() + " " + i10k.getcontadorAI() + " " + i30k.getcontadorAI() + "  " + i5k.getcompI()
				+ " " + i10k.getcompI() + " " + i30k.getcompI() + "                                         "
				+ i5k.getcontadorInsI() + " " + i10k.getcontadorInsI() + " " + i30k.getcontadorInsI());

		System.out.println("Merge       " + m5k.gettempo() + " " + m10k.gettempo() + " " + m30k.gettempo() + "  "
				+ m5k.getcontadorA() + " " + m10k.getcontadorA() + " " + m30k.getcontadorA() + "  " + m5k.getcompM()
				+ " " + m10k.getcompM() + " " + m30k.getcompM());

		System.out.println("Quick       " + Q5k.gettempo() + " " + Q10k.gettempo() + " " + Q30k.gettempo() + "  "
				+ Q5k.getcontadorAQ() + " " + Q10k.getcontadorAQ() + " " + Q30k.getcontadorAQ() + "  " + Q5k.getcompQ()
				+ " " + Q10k.getcompQ() + " " + Q30k.getcompQ() + "  " + Q5k.gettrocas() + " " + Q10k.gettrocas() + " "
				+ Q30k.gettrocas() + "                       " + Q5k.getpivoQ() + " " + Q10k.getpivoQ() + " "
				+ Q30k.getpivoQ());

	}
}
