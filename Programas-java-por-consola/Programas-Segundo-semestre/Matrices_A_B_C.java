import java.util.*;

class Matrices_A_B_C{
	
	public static void main(String arg[]){
	double A[][]=new double[4][4];
	double B[][]=new double[4][4];
	double C[][]=new double[4][4];
	int indiceBfila=0,indiceBColumna=0,indiceCfila=0,indiceCColumna=0,ceros=0;
		
///llenado de matrices/////////////////////////////////
for(int b=0;b<4;b++)
     	for(int c=0;c<4;c++)
     	{
     	System.out.print("valor Matriz A [ "+b+" ][ "+c+" ] = ");	
     	A[b][c]=Leer.leerdouble();
     
     	}
     	
  for(int b=0;b<4;b++)
     	for(int c=0;c<4;c++)
     	{	
     	B[b][c]=0;
     	C[b][c]=1;
     	}   	

/////////////////////////////////////////////////////	
////////paso de valores a matrices B y C//////////////	
	
	 for(int b=0;b<4;b++)
	 {
	 
     	for(int c=0;c<4;c++)
     	{
       double n=A[b][c];
     	for(int i=2;i<=n-1;i++)///////ciclo para saber si es primo////////////////////
  	      {
  	        if(n%i==0)	
  	         {
  	         ceros++;	
  	         }
  	       }
  	       if(ceros>0 && n%2!=0 || n==1) ///si no es primo y tampoco par, ó si es 1 va en matriz C.
  	        {
  	         C[indiceCfila][indiceCColumna]=n;//ingreso valor a Matriz C.
  	  	    indiceCfila++;//incremento para pasar ala siguiente columna 
  	  	        if(indiceCfila==4)//si ya termine con la columna....
  	  	        {
  	  	        indiceCfila=0;//...empiezo otra ves desde la columna cero,
  	  	        indiceCColumna++;//pero en la fila de abajo	
  	  	        }
  	       	  	    
  	        }  	        
  	        else//// sino para matriz B.
  	        {
  	         B[indiceBfila][indiceBColumna]=n;
  	         indiceBColumna++;
  	         if(indiceBColumna==4)
  	  	        {
  	  	        indiceBColumna=0;
  	  	        indiceBfila++;	
  	  	        }		
  	         }
     	
     	  ceros=0; ///dejar en cero para comprovar el siguiente elemento  
     	}
     }
     	
 /////imprimir matrices///////////////// 
 System.out.println("Matriz A");   	
	 for(int b=0;b<4;b++){
    	for(int c=0;c<4;c++)
     	System.out.print(A[b][c]+"\t");
     	System.out.print("\n");
        }
        
    System.out.print("\n");
    System.out.println("Matriz B: primos y pares");
    for(int b=0;b<4;b++){
    	for(int c=0;c<4;c++)
     	System.out.print(B[b][c]+"\t");
     	System.out.print("\n");
        } 
        
        System.out.print("\n");
    System.out.println("Matriz C: impares que no sean primos");
    for(int b=0;b<4;b++){
    	for(int c=0;c<4;c++)
     	System.out.print(C[b][c]+"\t");
     	System.out.print("\n");
        }   
//////////////////////////////////////////////       
	}
	

   
}