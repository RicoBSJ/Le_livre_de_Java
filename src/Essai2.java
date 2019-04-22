import static algorea.Robot.*;

class Main {
	public static void main(String[] args) {
		for (int loop = 1; loop <= 4; loop = loop + 1) {
			for (int loop1 = 1; loop1 <= 9; loop1 = loop1 + 1) {
				haut();
			}
			droite();
			for (int loop1 = 1; loop1 <= 9; loop1 = loop1 + 1) {
				bas();
			}
			droite();
		}
		for (int loop2 = 1; loop2 <= 9; loop2 = loop2 + 1) {
			haut();
		}
		droite();
		for (int loop3 = 1; loop3 <= 9; loop3 = loop3 + 1) {
			bas();
		}
		for (int loop4 = 1; loop4 <= 9; loop4 = loop4 + 1) {
			gauche();
		}
	}
}