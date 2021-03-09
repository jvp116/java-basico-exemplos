package exemplo09;

/**
 * Classe para demonstrar o conceito de herança de métodos e atributos
 * 
 * @author João Victor
 * @since 23/02/2021
 */
public abstract class Funcionario {

	// atributos do objeto funcionário
	private String nome;
	private String cpf;
	private double salario;

	// métodos para acessar os atributos
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	// método simples para exibir atributos
	public void mostrarDados() {
		System.out.println("Nome: " + nome);
		System.out.println("CPF: " + cpf);
		System.out.println("Salário: " + salario);
	}

} // fim da classe
