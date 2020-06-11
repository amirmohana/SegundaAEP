package segundaAEP;

public class Serie {
	private String nomeSerie;
	private Ator ator;
	private Genero genero;

	public Serie(String nomeSerie, Ator ator, Genero genero) {
		this.nomeSerie = nomeSerie;
		this.ator = ator;
		this.genero = genero;
	}

	public Ator getAtor() {
		return ator;
	}

	public Genero getGenero() {
		return genero;
	}

	public String getNomeSerie() {
		return nomeSerie;
	}
}
