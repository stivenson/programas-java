/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author stivenson
 */

 // Demostración de los eventos de pulsación de tecla.
 import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class demoteclas extends JFrame implements KeyListener {
  private String linea1 = "", linea2 = "", linea3 = "";
  private int codigo=0;
  private JTextArea areaTexto;

   // configurar GUI
   public demoteclas()
   {
       super( "Demostración de eventos de pulsación de tecla" );

       // establecer objeto JTextArea
       areaTexto = new JTextArea( 10, 15 );
       areaTexto.setText( "Oprima cualquier tecla en el teclado..." );
       areaTexto.setEnabled( false );
       areaTexto.setDisabledTextColor( Color.blue );
       getContentPane().add( areaTexto );

       addKeyListener( this );  // permitir al marco procesar eventos de teclas

       setSize( 350, 100 );
       setVisible( true );

    } // fin del constructor de DemoTeclas

    // manejar evento de pulsación de cualquier tecla
    public void keyPressed( KeyEvent evento )
    {
       linea1 = "Se oprimió tecla: " + evento.getKeyText( evento.getKeyCode() );
       codigo =(int)(evento.getKeyText( evento.getKeyCode() )).charAt(0);
       establecerLineas2y3( evento );
    }

    // manejar evento de liberación de cualquier tecla
    public void keyReleased( KeyEvent evento )
    {
       linea1 = "Se soltó tecla: " + evento.getKeyText( evento.getKeyCode() );
       establecerLineas2y3( evento );
    }

    // manejar evento de pulsación de una tecla de acción
    public void keyTyped( KeyEvent evento )
    {
       linea1 = "Se escribió tecla: " + evento.getKeyChar();
       establecerLineas2y3( evento );
    }

    // establecer segunda y tercera líneas de salida
    private void establecerLineas2y3( KeyEvent evento )
    {
       linea2 = "Esta tecla " + ( evento.isActionKey() ? "" : "no " ) +
          "es una tecla de acción";

       String temp = evento.getKeyModifiersText( evento.getModifiers() );

       linea3 = "Teclas modificadoras oprimidas: " +
          ( temp.equals( "" ) ? "ninguna" : temp );

       areaTexto.setText( linea1 + "\n" + linea2 + "\n" + linea3 + "\n" +"codigo: "+codigo+"\n");
    }

    public static void main( String args[] )
    {
       demoteclas aplicacion = new demoteclas();
       aplicacion.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
    }

 } // fin de la clase DemoTeclas


