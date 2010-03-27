/**
 * @(#)Matriz_trabajadores_dias_semana.java
 *
 *
 * @author 
 * @version 1.00 2010/3/25
 */

public class Matriz_trabajadores_dias_semana {
        
    /**
     * Creates a new instance of <code>Matriz_trabajadores_dias_semana</code>.
     */
    public Matriz_trabajadores_dias_semana() {
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        int M[][]=new int[8][3];
        int V[][]=new int[2][3];
        int Dias[][]=new int[2][7];
        int s=0,indiceDia=0,aux;
        
        
        	for(int i=0;i<3;i++)
        		{
        		System.out.print("Codigo trabajador "+(i+1)+" = ");
        		M[0][i]=Leer.leerint();
			       for(int b=1;b<8;b++)
			   	   {
			       System.out.print("dia "+b+" trabajador "+(i+1)+" = ");
        	       M[b][i]=Leer.leerint();
        		   s=s+M[b][i];
		           }
		       V[0][i]=i;
		       V[1][i]=s*5200;
		       s=0;
		        }
		    
		     
		    for(int i=1;i<8;i++)
		    {
		    	for(int b=0;b<3;b++)
			      	Dias[1][i-1]= Dias[1][i-1]+ M[i][b]; 
			        Dias[0][i-1]=i-1; 
		    }

		OrdenarConIndice(V);
		ImprimirMatriz(Dias);     
		OrdenarConIndice(Dias); 
		ImprimirMatriz(Dias);   
        ImprimirMatriz(V);
        NombreDia(Dias[0][6]);
        	
         
         		       	  
    }



 public static void OrdenarConIndice(int R[][]){
 	int aux;
 	          for(int b=0;b<R.length;b++)
		    	{
		    	System.out.println(b);	
		    	  for(int a=b+1;a<R[b].length;a++)
		    	   {
		    	     if(R[1][b]>R[1][a])
		    	     {
		    	     
		    	     aux= R[0][a];
		    	     R[0][a]=R[0][b];
		    	     R[0][b]=aux;
		    	     
		    	      aux= R[1][a];
		    	     R[1][a]=R[1][b];
		    	     R[1][b]=aux;
		    	  	
		    	    }	
		    	  }	
		    	}
			      	
          }
          
    public static void ImprimirMatriz(int M[][]){
    	 for(int i=0;i<M.length;i++)
		    {
		    	for(int b=0;b<M[i].length;b++)
			       System.out.print(M[i][b]+"\t");
			       System.out.print("\n");
			        
		    }
		    System.out.print("\n");
		   
    }   
    	
   public static void NombreDia(int M){
    	 switch(M){
    	 	case 0: System.out.print("Dia de mas trabajo Lunes"); break;
    	 	case 1: System.out.print("Dia de mas trabajo Martes"); break;
    	 	case 2: System.out.print("Dia de mas trabajo Miercoles"); break;
    	 	case 3: System.out.print("Dia de mas trabajo Jueves"); break;
    	 	case 4: System.out.print("Dia de mas trabajo Viernes"); break;
    	 	case 5: System.out.print("Dia de mas trabajo Sabado"); break;
    	 	case 6: System.out.print("Dia de mas trabajo Domingo"); break;
    	 	}
		   
    }       
 }