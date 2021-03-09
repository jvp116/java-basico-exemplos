package exemplo06;

/**
 * Classe para demonstrar a utilização do objeto Pessoa
 * 
 * @author João Victor
 * @since 17/02/2021
 */
public class TestaPessoa {

	/*
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {

		// declarando o objeto pessoa
		Pessoa joao;

		// inicializando o objeto joao (instância de objeto)
		joao = new Pessoa();

		// atribuindo os valores ao objeto joao
		joao.nome = "João Victor Paltanin";
		joao.dataNascimento = "16/04/2001";
		joao.altura = 1.83;
		joao.peso = 77;
		joao.sexo = "Masculino";

		// declarando o onjeto pessoa maria
		Pessoa maria;

		// inicializando o objeto maria (instância de objeto)
		maria = new Pessoa();

		// atribuindo os valores ao objeto maria
		maria.nome = "Maria Josias";
		maria.dataNascimento = "12/08/2005";
		maria.altura = 1.52;
		maria.peso = 65;
		maria.sexo = "Feminino";

		// exibindo os dados do objeto joao
		System.out.println("Nome: " + joao.nome);
		System.out.println("Data de Nascimento: " + joao.dataNascimento);
		System.out.println("Altura: " + joao.altura);
		System.out.println("Peso: " + joao.peso);
		System.out.println("Sexo: " + joao.sexo);

		// pulando uma linha
		System.out.println("");

		// exibindo os dados do objeto maria
		System.out.println("Nome: " + maria.nome);
		System.out.println("Data de Nascimento: " + maria.dataNascimento);
		System.out.println("Altura: " + maria.altura);
		System.out.println("Peso: " + maria.peso);
		System.out.println("Sexo: " + maria.sexo);

		// pulando uma linha
		System.out.println("");

		// exibindo os dados do objeto joao
		joao.exibirDados();

		// pulando uma linha
		System.out.println("");

		// exibindo os dados do objeto maria
		maria.exibirDados();
	}

}
