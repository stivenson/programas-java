class primos
{
public static void main(String arg[])
  {
  	
  	float ceros,i,n;
  	ceros=0;
  	System.out.println("_________________sera primo?_____________________");
  	System.out.print("\n");
  	System.out.print("escriba el numero: ");
  	n=Leer.leerfloat();
  	for(i=2;i<=n;i++)
  	  {
  	   if(n%i==0)	
  	     {
  	      ceros++;	
  	     }
  	  }
  	  if(ceros>1)
  	    {
  	  	System.out.print("no es primo,         ");
  	    }
  	    else
  	    {
  	    System.out.print(" es primo,           ");	
  	    }
  }	
}

