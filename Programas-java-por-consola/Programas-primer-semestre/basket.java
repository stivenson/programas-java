class basket
{
	public static void main(String arg[])
	{
	int ha,ma,n,edad,i;
	String nombre;
	byte sexo;
	double esh,esm;
	float est,peso;
	ha=0;
	ma=0;
	esm=0;
	esh=0;
	 System.out.print(" numero de alumnos: ");
	 n=Leer.leerint();
	 
	 for(i=1;i<=n;i++) 	
	   {
	   	 System.out.print(" nombre: ");
		 nombre=Leer.leercadena();
		 System.out.print(" sexo (M=1, F=2): ");
		 sexo=Leer.leerbyte();
		 System.out.print(" edad: ");
		 edad=Leer.leerint();
		 System.out.print(" estatura: ");
		 est=Leer.leerfloat();
		 System.out.print(" peso: ");
		 peso=Leer.leerfloat();
		 System.out.println("\n");
		 
		 if(sexo==1)
		   {
		   	if(edad>=17 && est>=1.75 && peso<=80)
		   	  {
		   	  esh=esh+est;
		   	  ha++;
		   	  System.out.println(" Apto ");
		 	
		   	  }
		   	  else
		   	  {
		   	  System.out.println(" no apto ");
		 	
		   	  }
		   }
		   else
		   {
		   	if(edad>=15 && est >= 1.70 && peso<=70)
		   	  {
		   	  esm=esm+est;
		   	  ma++;
		   	  System.out.println(" Apta ");	
		   	  }
		   	  else
		   	  {
		   	  System.out.println("  no apta ");	
		   	  }
		   }
	   }
	   System.out.println(" total estudiantes aptos: "+(ma+ha));
	   System.out.println(" cantidad de mujeres aptas: "+ma); 
	   System.out.println(" cantidad de hombres aptos: "+ha);
	   System.out.println(" promedio estatura hombres: "+(esh/ha));
	   System.out.println(" promedio estatura mujeres: "+(esm/ma));
	}
}
