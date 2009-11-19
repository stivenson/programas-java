class palindromo
{
    public static void main(String[] args)
    {
    String frase,se="",sei="";
    char p,u;
    int ccc,cc,i; 
    System.out.println("*******************PALINDROMOS******************");
    System.out.print("\n");   
    System.out.print("ESCRIBA LA FRASE: ");
   	frase=Leer.leercadena();
   	cc=frase.length()-1;
   	System.out.print("\n");
   	ccc=cc;
   	for(i=0;i<=cc;i++)
   	{
   	p=frase.charAt(i);
   	u=frase.charAt(ccc);	
   	         if(u!=' ')
   	         {
   	             if(u>='A' && u<='Z')
   	             {
   	             sei=sei+u;	
   	             }
   	             else
   	             {
   	             u=(char)((byte)(frase.charAt(ccc))-32);
   	             sei=sei+u;
   	             }
   	              	
   	         }
   	         
   	         if(p!=' ')
   	         {
   	             if(p>='A' && p<='Z')
   	             {
   	             se=se+p;	
   	             }
   	             else
   	             {
   	             p=(char)((byte)(frase.charAt(i))-32);
   	             
   	       
   	             se=se+p;
   	             }	
   	         }
   	   ccc--;      
   	}
   	System.out.println(sei);
   	System.out.println(se);
   	System.out.print("\n");
   	if(se.equals(sei))
   	{
   	System.out.print("Es un palindromo");
   	System.out.println("\n");	
   	}
   	else
   	{
   	System.out.println("No es palindromo");
   	System.out.println("\n");
   	}
 
 	
 }	
}