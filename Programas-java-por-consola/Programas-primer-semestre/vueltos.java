/// simulador cajero(Moneda colombiana)

class vueltos
{
	public static void main(String arg[])
	{
	int m50,m100,m200,m500,b1,b2,b5,b10,b20,b50; 
	long vd,vp,vueltos,i;
	m50=0;
	m100=0;
	m200=0;
	m500=0;
	b1=0;
	b2=0;
	b5=0;
	b10=0;
	b20=0;
	b50=0; 
	 
	 
	 
	 
	  System.out.print("Escriba su saldo: ");
	  vd=Leer.leerlong();
	  System.out.print(" ahora la cantidad a retirar: ");
	  vp=Leer.leerlong();
	  vueltos=vp-vd;
	  for(i=vueltos;i>=50000;i=i-50000)
	  {
	  b50++;
	  }
	  vueltos=i;
	  for(i=vueltos;i>=20000;i=i-20000)
	  {
	  b20++;
	  }
	  vueltos=i;
	  for(i=vueltos;i>=10000;i=i-10000)
	  {
	  b10++;
	  }
	  vueltos=i;
	  for(i=vueltos;i>=5000;i=i-5000)
	  {
	  b5++;
	  }
	  vueltos=i;
	  for(i=vueltos;i>=2000;i=i-2000)
	  {
	  b2++;
	  }
	  vueltos=i;
	  for(i=vueltos;i>=1000;i=i-1000)
	  {
	  b1++;
	  }
	  vueltos=i;
	  for(i=vueltos;i>=500;i=i-500)
	  {
	  m500++;
	  }
	  vueltos=i;
	  for(i=vueltos;i>=200;i=i-200)
	  {
	  m200++;
	  }
	  vueltos=i;
	  for(i=vueltos;i>=100;i=i-100)
	  {
	  m100++;
	  }
	  vueltos=i;
	  for(i=vueltos;i>=50;i=i-50)
	  {
	  m50++;
	  }
	  
	  vueltos=i;
	   System.out.println(" billetes de 50000: "+b50);
	   System.out.println(" billetes de 20000: "+b20);
	   System.out.println(" billetes de 10000: "+b10);
	   System.out.println("  billetes de 5000: "+b5);
	   System.out.println("  billetes de 2000: "+b2);
	   System.out.println("  billetes de 1000: "+b1);
	   System.out.println("    monedas de 500: "+m500);
	   System.out.println("    monedas de 200: "+m200);
	   System.out.println("    monedas de 100: "+m100);
	   System.out.println("     monedas de 50: "+m50);
	  
	}
}
 