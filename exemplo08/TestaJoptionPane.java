package exemplo08;

import javax.swing.JOptionPane;

/**
 * Classe para demonstrar a utilização do componente JoptionPane acessando
 * atributos estáticos
 * 
 * @author João Victor
 * @since 23/02/2021
 */
public class TestaJoptionPane {

	/*
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {

		// utilizando o JoptionPane com o construtor para exibição de mensagem de erro
		JOptionPane.showMessageDialog(null, Mensagem.erroIncluido, "Erro", 0); // 0 - código do ícone de erro

		// utilizando o JoptionPane com o construtor para exibição de mensagem de erro
		JOptionPane.showMessageDialog(null, Mensagem.sucessoIncluido, Titulo.cadastroUsuario, 1); // 1 - código do ícone
																									// de informação

		// utilizando o JoptionPane com o construtor para exibição de mensagem de erro
		JOptionPane.showMessageDialog(null, "Conteúdo", "Título", 2); // 0 - código do ícone de advertência

		// utilizando o JoptionPane com o construtor para exibição de mensagem de erro
		JOptionPane.showMessageDialog(null, "Conteúdo", "Título", 3); // 0 - código do ícone de interrogação
	}
}
