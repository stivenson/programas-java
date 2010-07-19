
import java.awt.Image;
import javax.swing.ImageIcon;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author stivenson
 */

public class ObjetosImagen{
  private static Image[] imagen=new Image[90];
  private static Image[] imagenP=new Image[90];

  public ObjetosImagen(){
    //realizar la asignacion una por una
    imagen[65] = new ImageIcon(getClass().getResource("A.png")).getImage();
    imagenP[65]= new ImageIcon(getClass().getResource("AP.png")).getImage();
    imagen[66] = new ImageIcon(getClass().getResource("B.png")).getImage();
    imagenP[66]= new ImageIcon(getClass().getResource("BP.png")).getImage();
    }

   public static Image ObtenerObjetoImagen(int indice){
        return imagen[indice];
    }

   public static Image ObtenerObjetoImagenP(int indice){
     return imagenP[indice];

   }
 
}

