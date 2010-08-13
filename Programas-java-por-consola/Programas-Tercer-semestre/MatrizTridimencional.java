/**
 * @(#)MatrizTridimencional.java
 *
 *
 * @author 
 * @version 1.00 2010/8/6
 */

public class MatrizTridimencional{
    
   
    
   static int[][][] MT=new int[3][4][3];
   static String[] CIUDADES={"Cucuta", "Bogota", "Medellin"};
   static String[] MARCAS={"toyota","chevrolet","Mercedes"};
   static String[] AÑOS={"2006","2007","2008","2009"};
   
   public static void main(String[] args){
   	
     llenarConAleatorios();
    
     /////impresion de todos los cuadros///
     for(int i=0;i<AÑOS.length;i++)		 //	
     Imprimir(AÑOS[i],i);//
     //////////////////////////////////////
     
     System.out.println("total de carros "+MARCAS[0]+" en el "+AÑOS[3]+" = "+Sumatorias(0,3,0,1,3)); 
     double prom=Sumatorias(0,0,1,2,4)/4;		
     System.out.println("Promedio de carros "+MARCAS[1]+" de "+CIUDADES[0]+" = "+prom);
     System.out.println("Ciudad con mayor venta en el "+AÑOS[2]+" = "+(CIUDADES[Indice_Mayor_Venta()]));
     ////punto propuesto////
     Pedir_Un_Dato();
   }
   
   
 ////////////////METODO PARA LLENAR LA MATRIZ TRIDIMENCIONAL//////////////////////////////////////////////  
 public static void  llenarConAleatorios(){
    	for(int x=0;x<3;x++)
    		for(int y=0;y<4;y++)
    			for(int z=0;z<3;z++)
    				MT[x][y][z]=(int)(Math.random()*9)+1;
 }
    
   
    

///////////////////// METODO UTILIZADO POR LOS DOS PRIMEROS PUNTOS //////////////////////////////////////////////    
public static int Sumatorias(int x, int y, int z,int indiceVariable,int ultimoIndice){
    int s=0;
    for(int i=0;i<ultimoIndice;i++){
    	switch(indiceVariable){
        case 1: s=s+MT[i][y][z];	break;
        case 2: s=s+MT[x][i][z];	break;
        case 3: s=s+MT[x][y][i];	break;
        }
    }
    return s;
}
    
///////////////// CIUDAD CON MAYOR VENTA EN EL TERCER AÑO ///////////////////////////////////////////////////////    
public static int Indice_Mayor_Venta(){
    	int cambiar=0,s=0,mayor=0,indiceMayor=-1;
    	
    	for(int i=0;i<CIUDADES.length;i++){
    	    for(int u=0;u<MARCAS.length;u++){
    	   	s=s+MT[i][2][u];
    	   	}
    	    if(s>mayor){
    	    indiceMayor++;	
    	    mayor=s;
    	    }
    	 s=0;	   	
    	}
     return indiceMayor;
}
////////////////////////////////////////////////////////////////////////////////////////////////////////////////  
/////////////////////////////// IMPRESION DE TODOS LOS CUADROS ///////////////////////////////////////////////////   
public static void Imprimir(String año,int indiceAño){
    	System.out.print("          ********* "+año+" **************\n");
    	System.out.print("          ");
    	for(int i=0;i<CIUDADES.length;i++)
    		System.out.print(CIUDADES[i]+"\t");
    		System.out.print("\n");
    	for(int i=0;i<MARCAS.length;i++){
    		 System.out.print(MARCAS[i]);	
    		 tabulaciones(MARCAS[i]);
    		for(int u=0;u<MT[i][indiceAño].length;u++)
    		  System.out.print(MT[u][indiceAño][i]+"          ");	
    		  System.out.print("\n");
    	}
      System.out.print("\n\n");   			
}
    
public static void tabulaciones(String p){
    int espacio=10-p.length();	
    for(int i=0;i<espacio;i++)
    	System.out.print(" ");
}	

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////// PUNTO PROPUESTO ///////////////////////////////////////////////////
   
public static void Pedir_Un_Dato(){
    int x=Pedir_Indice_de("CIUDAD",CIUDADES);
    int y=Pedir_Indice_de("AÑO",AÑOS);
    int z=Pedir_Indice_de("MARCA",MARCAS);
    System.out.println("En la ciudad de "+CIUDADES[x]+" en el año "+AÑOS[y]+" se vendio "+MT[x][y][z]+" "+MARCAS[z]);
}
    
public static int Pedir_Indice_de(String Dato,String Matriz[]){
    	System.out.println("SELECCIONE "+Dato+": ");
    	ImprimirMenus(Matriz);
    	return (Leer.leerint()-1);
}
    
public static void ImprimirMenus(String Palabras[]){
    for(int i=0;i<Palabras.length;i++)
    	System.out.println((i+1)+". "+Palabras[i]);		
}  
 ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
 ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////   
  }
  
  
