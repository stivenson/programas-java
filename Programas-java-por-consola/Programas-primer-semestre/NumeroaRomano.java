 class NumeroaRomano
 {
 
    public static void main(String arg[])
    {
    String numero,Enromano="";
    int i,ncaracteres,vueltas=1,son=0,p=0,verificar4o9=0;
    long sumatoria=0;
    double cantidadceros,paralosde1000,paralosde100,paralosde10,copiacaracteres;
    double paralosde5,paralosde1,paralosde50,paralosde500,copiaparalosde1,copiaparalosde5;
    double copiaparalosde10;
    
    System.out.println("**************NUMEROS DECIMALES A ROMANOS*************");
    System.out.print("\n");		
    do{
    System.out.print("ESCRIBA EL NUMERO:  ");	
    numero=Leer.leercadena();
    System.out.println("\n");
    while(p<=numero.length()-1)
    {
    sumatoria=sumatoria	+ (int)numero.charAt(p)-48;
    p++;
    }
   	
    }while(sumatoria>30);
    copiacaracteres=p-1;
    ncaracteres=p-1;	
    for(i=0;i<=ncaracteres;i++)
    {
    cantidadceros=((int)(numero.charAt(i)-48)*Math.pow(10,copiacaracteres));
    System.out.println("numero: "+cantidadceros);
    ParacontarI=cantidadceros;
   
    
    copiacaracteres--;
    
    if(cantidadceros>=1)
    son=1;
    if(cantidadceros>=5)
    son=2;
    if(cantidadceros>=10)
    son=3;
    if(cantidadceros>=50)
    son=4;
    if(cantidadceros>=100)
    son=5;
    if(cantidadceros>=500)
    son=6;
    if(cantidadceros>=1000)
    son=7;
    switch(son)
    {
    case 1:
    while(ParacontarI-1>=0)
	{		
	verificar4o9++;
	ParacontarI--;
	}
   if(verificar4o9>=4)
   {
   	Enromano=Enromano+"IV";
   }
   else
   {
    while(cantidadceros-1>=0)
	{
    Enromano=Enromano+"I";
    cantidadceros=cantidadceros-1;
    }
   }
 	break;
 	
    
    case 2:
    
    while(ParacontarI-1>=0)
	{		
	verificar4o9++;
	ParacontarI--;
	}
    if(verificar4o9>=9)
    {
    Enromano=Enromano+"IX";	
    }
    else
    {
    while(cantidadceros-5>=0)
    {	
    Enromano=Enromano+"V";
    cantidadceros=cantidadceros-5;
    }

    while(cantidadceros>0)
	{
    Enromano=Enromano+"I";
    cantidadceros=cantidadceros-1;
    }	
    }
    break;
    case 3:
    
    while(ParacontarI-1>=0)
	{		
	verificar4o9++;
	ParacontarI--;
	}
    switch(verificar4o9)
    {
    case 14:
    Enromano=Enromano+"XIV";
    break;
    case 19:
    Enromano=Enromano+"XIX";
    break;
    case 24:
    Enromano=Enromano+"XXIV";
    break;
    case 29:
    Enromano=Enromano+"XXIX";
    break;
    case 34:
    Enromano=Enromano+"XXXIV";
    break;
    case 39:
    Enromano=Enromano+"XXXIX";
    break;
    case 44:
    Enromano=Enromano+"XLIV";
    break;
    case 49:
    Enromano=Enromano+"XLIX";
    break;
    default:	
    while(cantidadceros-10>=0)
    {			
    Enromano=Enromano+"X";
    cantidadceros=cantidadceros-10;	
    }
    if(cantidadceros>0)
    {
      while(cantidadceros-5>=0)
      {	
      Enromano=Enromano+"V";
      cantidadceros=cantidadceros-5;
      }		
    }
    if(cantidadceros>0)
    {
      while(cantidadceros-1>=0)
      {	
      Enromano=Enromano+"I";
      cantidadceros=cantidadceros-1;
      }		
    }
    }
    break;
    
    
    case 4:
    while(ParacontarI-1>=0)
	{		
	verificar4o9++;
	ParacontarI--;
	}
    switch(verificar4o9)
    {
    case 54:
    Enromano=Enromano+"L";
    while(cantidadceros-50>=0)
    {	
    Enromano=Enromano+"L";
    cantidadceros=cantidadceros-50;
    }
    if(cantidadceros>=10)
    {
    while(cantidadceros-10>=0)
    {	
    Enromano=Enromano+"X";
    cantidadceros=cantidadceros-10;	
    }
    }
    if(cantidadceros>=5)
    {
    while(cantidadceros-5>=0)
    {	
    Enromano=Enromano+"V";
    cantidadceros=cantidadceros-5;
    }		
    }
    if(cantidadceros>=1)
    {
    while(cantidadceros-1>=0)
	{
    Enromano=Enromano+"I";
    cantidadceros=cantidadceros-1;
    }
    }
    break;
    
    
    case 5:
    while(cantidadceros-100>=0)
    {	
    Enromano=Enromano+"C";
    cantidadceros=cantidadceros-100;
    }
    if(cantidadceros>=0)
    {
    while(cantidadceros-50>=0)
    {	
    Enromano=Enromano+"L";
    cantidadceros=cantidadceros-50;
    }
    }
    if(cantidadceros>=0)
    {
    while(cantidadceros-10>=0)
    {	
    Enromano=Enromano+"X";
    cantidadceros=cantidadceros-10;	
    }
    }
    if(cantidadceros>=0)
    {
    while(cantidadceros-5>=0)
    {	
    Enromano=Enromano+"V";
    cantidadceros=cantidadceros-5;
    }		
    }
    if(cantidadceros>=0)
    {
    while(cantidadceros-1>=0)
	{
    Enromano=Enromano+"I";
    cantidadceros=cantidadceros-1;
    }
    }
    
    
    break;
    case 6:
    while(cantidadceros-500>=0)
    {	
    Enromano=Enromano+"D";
    cantidadceros=cantidadceros-500;
    }
    
    if(cantidadceros>=0)
    {
    while(cantidadceros-100>=0)
    {	
    Enromano=Enromano+"C";
    cantidadceros=cantidadceros-100;
    }
    }
    if(cantidadceros>=0)
    {
    while(cantidadceros-100>=0)
    {	
    Enromano=Enromano+"C";
    cantidadceros=cantidadceros-100;
    }
    }
    if(cantidadceros>=0)
    {
    while(cantidadceros-50>=0)
    {	
    Enromano=Enromano+"L";
    cantidadceros=cantidadceros-50;
    }
    }
    if(cantidadceros>=0)
    {
    while(cantidadceros-10>=0)
    {	
    Enromano=Enromano+"X";
    cantidadceros=cantidadceros-10;	
    }
    }
    if(cantidadceros>=0)
    {
    while(cantidadceros-5>=0)
    {	
    Enromano=Enromano+"V";
    cantidadceros=cantidadceros-5;
    }		
    }
    if(cantidadceros>=0)
    {
    while(cantidadceros-1>=0)
	{
    Enromano=Enromano+"I";
    cantidadceros=cantidadceros-1;
    }
    }
    break;
    
    case 7:
    while(cantidadceros-1000>=0)
    {	
    Enromano=Enromano+"M";
    cantidadceros=cantidadceros-1000;
    }
    
    if(cantidadceros>=0)
    {
    while(cantidadceros-500>=0)
    {	
    Enromano=Enromano+"D";
    cantidadceros=cantidadceros-500;
    }	
    }
    
    if(cantidadceros>=0)
    {
    while(cantidadceros-100>=0)
    {	
    Enromano=Enromano+"C";
    cantidadceros=cantidadceros-100;
    }
    }
    if(cantidadceros>=0)
    {
    while(cantidadceros-100>=0)
    {	
    Enromano=Enromano+"C";
    cantidadceros=cantidadceros-100;
    }
    }
    if(cantidadceros>=0)
    {
    while(cantidadceros-50>=0)
    {	
    Enromano=Enromano+"L";
    cantidadceros=cantidadceros-50;
    }
    }
    if(cantidadceros>=0)
    {
    while(cantidadceros-10>=0)
    {	
    Enromano=Enromano+"X";
    cantidadceros=cantidadceros-10;	
    }
    }
    if(cantidadceros>=0)
    {
    while(cantidadceros-5>=0)
    {	
    Enromano=Enromano+"V";
    cantidadceros=cantidadceros-5;
    }		
    }
    if(cantidadceros>=0)
    {
    while(cantidadceros-1>=0)
	{
    Enromano=Enromano+"I";
    cantidadceros=cantidadceros-1;
    }
    }
    break;

    }   
    
   }
System.out.println("SU NUMERO EN ROMANO ES:   "+Enromano);
} 
}
