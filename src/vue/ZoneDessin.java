package vue;

import java.awt.Graphics2D;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JPanel;

import controleur.ControleurCercle;
import controleur.ControleurRectangle;
import controleur.ControleurSouris;
import modele.Cercle;
import modele.Forme;
import modele.Plateau;
import modele.Rectangle;
import util.observer.EcouteurModele;

public class ZoneDessin extends JPanel implements EcouteurModele {

	private static final long serialVersionUID = 1L;
	public final static int MODE_RECTANGLE = 0;
	public final static int MODE_CERCLE = 1;

	private ControleurRectangle ctrlRect;
	private ControleurCercle ctrlCerc;
	private ControleurSouris ctrlActif;
	private AbstractFormeViewFactory formeFactory = new FormeViewFactoryBasic();
	private HashMap<Forme,FormeView> formeView = new HashMap<Forme, FormeView>();

	public ZoneDessin (Plateau plateau) {
		super();
		for ( Forme f : plateau.getListeObstacles() ) {
			if ( f instanceof Rectangle) {
				Rectangle r = (Rectangle)f;
				formeView.put(f, formeFactory.getVueRect(r));
			}
			else {
				Cercle c = (Cercle)f;
				formeView.put(f, formeFactory.getVueCercle(c));
			}
		}
		this.ctrlRect = new ControleurRectangle(this);
		this.ctrlCerc = new ControleurCercle(this);
		this.ctrlActif = this.ctrlRect;
		this.addMouseListener(this.ctrlActif);
	}

	public void setMode(int mode) {
		switch(mode) {
			default :
				this.ctrlActif = this.ctrlRect;
				System.out.println("defaut");
				break;
			case 0 : 
				this.ctrlActif = this.ctrlRect;
				System.out.println("rectangle");
				break;
			case 1 : 
				this.ctrlActif = this.ctrlCerc;
				System.out.println("cercle");
				break;
		}
	}

	@Override
	public void changement(Object source) {
		repaint();
	}
	
	public void paintComponent(Graphics2D g) {
		for(Map.Entry<Forme, FormeView> entry : this.formeView.entrySet()) {
		    Forme key = entry.getKey();
		    FormeView value = entry.getValue();
		    value.paint(g);

		}
	}

}
