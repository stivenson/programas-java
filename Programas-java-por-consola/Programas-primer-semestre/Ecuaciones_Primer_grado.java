/**
 * @(#)Ecuaciones_Primer_grado.java
 *
 *
 * @author Stivenson
 * @version 1.00 2010/1/4
 */

public class Ecuaciones_Primer_grado {
        
    /**
     * Creates a new instance of <code>Ecuaciones_Primer_grado</code>.
     */
    public Ecuaciones_Primer_grado() {
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
      System.out.println("Escriba su ecuacion: ");
      String ecu=Leer.leercadena();
      
      for(int i=0;i<1000;i++){
      String CambioIncognita=Reemplazo(i,ecu);	
      String izquierda= CambioIncognita.substring(0,CambioIncognita.indexOf("="));	
      }
      
      
     
      
    }
    
    public static String Reemplazo(int indice, String expresion){
    return  expresion.replace('x',String.valueOf(indice).charAt(0));	
    }
    
    public double Resultado(String expresionSinIgualacion){
    	double acumula=1;
    	for(int i=0;i<expresionSinIgualacion.length();i++){
    	if(Signo(expresionSinIgualacion.charAt(i))==false)
    	acumula=acumula*Integer.parseInt(String.valueOf(expresionSinIgualacion.charAt(i)));
    	else{
    		if (i==0)
    		   		
    	}
    			
    	}
    }
    
    private static boolean Signo(char caracter){
      if(caracter=='+'||caracter=='-'|| caracter=='*'||caracter=='/')
      	return true;
      	else
      	return false;		
    }
    
    }