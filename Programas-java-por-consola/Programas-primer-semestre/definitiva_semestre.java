class definitiva_semestre
{
	
	
		public static double porMateria(int i)
	   {
		float p1,p2,exa;
		double def;
		
	    
	   
	    System.out.println(" Materia "+(i+1)+" : " );
		System.out.println("\n");
		System.out.print("previo 1 : " );
		p1=Leer.leerfloat();
		
		System.out.print("previo 2 : " );
		p2=Leer.leerfloat();
		
		System.out.print("exa : " );
		exa=Leer.leerfloat();
		System.out.println("\n");
		def=p1*0.3+p2*0.3+exa*0.4;
		
		
	   return(def);
		}
      
	
	
	public static void main(String arg[])
	{
	 double[] m= new double[7];
	 double sumatoria=0;
	 int i;
	     System.out.println("PROMEDIO SEMESTRE");
	     System.out.println("\n");
	    for(i=0;i<=6;i++)
	 	{
	 	
  	    m[i]=porMateria(i);	
  	    sumatoria=sumatoria+m[i];
  	    System.out.println(sumatoria);
	 	}
	 	
	 	sumatoria=sumatoria/7;
	 	System.out.println("\n\n");
	 	System.out.println("promedio semestre: "+sumatoria);
	 	
	}
}