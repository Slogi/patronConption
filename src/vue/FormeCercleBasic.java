package vue;

import java.awt.Graphics2D;

import modele.Cercle;

public class FormeCercleBasic extends FormeView{
	
	private int x;
	private int y;
	private int width;
	private int height;

	public FormeCercleBasic(Cercle cercle) {
		
		this.x = (int)(cercle.getCentre().getX() - (cercle.getRayon()/2));
		this.y = (int)(cercle.getCentre().getY() - (cercle.getRayon()/2));
		this.width = (int) cercle.getRayon();
		this.height = (int) cercle.getRayon();
	}
	
	@Override
	public void paint(Graphics2D g) {
		  g.fillOval(this.x,this.y, this.width, this.height);
	}
}