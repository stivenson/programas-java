class nodocola
{
	int dato;
	nodocola siguiente,anterior;
	public nodocola (int d)
	{
		dato=d;
		siguiente=null;
		anterior=null;
		
	}
}

class cola
{
	nodocola tope,ultimo;
	
	public cola()
	{
		tope=null;
		ultimo=tope;
	}
	
	public void inserta(int d)
	{
		nodocola nuevo= new nodocola(d);
		
		if(tope==null){
		tope=nuevo;	
		ultimo=tope;
		}
		else{
		nuevo.siguiente=tope;
		tope.anterior=nuevo;
		tope=nuevo;
		}
		
		
	
		
		
	}
	
	public int saca()
	{
		int v=ultimo.dato;
		ultimo=ultimo.anterior;
		ultimo.siguiente=null;
		return v;
	}
}



class ProvarCola
{
	public static void main(String yeniret[])
	{
		cola Barta=new cola();
		for (int i = 8; i>0; i--)
		Barta.inserta(i);
		for (int i = 1; i<8; i++)
		System.out.println(Barta.saca());
		Barta.inserta(999);
		
		System.out.println(Barta.saca());
	}
	
}