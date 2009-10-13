class capicula
{
	public static void main(String arg[])
	{    
	
	    long cifras=1,van=0,igual=1;
		double numero,copianumero;
		System.out.println("**************CAPICULA***************");
		System.out.print("\n");
		System.out.print("  Escriba el numero: ");
		numero=Leer.leerdouble();
	    System.out.print("\n");
		copianumero=numero;
	
		
		while((int)numero/10>0)
		{
		numero=numero/10;
		cifras++;
		}
        
        while(van<cifras&&igual==1)
        {
        igual=0;		
        if((int)numero%10==(int)copianumero%10)
        {
        igual++;
        van=van + 2;
        numero=numero*10;
        copianumero=copianumero/10;	
        }		
         System.out.print("\n");
        }
        if(igual==0)
        {
        System.out.println("NO ES CAPICULA");	
        }
        else
        {
        System.out.println("ES CAPICULA");	
        }
	
	  }
	}
