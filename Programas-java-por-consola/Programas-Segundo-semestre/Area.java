/**
 * @(#)Area.java
 *
 *
 * @author Stivenson Rincon Mora
 * @version 1.00 2010/2/17
 */

public class Area {
        
    /**
     * Creates a new instance of <code>Area</code>.
     */
    public Area() {
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {	
     int[] vaT=new int[3];
     int[] vaR=new int[3];
     int vaC,vaCU,vaRO;			
     System.out.print("Escriba los lados del triangulo separados por coma: "); 
     StringBuffer lT=new StringBuffer(Leer.leercadena());
     System.out.print("Escriba los dos lados contiguos del rectangulo separados por coma: "); 
     StringBuffer lR=new StringBuffer(Leer.leercadena());
     System.out.print("Escriba el diametro del circulo: "); 
     vaC=Leer.leerint();
     System.out.print("Escriba el lado del cuadrado: "); 
     vaCU=Leer.leerint();
     
     System.out.print("Escriba el lado del rombo: "); 
     vaRO=Leer.leerint();
     lT.append(',');lR.append(",0,");
     for(int i=0; i<3;i++){
     vaT[i]=Integer.parseInt(lT.substring(0,lT.indexOf(",")).trim());
     vaR[i]=Integer.parseInt(lR.substring(0,lR.indexOf(",")).trim());
     lT.delete(0,lT.indexOf(",")+1);
     lR.delete(0,lR.indexOf(",")+1);
     }
     double pt= (vaT[0]+ vaT[1]+ vaT[2])/2; 
     System.out.println("Area del triangulo: "+(Math.pow(pt*(pt-vaT[0])*(pt-vaT[1])*(pt-vaT[2]),0.5)));
     System.out.println("Area del Circulo: "+(Math.PI*Math.pow(vaC/2,2))); 
     System.out.println("Area del Cuadrado: "+(vaCU*vaCU));
     System.out.println("Area del Rectangulo: "+(vaR[0]*vaR[1]));
     System.out.println("Area del Rombo: ");	 
    }
}
