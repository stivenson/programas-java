class Matriz_prom_columnas{
	public static void main(String ar[]){
		int M[][]=new int[4][3];
		double Mprom[]=new double[3];
        double acu=0; 
          for(int a=0;a<3;a++){
                 for(int b=0;b<4;b++){
           	     System.out.print("valor Matriz [ "+b+" ][ "+a+" ] = ");
           	     M[b][a]=Leer.leerint();
           	     acu=acu+ M[b][a];
           	     
                 }
           Mprom[a]= acu/4;
           acu=0;
           System.out.println("valor Matriz [ "+a+" ] = "+Mprom[a]);
          }
          
          
          
          
           	     
           
	}
}