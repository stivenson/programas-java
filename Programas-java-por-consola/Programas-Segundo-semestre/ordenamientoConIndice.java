class ordenamientoConIndice{
	public static void main(String arg[]){
		  int M[][]=new int[2][7];
		  llenarMatriz(M);
		  ImprimirMatriz(M);
		  OrdenarConIndice(M);
		  ImprimirMatriz(M);
		  
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
    
    private static void OrdenarConIndice(int M[][]){
    int aux=0;	
    for(int a=0;a<M[0].length;a++){
    	System.out.println("***");
    	  for(int e=a+1;e<M[0].length;e++){
      System.out.println("*");
      	if(M[1][a]<M[1][e]){
      	
      	aux=M[1][a];
      	M[1][a]=M[1][e];
      	M[1][e]=aux;
      	
      	aux=M[0][a];
      	M[0][a]=M[0][e];
      	M[0][e]=aux;	
      	}
      	
      	}
      	
      	
    }	
      
      }	
      
    }
/*	*/



