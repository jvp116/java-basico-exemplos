package exemplo01;

import javax.swing.JOptionPane;

/**
 * Programa para demosntrar entrada de dados fornecido pelo usuário
 * 
 * @author jvictorp
 * @since 05/02/2021
 */
public class EntradaDados {

	/*
	 * Método principal apara executar o programa
	 */
	public static void main(String[] args) {
		// declarando variáveis
		String nome;

		// atribuir valor para a variável
		nome = JOptionPane.showInputDialog("Digite o seu nome");
		
		System.out.println("Seu nome é: " + nome);
	}

}
