class Segundo_Parcial_Programa_1
{
	static int W[][]=new int[4][4];
	
	public static void main(String arg[])
	{
	Segundo_Parcial_Programa_1 obj=new Segundo_Parcial_Programa_1();
	System.out.println("LLenado de la matriz por filas");
	obj.LLenarPorFilas();	
	System.out.print("Valor a buscar: ");
	int  v=Leer.leerint();	
	
	System.out.print("El valor "+ v+" esta :");
	obj.buscar(v);
	System.out.println("en las posiciones ");
	obj.Posiciones(v);
	System.out.println(", respectivamente.");
	
	obj.MostrarSEPDDS(obj.PromedioDiagonalPrincipal());
	}
	
	
	
	
	public void buscar(int valor){
	int contador=0;
   	 for(int b=0;b<4;b++)
    	for(int c=0;c<4;c++)
     	if(W[b][c]==valor)
    	contador++;
    	System.out.println(contador+" veces");		
    }
    
    	public void Posiciones(int valor){
	String posiciones=" ";
   	 for(int b=0;b<4;b++)
    	for(int c=0;c<4;c++)
     	if(W[b][c]==valor)
        System.out.println("Fila: "+b+" columna: "+c);		
    }
    
     public void LLenarPorFilas(){
   for(int b=0;b<4;b++)
     	for(int c=0;c<4;c++)
     	{
     	System.out.print("valor Matriz [ "+b+" ][ "+c+" ] = ");	
     	W[b][c]=Leer.leerint();	
     	}	
  }
  
  public float PromedioDiagonalPrincipal(){
 	int A=0;
 	float s=0;
    for(int b=0;b<4;b++){
     	s=s+W[b][A];
     	A++;
     	}
  	return (s/4);
    }
    
     public void MostrarSEPDDS(float mediaDiagonalPrincipal){ //metodo para Mostrar Elementos Por Debajo de Diagonal Secundaria
 	int A=3;
 	int s=0;
    for(int b=1;b<4;b++){
    	for(int c=A;c<4;c++){
    	if(W[b][c]>= mediaDiagonalPrincipal)
     	s=s+W[b][c];	
    	}
        A--;
     	}
     System.out.println("Sumatoria de los elementos por debajo de la DS. y mayores o iguales a media de diagonal principal : "+s);		
    }	
}