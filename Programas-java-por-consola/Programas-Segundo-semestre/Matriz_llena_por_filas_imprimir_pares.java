

public class Matriz_llena_por_filas_imprimir_pares {
        
    
    public static void main(String[] args) {
    	 int M[][]=new int[3][3];
           int aux;
          for(int a=0;a<3;a++){
           for(int b=0;b<3;b++){
           	     System.out.print("valor Matriz [ "+a+" ][ "+b+" ] = ");
           	     M[b][a]=Leer.leerint();
           }
          }
          
          for(int a=0;a<3;a++){
          	for(int b=0;b<3;b=b+2)
          	 System.out.print(M[b][a]+"\t");	
          	  System.out.print("\n");
          }
    }
}
