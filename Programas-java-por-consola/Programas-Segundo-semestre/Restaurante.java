/**
 * @(#)Restaurante.java
 *
 *
 * @author Stivenson Rincón Móra
 * @version 1.00 2010/2/18
 */

public class Restaurante {
        
  
    public static void main(String[] args) {
    	int Px=0,Py=0;
        System.out.print("Cantidad de platos X= ");
        Px=Leer.leerint();
        System.out.print("Cantidad de platos Y= ");
        Py=Leer.leerint();
        System.out.print("Descuento= ");
        double d=Leer.leerint();
        int ValorP=(Px*4500)+(Py*3800);
        if(Px+Py>3)
        System.out.println("Total: "+(ValorP-((Px*(4500*(d/100)))+(Py*(3800*(d/100))))));	
        else
        System.out.println("Total: "+ValorP);
        System.out.println("Platos comprados: "+(Px+Py)); 
         	 	
        
        
    }
}
