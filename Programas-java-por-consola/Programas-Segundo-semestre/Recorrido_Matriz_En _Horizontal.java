

 class Recorrido_Matriz_En_Horizontal {
        
   
    public static void main(String[] args){
        int M[][]=new int[5][5];
        int pasadas=1;
    llenarMatriz(M);
    ImprimirMatriz(M);
    System.out.print("Recorrido: ");	
     for(int a=4;a>-1;a--)
     {
      if(pasadas>2 && pasadas<5)
      for(int e=4;e>-1;e--)
      System.out.print(M[a][e]+"\t");		
      else
      for(int e=0;e<5;e++)
      System.out.print(M[a][e]+"\t");	
      
     pasadas++;			
     }    
    }

    ///metodos///
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