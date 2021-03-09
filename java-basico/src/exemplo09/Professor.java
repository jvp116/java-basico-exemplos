package exemplo09;

/**
 * Classe para armazenar osa tributos de professor herdando os dados de
 * funcionário (herança)
 * 
 * @author João Victor
 * @since 23/02/2021
 */
public class Professor extends Funcionario implements InterfaceFuncionario {

	// atributos do objeto professor
	private String materia;

	// métodos para acessar o atributo
	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}

	// método para exibir os dados
	public void mostrarDados() {
		super.mostrarDados();
		System.out.println("Matéria: " + materia);
	}

	@Override
	public void salvar() {
	}

	@Override
	public void excluir() {
	}

	@Override
	public void consultar() {
	}

	@Override
	public void alterar() {
	}

} // fim da classe