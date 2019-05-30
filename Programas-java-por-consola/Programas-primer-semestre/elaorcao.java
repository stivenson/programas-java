 class elaorcao
 {
 	public static void main(String arg[])
 	{
 	String frase="el laberinto del fauno";
 	String conver_letra,otra="",adivino="",paracomparar;
 	char letra;
 	StringBuffer  im=new StringBuffer("** ********* *** *****");
    int posicion=0;
 	byte oportunidades=0,haymas,p=0,errores=0,opc,acerto=0;
    System.out.println("******************EL AHORCADO******************");
    System.out.println("\n");
 	System.out.println("** ********* *** *****");
 	
 	
 	do{
 	   oportunidades++;	
 	   haymas=0;	
 	   p=0;
 	   System.out.print("letra: ");
 	   conver_letra=Leer.leercadena();
 	   letra=(char)(conver_letra.charAt(0));
 	   if(frase.indexOf(letra)!=-1)
 	   {
 	      do{ 
 	      posicion=frase.indexOf(letra);
 	      haymas=0;
 	   	  posicion=frase.indexOf(letra,posicion+p);
 	   	  im.setCharAt(posicion,letra); 
 	   	    if(frase.indexOf(letra,posicion+1)!=-1)
 	   	    haymas++;	
 	   	  p++;
 	   	  }while(haymas==1);
 	      System.out.println(im);
 	   }
 	   else
 	   {
 	      errores++;	
 	      System.out.println(im);
 	      System.out.println(" llEVAS "+errores+" ERRORES DE 10 PERMITIDOS ");
 	      System.out.println("\n");  
 	   }
 	      paracomparar= new String(im);
 	   if(frase.equals(paracomparar))
 	      {
 	      System.out.println("\n");	
 	      System.out.println("FRASE COMPLETADA");
 	      System.out.println("\n");	
 	      }
 	    else
 	     {
 	      System.out.println("\n");
 	      System.out.println("ELIGE");
 	      System.out.println("1. ESCRIBIR OTRA LETRA ");
 	      System.out.println("2. ADIVINASTES OPRIME ESTA PARA ESCRIBIRLA ");
 	      opc=Leer.leerbyte();
 	      System.out.println("\n");
 	        if(opc==2)
 	        {	
 	         System.out.print(" ESCRIBELA: ");
 	         adivino=Leer.leercadena();
 	           if(adivino.equals(frase))
 	           {
 	  	       System.out.println("\n");
 	           System.out.println(" GANASTE ");
 	           acerto++;	
 	           }
 	           else
 	           {
 	   	       System.out.println("\n");
 	           System.out.println("NADA!!!");	
 	           }
 	         }
 	      }
 	 }while(oportunidades<=frase.length()-4 && frase.equals(paracomparar)==false && errores<10 && acerto==0);
 	 if(acerto==0 && frase.equals(paracomparar)==false)	
 	 {
 	 System.out.println("PERDISTES");
 	 }	
   }
 }