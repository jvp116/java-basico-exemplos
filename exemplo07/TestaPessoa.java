package exemplo07;

/**
 * Programa para testar o objeto pessoa
 * 
 * @author João Victor
 * @since 17/02/2021
 */
public class TestaPessoa {

	/*
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {

		// declarar e instanciar o objeto pessoa
		Pessoa joao = new Pessoa();

		// atribuindo os valores ao objeto joao
		joao.setNome("João Victor Paltanin");

		// criando o objeto de data
		Data dataNascimento = new Data();

		// incializando a data do objeto joao
		dataNascimento.setDia(16);
		dataNascimento.setMes(04);
		dataNascimento.setAno(2001);

		// atribuindo os valores de data para o objeto joao
		joao.setDataNascimento(dataNascimento);

		// atribuindo os valores de salário para o objeto joao
		joao.setSalario(1300.55);

		// exibindo os dados do objeto joao
		System.out.println("Nome: " + joao.getNome());
		System.out.println("Data de nascimento: " + joao.getDataNascimento());
		System.out.println(joao.getDataNascimento().faixaEtaria());
		System.out.println(joao.salarioMinimo());
	}

}
