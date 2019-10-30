package lab5;

/**
 * Facade principal
 * 
 * @author cilas
 *
 */
public class FacadeSAGA {

	private static ControllerPesquisa cp = new ControllerPesquisa();

	public static void main(String[] args) {
		cp.cadastraPesquisa("esse eh o campo 1", "campo");
		System.out.println(cp.exibePesquisa("cam1"));
		cp.cadastraPesquisa("esse eh o campo 2", "campo2");
		System.out.println(cp.exibePesquisa("cam2"));

	}
}