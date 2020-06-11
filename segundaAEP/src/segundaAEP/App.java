package segundaAEP;

public class App {
	public static void main(String[] args) {
		Diretor samir = new Diretor("Samir");
		Diretor Ali = new Diretor("Ali");

		Genero Terror = new Genero("terror");

		Ator amir = new Ator("Amir", 19);
		amir.adicionarDiretores(Ali);
		amir.adicionarDiretores(samir);
		Serie SPN = new Serie("Supernatural", amir, Terror);
		Ali.adicionarAtores(amir);
		samir.adicionarAtores(amir);
		System.out.println(SPN.getAtor().getDiretores());

	}
}
