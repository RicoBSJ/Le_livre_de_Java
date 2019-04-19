
/*
#	Le livre de Java 1er langage
#	A. Tasso
#	Chapitre 5 : De l'algorithme paramÈtrÈ ‡ l'Ècriture de fonctions
#	Exercice : 5.5
#	Fichier  : Exercice5.java
#	Class    : Exercice5
*/

import java.util.*;

public class Exercice5_5 {
	public static void main(String[] arg) {
		int nbCB, nbCheque, nbVirement, nbDebit;
		double rÈsultat;
		Scanner lectureClavier = new Scanner(System.in);
		System.out.print(" Nombre d'achat Cartes Bleues : ");
		nbCB = lectureClavier.nextInt();
		System.out.print(" Nombre de chËques Èmis : ");
		nbCheque = lectureClavier.nextInt();
		System.out.print(" Nombre de virements automatiques : ");
		nbVirement = lectureClavier.nextInt();
		nbDebit = nbCB + nbCheque + nbVirement;
		System.out.println("Vous avez emis " + nbDebit + " debits ");
		rÈsultat = pourcentage(nbDebit, nbCB);
		System.out.println(" dont " + rÈsultat + " % par Carte bleue ");
		rÈsultat = pourcentage(nbDebit, nbCheque);
		System.out.println("      " + rÈsultat + " % par Cheques ");
		rÈsultat = pourcentage(nbDebit, nbVirement);
		System.out.println("      " + rÈsultat + " % par Virement automatique ");
		lectureClavier.close();
	}

	public static double pourcentage(int t, int nb) {
		double prct = (double) nb / t * 100;
		return prct;
	}
}