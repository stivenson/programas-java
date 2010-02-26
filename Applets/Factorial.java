/**
 * @(#)Factorial.java
 *
 *
 * @author Stivenson Rincón Móra
 * @version 1.00 2010/2/26
 */

import java.awt.*;
import java.awt.event.*;
public class Factorial extends java.applet.Applet implements ActionListener{
    Label la,lb;
    TextField a,b;
    Button c;
    public Factorial(){
    la=new Label("Numero");
    a=new TextField(5);	
    c=new Button("CALCULAR");		
    lb=new Label("Factorial");
    b=new TextField(5);	
    	add(la);
    	add(a);
    	add(c);
    	c.addActionListener(this);
    	add(lb);
    	add(b);
    }
    
     public void actionPerformed(ActionEvent ae){
     int numero=Integer.parseInt(a.getText());
     int factorial=1;
     for(int i=1;i<=numero;i++)
     factorial=factorial*i;
     b.setText(String.valueOf(factorial));		
     }
}