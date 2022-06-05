package all;

public class Main {

	public static void main(String[] args) {

		int[] mouse = new int[30000];

		CriaVetor.preencherVetor(mouse);

		CriaVetor.imprimeVetor(mouse, 20);
		CriaVetor.imprimeVetor(mouse, 20);
		CriaVetor.imprimeVetor(mouse, 20);

		CriaVetor celular = new CriaVetor(mouse);

		// Ordenação

		MergeSort m5k = new MergeSort(celular.Vetor5, 5000);
		MergeSort m10k = new MergeSort(celular.Vetor10, 10000);
		MergeSort m30k = new MergeSort(celular.Vetor30, 30000);

		CriaVetor.imprimeVetor(celular.Vetor5, 5000);
		System.out.println("Tempo : " + m5k.gettempo());
		System.out.println("Acessos : " + m5k.getcontadorA());
		System.out.println("Comparacoes : " + m5k.getcompM());

		CriaVetor.imprimeVetor(celular.Vetor10, 10000);
		System.out.println("Tempo : " + m10k.gettempo());
		System.out.println("Acessos : " + m10k.getcontadorA());
		System.out.println("Comparacoes : " + m10k.getcompM());

		CriaVetor.imprimeVetor(celular.Vetor30, 3 );
		System.out.println("Tempo : " + m30k.gettempo());
		System.out.println("Acessos : " + m30k.getcontadorA());
		System.out.println("Comparacoes : " + m30k.getcompM());
		
		//
		
		QuickSort Q5k = new QuickSort(celular.Vetor5, 5000);
		QuickSort Q10k = new QuickSort(celular.Vetor10, 10000);
		QuickSort Q30k = new QuickSort(celular.Vetor30, 30000);

		CriaVetor.imprimeVetor(celular.Vetor5, 5000);
		System.out.println("Tempo : " + Q5k.gettempo());
		System.out.println("Acessos : " + Q5k.getcontadorAQ());
		System.out.println("Comparacoes : " + Q5k.getcompQ());
		System.out.println("Pivo : " + Q5k.getpivoQ());
		System.out.println("Trocas : " + Q5k.gettrocas());
		
		CriaVetor.imprimeVetor(celular.Vetor10, 10000 );
		System.out.println("Tempo : " + Q10k.gettempo());
		System.out.println("Acessos : " + Q10k.getcontadorAQ());
		System.out.println("Comparacoes : " + Q10k.getcompQ());
		System.out.println("Pivo : " + Q10k.getpivoQ());
		System.out.println("Trocas : " + Q10k.gettrocas());
		
		CriaVetor.imprimeVetor(celular.Vetor30, 30000 );
		System.out.println("Tempo : " + Q30k.gettempo());
		System.out.println("Acessos : " + Q30k.getcontadorAQ());
		System.out.println("Comparacoes : " + Q30k.getcompQ());
		System.out.println("Pivo : " + Q30k.getpivoQ());
		System.out.println("Trocas : " + Q30k.gettrocas());

	}

}
