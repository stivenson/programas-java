class Segundo_parcial_programa_2
{
	
	static float M[][]=new float[4][8];
	public static void main(String arg[])
	{
	System.out.println("Ingrese los valores: ");			
	Segundo_parcial_programa_2 obj=new Segundo_parcial_programa_2();	
	obj.LLenarPorViviendas();
	float V[]=obj.VectorCantidadBasuraPorCasa();
	obj.CantidadBasuraPorCasas();
	obj.ViviendaMasBasura(V);
	obj.ViviendaMenosBasura(V);
	obj.PromedioBasura(V);
	obj.TotalAPagarVivienda(V);	
	
	System.out.println("Promedio "+obj.PromedioBasura(V));	
	}
	
	public void LLenarPorViviendas(){   //////metodo void sin parametros.
   for(int b=0;b<8;b++)
     	for(int c=0;c<4;c++)
     	{
     	System.out.print("Semana "+(c+1)+" vivienda "+(b+1)+" = ");	
     	M[c][b]=Leer.leerfloat();	
     	}	
  }
  
  public  float[]  VectorCantidadBasuraPorCasa(){///metodo que debuelve sin parametros.
  float BasuraPorCasa[]=new float[8];
  float s=0;
   for(int b=0;b<8;b++){
   	for(int c=0;c<4;c++)
     	{
     	s=s+M[c][b];	
     	}
    BasuraPorCasa[b]=s; 
    s=0;	//<--- faltaba //////////////////////////////////////////////////////////////////////	
   }  
     	
   return   BasuraPorCasa; 		
  }
  
    public void CantidadBasuraPorCasas(){
  float BasuraPorCasa[]=new float[8];
  float s=0;
   for(int b=0;b<8;b++){
   	for(int c=0;c<4;c++)
     	{
     	s=s+M[c][b];	
     	}
     System.out.println("Vivienda "+(b+1)+" genero "+(s)+ " Kg. ");	
     s=0;//<--- faltaba  /////////////////////////////////////////////////////////////////////			
   }
  }
  
   public  void  ViviendaMasBasura(float BasuraPorCasa[]){
  	float mayor=BasuraPorCasa[0];
  	int indice=0;
   	 for(int c=1;c<8;c++)
   	 if(BasuraPorCasa[c]>mayor){
   	 mayor=BasuraPorCasa[c];
   	 indice=c;	
   	 }
   	 
   	System.out.println("Vivienda con mas basura: "+(indice+1));	 
   }	 	
   	public  void  ViviendaMenosBasura(float BasuraPorCasa[]){
  	float menor=BasuraPorCasa[0];
  	int indice=0;
   	 for(int c=1;c<8;c++)
   	 if(BasuraPorCasa[c]<menor){
   	 menor=BasuraPorCasa[c];
   	 indice=c;	
   	 } 		
   	System.out.println("Vivienda con menos basura: "+(indice+1));	 		
  }
  
  
   public float PromedioBasura(float BasuraPorCasa[]){  ///metodo que debuelve y con parametros.
  	float prom=0;
    	for(int c=0;c<8;c++)
     	prom=prom+BasuraPorCasa[c];
     	
    return (prom/8);	
    }
  	
  
   public void TotalAPagarVivienda(float BasuraPorCasa[]){  ///metodo void con parametros
  	float prom=0;
    	for(int c=0;c<8;c++)
     	System.out.println("Total a pagar vivienda: "+(c+1)+" = "+(BasuraPorCasa[c]*280));	 
     	
    	
    }	
  	
  } 
  
  
  
