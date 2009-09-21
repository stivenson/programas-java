class notas
{
	public static void main(String arg[])
	{
		float p1,p2,exa;
		double def;
		long codigo;
	
	    System.out.print(" escriba su codigo : " );
		p1=Leer.leerlong();
		
		System.out.print("previo 1 : " );
		p1=Leer.leerfloat();
		
		System.out.print("previo 2 : " );
		p2=Leer.leerfloat();
		
		System.out.print("exa : " );
		exa=Leer.leerfloat();
		def=p1*0.3+p2*0.3+exa*0.4;
		
		System.out.println("definitiva : "+def );
		if (def>=3.0)
		{
		System.out.print(" HAS APROVADO " );
		}
		else
		{
			if(def>2.0)
			{
				System.out.print("PUEDES HABILITAR" );
				
	     	}
	    	else
	    	{
				System.out.print("REPROVASTE" );
		    }
		}
      }
}