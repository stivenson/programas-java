/**
 * @(#)Conversion_lectura_datos.java
 *
 *
 * @author Stivenson Rincon Mora
 * @version 1.00 2010/2/12
 */

import java.awt.*;
import java.awt.event.*;

public class Conversion_lectura_datos extends java.applet.Applet implements ActionListener {
	Label L1,L2;
    TextField grados;
    TextField farenheid;
    Button convertir;
    
    public Conversion_lectura_datos(){
    L1=new Label("Centrigados");	
    grados=new TextField(5);
    L2=new Label(" Farenheid");	
    farenheid=new TextField(5);
    convertir=new Button("Convertir");	
    convertir.addActionListener(this);
    add(L1);	
    add(grados);
    add(L2);
    add(farenheid);
    add(convertir);
    }
    public void actionPerformed(ActionEvent ae){
    	double Convertido=Double.parseDouble(grados.getText())*1.8+32;	
    	farenheid.setText(String.valueOf(Convertido));
     }

   
}