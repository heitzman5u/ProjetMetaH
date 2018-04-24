package model.algos;

import java.util.ArrayList;
import java.util.LinkedList;

import model.Probleme;

public class BranchAndBound extends Algo {
	private ArrayList<Integer[]> listeSolution;
	private ArrayList<Integer> aTraiter;
	
	private static final int A_DEVELOPPER = 0;
	private static final int PRIS = 1;
	private static final int NON_PRIS = 2;

	public BranchAndBound(Probleme p) {
		super(p);
		listeSolution = new ArrayList<Integer[]>();
		aTraiter = new ArrayList<Integer>();
		//algo();
		System.out.println(toStringSolution());
		viderSolution();
	}
	
	
	/*
	private void algo() {
		int B = 1000;
		LinkedList<Integer[]> queue = new LinkedList<Integer[]>();
		for(int i = 0 ; i < probleme.getNbPersonnes() ; i++) {
			Integer[] tabInit = {i, 0, probleme.getTab(i, 0), A_DEVELOPPER};
			queue.add(tabInit);
		}
		while (!queue.isEmpty()) {
			Integer[] N = queue.get(0);
			if((N[3] != A_DEVELOPPER)){
				if(evaluer(N) < B) {
					B = evaluer(N);
				}
			} else {
				Integer[] tabP = {N[0], N[1], probleme.getTab(N[0], N[1]), PRIS};
				Integer[] tabNP = {N[0], N[1], probleme.getTab(N[0], N[1]), NON_PRIS};
				if(evaluer(tabP) <= B) {
					queue.add(queue.size(), tabP);
					if(evaluer(tabP) < B) {
						B = evaluer(tabP);
					}
				}
				if(evaluer(tabNP) <= B) {
					queue.add(queue.size(), tabNP);
					if(evaluer(tabNP) < B) {
						B = evaluer(tabNP);
					}
				}
			}
		}
	}
	*/
	/*
	
	private void algo() {
		int meilleureHeuristique = heuristique(0);

		for(int j = 0 ; j < probleme.getNbTaches() ; j++) {
			for (int i = 0 ; i < probleme.getNbPersonnes() ; i++) {
				
				probleme.getPersonne(i).addTache(j);
				probleme.getPersonne(i).addTempsTravail(probleme.getTab(i, j));
				
				int nouvHeuristique = heuristique(j+1);
				if (nouvHeuristique <= meilleureHeuristique) {
					Integer[] tmp = {i,j};
					listeSolution.add(tmp);
					meilleureHeuristique = nouvHeuristique;
				}
				
			}
		}
		reconstituerSolution();
		
	}

	private int heuristique(int debut) {
		reconstituerSolution();
		Greedy.iteration(debut, probleme.getNbTaches());
		int tps = probleme.getTempsFinal();
		viderSolution();
		return tps;
		
	}
	
	private void reconstituerSolution() {
		for(int i = 0 ; i < listeSolution.size() ; i++) {
			int personne = listeSolution.get(i)[0];
			int tache = listeSolution.get(i)[1];
			probleme.getPersonne(personne).addTache(tache);
			probleme.getPersonne(personne).addTempsTravail(probleme.getTab(personne, tache));
		}
	}
	
	*/
}
