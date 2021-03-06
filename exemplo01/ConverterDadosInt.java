package exemplo01;

import javax.swing.JOptionPane;

/**
 * Programa para demonstrar conversão de tipos de dados
 * 
 * @author jvictorp
 * @since 05/02/2021
 */
public class ConverterDadosInt {

	/*
	 * Método principal apara executar o programa
	 */
	public static void main(String[] args) {
		// declarando variáveis
		int valor1, valor2, resultado;

		// recebendo valores do usuário
		valor1 = Integer.parseInt(JOptionPane.showInputDialog("Informe o primeiro valor"));
		valor2 = Integer.parseInt(JOptionPane.showInputDialog("Informe o segundo valor"));

		// calculando o resultado da soma
		resultado = valor1 + valor2;

		// exibindo o resultado da soma
		System.out.println("O resultado da soma é: " + resultado);
	}

}
