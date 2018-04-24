package model.algos;

import model.Personne;
import model.Probleme;

public class Greedy extends Algo {

	public Greedy(Probleme p) {
		super(p);
		algo();
		System.out.println(toStringSolution());
		viderSolution();
	}
	
	private void algo() {
		//pour chaque tache
		for(int j = 0 ; j < probleme.getNbTaches() ; j++) {
			// je sélectionne la personne pour laquelle la tache coute le moins de temps de travail
			int meilleurIndicePersonne = 0;
			int meilleurTpsTravail = probleme.getTab(0, j);
			for (int i = 0 ; i < probleme.getNbPersonnes() ; i++) {
				if (probleme.getTab(i, j) < meilleurTpsTravail) {

					meilleurTpsTravail = probleme.getTab(i, j);
					meilleurIndicePersonne = i;
				}
			}
			// j'affecte la tache à la personne
			probleme.getPersonne(meilleurIndicePersonne).addTache(j);
			probleme.getPersonne(meilleurIndicePersonne).addTempsTravail(meilleurTpsTravail);
		}
	}

	public static void iteration(int debut, int fin) {
		for(int j = debut ; j < fin ; j++) {
			// je sélectionne la personne pour laquelle la tache coute le moins de temps de travail
			int meilleurIndicePersonne = 0;
			int meilleurTpsTravail = probleme.getTab(0, j);
			for (int i = 0 ; i < probleme.getNbPersonnes() ; i++) {
				if (probleme.getTab(i, j) < meilleurTpsTravail) {

					meilleurTpsTravail = probleme.getTab(i, j);
					meilleurIndicePersonne = i;
				}
			}
			// j'affecte la tache à la personne
			probleme.getPersonne(meilleurIndicePersonne).addTache(j);
			probleme.getPersonne(meilleurIndicePersonne).addTempsTravail(meilleurTpsTravail);
		}
	}
}
