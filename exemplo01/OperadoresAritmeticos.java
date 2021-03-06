package exemplo01;

/**
 * Programa para demonstrar operações aritméticas
 * 
 * @author jvictorp
 * @since 05/02/2021
 */
public class OperadoresAritmeticos {

	/*
	 * Método principal apara executar o programa
	 */
	public static void main(String[] args) {
		// declarando variáveis
		int adicao, subtracao, multiplicacao, modulo;
		double divisao;

		// exemplo de adição
		adicao = 10 + 5;

		// exemplo de subtração
		subtracao = 10 - 5;

		// exemplo de multiplicação
		multiplicacao = 10 * 5;

		// exemplo de divisão
		divisao = 10 / 5;

		// exemplo de módulo
		modulo = 10 % 5;

		// exibindo as variáveis no console
		System.out.println("10 + 5 = " + adicao);
		System.out.println("10 - 5 = " + subtracao);
		System.out.println("10 * 5 = " + multiplicacao);
		System.out.println("10 / 5 = " + divisao);
		System.out.println("10 % 5 = " + modulo);

	}

}
