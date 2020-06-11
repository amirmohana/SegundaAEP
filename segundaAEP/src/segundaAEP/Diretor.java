package segundaAEP;

import java.util.ArrayList;

public class Diretor {
	private String nome;
	private ArrayList<Ator> Atores = new ArrayList<>();

	public Diretor(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void adicionarAtores(Ator ator) {
		if (this.Atores.contains(ator)) {
			return;
		}
		this.Atores.add(ator);
		ator.adicionarDiretores(this);
	}

	public ArrayList<Ator> getAtores() {
		return Atores;
	}

}
