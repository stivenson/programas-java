


class diassantos
{
	public static void main (String arg[])
	{
	int m=0,n=0,repetir;	
	long a�o;
	double a,A,b,B,c,d;
	System.out.print("                        DIAS SANTOS SEGUN EL A�O                 ");
	System.out.print("\n");
   
    System.out.print("\n");
    do{
    repetir=0;	
    System.out.print("A�O: ");
    a�o=Leer.leerlong();
    if(a�o>=1583&&a�o<=1699)
    {
    m = 22;
    n= 2;
    }
    else
    {
      if(a�o>=1700&&a�o<=1799)
      {
      m=23;
      n=3;	
      }
      else
      {
      	if(a�o>=1800&&a�o<=1899)
      	{
      	m=23;
        n=4;	
      	}
      	else
      	{
      		if(a�o>=1900&&a�o<=2099)
      		{
      		m=24;
      		n=5;	
      		}
      		else
      		{
      			if(a�o>=2100&&a�o<=2199)
      			{
      			m=24;
      			n=6;	
      			}
      			else
      			{
      			   if(a�o>=2200&&a�o<=2299)
      			   {
      				m=25;
      				n=0;
      			   }
      			   else
      			   {
      			   	System.out.println("Solo a�os compredidos entre 1583 hasta 2299");
      			   	repetir++;
      			   }	
      			}
      		}
      	}
      }	
    }
      
      
    }while(repetir!=0);  
   
    a=a�o%19;
    A=(19*a+m)%30;
    b=a�o%4;
    c=a�o%7;
    B=(2*b+4*c+6*A+n)%7;
    
    
   	 if((A+B+22-3)>31)
	 {
	 	if(a�o<=2009)
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
       if(a�o<=2009)
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
	System.out.println("al = " + al + "�");
  }
  
}    
    