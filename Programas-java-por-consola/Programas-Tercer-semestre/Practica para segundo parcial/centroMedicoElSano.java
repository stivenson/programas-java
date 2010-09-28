class afili
{
	int dato,cita;
	afili siguiente,anterior;
	public afili(int d)
	{
		dato=d;
		siguiente=null;
		anterior=null;
		cita=0;
	}
}
class afiliados
{
	afili primero, ultimo,aux;
	
	public afiliados()//constructor
	{
		ultimo=null;
		primero=null;	
	}
	public void insertarInicio(int d)//inser inicio
	{
		afili nuevo=new afili(d);
		
		if (primero==null)
			ultimo=nuevo;
		else
		{
			nuevo.siguiente=primero;
			primero.anterior=nuevo;
		}
			primero=nuevo;
	}

	

	public void imprimir()
	{
		afili aux=primero;
		while (aux!=null)
		{
			System.out.println("doc. paciente No. 	"+" "+aux.dato + "  citas "+aux.cita);
			aux=aux.siguiente;
		}
	}
	public boolean listaVacia()
	{
		if(primero==null)
		return (true);
		else
		return(false);
	}
	public boolean EstaValor(int d)
	{
		boolean e=false;
		afili aux=primero;
		while(aux!=null)
		{
			if(aux.dato==d)
			e=true;
		aux=aux.siguiente;
		}
		return e;
	}
	
	public int tamano()
	{
		int t=0;
		if(primero!=null)
		{
			afili aux=primero;
			while(aux!=null)//Corrigo Error: while(aux.siguiente!=null) 
			{
				t++;
				aux=aux.siguiente;
			}
		}
		return (t);
	}
	public void ordenaLista1()
	{
	afili p=new afili(0);	
		for(int a=0;a<tamano()-1;a++)
		{
			aux=primero;
			for(int i=0;i<tamano()-1;i++)
			{
				if(aux.cita<aux.siguiente.cita)
			    {
				p.cita=aux.cita;
				p.dato=aux.dato;
				aux.cita=aux.siguiente.cita;
				aux.dato=aux.siguiente.dato;
				aux.siguiente.cita=p.cita;
				aux.siguiente.dato=p.dato;
			   }
			   aux=aux.siguiente;
			}
			
		}
	}

	
	public afili buscarNodo(int d)
	{
		
		int t=tamano();
		aux=primero;
		while ((aux.dato!=d)&&(t>0))
		{
			aux=aux.siguiente;
			t--;
		}
		return(aux);
	}
   public afili buscarNodoPosicion(int p)
	{
	aux=primero;	
	for (int i = 2; i<=p; i++)
	aux=aux.siguiente;
	return aux;
	}
}
class centroMedicoElSano
{
	static afiliados pacientes =new afiliados();
	static afiliados citas= new afiliados();
	static afiliados nCitas= new afiliados();
	
	public static void main (String arg[])
	{
		System.out.println("HOSPITAL EL SANO");
		System.out.println("(se generarán CC aleatorias del 1 al 20,\n por eso no pueden haver mas de 20\n afiliados.)");
		System.out.print("Ingrese la cantidad de afiliados: ");
		aleatorio(Leer.leerentero());//llena lista 2
		pacientes.imprimir();//muestro lista 2	
		System.out.print("Ingrese la cantidad de citas: ");
		citas(Leer.leerentero());//llena lista 1
		System.out.println("\nAFILIADOS CON CITAS EN EL MES");
		citas.imprimir();//muestro lista 1
		citas.ordenaLista1();//ordeno lista 1
		System.out.println("\nAFILIADOS CON CITAS EN EL MES ORDENADOS");
		citas.imprimir();//y la muestro ordenada....:)
		noCitas();//llena lista 3
		System.out.println("\nAFILIADOS SIN CITAS EN EL MES");
		nCitas.imprimir();//y tambien la muestro..
	}
	
	static public void aleatorio(int cant)
	{
		for(int i=0;i<cant;i++)
		{
			int x=(int)(Math.random()*20)+1;
			if(pacientes.EstaValor(x))
			i--;
			else
			pacientes.insertarInicio(x);
		}
	}
	static void citas(int numcit)
	{
		int tam=pacientes.tamano();//guardo en variable para evitar varios llamados dentro del for.
		for(int i=0;i<numcit;i++)
		{
			int pos=(int)(Math.random()*tam)+1;//posicion aleatoria que no se salga de la cantidad de pacientes
			afili A=pacientes.buscarNodoPosicion(pos);//busca y devuelbe nodo en la posicion pasada, en esta caso posicion aleatoria
			if(citas.EstaValor(A.dato)==false)
			citas.insertarInicio(A.dato);
			
			pacientes.buscarNodo(A.dato).cita++;//guardo la cantidad de citas en la lista principal
			                                    //para saber quienes quedan sin citas. 
			citas.buscarNodo(A.dato).cita++;
		}
	}

	static  void noCitas()
	{
		int can=pacientes.tamano(); //guardo en variable para evitar varios llamados en el for.
		for(int i=1;i<=can;i++)
		{
			
		   if(pacientes.buscarNodoPosicion(i).cita==0)
		   {
		   	nCitas.insertarInicio(pacientes.buscarNodoPosicion(i).dato);
		   }
		}	
	}
}