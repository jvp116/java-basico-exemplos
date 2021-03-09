package exemplo01;

import javax.swing.JOptionPane;

/**
 * Programa para demonstrar conversão de dados String para double
 * 
 * @author jvictorp
 * @since 05/02/2021
 */
public class ConverterDadosDouble {

	/*
	 * Método principal apara executar o programa
	 */
	public static void main(String[] args) {
		// declarando variáveis
		double valor1, valor2, resultado;

		// atribuindo valores
		valor1 = Double.parseDouble(JOptionPane.showInputDialog("Informe o primeiro valor"));
		valor2 = Double.parseDouble(JOptionPane.showInputDialog("Informe o segundo valor"));

		// efetuando o cálculo
		resultado = valor1 / valor2;

		// exibindo na tela o resultado da divisão
		System.out.println("O resultado é: " + resultado);

	}

}
