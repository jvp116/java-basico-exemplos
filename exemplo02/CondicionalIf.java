package exemplo02;

import javax.swing.JOptionPane;

/**
 * Programa para demonstrar o comando IF
 * 
 * @author jvictorp
 * @since 08/02/2021
 */
public class CondicionalIf {

	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {

		// declarando variáveis
		double imc, altura, peso;

		// capturando os dados do usuário
		peso = Double.parseDouble(JOptionPane.showInputDialog("Informe o peso"));
		altura = Double.parseDouble(JOptionPane.showInputDialog("Informe a altura"));

		// calculando o IMC do usuário
		imc = peso / (Math.pow(altura, 2));

		// exibir p resultado do IMC
		if (imc < 18.5) {
			JOptionPane.showMessageDialog(null, "Abaixo do peso!");
		}

		if ((imc >= 18.5) && (imc <= 24.9)) {
			JOptionPane.showMessageDialog(null, "Peso ideal!");
		}
	}

}
