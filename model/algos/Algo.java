package model.algos;

import model.Personne;
import model.Probleme;

public abstract class Algo {
	protected static Probleme probleme;
	
	public Algo(Probleme p) {
		probleme = p;
	}
	
	public String toStringSolution() {
		StringBuilder sb = new StringBuilder();
		for(Personne p : probleme.getListePersonnes()) {
			sb.append(p.toString() + "\n\n");
		}
		sb.append("Temps final : " + probleme.getTempsFinal() + "\n");
		return sb.toString();
	}
	
	public void viderSolution() {
		probleme.viderSolution();
	}
}
