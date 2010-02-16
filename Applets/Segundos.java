/**
 * @(#)Segundos.java
 *
 *
 * @author Stivenson Rincon Mora
 * @version 1.00 2010/2/16
 */

import java.awt.*;
import java.awt.event.*;

public class Segundos extends java.applet.Applet implements ActionListener {
    Label Segundos,horas,minutos,segundos;
    TextField SE,H,M,S;
    Button calcular;
    
    public Segundos(){
    Segundos =new Label("Escriba sus segundos");
    SE=new TextField(5);
    calcular=new Button("calcular");
    horas =new Label("Total horas");
    H=new TextField(5);
   	minutos =new Label("Total minutos");
   	M=new TextField(5);
   	segundos =new Label("Total segundos");
   	S=new TextField(5);
   	add(Segundos);
   	add(SE);
   	add(calcular);
   	calcular.addActionListener(this);
   	add(horas);
   	add(H);
   	add(minutos);
   	add(M);
   	add(segundos);
   	add(S);
    }

  public void actionPerformed(ActionEvent ae){
  	int Segundos_Entero=0;
  	Segundos_Entero=Integer.parseInt(SE.getText());
    int horas=(int)(Segundos_Entero/3600);
  	int minutos=(int)((Segundos_Entero%3600)/60);
  	int segundos=(int)(((Segundos_Entero%3600)%60)%60);
  	H.setText(String.valueOf(horas));
  	M.setText(String.valueOf(minutos));
  	S.setText(String.valueOf(segundos));
  	
  }
}