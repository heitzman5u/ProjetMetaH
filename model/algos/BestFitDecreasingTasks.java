package model.algos;

import model.Personne;
import model.Probleme;

public class BestFitDecreasingTasks extends Algo{

	public BestFitDecreasingTasks(Probleme p) {
		super(p);
		algo();
		System.out.println(toStringSolution());
		viderSolution();
	}
	
	private void algo(){
		//pour chaque tache
		for(int j = 0 ; j < probleme.getNbTaches() ; j++) {
		// je créer un tableau : 1ere ligne : indice de la personne i ; 2eme ligne : temps pour que la personne i effectue la tache.
			int[][] tab = new int[2][probleme.getNbPersonnes()];
			for(int i = 0 ; i < probleme.getNbPersonnes() ; i++) {
				tab[0][i] = i;
				tab[1][i] = probleme.getTab(i, j);
			}
		//j'ordonne le tableau créé : ordre décroissant.
			ordonner(tab);
		// je cherche la personne dont (le temps de travail total + tache ajoutée) est la plus petite
			Personne meilleurePersonne = probleme.getPersonne(tab[0][0]);
			int meilleurTpsTotal = meilleurePersonne.getTempsTravail() + tab[1][0];
			int meilleurTps = tab[1][0];
			for(int i = 1 ; i < probleme.getNbPersonnes() ; i++) {
				Personne p = probleme.getPersonne(tab[0][i]);
				int tps = p.getTempsTravail() + tab[1][i];
				if(meilleurTpsTotal > tps) {
					meilleurePersonne = p;
					meilleurTpsTotal = tps;
					meilleurTps = tab[1][i];
				}
			}
		// j'ajoute la tache à la personne
			probleme.getPersonne(meilleurePersonne.getNumPersonne()).addTache(j);
			probleme.getPersonne(meilleurePersonne.getNumPersonne()).addTempsTravail(meilleurTps);
		}
	}
	
	private void ordonner(int[][] tab) {
		for(int j = 0 ; j < tab[0].length - 1 ; j++) {
			if (tab[1][j] > tab[1][j+1]) {
				int indiceTmp = tab[0][j];
				tab[0][j] = tab[0][j+1];
				tab[0][j+1] = indiceTmp;
				
				int valTmp = tab[1][j];
				tab[1][j] = tab[1][j+1];
				tab[1][j+1] = valTmp;
			}
		}
	}
}
