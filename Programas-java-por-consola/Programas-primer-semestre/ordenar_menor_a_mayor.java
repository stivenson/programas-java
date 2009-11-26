class ordenar_menor_a_mayor
{
	public static void main (String arg[])
		{
		
		System.out.println("\t\t*********ORDENAR DE MENOR A MAYOR*********" );	
					 
 	    System.out.println("  ");
 	
		
		int a=0,s=0,aux=0;
		String numero;
		
		
		System.out.print("digite el numero a ordenar: ");
		numero=Leer.leercadena();
		int cantidadc=numero.length();
		int h []=new int [cantidadc];
		
		for (a=0;a<cantidadc;a++)
		{
		
			h[a]=(int)(numero.charAt(a))-48;
			
		}
		System.out.println("  ");
		for (a=0;a<cantidadc;a++)
		{
			for(s=a+1;s<cantidadc;s++)
			{
				
				if (h[a]>h[s])
				{
					aux=h[a];
					h[a]=h[s];
					h[s]=aux;
				}
				
			}
			 System.out.print(h[a]);
			
        }
       
        System.out.print("\n");
   }
}