package vue;

import modele.Cercle;
import modele.Rectangle;

public class FormeViewFactoryBasic extends AbstractFormeViewFactory{

	@Override
	public FormeView getVueRect(Rectangle rect) {
		return new FormeRectangleBasic(rect);
	}

	@Override
	public FormeView getVueCercle(Cercle cercle) {
		return new FormeCercleBasic(cercle);
	}

}
