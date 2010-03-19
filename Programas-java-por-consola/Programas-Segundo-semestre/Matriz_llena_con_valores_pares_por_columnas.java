
public class Matriz_llena_con_valores_pares_por_columnas {
        
    
    public static void main(String[] args) {
           int M[][]=new int[3][3];
           int aux;
           for(int a=0;a<3;a++){
           	
           	  for(int b=0;b<3;b++){
           	     System.out.print("valor Matriz [ "+b+" ][ "+a+" ] = ");
           	     aux=Leer.leerint();
           	     if(aux%2==0)
           	     M[b][a]=aux;
           	     else
           	     b--;	
           	   }3
          }
          
          for(int a=0;a<3;a++){
          	for(int b=0;b<3;b++)
          	 System.out.print(M[a][b]+"\t");	
          	  System.out.print("\n");
          }
          	 
          	 
             
    }
}

