/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author stivenson
 */
public class AnimacionLetras {


  

    public static void CambiarImagen(char Letra,boolean Presionar){
       int indice = (int)(Letra);
        if(Presionar)
        InterfazGrafica.Etiquetas[indice].setIcon(new javax.swing.ImageIcon(ObjetosImagen.ObtenerObjetoImagenP(indice)));
        else
        InterfazGrafica.Etiquetas[indice].setIcon(new javax.swing.ImageIcon(ObjetosImagen.ObtenerObjetoImagen(indice)));

    }
}

