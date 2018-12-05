package controleur;

import java.awt.Point;
import java.awt.event.MouseEvent;

import vue.ZoneDessin;

public class ControleurCercle extends ControleurSouris{
	
	private ZoneDessin zoneDessin;
	private Point centre;
	private Point p2;
	
	public ControleurCercle(ZoneDessin zoneDessin) {
		this.zoneDessin = zoneDessin;
		this.centre = new Point(0,0);
		this.p2 = new Point(0,0);
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		System.out.println("Mouse Pressed");
		this.centre.setLocation(arg0.getX(), arg0.getY());
				
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		System.out.println("Mouse Released");
		this.p2.setLocation(arg0.getX(), arg0.getY());		
	}

	@Override
	public void mouseDragged(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
