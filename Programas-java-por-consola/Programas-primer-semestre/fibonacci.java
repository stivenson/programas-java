class fibonacci
{
	public static void main(String arg[])
	{
		int a=0,b=1,c,i;
		byte d= 20;
		
		System.out.println("resultado: \n ");
        
        System.out.print(a);
        System.out.print(" , "+b);
        for(i=1;i<=d;i++)
        {
        c=a+b;
        a=b;
        b=c;
        System.out.print(" , "+c);	
        }
	}
}