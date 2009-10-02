class PicasyFamas
{
	public static void main(String arg[])
	{
	int sera1,sera2,sera3,sera4,famas=0,picas=0,sigue=0,oportunidades=0,gano=0;	
	double a,b,c,d;
	
	do{
	
	a=(int)(Math.random()*9);
	b=(int)(Math.random()*9);
	c=(int)(Math.random()*9);
	d=(int)(Math.random()*9);
	}while(a==b||b==c||c==d||c==a||d==a||d==b);
	
	System.out.println("Imprimo los numeros aleatorios aca para  poder verificar: "+(int)a+" "+(int)b+" "+(int)c+" "+(int)d);
	System.out.println("\n");
	do{
	famas=0;
	picas=0;
	oportunidades++;
	System.out.print("Primer numero: ");
    sera1=Leer.leerint();
	System.out.print("Segundo numero: ");
    sera2=Leer.leerint();
    System.out.print("Tercer numero: ");
    sera3=Leer.leerint();
    System.out.print("Cuarto numero: ");
    sera4=Leer.leerint();
	System.out.println("\n");
		
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
	  System.out.println("famas: "+famas);
	  System.out.println("picas: "+picas);
	
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