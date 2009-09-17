class cuadratica
{
	public static void main(String arg[])
	{
	 double a,b,c,p1,p2,p3,x1,x2;
	  do{
	  System.out.print(" escriba el primer numero: ");
	  a=Leer.leerfloat();
	  }while(a==0);
	  
	  System.out.print(" escriba el segundo numero: ");
	  b=Leer.leerfloat();
		
	  System.out.print(" escriba el tercer numero: ");
	  c=Leer.leerfloat();
	    
	  p1=Math.pow(b,2);
	  if(p1-4*a*c>=0)
	  {
	  p2=-b+Math.pow((p1-4*a*c),(1/2));	
	  x1=p2/(2*a);
	  p3=-b-Math.pow((p1-4*a*c),(1/2));
	  x2=p3/(2*a);
	  System.out.println(" x1:"+x1);
	  System.out.print(" x2:"+x2);
	  }	   
	  else
	  {
	  System.out.println("operacion < 0");	
	  }
	  
		 
	}
}