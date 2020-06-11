package segundaAEP;

import java.util.ArrayList;

public class Ator {
	private String nomeAtor;
	private int idade;
	private ArrayList<Diretor> Diretores = new ArrayList<>();

	public Ator(String nomeAtor, int idade) {
		this.nomeAtor = nomeAtor;
		this.idade = idade;
	}

	public String getNomeAtor() {
		return nomeAtor;
	}

	public int getIdade() {
		return idade;
	}

	public void adicionarDiretores(Diretor diretor) {
		if (this.Diretores.contains(diretor)) {
			return;
		}
		this.Diretores.add(diretor);
	}

	public ArrayList<Diretor> getDiretores() {
		return Diretores;
	}

}
