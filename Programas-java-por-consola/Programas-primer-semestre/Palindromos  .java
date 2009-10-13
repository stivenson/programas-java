 class Palindromos
 {
   public static void main(String[] args)
   {
   	String frase,principio="",sinespaciado="",v1,v2;
   	int i,i2=0,caracteres;
   	System.out.println("********************PALINDROMOS******************");
   	System.out.print("\n");
   	System.out.print("escriba la frase: ");
   	frase=Leer.leercadena();
   	System.out.print("\n");
   	
   	caracteres=frase.length()-1;
   	
   	for (i=caracteres;i>=0;i--)
   	{
   	  if((int)frase.charAt(i)!=32)
      principio=principio + frase.charAt(i);
      if((int)frase.charAt(i2)!=32)
      {	
      sinespaciado=sinespaciado+frase.charAt(i2);	
      }
      i2++;
    }
     if(principio.compareTo(sinespaciado)==0)
     {
     System.out.println("ES UN PALINDROMO");	
     }
     else
     {
     System.out.println("NO ES UN PALINDROMO");	
     }
  } 
  
 }