package exemplo10;

import javax.swing.JOptionPane;

/**
 * Classe para demonstrar a utilização de exceções em Java
 * 
 * @author João Victor
 * @since 23/02/2021
 */
public class TestaUsuario {

	// método para verificar String vazia
	public void receberDados() {
		if (Valida.isStringVazio(JOptionPane.showInputDialog(Mensagem.informeNome))) {
			JOptionPane.showMessageDialog(null, Mensagem.nomeVazio, "Cadastro de Usuário", 0);
		} else {
			JOptionPane.showMessageDialog(null, "Nome válido!", "Cadastro de Usuário", 1);
		}

		if (Valida.isStringValida(JOptionPane.showInputDialog(Mensagem.informeNome))) {
			JOptionPane.showMessageDialog(null, "Nome válido!", "Cadastro de Usuário", 1);
		} else {
			JOptionPane.showMessageDialog(null, Mensagem.nomeInvalido, "Cadastro de Usuário", 0);
		}

		if (Valida.isNumber(JOptionPane.showInputDialog(Mensagem.informeIdade))) {
			JOptionPane.showMessageDialog(null, "Idade Válida", "Cadastro de Uusário", 0);
		} else {
			JOptionPane.showMessageDialog(null, Mensagem.idadeInvalido, "Cadastro de Uusário", 0);
		}

	} // fim do método

	/*
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {
		// instanciando o objeto do tipo Usuario Usuario admin = new Usuario();
		new TestaUsuario().receberDados();
	}

}