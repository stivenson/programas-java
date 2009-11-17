class lugar_punto_circulo
{
	public static void main(String arg[])
	{
		
	int x1,y1,cx2,cy2,x3,y3,esta=0;	
	double r,rp;
		
		
	System.out.print("x1: ");
	x1=Leer.leerint();
	System.out.print("y1: ");
	y1=Leer.leerint();
	System.out.print("coordenada centro x : ");
	cx2=Leer.leerint();
	System.out.print("coordenada centro y: ");
	cy2=Leer.leerint();
	System.out.print("x3: ");
	x3=Leer.leerint();
	System.out.print("y3: ");
	y3=Leer.leerint();
	
	r=Math.pow(Math.pow((cx2-x1),2)+Math.pow((cy2-y1),2),0.5);
	rp=Math.pow(Math.pow((cx2-x3),2)+Math.pow((cy2-y3),2),0.5);
	
	    if(rp<=r)
	    {
		System.out.println("EL PUNTO ESTA DENTRO DEL CIRCULO"); 
	    }
	    else
	    {
	    System.out.println("EL PUNTO NO ESTA DENTRO DEL CIRCULO");	
	    }
	
	}
	
	
}