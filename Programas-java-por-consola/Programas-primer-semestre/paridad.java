class paridad
{
	public static void main(String arg[])
	{
		String n,a;
		int i,unos=0,cunos;
        cunos=unos;
        
        System.out.print("escriba el binario: ");
 	    n=Leer.leercadena();
 	
		for(i=n.length()-1;i>=0;i--)
		{
			if(n.charAt(i)=='1')
			{
				unos++;
			}
		}
		int nu=Integer.parseInt(n.trim());
	
		if(unos % 2==0)
		{
		a="1";	
		}
		else
		{
		a="0";	
		}
		
		System.out.print(n+" "+a);
	}
}