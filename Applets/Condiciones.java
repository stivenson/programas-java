/**
 * @(#)Condiciones.java
 *
 *
 * @author Stivenson Rincon Mora
 * @version 1.00 2010/2/16
 */

import java.awt.*;
import java.awt.event.*;

public class Condiciones extends java.applet.Applet implements ActionListener{
  Label A,B;  
  TextField precio,im;
  Button calcula;
  public Condiciones(){
  A=new Label("Precio Articulo");
  precio=new TextField(10);
  calcula=new Button("Calcula");
  calcula.addActionListener(this);
  B=new Label("Impuesto a pagar");
  im=new TextField(10);	
  add(A);
  add(precio);
  add(calcula);
  add(B);
  add(im);
  
  }	

   public void actionPerformed(ActionEvent ae){
  	long p=0;
  	p=Long.parseLong(precio.getText());
    if(p < 10000)
    im.setText(String.valueOf(p*0.5));
    else
       if(p >= 10000 && p < 25000)
       	im.setText(String.valueOf(p*0.10));
       	else
       	im.setText(String.valueOf(p*0.15));		
  }

    
}