/*/**
 * @(#)Conversion_lectura_datos.java
 *
 *
 * @author Stivenson Rincon Mora
 * @version 1.00 2010/2/12
*/
import java.awt.*;
import java.awt.event.*;

public class Formula_cuadratica extends java.applet.Applet implements ActionListener {
    
    TextField a;
    TextField b;
    TextField c;
    Button s;
    TextField x1;
    TextField x2,NAN;
    Label A,B,C,X1,X2;
    public Formula_cuadratica(){
    A=new Label("a");	
    a=new TextField(5);
    B=new Label("b");
    b=new TextField(5);
    C=new Label("c");
    c=new TextField(5);
    s=new Button("Solucion");
    X1=new Label("x1");	
    x1=new TextField(5);
    X2=new Label("x2");
    x2=new TextField(5);
    NAN=new TextField(20);
    add(A);
    add(a);
    add(B);	
    add(b);
    add(C);
    add(c);
    add(s);
    s.addActionListener(this);
    add(X1);
    add(x1);
    add(X2);
    add(x2);
    add(NAN);
    }
    public void actionPerformed(ActionEvent ae){
      NAN.setText(" ");	
      x1.setText(" ");
      x2.setText(" ");	
      double p1=Math.pow(Integer.parseInt(b.getText()),2);
      int cEntero=Integer.parseInt(c.getText());
      int aEntero=Integer.parseInt(a.getText());
      int bEntero=Integer.parseInt(b.getText());
      if(aEntero<=0)
      NAN.setText("Valor de a < ó = 0");
      else	
	  if(p1-(4*aEntero*cEntero)>=0)
	  {
	  double p2=-bEntero+Math.pow((p1-(4*aEntero*cEntero)),(1/2));	
	  double Rx1=p2/(2*aEntero);
	  double p3=-bEntero-Math.pow((p1-(4*aEntero*cEntero)),(1/2));
	  double Rx2=p3/(2*aEntero);
	  x1.setText(String.valueOf(Rx1));
	  x2.setText(String.valueOf(Rx2));
	  NAN.setText("Si hay solucion");
	  }	   
	  else
	  {
	  NAN.setText("Operacion < 0");
	  }
    }
  }