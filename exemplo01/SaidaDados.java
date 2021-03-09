package exemplo01;

import javax.swing.JOptionPane;

/**
 * Programa para demonstrar exibição de dados para o usuário
 * 
 * @author jvictorp
 * @since 05/02/2021
 */
public class SaidaDados {

	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {
		// declarando variáveis
		double num1, num2, res;

		// atribuindo valores para as variáveis
		num1 = Double.parseDouble(JOptionPane.showInputDialog("Informe o primeiro número"));
		num2 = Double.parseDouble(JOptionPane.showInputDialog("Informe o segundo número"));

		// efetuando a operação de multiplicação
		res = num1 * num2;

		// exibindo o resultado para o usuário
		JOptionPane.showMessageDialog(null, "Primeiro valor digitado: " + num1 + "\n" +
											"Segundo valor digitado: " + num2 + "\n" +
											"Resultado da operação: " + res);

	}

}
