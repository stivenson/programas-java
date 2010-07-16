import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

 class Utilizacion_Jlabel extends JFrame{
   private JLabel etiqueta1, etiqueta2;

    public Utilizacion_Jlabel(){

      super("Prueba de etiquetas");
      Container c = getContentPane();
      c.setLayout(new FlowLayout() );

      //Construccion de JLabel con argumentos tipo cadena, Icon
      // y de alineacion

       etiqueta1 = new JLabel("Etiqueta con texto");
       etiqueta1.setToolTipText("Etiqueta uno");
       c.add(etiqueta1);

       Icon imagen = new ImageIcon("imagen.png");
       etiqueta2 = new JLabel("Etiqueta con texto e imagen en la parte inferior",SwingConstants.LEFT);
       etiqueta2.setToolTipText("Esta es la etiqueta2");
       c.add(etiqueta2);

       setSize(275,170);
       show();

   }
   public static void main(String[]args){
      Utilizacion_Jlabel frm=new Utilizacion_Jlabel();
      frm.addWindowListener(
        new WindowAdapter(){

             public void windowClosing(WindowEvent e){
                System.exit(0);
             }

            }
      );
   }

}
