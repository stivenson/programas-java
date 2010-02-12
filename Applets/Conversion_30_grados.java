/**
 * @(#)miNombre.java
 *
 * @author Stivenson Rincón Móra
 * @version 1.00 2010/2/4
 */

import java.applet.Applet;
import java.awt.Graphics;

public class Conversion_30_grados extends java.applet.Applet {
	

 
    public void paint(Graphics objeto) {
    	 double EnFarenheit=(30*1.8)+32;
             objeto.drawString("Centigrados = "+"30.0"+" Farenheit = "+ EnFarenheit, 2, 60);
             
    }
}
   

