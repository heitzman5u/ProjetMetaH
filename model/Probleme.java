package model;

import java.util.ArrayList;

public class Probleme {
	private int[][] tab;
	private int nbPersonnes;
	private int nbTaches;
	public ArrayList<Personne> listePersonnes;
	
	public Probleme(int[][] t) {
		tab = t;
		nbPersonnes = tab.length;
		nbTaches = tab[0].length;
		listePersonnes = new ArrayList<Personne>();
		for(int i=0 ; i < nbPersonnes ; i++) {
			listePersonnes.add(new Personne(i));
		}
	}
	
	public int getTab(int personne, int tache) {
		return tab[personne][tache];
	}

	public int getNbPersonnes() {
		return nbPersonnes;
	}

	public int getNbTaches() {
		return nbTaches;
	}

	public ArrayList<Personne> getListePersonnes() {
		return listePersonnes;
	}
	
	public Personne getPersonne(int i) {
		return listePersonnes.get(i);
	}
	
	public int getTempsFinal() {
		int meilleur = listePersonnes.get(0).getTempsTravail();
		for(int i = 1 ; i < listePersonnes.size() ; i++) {
			if (listePersonnes.get(i).getTempsTravail() > meilleur) {
				meilleur = listePersonnes.get(i).getTempsTravail();
			}
		}
		return meilleur;
	}
	
	public void viderSolution() {
		listePersonnes.clear();
		for(int i=0 ; i < nbPersonnes ; i++) {
			listePersonnes.add(new Personne(i));
		}
	}

}
