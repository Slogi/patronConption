package controleur;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public abstract class ControleurSouris implements MouseMotionListener, MouseListener {
		
	public abstract void mouseClicked(MouseEvent arg0);

	public abstract void mouseEntered(MouseEvent arg0);

	public abstract void mouseExited(MouseEvent arg0);

	public abstract void mousePressed(MouseEvent arg0);

	public abstract void mouseReleased(MouseEvent arg0);

	public abstract void mouseDragged(MouseEvent arg0);

	public abstract void mouseMoved(MouseEvent arg0);

}
