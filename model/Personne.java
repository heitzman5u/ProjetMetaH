package model;

import java.util.ArrayList;

public class Personne {

	private int numPersonne;
	private ArrayList<Integer> listeNumTaches;
	private int tempsTravail;
	
	public Personne(int num) {
		numPersonne = num;
		listeNumTaches = new ArrayList<Integer>();
		tempsTravail = 0;
	}

	public int getTempsTravail() {
		return tempsTravail;
	}

	public void addTempsTravail(int tempsTravail) {
		this.tempsTravail += tempsTravail;
	}

	public ArrayList<Integer> getListeTaches() {
		return listeNumTaches;
	}
	
	public void addTache(int numTache) {
		listeNumTaches.add(numTache);
	}
	
	public int getNumPersonne() {
		return numPersonne;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(" ---- PERSONNE N°" + numPersonne + " ---- \n");
		sb.append("liste des numeros de Taches : ");
		for(int i = 0 ; i < listeNumTaches.size() ; i++) {
			sb.append(listeNumTaches.get(i) + " ");
		}
		sb.append("\n");
		sb.append("temps total de travail : " + tempsTravail + "\n");
		return sb.toString();
	}
}
