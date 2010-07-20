/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

//**
 //*
 //* @author stivenson
public class HiloColores 
{
    
 // mensaje a mostrar
public HiloColores( ) //constructor
{
  ciclo();
}
 public void ciclo(){

     for(int i=0;i<1000000;i++)
               InterfazGrafica.referenciaA.setBackground(ColorAleatorio());
    }

 public java.awt.Color ColorAleatorio(){
      int c1=(int)(Math.random()*255);
      int c2=(int)(Math.random()*255);
      int c3=(int)(Math.random()*255);
     return (new java.awt.Color(c1,c2,c3));
    }

 
}
