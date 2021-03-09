package exemplo05;

import javax.swing.JOptionPane;

/**
 * Programa para demonstrar vetor com o usuário informando o seu tamanho
 * 
 * @author Murillo Barbosa Lemos
 * @since 11/02/2021
 */
public class VetorTamanhoDinamico {

	/*
	 * Método principal para executyar a classe
	 */
	public static void main(String[] args) {

		// declarando o vetor
		int vetor[];

		// variavel auxiliar informada pelo usuário para definir o tamanho do vetor
		int tamanho;

		// usuario informando o tamanho do vetor
		tamanho = Integer.parseInt(JOptionPane.showInputDialog("Informe o tamanho do vetor"));

		// Inicializando o vetor e definindo o seu tamanho
		vetor = new int[tamanho];

		// recebendo do usuario os valores a serem gravados no vetor
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor"));
		}

		// exibir os dados gravados no vetor
		for (int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i]);
		}
	}

}
