class nodopila
{
	int dato;
	nodopila siguiente;
	public nodopila (int d)
	{
		dato=d;
		siguiente=null;
		
	}
}

class pila
{
	nodopila tope;
	
	public pila()
	{
		tope=null;
	}
	
	public void insertainicio(int d)
	{
		nodopila nuevo= new nodopila(d);
		if(tope!=null)
		nuevo.siguiente=tope;
		tope=nuevo;
		
	}
	
	public int sacar()
	{
		int v=tope.dato;
		tope=tope.siguiente;
		return v;
	}
}



class ProvarPila
{
	public static void main(String yeniret[])
	{
		pila Barta=new pila();
		for (int i = 1; i<8; i++)
		Barta.insertainicio(i);
		for (int i = 1; i<8; i++)
		System.out.println(Barta.sacar());
		Barta.insertainicio(999);
		
		System.out.println(Barta.sacar());
	}
	
}