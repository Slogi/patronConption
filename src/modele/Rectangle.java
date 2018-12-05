package modele;

import java.awt.Point;

public class Rectangle extends Forme{

	private Point supGauche;
	private Point infDroit;
	
	public Point getSupGauche() {
		return supGauche;
	}

	public void setSupGauche(Point supgauche) {
		this.supGauche = supgauche;
	}

	public Point getInfDroit() {
		return infDroit;
	}

	public void setInfDroit(Point infdroit) {
		this.infDroit = infdroit;
	}

	public Rectangle(Point supGauche, Point infDroit) {
		this.supGauche = supGauche;
		this.infDroit = infDroit;
	}
	
	
	
	@Override
	public String toString() {
		return "Rectangle [supGauche=" + supGauche + ", infDroit=" + infDroit + "]\n";
	}

	@Override
	public boolean deplacer(Point pointDepart, Point pointArrive) {/*
		if (true ) { // TO DO - Remplacer true par la vérification du déplacement
			
			Point distance = new Point ((int)(pointArrive.getX() - pointDepart.getX()), (int) (pointArrive.getY() - pointDepart.getY()));
			this.supgauche = new Point((int)(this.supgauche.getX() + distance.getX()),(int)(this.supgauche.getY()+ distance.getY()));
			this.infdroit = new Point((int)(this.infdroit.getX() + distance.getX()),(int)(this.infdroit.getY()+ distance.getY()));

		}*/
		return false;
	}

	@Override
	public String getNomClasse() {
		// TODO Auto-generated method stub
		return null;
	}

	

}
