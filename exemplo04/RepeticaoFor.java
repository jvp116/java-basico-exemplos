package exemplo04;

/**
 * Programa para demonstrar a utlização do comando de repetição For
 * 
 * @author João Victor
 * @since 10/02/2021
 */
public class RepeticaoFor {

	/*
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {

		// efetuando o laço de repetição para exibir o cubo de um número
		for (int i = 0; i < 10; i++) { // início do laço for
			System.out.println(i + " ao cubo é " + ((i * i) * i));
		} // fim do laço for
	}

}
