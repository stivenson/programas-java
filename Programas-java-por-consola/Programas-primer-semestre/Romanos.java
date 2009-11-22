class romanos
{
	public static void main(String arg[])
	{
	String numero,Enromano="";
	int Ccifras,potencia,i,I,ceros=0,m,paraverificar;
	double lugar,hallarlugar;
	System.out.println("**************NUMEROS DECIMALES A ROMANOS*************");

    System.out.print("\n");	
    do{
    m=1;
    paraverificar=0;
    System.out.println("NUMEROS DEL 1 AL 3999");
    System.out.print("ESCRIBA EL NUMERO:  ");
    numero=Leer.leercadena();
    System.out.print("\n");	
    System.out.println("\n");
    for(i=numero.length()-1;i>=0;i--)
    {
    paraverificar=paraverificar+(int)(numero.charAt(i)-48)*m;
    m=m*10;	
    }
    
    }while(paraverificar>3999);
    Ccifras=numero.length()-1;
    potencia=Ccifras;
    for(i=0;i<=Ccifras;i++)
    {
    	I=0;
        lugar=(int)(numero.charAt(i)-48)*Math.pow(10,potencia);
        hallarlugar=lugar;
        
      
        
        while(hallarlugar-1>=0)
        {
        hallarlugar=hallarlugar-1;
        I++;
        }
        if(I<=3999)
        {
        while(lugar-1000>=0)
        {
        Enromano=Enromano+"M";
        lugar=lugar-1000;
        }
        if(lugar>=900)
        {
        Enromano=Enromano+"CM";	
        lugar=lugar-900;
        }
        while(lugar-500>=0)
        {
        Enromano=Enromano+"D";
        lugar=lugar-500;
        }			
         if(lugar>=400)
        {
        Enromano=Enromano+"CD";	
        lugar=lugar-400;
        }
        while(lugar-100>=0)
        {
        Enromano=Enromano+"C";
        lugar=lugar-100;
        }	
        
        if(lugar>=90)
        {
        Enromano=Enromano+"XC";	
        lugar=lugar-90;
        }
        while(lugar-50>=0)
        {
        Enromano=Enromano+"L";
        lugar=lugar-50;
        }
        if(lugar>=40)
        {
        Enromano=Enromano+"XL";	
        lugar=lugar-40;
        }
        while(lugar-10>=0)
        {
        Enromano=Enromano+"X";
        lugar=lugar-10;
        }
        if(lugar>=9)
        {
        Enromano=Enromano+"IX";	
        lugar=lugar-9;
        }
        while(lugar-5>=0)
        {
        Enromano=Enromano+"V";
        lugar=lugar-5;
        }
        
        if(lugar>=4)
        {
        Enromano=Enromano+"IV";	
        lugar=lugar-4;
        }
     
        while(lugar-1>=0)
        {
        Enromano=Enromano+"I";
        lugar--;
        }
        }
        potencia--;
      }	
        System.out.println("SU NUMERO EN ROMANO ES:      "+Enromano);
        System.out.println("\n");
 
	
}}