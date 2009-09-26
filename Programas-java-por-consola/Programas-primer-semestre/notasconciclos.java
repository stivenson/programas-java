class notasconciclos
{
  public static void main(String arg[])
  {
  int n,a,na,ha,i;
  String nombre;
  long codigo;
  float n1,n2,exa;
  double def,snotas,pronotas;
  a=0;
  na=0;
  ha=0;
  snotas=0;
  System.out.print("Escriba el numero de alumnos a evaluar: ");
  n=Leer.leerint();
  
  for(i=1;i<=n;i++)	
    {
     System.out.print("NOMBRE: ");
  	 nombre=Leer.leercadena();
  	 
  	 System.out.print("CODIGO: ");
  	 codigo=Leer.leerlong();
  	 
  	
     System.out.print("NOTA 1: ");
  	 n1=Leer.leerfloat();
  	 
  	 System.out.print("NOTA 2: ");
  	 n2=Leer.leerfloat();
  	 
  	 System.out.print("EXAMEN FINAL: ");
  	 exa=Leer.leerfloat();
  	 System.out.println("\n");
  	 
  	 def=n1*0.3+n2*0.3+exa*0.4;
  	 System.out.println("ALUMNO "+ nombre +" SU DEFINITIVA ES "+def );
  	 
  	 
  	 if(def>=3)	
  	   {
  	   	a++;
  	   	System.out.println("USTED HA APROBADO");
  	   	System.out.println("\n");
  	   }
  	   else
  	   {
  	   	if(def>=2)
  	   	 {
  	   	 ha++;	
  	   	 System.out.println("USTED PUEDE RECUPERAR");
  	   	 System.out.println("\n");
  	   	 }
  	   	 else
  	   	 {
  	   	 na++;	
  	   	 System.out.println("USTED HA REPROBADO");
  	   	 System.out.println("\n");
  	   	 }
  	   }
  	   snotas = snotas + def;
  	   
    }
    pronotas=snotas/n;
    System.out.println("No aprovados: "+na);
    System.out.println("Aprovados: "+a);
    System.out.println("promedio de notas: "+pronotas);
  }
}