package exemplo04;

/**
 * Programa para demonstrar a utlização do comando de repetição Do While
 * 
 * @author João Victor
 * @since 10/02/2021
 */
public class RepeticaoDoWhile {

	/*
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {
		// declarando as variáveis
		int i;

		// inicializando a variável
		i = 0;

		// efetuando o laço de repetição para exibir o cubo de um número
		do {
			System.out.println(i + " ao cubo é " + ((i * i) * i));
			i++;
		} while (i < 10);
	}

}
