package exemplo05;

import javax.swing.JOptionPane;

/**
 * Programa para mostrar a soma de um vetor do tipo inteiro
 * 
 * @author João Victor
 * @since 10/02/2021
 */
public class SomaVetor {

	/*
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {
		// declarando o vetor
		int vetor[];

		// declarando variável auxiliar para somaro vetor
		int soma;

		// inicializando a variável de soma
		soma = 0;

		// iniciando o vetor e informando a quantidade de posições (tamanho)
		vetor = new int[5];

		// recebendo os valores do usuário usando o comando FOR
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor"));
		}

		// somando o vetor com auxílio do comando FOR
		for (int i = 0; i < vetor.length; i++) {
			soma += vetor[i];
		}

		// exibindo o resultado da soma do vetor
		System.out.println(soma);
	}

}
