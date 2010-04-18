class metodos 
{
	
		public static String nombre;
		public static String direccion;
		public static long telefono;

	
	public void asignarnombre(String nom)
	{
		nombre=nom;
	}
	
	public String obtenerNombre()
	{
		String nom =Leer.leercadena();
		return nom;
	}
	public void asignarDireccion(String dir)
	{
		direccion=dir;
	}
	public String obtenerDireccion()
	{
		String dir=Leer.leercadena();
		return dir;
	}
	public void asignarTelefono(long tel)
	{
		telefono=tel;
	}
	
	public long obtenerTelefono()
	{
		long tel=Leer.leerlong();
		return tel;
	}

	public void llametodos ()
	{
		System.out.println("Nombre ");
		String n1=obtenerNombre();
	    asignarnombre(n1);
		
		System.out.println("Direccion ");
		String d1=obtenerDireccion();
		this.asignarDireccion(d1);
		
		System.out.println("Telefono ");
		long t1=obtenerTelefono();
		asignarTelefono(t1);
	}
		
	public static void main (String args[])
	{
	
	
		metodos  m = new metodos ();
		
		m.llametodos();
		
		System.out.println("Los datos de la persona son");
		System.out.println("Nombre " + nombre);
		System.out.println("Direccion " + direccion);
		System.out.println("telefono " + telefono);
		
	}
}