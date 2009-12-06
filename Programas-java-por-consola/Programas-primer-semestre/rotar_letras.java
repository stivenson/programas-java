class rotarl_letras
{
	public static void main(String arg[])
	{
	
	System.out.print("Escriba la cadena: ");		
	String a =Leer.leercadena();
	int cc=a.length();
	System.out.print(a+"\t");
	for(int i=cc-1;i>=0;i--)
	{
    StringBuffer n= new	StringBuffer(a);
	n.insert(0,n.charAt(n.length()-1));
	a=n.substring(0,n.length()-1);
	System.out.print(a+"\t");
	}
	System.out.println("\n");
	}
}