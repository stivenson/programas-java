

public class Recorrido_Matriz_En_Verticales_2 {
        
  
    public static void main(String[] args) {
         int M[][]=new int[4][4];
    llenarMatriz(M);
    ImprimirMatriz(M);
    System.out.print("Recorrido: ");	
     for(int a=3;a>-1;a--)
     {
      if(!(a%2==0))	
      for(int e=3;e>-1;e--)
      System.out.print(M[e][a]+"\t");
      else
      for(int e=0;e<4;e++)
      System.out.print(M[e][a]+"\t");			
     }
    }
    
     ////metodos////
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
