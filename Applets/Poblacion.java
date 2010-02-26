/**
 * @(#)Poblacion.java
 *
 *
 * @author Stivenson Rincón Móra
 * @version 1.00 2010/2/25
 */

import java.awt.*;
import java.awt.event.*;

public class Poblacion extends java.applet.Applet implements ActionListener {
    Label la,lb,lc;
    TextField a,b;
    Button simular;
    TextArea r;
    
    public Poblacion(){
    la =new Label("Poblacion inicial ");
    a=new TextField(10);
    lb=new Label("% aumento diario");
    b=new TextField(10);
    simular=new Button("Simular");
    lc=new Label("Resultado de la simulacion");
    r=new TextArea(5,30);
   	add(la);
   	add(a);
   	add(lb);
    add(b);
   	add(simular);
   	simular.addActionListener(this);
    add(lc);
    add(r);
    }

  public void actionPerformed(ActionEvent ae){
  	
  	double pinicial=Double.parseDouble(a.getText());
  	double aumento=Double.parseDouble(b.getText());
  	double ConAumento=pinicial+(pinicial*(aumento/100));
  	String imprimir=""; 
  	int i=1;
     while(ConAumento <=(pinicial+pinicial)){
     	r.append("dia "+i+" poblacion "+ConAumento+"\n");
        ConAumento=ConAumento+(ConAumento*(aumento/100));	
       	i++;
     }
     	r.append("dia "+i+" poblacion "+ConAumento+"\n");
  	
  }
}