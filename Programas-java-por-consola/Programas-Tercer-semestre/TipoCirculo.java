/**
 * @(#)TipoCirculo.java
 *
 *
 * @author 
 * @version 1.00 2010/8/14
 */


public class TipoCirculo {

    int radio;

    public TipoCirculo(int r) {
    radio=r;	
    }
    
    public double Area(){
    	  return Math.PI*radio*radio;
    } 
    
     public double Perimetro(){
     return Math.PI*2*radio; 	
    }
    
}


class Principal{
 public static void main(String[] args){
    System.out.print("Escriba el radio del circulo: ");
    TipoCirculo unCirculo= new TipoCirculo(Leer.leerint());
    System.out.println("EL AREA ES: "+unCirculo.Area()+"\nY EL PERIMETRO ES: "+unCirculo.Perimetro()+"\n\n"); 
    
    System.out.print("Escriba el radio de otro circulo: "); 
    TipoCirculo otroCirculo= new TipoCirculo(Leer.leerint());
    System.out.println("EL AREA ES: "+otroCirculo.Area()+"\nY EL PERIMETRO ES: "+otroCirculo.Perimetro()); 	
    }	
  }