package exemplo04;

/**
 * Program para demonstrar laço de repetição while
 * 
 * @author João Victor
 * @since 10/02/2021
 */
public class RepeticaoWhile {

	/*
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {
		// declarando as variáveis
		int indice;

		// inicializando a variável
		indice = 0;

		// efetuando o laço de repetição para exibir o cubo de um número
		while (indice < 10) { // início do laço de repetição

			System.out.println(indice + " ao cubo é " + ((indice * indice) * indice));
			indice++;

		} // fim do laço de repetição
	}

}
