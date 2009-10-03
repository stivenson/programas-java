class PicasyFamas_UnEntero
{
  	public static void main (String arg[])
  	
  	{
  	 int a,b,c,d,numerop,picas,famas,gano=0,sigue=0,oportunidades=0;
  	 double sera1,sera2,sera3,sera4;	
  	 do{
	
	a=(int)(Math.random()*9);
	b=(int)(Math.random()*9);
	c=(int)(Math.random()*9);
	d=(int)(Math.random()*9);
	}while(a==b||b==c||c==d||c==a||d==a||d==b);
	
	System.out.println("Imprimo los numeros aleatorios aca para  poder verificar: "+(int)a+" "+(int)b+" "+(int)c+" "+(int)d);
	System.out.println("\n");
	do{
	oportunidades++;
	famas=0;
	picas=0;	
	
	System.out.print("numero: ");
	numerop=Leer.leerint();
	System.out.println("\n");
	
	sera4=numerop%10;
	sera3=(numerop/10)%10;
	sera2=((numerop/10)/10)%10;
	sera1=(((numerop/10)/10)/10)%10;
	
	if(sera1==a)
	   {
	   famas++;
	   
	   }
	   if(sera2==b)
	   {
	   	famas++;
	   }
	   
	   
	   if(sera3==c)
	   {
	   	famas++;
	   }
	   
	   if(sera4==d)
	   {
	   	famas++;
	   }
	   
	   if(sera1==b)
	   {
	   picas++;
	   }
	   if(sera1==c)
	   {
	   	picas++;
	   }
	   
	   if(sera1==d)
	   {
	   picas++;
	   }
	   
	   if(sera2==c)
	   {
	   picas++;
	   }
	   if(sera2==a)
	   {
	   	picas++;
	   }
	   
	   if(sera2==d)
	   {
	   picas++;
	   }
	  
	   
	   if(sera3==b)
	   {
	   picas++;
	   }
	   if(sera3==a)
	   {
	   picas++;
	   }
	   
	   if(sera3==d)
	   {
	   picas++;
	   }
	   
	   if(sera4==a)
	   {
	   picas++;
	   }
	   
	   if(sera4==b)
	   {
	   picas++;
	   }
	   
	   if(sera4==c)
	   {
	   picas++;
	   }
	   
	  
	  System.out.println("\n\n"); 
	  System.out.println("Famas: "+famas+" picas: "+picas);
	 
	  System.out.println("\n");
	   if(famas==4)
	   {
	   	
	   	gano++;
	   	
	   	System.out.println("BIEN HECHO, ganaste con "+ oportunidades +" oportunidades");
	   }
	   else
	   {
	   
	  
	   System.out.println("\n"); 
	   System.out.println("SELECCIONE:"); 
	   System.out.println("1. SE RINDE, Escoja esta opcion para mirar el numero que era, PERDEDOR!!!");
	   System.out.println("2. SEGUIR INTENTANDO");
	   sigue=Leer.leerint();
	   }
	  
	  
	  
	  
	   }while(sigue==2 && gano==0);
	   if(famas!=4)
	   {
	   	System.out.println("trataste en "+ oportunidades +" oportunidades");
	   	System.out.println("los numeros eran "+(int)a+" "+(int)b+" "+(int)c+" "+(int)d);
	   }
	
  	}	
  	
  	
}