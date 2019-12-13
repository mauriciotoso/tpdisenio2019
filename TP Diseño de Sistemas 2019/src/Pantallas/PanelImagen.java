package Pantallas;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class PanelImagen extends JPanel {
    
     
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public  void  paintComponet(Graphics g){
        Dimension tam = getSize();
        
        ImageIcon imagen= new ImageIcon(new ImageIcon(getClass().getResource("/Pantallas/logoAseguradora.jpg")).getImage());
       g.drawImage(imagen.getImage(),0,0,tam.width,tam.height,null);
    }
}
