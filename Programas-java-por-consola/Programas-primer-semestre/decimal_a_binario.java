class decimal_a_binario
{
	public static void main(String arg[])
	{
		int decimal,i;
		String enbinario="",enbinarioderecho="";
		System.out.println("************DECIMAL A BINARIO*************");
        System.out.print("\n");   
		System.out.print("ESCRIBA SU DECIMAL: ");
		decimal=Leer.leerint();
		do{
			if(decimal%2>0)
			{
			enbinario=enbinario+"1";	
			}
			else
			{
			enbinario=enbinario+"0";	
			}
	
			decimal=decimal/2;
		}while(decimal>0);
			
			for(i=enbinario.length()-1;i>=0;i--)
			enbinarioderecho=enbinarioderecho+enbinario.charAt(i);
			
			
		    System.out.println("SU NUMERO EN BINARIO ES "+enbinarioderecho);
	}
}