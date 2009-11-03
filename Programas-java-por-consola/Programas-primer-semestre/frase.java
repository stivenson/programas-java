class frase
{
	public static void main(String arg[])
	{
	String f,p;
	System.out.println("frase:");
	f=Leer.leercadena();
	System.out.println("palabra:");
	p=Leer.leercadena();
	
	if(f.equals(p))
	{
		if(f.indexOf(p)!=-1)
		{
			System.out.println("son iguales y la palabra esta en la frase");
		}
		else
		{
			System.out.println("son iguales y la palabra es diferente");
		}
	}
	else
	{
	   if(f.indexOf(p)!=-1)
		{
			System.out.println("la palabra esta en la frase  ");
		}
		else
		{
			System.out.println("todo diferente");
		}	
	}
	}
}
