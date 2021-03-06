package exemplo05;

/**
 * Programa para demonstrar a utilização do vetor tipo inteiro
 * 
 * @author João Victor
 * @since 11/02/2021
 */
public class VetorInteiro {

	/*
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {
		// declarando o vetor
		int vetor[];

		// iniciando o vetor e informando a quantidade de posições (tamanho)
		vetor = new int[3];

		// adicionando o valor 10 na 1ª posição do vetor no seu índice 0
		vetor[0] = 10;

		// adicionando o valor 5 na 2ª posição do vetor no seu índice 1
		vetor[1] = 5;

		// adicionando o valor 25 na 3ª posição do vetor no seu índice 2
		vetor[2] = 25;

		// exibindo o valor da primeira posição do vetor
		System.out.println(vetor[0]);

		// exibindo o valor da segunda posição do vetor
		System.out.println(vetor[1]);

		// exibindo o valor da terceira posição do vetor
		System.out.println(vetor[2]);
	}

}