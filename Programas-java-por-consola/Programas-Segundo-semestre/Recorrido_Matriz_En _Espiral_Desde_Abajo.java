

class Recorrido_Matriz_En_Espiral_Desde_Abajo {
        
 
    public static void main(String[] args) {
    	
    	 int b=0,c=0;
     int M[][]=new int[4][4];
     llenarMatriz(M);
     ImprimirMatriz(M);
     System.out.print("Recorrido: ");
       for(int a=3;a>1;a--)
       {
       	 if(a==3)
       	 {
    
         for(b=3;b>-1;b--)
       	 System.out.print(M[a][b]+"\t");
       	 for(c=3;c>0;c--)
       	 System.out.print(M[c][b+1]+"\t");
       	 for(c=0;c<4;c++)	
       	 System.out.print(M[b+1][c]+"\t");////
       	 }
       	 else
       	 {
       	  System.out.print(M[a-1][3]+"\t");		
       	     for(b=3;b>0;b--)
       	 	 System.out.print(M[a][b]+"\t");
       	 	 for(c=1;c<3;c++)
       	 	 System.out.println(M[b+1][c]+"\t");			
       	 }
      }    
       
    }
    
     private static void llenarMatriz(int M[][]){
     for(int b=0;b<M.length;b++)
     	for(int c=0;c<M[0].length;c++)
     	{
     	System.out.print("valor Matriz [ "+b+" ][ "+c+" ] = ");	
     	M[b][c]=Leer.leerint();	
     	}	
    }
    private static void ImprimirMatriz(int M[][]){
    for(int b=0;b<M.length;b++){
    	for(int c=0;c<M[0].length;c++)
     	System.out.print(M[b][c]+"\t");
     	System.out.print("\n");
        }
    }
}
