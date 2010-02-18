/**
 * @(#)Fecha.java
 *
 *
 * @author Stivenson Rincón Móra
 * @version 1.00 2010/2/18
 */

import java.awt.*;
import java.awt.event.*;
public class Fecha extends java.applet.Applet implements ActionListener {
    
   Label a,b,c;
   Button  ca;
   TextArea l;
   TextField d,m;
  
  public Fecha(){
  	a=new Label("Dia");
  	d=new TextField(4);
  	b=new Label("Mes");
  	m=new TextField(4);
    ca=new Button("cambiar");
    c=new Label("Fecha con letras");
    l=new TextArea(2,25);
    add(a);
    add(d);
    add(b);
    add(m);
    add(ca);
    ca.addActionListener(this);
    add(c);
    add(l);
     }
     
   public void actionPerformed(ActionEvent ae){
   	 String EnTexto="";
   	 l.setText(" ");   
   	  switch(Integer.parseInt(d.getText())){
   	   case 1:EnTexto=EnTexto+"lunes";break;
   	   case 2:EnTexto=EnTexto+"Martes";break;
   	   case 3:EnTexto=EnTexto+"Miercoles";break;
   	   case 4:EnTexto=EnTexto+"jueves";break;
   	   case 5:EnTexto=EnTexto+"viernes";break;
   	   case 6:EnTexto=EnTexto+"sabado";break;
   	   case 7:EnTexto=EnTexto+"domingo";break;	
   	   default:EnTexto=" numero dia imposible ";break;			
   	  }
   	  EnTexto=EnTexto+" de ";	
   	  
   	  switch(Integer.parseInt(m.getText())){
   	  case 1:EnTexto=EnTexto+"Enero";break;
   	   case 2:EnTexto=EnTexto+"Febrero";break;
   	   case 3:EnTexto=EnTexto+"Marzo";break;
   	   case 4:EnTexto=EnTexto+"Abril";break;
   	   case 5:EnTexto=EnTexto+"Mayo";break;
   	   case 6:EnTexto=EnTexto+"Junio";break;
   	   case 7:EnTexto=EnTexto+"Julio";break;
   	   case 8:EnTexto=EnTexto+"Agosto";break;
   	   case 9:EnTexto=EnTexto+"Septiembre";break;
   	   case 10:EnTexto=EnTexto+"Octubre";break;	
   	   case 11:EnTexto=EnTexto+"Noviembre";break;
   	   case 12:EnTexto=EnTexto+"Diciembre";break;
   	   default:EnTexto=" numero mes imposible ";break;	
   	  		
   	  }
   	
   	 l.setText(EnTexto); 
   }
 
}