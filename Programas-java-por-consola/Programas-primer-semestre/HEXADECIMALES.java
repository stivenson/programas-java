class HEXADECIMALES
{
	public static void main(String arg[])
	{
		float numerohexa;
		int i,posicion=0;
		
		double ncaracteres,potencia,caracter,sumatoria=0;
		String n;
		
		System.out.println("************NUMERO HEXADECIMAL A DECIMAL*************: ");
		System.out.print("\n");
		System.out.print(" solo letras mayusculas y digitos: ");
		n=Leer.leercadena();
		System.out.print("\n");
		ncaracteres=n.length();
		potencia=ncaracteres-1;
		for(i=1;i<=ncaracteres;i++)
		{
	      if((int)n.charAt(posicion)>57)
	      {
	      caracter=(int)n.charAt(posicion)-55; 
	      caracter=caracter*Math.pow(16,potencia);	
	      }
	       else
	      {
		  caracter=((int)n.charAt(posicion)-48);
		  caracter=caracter*Math.pow(16,potencia);
		  }
		sumatoria=sumatoria+caracter;
		posicion++;
		potencia--;
		 	
		}
		System.out.println("Su numero en decimal es: "+(int)sumatoria);
		
	}
}