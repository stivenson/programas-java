class longitud_recta
{
	public static void main(String arg[])
	{
		int x1,y1,x2,y2;
		double re;
		
		System.out.print("X1: ");
 	    x1=Leer.leerint();
 	    System.out.print("y1: ");
 	    y1=Leer.leerint();
 	    System.out.print("X2: ");
 	    x2=Leer.leerint();
 	    System.out.print("y2: ");
 	    y2=Leer.leerint();
 	    
 	    
 	    re=Math.pow(Math.pow((x2-x1),2)+Math.pow((y2-y1),2),0.5);
 	    
 	    if(re==0)
 	    {
 	    System.out.println("longitud: 0");	
 	    }
 	    else
 	    {
 	    System.out.println("longitud: "+re);
 	    }
 	    
	}
}