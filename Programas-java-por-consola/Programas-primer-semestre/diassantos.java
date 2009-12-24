


class diassantos
{
	public static void main (String arg[])
	{
	int m=0,n=0,repetir;	
	long año;
	double a,A,b,B,c,d;
	System.out.print("                        DIAS SANTOS SEGUN EL AÑO                 ");
	System.out.print("\n");
   
    System.out.print("\n");
    do{
    repetir=0;	
    System.out.print("AÑO: ");
    año=Leer.leerlong();
    if(año>=1583&&año<=1699)
    {
    m = 22;
    n= 2;
    }
    else
    {
      if(año>=1700&&año<=1799)
      {
      m=23;
      n=3;	
      }
      else
      {
      	if(año>=1800&&año<=1899)
      	{
      	m=23;
        n=4;	
      	}
      	else
      	{
      		if(año>=1900&&año<=2099)
      		{
      		m=24;
      		n=5;	
      		}
      		else
      		{
      			if(año>=2100&&año<=2199)
      			{
      			m=24;
      			n=6;	
      			}
      			else
      			{
      			   if(año>=2200&&año<=2299)
      			   {
      				m=25;
      				n=0;
      			   }
      			   else
      			   {
      			   	System.out.println("Solo años compredidos entre 1583 hasta 2299");
      			   	repetir++;
      			   }	
      			}
      		}
      	}
      }	
    }
      
      
    }while(repetir!=0);  
   
    a=año%19;
    A=(19*a+m)%30;
    b=año%4;
    c=año%7;
    B=(2*b+4*c+6*A+n)%7;
    
    
   	 if((A+B+22-3)>31)
	 {
	 	if(año<=2009)
	 	{
	 	
           System.out.println("EL JUEVES SANTO FUE EL : "+(int)(A + B - 12)+" DE ABRIL");
           if((A + B - 9-3)==31)
           {
         	System.out.println("Y EL VIERNES SANTO EL: "+"1 DE ABRIL");
           }
           else
           {
           System.out.println("Y EL VIERNES SANTO EL: "+(int)(A + B - 11)+" DE ABRIL");
           }
       }
       else
       {
         	System.out.println("EL JUEVES SANTO SERA EL : "+(int)(A + B - 12)+" DE ABRIL");
            if((A + B - 9-3)==31)
            {
       	    System.out.println("Y EL VIERNES SANTO EL: "+"1 DE ABRIL");
            }
            else
            {
            System.out.println("Y EL VIERNES SANTO EL: "+(int)(A + B - 11)+" DE ABRIL");
            }  
       }
       	
     }
     else
     {
       if(año<=2009)
	   {
           System.out.println("EL JUEVES SANTO FUE EL : :"+ (int)(A + B + 22-3)+" DE MARZO");
           if((A + B - 9-3)==31)
           {
       	   System.out.println("Y EL VIERNES SANTO EL: "+" 1 DE ABRIL");
           }
           else
           {
       
            System.out.println("Y EL VIERNES SANTO ES EL : "+(int)(A + B + 22-2)+" DE MARZO");
           }
        }
        else
        {
        	System.out.println("EL JUEVES SANTO SERA EL : :"+ (int)(A + B + 22-3)+" DE MARZO");
           if((A + B - 9-3)==31)
           {
       	   System.out.println("Y EL VIERNES SANTO EL: "+" 1 DE ABRIL");
           }
           else
           {
       
            System.out.println("Y EL VIERNES SANTO ES EL : "+(int)(A + B + 22-2)+" DE MARZO");
       
           }
        }
     }
    double x = 4.0;
	double y = 3.0;
	 
	double r = Math.hypot(x, y);
	double aRad = Math.atan2(y, x);
	double al = Math.toDegrees(aRad);
	 
	System.out.println("Para x = " + x + "   y = " + y);
	System.out.println("r = " + r);
	System.out.println("al = " + al + "º");
  }
  
}    
    