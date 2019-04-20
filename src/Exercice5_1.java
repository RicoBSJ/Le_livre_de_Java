import java.util.Scanner;

/*
#	Le livre de Java 1er langage
#	A. Tasso
#	Chapitre 5 : De l'algorithme paramÈtrÈ ‡ l'Ècriture de fonctions
#	Exercice : 5.1
#	Fichier  : Exercice1.java
#	Class    : Exercice1
*/

public class Exercice5_1 {

	public static void main(String[] args) {
		choixBoisson();
		nbrDeSucres();
	}
	
	static public String choixBoisson() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Souhaitez-vous un café ou un thé ?");
		String boissonChaude = sc.toString();
		String choixBoisson = boissonChaude;
		if (choixBoisson == "thé") {
			String the = choixBoisson;
			System.out.println("Vous avez choisi du "+the);
		} else {
			String cafe = choixBoisson;
			System.out.println("Vous avez choisi du "+cafe);
		}
		sc.close();
		return choixBoisson;
	}

	static public int nbrDeSucres() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Combien voulez-vous rajouter de sucre(s) ? ");
		int totalSucres = sc.nextInt();
		System.out.println("Vous souhaitez " + totalSucres + " sucres dans votre boisson chaude");
		sc.close();
		return totalSucres;
	}
}
