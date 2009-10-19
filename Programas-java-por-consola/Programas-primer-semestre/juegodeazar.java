class juegodeazar
{
	public static void main(String arg[])
	{
		String enter;
		int a,b,c,i,jugadas=0,gano=0;
		System.out.println("             		JUEGO DE AZAR                  ");
		System.out.print("PRESIONE ENTER PARA COMENZAR");
		enter=Leer.leercadena();
		do{
			a=(int)(Math.random()*10)+1;
			b=(int)(Math.random()*10)+1;
			c=(int)(Math.random()*10)+1;
			jugadas++;
			if(a==b && b==c && a==c)
			{
			gano++;	
			}
			System.out.println("              "+a+" "+b+" "+c+"               ");
			System.out.println("PRESIONE ENTER PARA CONTINUAR");
		    enter=Leer.leercadena();
			}while(jugadas<10 && gano==0);
			  if(jugadas>=10)
			  {
			  System.out.println("PERDISTES");	
			  }
			  else
			  {
			  System.out.println("GANASTE");
			  }
		
			
			
			
	}
		
}
