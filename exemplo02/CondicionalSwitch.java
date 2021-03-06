package exemplo02;

import javax.swing.JOptionPane;

/**
 * Programa para demonstrar o uso do comando Switch
 * 
 * @author jvictorp
 * @since 08/02/2021
 */
public class CondicionalSwitch {

	/*
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {

		// declarando variáveis
		int mes;

		// capturando os dados do usuário
		mes = Integer.parseInt(JOptionPane.showInputDialog("Informe o mês"));

		// exibindo o mês escolhido pelo usuário
		switch (mes) {
		case 1: {
			JOptionPane.showMessageDialog(null, "Mês escolhido - Janeiro");
			break;
		}
		case 2: {
			JOptionPane.showMessageDialog(null, "Mês escolhido - Fevereiro");
			break;
		}
		case 3: {
			JOptionPane.showMessageDialog(null, "Mês escolhido - Março");
			break;
		}
		case 4: {
			JOptionPane.showMessageDialog(null, "Mês escolhido - Abril");
			break;
		}
		case 5: {
			JOptionPane.showMessageDialog(null, "Mês escolhido - Maio");
			break;
		}
		case 6: {
			JOptionPane.showMessageDialog(null, "Mês escolhido - Junho");
			break;
		}
		case 7: {
			JOptionPane.showMessageDialog(null, "Mês escolhido - Julho");
			break;
		}
		case 8: {
			JOptionPane.showMessageDialog(null, "Mês escolhido - Agosto");
			break;
		}
		case 9: {
			JOptionPane.showMessageDialog(null, "Mês escolhido - Setembro");
			break;
		}
		case 10: {
			JOptionPane.showMessageDialog(null, "Mês escolhido - Outubro");
			break;
		}
		case 11: {
			JOptionPane.showMessageDialog(null, "Mês escolhido - Novembro");
			break;
		}
		case 12: {
			JOptionPane.showMessageDialog(null, "Mês escolhido - Dezembro");
			break;
		}
		default:
			JOptionPane.showMessageDialog(null, "Não consta no calendário!");
		}
	}

}
