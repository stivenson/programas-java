/**
 * @(#)MesDias.java
 *
 *
 * @author Stivenson Rincón Móra
 * @version 1.00 2010/2/18
 */

import java.awt.*;
import java.awt.event.*;
public class MesDias extends java.applet.Applet implements ActionListener{
   Label a,b,c,d,e;
   TextField at,bt,ct,dt,et;
   Button  ca;
   public MesDias(){
   	a=new Label("Año");
   	at=new TextField(3);
   	b=new Label("Dias");
   	bt=new TextField(3);
   	ca=new Button("Convertir");
   	c=new Label("Año");
   	ct=new TextField(3);
   	d=new Label("Mes");
   	dt=new TextField(3);
   	e=new Label("Dias");
   	et=new TextField(3);
   	add(a);
   	add(at);
   	add(b);
   	add(bt);
   	add(ca);
   	ca.addActionListener(this);
   	add(c);
   	add(ct);
   	add(d);
   	add(dt);
    add(e);
    add(et);
   }  
  public void actionPerformed(ActionEvent ae){
  dt.setText(" ");
  et.setText(" ");
  ct.setText(at.getText());
  int dias=Integer.parseInt(bt.getText().trim());	
  int mes=0,dia=0;	
    while(dias>=30){
  	mes++;
    dias=dias-30;
    }	
    while(dias>0){
  	dia++;
    dias=dias-1;
    }
    dt.setText(String.valueOf(mes));
    et.setText(String.valueOf(dia));
    	
  }
}