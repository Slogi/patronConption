package vue;

import modele.Cercle;
import modele.Forme;
import modele.Rectangle;

public abstract class AbstractFormeViewFactory {
	
	public abstract FormeView getVueRect(Rectangle f);
	public abstract FormeView getVueCercle(Cercle cercle);

}
