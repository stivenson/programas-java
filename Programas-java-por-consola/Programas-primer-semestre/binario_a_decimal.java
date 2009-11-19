class binario_a_decimal
{
	public static void main(String arg[])
	{
		String binario;
		int sumatoria=0,potencia=0,i;
		
		System.out.println("************BINARIO A DECIMAL*************");
        System.out.print("\n");
		 System.out.print("ESCRIBA SU BINARIO: ");
 	     binario=Leer.leercadena();
		
		for(i=binario.length()-1;i>=0;i--)
		{
		 if(binario.charAt(i)=='1')
		 {
		 sumatoria=sumatoria+(int)((int)(binario.charAt(i)-48)*Math.pow(2,potencia));
		 }
		 
		 potencia++;	
		 }
		
		System.out.println("SU NUMERO EN BINARIO ES: "+sumatoria);
		
		
	}
}