package modele;

import java.awt.Point;

import util.observer.AbstractModeleEcoutable;

public abstract class Forme extends AbstractModeleEcoutable {
	
	public abstract boolean deplacer(Point pointDepart, Point pointArrive);
	
	public abstract String getNomClasse();
	
}
