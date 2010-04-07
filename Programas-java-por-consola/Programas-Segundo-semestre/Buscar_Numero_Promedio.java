

public class Buscar_Numero_Promedio {
        
    
    public static void main(String[] args) {
       
       int M[][]=new int[3][4];
       boolean AquiEsta=false;
       double s=0;
       
       System.out.print("Valor a buscar: ");
       int q=Leer.leerint();
       
       for(int i=0;i<3;i++)
       {
       		for(int a=0;a<4;a++)
       		{
       		System.out.print("valor Matriz [ "+i+" ][ "+a+" ] = ");
       		M[i][a]=Leer.leerint();
       		if(M[i][a]==q)
       		AquiEsta=true;	
       		}
       		
       		if(AquiEsta){
       		for(int e=0;e<4;e++)
       		s=s+M[i][e];
       		System.out.println(q+" esta en la fila "+i+" y entonces su promedio es "+(s/4)); 	
       		}
       	AquiEsta=false;
       	s=0;		
       						
       }
   }
}
