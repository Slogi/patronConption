package vue;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Menu extends JMenuBar{

	private static final long serialVersionUID = 1L;
	
	public Menu (ZoneDessin zoneDessin) {
		
		super();
        JMenu menu;
        JMenuItem item;

        menu = new JMenu("Creation");
        item = new JMenuItem("Rectangle");
        item.addActionListener(
            new ActionListener() {
            @Override
                public void actionPerformed(ActionEvent e) {

            		zoneDessin.setMode(ZoneDessin.MODE_RECTANGLE);
                }                
            }
        );
        menu.add(item);
        item = new JMenuItem("Cercle");
        item.addActionListener(
            new ActionListener() {
            @Override
                public void actionPerformed(ActionEvent e) {

            		zoneDessin.setMode(ZoneDessin.MODE_CERCLE);
                }                
            }
        );
        menu.add(item);
        
        add(menu);
        
        
	}

}
