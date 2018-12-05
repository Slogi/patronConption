package vue;

import java.awt.Graphics2D;

import modele.Rectangle;

public class FormeRectangleBasic extends FormeView{

	private int x;
	private int y;
	private int width;
	private int height;
	
	public FormeRectangleBasic(Rectangle rect) {
		
		this.x = (int) rect.getSupGauche().getX();
		this.y = (int) rect.getSupGauche().getY();
		this.width = rect.getInfDroit().x - this.x;
		this.height = rect.getInfDroit().y - this.y;
	}
	
	@Override
	public void paint(Graphics2D g) {
		g.drawRect(x, y, width, height);
	}
}
