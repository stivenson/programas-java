import java.awt.*;
import java.applet.*;
import java.awt.event.*;
 
// <applet width="150" height="200" code="MouseEvents"></applet>
 class EventosRaton extends Applet implements MouseListener,MouseMotionListener {
   String msg = "";
   int mouseX = 0;
   int mouseY = 0;
   
   public void init() {
   	addMouseListener(this);  // se a�ade el escuchador del rat�n 
//a este applet
addMouseMotionListener(this); // se a�ande el escuchador del movimiento 
//  del raton a este applet
   }
   
   // cuando se da un clic en el rat�n
   public void mouseClicked(MouseEvent me) {
   	mouseX = 0;
   	mouseY = 10;
   	msg = "Rat�n Oprimido";
   	repaint();
   }
 
   // cuando el rat�n entra
   public void mouseEntered(MouseEvent me) {
   	mouseX = 0;
   	mouseY = 10;
   	msg = "Rat�n Entra";
   	repaint();
   }
   
   // cuando sale el rat�n
   public void mouseExited(MouseEvent me) {
   	mouseX = 0;
   	mouseY = 10;
   	msg = "Rat�n Sale";
   	repaint();
   }
 
   // cuando se presiona el rat�n
   public void mousePressed(MouseEvent me) {
   	mouseX = me.getX();     // se toma el valor de la coordenada de x
   	mouseY = me.getY();     // se toma el valor de la coordenada de y
   	msg = "Abajo";
   	repaint();
   }
 
   // cuando se libera el rat�n
   public void mouseReleased(MouseEvent me) {
   	mouseX = me.getX();
   	mouseY = me.getY();
   	msg = "Arriba";
   	repaint();
   }
 
   // cuando se arrastra el rat�n
   public void mouseDragged(MouseEvent me) {
   	mouseX = me.getX();
   	mouseY = me.getY();
   	msg = "*";
   	showStatus("Moviendo el raton en " + mouseX + "," + mouseY);
   	repaint();
   }
 
   // moviendo el rat�n
   public void mouseMoved(MouseEvent me) {
   	showStatus("Moviendo el raton en " + mouseX + "," + mouseY);
   }
   
   // desplegando el mensaje en el applet
   public void paint(Graphics g) {
   	g.drawString(msg, mouseX, mouseY);
   }
}

