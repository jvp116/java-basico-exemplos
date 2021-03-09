package exemplo11;

import java.util.ArrayList;

/**
 * Classe para demonstrar a utilização de ArrayList do tipo String
 * 
 * @author João Victor
 * @since 23/02/2021
 */
public class ArrayListString {

	/*
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {

		// declarar e instanciar uma lista de String
		ArrayList<String> listaString = new ArrayList<String>();

		// adicionar registros na lista de String
		listaString.add("Elemento 1");
		listaString.add("Elemento 2");
		listaString.add("Elemento 3");
		listaString.set(2, "Elemento3");

		// exibindo o conteúdo da lista
		System.out.println(listaString.get(0));
		System.out.println(listaString.get(1));
		System.out.println(listaString.get(2));

		// adcionando em uma posição específica
		listaString.add(1, "Elemento 1.5");

		// varrendo a lista e exibindo o conteúdo da lista
		for (String elemento : listaString) {
			System.out.println(elemento);
		}

		// obtendo o tamanho da lista de String
		System.out.println("O tamanho da lista é: " + listaString.size());

		// pesquisando um valor específico na lista
		if (listaString.contains("Elemento 1")) {
			System.out.println("Elemento encontrado!");
		} else {
			System.out.println("Elemento NÃO encontrado!");
		}

		// descobrindo o índice do elemento pesquisado
		int indice = listaString.indexOf("Elemento 1");
		System.out.println("Índice: " + indice);

		// adicionando um novo elemento na lista
		listaString.add("Elemento 4");

		// obtendo o tamanho da lista de String
		System.out.println("O tamanho da lista é: " + listaString.size());

		// removendo um elemento da lista
		listaString.remove("Elemento 1.5");
		for (String string : listaString) {
			System.out.println(string);
		}
	}
}