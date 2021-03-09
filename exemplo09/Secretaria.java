/**
 * 
 */
package exemplo09;

/**
 * Classe para armazenar os atributos e métodos do objeto Secretaria e herdar de
 * Funcionario
 * 
 * @author João Victor
 * @since 23/02/2021
 */
public class Secretaria extends Funcionario {

	// atributos de secretaria
	private int ramal;

	// métodos para acessar o atributo
	public int getRamal() {
		return ramal;
	}

	public void setRamal(int ramal) {
		this.ramal = ramal;
	}

	// método para exibir os dados
	public void mostrarDados() {
		super.mostrarDados();
		System.out.println("Ramal: " + ramal);
	}

}
