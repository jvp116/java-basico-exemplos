package exemplo05;

import javax.swing.JOptionPane;

/**
 * Programa para buscar um valor específico do vetor tipo String
 * 
 * @author João Victor
 * @since 11/02/2021
 */
public class BuscarValorVetorString {

	/*
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {
		// declarando o vetor
		String vetor[];

		// iniciando o vetor e informando a quantidade de posições (tamanho)
		vetor = new String[3];

		// variável auxiliar para buscar um registro
		String nome = "João";

		// valorizando o vetor recebendo os dados do usuário
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = JOptionPane.showInputDialog("Informe um nome");
		}

		// varrendo vetor para verificar os registros armazenados
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i].equals(nome)) {
				System.out.println("Achei o que você procurava na posição: " + i);
			}
		}

	}

}