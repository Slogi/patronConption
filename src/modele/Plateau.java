package modele;

import java.util.ArrayList;



import java.awt.Point;

public class Plateau {
	
	int largeurPlateau = 850;
	int hauteurPlateau = 600;
	private ArrayList<Forme> listeObstacles = new ArrayList<>();
	private ArrayList<Forme> listeFormesPerso = new ArrayList<>();
	
	public Plateau (int nombreFormes) {
		while(listeObstacles.size()<nombreFormes) {
			creerObstacles();
		}
		afficherListeObstacles();
		
		
		

	}
	
	public void ajouterObstacles(Forme forme) {
		this.listeObstacles.add(forme);
	}
	
	public void ajouterFormesPerso (Forme forme) {
		this.listeFormesPerso.add(forme);
	}
	
	public void creerObstacles() {
		double r = Math.random();
		if(r<0.5) r=1;
		else r =2;
		switch ((int)r) {
        case 1:  // creation rectangle
        	int x1Alea = 0;
        	int x2Alea = 0;
        	int y1Alea = 0;
        	int y2Alea = 0;
        	do {
        		x1Alea = 0 + (int)(Math.random() * ((largeurPlateau - 0) + 1));
            	y1Alea = 0 + (int)(Math.random() * ((hauteurPlateau - 0) + 1));
            	     //Point p1 = new Point(x1Alea,y1Alea);
            	     
            	x2Alea = 0 + (int)(Math.random() * ((largeurPlateau - 0) + 1));
            	y2Alea = 0 + (int)(Math.random() * ((hauteurPlateau - 0) + 1));
            	     //Point p2 = new Point(x2Alea,y2Alea);
        	}while((x1Alea == x2Alea) || (y1Alea ==y2Alea));
        	
        	
        	
        	
        	
        	
        	//System.out.println("x1alea = " + x1Alea);
        	//System.out.println("y1alea = " + y1Alea);
        	//System.out.println("x2alea = " + x2Alea);
        	//'System.out.println("y2alea = " + y2Alea);
        	
        	Point supGauche = null;
        	Point infDroit = null;
        	
        	     
        	if(x1Alea<x2Alea && y1Alea<y2Alea) {
        		supGauche = new Point(x1Alea, y1Alea);
        	    infDroit = new Point(x2Alea, y2Alea);
        	}
        	     
        	else if(x1Alea>x2Alea && y1Alea>y2Alea) {
        		supGauche = new Point(x2Alea, y2Alea);
            	infDroit = new Point(x1Alea, y1Alea);
            }
        	    	 
            else if(x1Alea<x2Alea && y1Alea>y2Alea) {
            	supGauche = new Point(x1Alea, y2Alea);
            	infDroit = new Point(x2Alea, y1Alea);
        	}
        	     
            else  {
            	supGauche = new Point(x2Alea, y1Alea);
            	infDroit = new Point(x1Alea,y2Alea);
            }
            if(supGauche != null && infDroit!= null) {
            	if(listeObstacles.size() == 0) {
            		ajouterObstacles(new Rectangle(supGauche, infDroit));
            	}
            	else if(verifCollisionObstaclesRectangle(supGauche, infDroit)) {
            		ajouterObstacles(new Rectangle(supGauche, infDroit));
            	}
            }
            else {
            	System.out.println("erreur");
            }
        	
        	     
        	     // foreach des obstacles + verif collision en fonction du type d'obstacle
        	break;
                 
        case 2: // creation cercle
        break;
		}
	}
	
	public boolean verifCollisionObstaclesRectangle(Point supGauche, Point infDroit) {
		for(Forme f : listeObstacles) {
			if(f instanceof Rectangle) {	// to do strategie
				Rectangle r = (Rectangle)f;
				if((supGauche.x > r.getSupGauche().getX() && supGauche.x < r.getInfDroit().getX()) && 
						(supGauche.y > r.getSupGauche().getY() && supGauche.y < r.getInfDroit().getY())) {
					return false;
				}
				if((infDroit.x > r.getSupGauche().getX() && infDroit.x < r.getInfDroit().getX()) 
						&& (infDroit.y > r.getSupGauche().getY() && infDroit.y < r.getInfDroit().getY())) {
					return false;
				}
				if( (supGauche.x < r.getInfDroit().getX() && supGauche.y < r.getInfDroit().getY()) 
						&& (infDroit.x > r.getSupGauche().x && infDroit.y > r.getSupGauche().getY())) {
					return false;
				}
			}
		}
		return true;
	}
	
	public void afficherListeObstacles() {
		System.out.println(listeObstacles);
	}
	
	public ArrayList<Forme> getListeObstacles() {
		return listeObstacles;
	}

	public void setListeObstacles(ArrayList<Forme> listeObstacles) {
		this.listeObstacles = listeObstacles;
	}
	
	/*
	public boolean verifCollision (Point supgauche, Point infdroit) { // Au moins un des deux points est en dehors du plateau
		if( supgauche.getX()<0 || supgauche.getY()<0 || infdroit.getX()<0 || infdroit.getY()<0 || 
				supgauche.getX()>largeurPlateau || supgauche.getY()>hauteurPlateau || infdroit.getX()>largeurPlateau || infdroit.getY()>hauteurPlateau) 
			return false;
	
		for(Forme f : listeObstacles) {
			if( supgauche.getX()>f )
				return false;
		}
		
		
		
		else return true;
	}*/
}
