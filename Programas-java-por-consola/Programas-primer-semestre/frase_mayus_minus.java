class frase_mayus_minus
{
	public static void main(String arg[])
	{
		String frase,fraseM="",frasem="";
		int i;
		System.out.println("**********FRASE EN MAYUSCULA Y MINUSCULA**********");
        System.out.print("\n");   
		System.out.print("ESCRIBA SU FRASE: ");
		frase=Leer.leercadena();
		 for(i=0;i<=frase.length()-1;i++)
		 {
		 	
		 	if(frase.charAt(i)!=' ')
		 	{
		 	
		 	   if(frase.charAt(i)>='A' && frase.charAt(i)<='Z')
		 	   {
		 	   	fraseM=fraseM+frase.charAt(i);
		 	   	frasem=frasem+(char)((byte)(frase.charAt(i)+32));
		 	   }
		 	   else
		 	   {
		 	   	fraseM=fraseM+(char)((byte)(frase.charAt(i)-32));
		 	   	frasem=frasem+frase.charAt(i);
		 	   }
		 	}
		 	else
		 	{
		 	frasem=frasem+' ';
		 	fraseM=fraseM+' ';	
		 	}
		 	   
		 }
		 System.out.print("\n");
		 System.out.println("SU FRASE EN MAYUSCULA ES: "+fraseM);
		 System.out.print("\n");
		 System.out.println("SU FRASE EN MINUSCULA ES: "+frasem);
	}
}