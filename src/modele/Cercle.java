package modele;

import java.awt.Point;

public class Cercle extends Forme{
	
	private Point centre;
	private double rayon;
	
	public Cercle (Point centre, double rayon) {
		
		this.centre = centre;
		this.rayon = rayon;
	}
	@Override
	public boolean deplacer(Point pointDepart, Point pointArrive) {
		if (true ) { // TO DO - Remplacer true par la vérification du déplacement
			
			Point distance = new Point ((int)(pointArrive.getX() - pointDepart.getX()), (int) (pointArrive.getY() - pointDepart.getY()));
			this.centre = new Point((int)(this.centre.getX() + distance.getX()),(int)(this.centre.getY()+ distance.getY()));
			//this.pointRayon = new Point((int)(this.pointRayon.getX() + distance.getX()),(int)(this.pointRayon.getY()+ distance.getY()));

		}
		return false;
	}
	
	public void setRayon(double r)
	{
		this.rayon=r;
		this.fireChangement();
	}
	@Override
	public String getNomClasse() {
		return "Cercle";
	}
	public Point getCentre() {
		return centre;
	}
	public void setCentre(Point centre) {
		this.centre = centre;
	}
	public double getRayon() {
		return rayon;
	}
	
	
	

}
