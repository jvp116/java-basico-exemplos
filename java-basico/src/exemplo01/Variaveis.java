package exemplo01;

/**
 * Programa para demonstrar utilização de variáveis
 * 
 * @author jvictorp
 * @since 04/02/2021
 */
public class Variaveis {

	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {
		// declarando uma variável do tipo inteiro
		int idade;

		// declarando uma variável do tipo string
		String nome;

		// declarando uma variável do tipo double
		double valor;

		// atribuindo valores para as variáveis
		idade = 19;
		nome = "João Victor Paltanin";
		valor = 155.98;

		// exibindo conteúdo das variáveis no console
		System.out.println("IDADE: " + idade + ".");
		System.out.println("NOME: " + nome + ".");
		System.out.println("VALOR: " + valor + ".");
	}

}
