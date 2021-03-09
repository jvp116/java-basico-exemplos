package exemplo07;

/**
 * Classe para armazenar os atributos e métodos do objeto Pessoa
 * 
 * @author João Victor
 * @since 17/02/2021
 */
public class Pessoa {

	// declarando os atributos da pessoa
	private String nome;
	private Data dataNascimento;
	private double salario;

	// métodos para acessar os atributos
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Data getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Data dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	// método para exibir os dados do objeto
	public void exibirDados() { // início do método
		System.out.println("Nome: " + nome);
		System.out.println("Data de Nascimento: " + dataNascimento);
	} // fim do método

	@Override
	public String toString() {
		return "Nome: " + nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	// método para retornar se é acima ou abaixo do salario minimo
	public String salarioMinimo() {
		if (salario > 1163.55) {
			return "Acima do salário mínimo";
		} else {
			return "Abaixo do salário mínimo";
		}
	}

}
