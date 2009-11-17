class lugar_punto
{
	public static void main(String arg[])
	{
	int x1,y1,x2,y2,x3,y3,esta=0;
	
	
	System.out.print("x1: ");
	x1=Leer.leerint();
	System.out.print("y1: ");
	y1=Leer.leerint();
	System.out.print("x2: ");
	x2=Leer.leerint();
	System.out.print("y2: ");
	y2=Leer.leerint();
	System.out.print("x3: ");
	x3=Leer.leerint();
	System.out.print("y3: ");
	y3=Leer.leerint();
	
	
	
	
	if(x1<x2)
	{
		if(y1<y2)
		{
     	if(x3>=x1 && x3<=x2)
    	{
	      if(y3>=y1 && y3<=y2) 
	      {
	      esta++;	
	  	  System.out.print("EL PUNTO ESTA DENTRO DE LA FIGURA");
	      }	
	   }
	 }
	 else
	 {
	 if(x3>=x1 && x3<=x2)
    	{
	      if(y3>=y2 && y3<=y1) 
	      {
	      esta++;	
	  	  System.out.print("EL PUNTO ESTA DENTRO DE LA FIGURA");
	      }	
	   }	
	 	
	 }
	}
	else
    {
		
		if(y2<y1)
		{
		
	      if(x3>=x2 && x3<=x1)
    	  {
	        if(y3>=y2 && y3<=y1) 
	        {
	        esta++;	
	  	    System.out.print("EL PUNTO ESTA DENTRO DE LA FIGURA");
	        }	
	      }
	    }
	    else
	    {
	       if(x3>=x2 && x3<=x1)
       	  {
	        if(y3>=y1 && y3<=y2) 
	        {
	        esta++;
	  	    System.out.print("EL PUNTO ESTA DENTRO DE LA FIGURA");
	        }	
	      }
	    }	
     }
     if(esta==0)
     System.out.println("EL PUNTO NO ESTA DENTRO DE LA FIGURA");
	
	}
	
	
	
	}
