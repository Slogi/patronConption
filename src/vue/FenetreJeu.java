package vue;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;

import modele.Plateau;

public class FenetreJeu extends JFrame {
	
	private static final long serialVersionUID = 1L;
	private Menu menu;
	private ZoneDessin zoneDessin;
	private ZoneAffichage zoneAffichage;
    private int longueurFenetre =850;
    private int hauteurFenetre  =600;

    public FenetreJeu(Plateau plateau) {
    	
    	super();
    	setLayout(new BorderLayout());
    	this.zoneDessin = new ZoneDessin(plateau);
    	this.menu = new Menu(this.zoneDessin);
    	setJMenuBar(this.menu);
    	this.zoneAffichage = new ZoneAffichage();
    	add(this.zoneDessin, BorderLayout.CENTER);
    	add(this.zoneAffichage, BorderLayout.EAST);
        setTitle("Projet Java");
        setSize(longueurFenetre, hauteurFenetre);
        setLocationRelativeTo(null);
        setBackground(Color.yellow);
        setVisible(true);

    }
}
