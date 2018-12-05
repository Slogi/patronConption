package General;

import modele.Plateau;
import vue.FenetreJeu;

public class Jeu {

	public static void main(String[] args) {
		
		Plateau plateau = new Plateau(100);
		FenetreJeu fenetre = new FenetreJeu(plateau);
	}

}
