package exemplo03;

/**
 * Programa para demonstrar o Incremento de valores
 * 
 * @author João Victor
 * @since 10/02/2021
 */
public class ExemploIncremento {

	/*
	 * Método principal para exeuctar o programa
	 */
	public static void main(String[] args) {
		// declarando as variáveis
		int numero;

		// atribuindo valores a variável
		numero = 1;

		System.out.println(numero); // exibe valor 1

		numero = numero + 1; // incremento

		System.out.println(numero); // exibe valor 2

		numero++; // incremento

		System.out.println(numero); // exibe valor 3

		System.out.println(numero++); // exibe valor 3

		System.out.println(numero); // exibe valor 4

		System.out.println(++numero); // exibe valor 5
	}

}
