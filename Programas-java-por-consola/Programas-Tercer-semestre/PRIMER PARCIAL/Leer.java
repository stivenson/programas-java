import java.io.*;

/*

				**************CLASE LEER *******************
				
	CLASE QUE PERMITE OBTENER DATOS PRIMITIVOS Y STRING DESDE EL TECLADO
	Conceptos Involucrados:
	
	FLUJOS DE ENTRADA E/S:
		System.in-->Referencia la entrada estándar del sistema, que normalmente
					coincide con el teclado.
		System.out-->Referencia a  la salida estándar del sistema, que normalmente es 
					 el monitor.
	
	Diagrama de entrada de datos:
	*****************************************************************
	*PROGRAMA<--FLUJOE <-------------FLUJOBYTE <-------IN---TECLADO *
	*     CARACTERES								BYTES           *
	*	BufferedReader							InputStreamReader   *  
	*****************************************************************
	
	EXEPCION:Soporte para manejar situaciones anómalas(exepciones), que pueden ocurrir durante la
			ejecución de un programa.Proporcionan una manera limpia de verificar errores.
			El manejo de Exepciones permite separar explícitamente el código básico que maneja 
			los errores, del código básico de una aplicación haciéndolo más legible.Partes:
			
			try{
								//CODIGO DE LA APLICACION
				}
				catch(clase_de_excepcion e)
				{
								//CODIGO DE TRATAMIENTO PARA LA EXECEPCIONºº 
				}
 */

class Leer
{
	
	
	
	public static void main(String algo[])
		{
			
			int datoentero;
			float datofloat;
			double datodouble;
			byte datobyte;
			long datolong;
			char datochar;
			short datoshort;
			String datostring;
			System.out.println("Digite una cadena:");
			datostring=leercadena();
			System.out.println("La cadena fue:"+datostring);
			System.out.println("Digite un entero:");
			datoentero=leerentero();
			System.out.println("El entero fue:"+datoentero);
			System.out.println("Digite un entero-tamaño byte:");
			datobyte=leerbyte();
			System.out.println("El entero fue:"+datobyte);
			System.out.println("Digite un char:");
			datochar=leerchar();
			System.out.println("El char fue:"+datochar);
			
			
				
			
		}
		
		
		
	
		
		
		
	public static byte leerbyte()
		{
		byte dato=0;
		try{
		
			String cadena=leercadena();
			dato=Byte.parseByte(cadena);
		}
		catch(NumberFormatException e) //Se intento convertir una cadena con un formato inapropiado de numero
		{
			System.out.println("Error:"+e.getMessage());
		}
	return dato;
	}
		
		
		
		
	public static long leerlong()
		{
		long dato=0;
		try{
		
			String cadena=leercadena();
			dato=Long.parseLong(cadena);
		}
		catch(NumberFormatException e) //Se intento convertir una cadena con un formato inapropiado de numero
		{
			System.out.println("Error:"+e.getMessage());
		}
	return dato;
	}
	
	
	
	
	public static int leerint()
		{
		int dato=0;
		try{
		
			String cadena=leercadena();
				dato=Integer.parseInt(cadena);
		}
		catch(NumberFormatException e) //Se intento convertir una cadena con un formato inapropiado de numero
		{
			System.out.println("Error:"+e.getMessage());
		}
	return dato;
	}
		
		
		
	public static short leershort()
		{
		short dato=0;
		try{
		
			String cadena=leercadena();
			dato=Short.parseShort(cadena);
		}
		catch(NumberFormatException e) //Se intento convertir una cadena con un formato inapropiado de numero
		{
			System.out.println("Error:"+e.getMessage());
		}
	return dato;
	}	
		
		
		
		public static double leerdouble()
		{
		double dato=0;
		try{
		
			String cadena=leercadena();
			dato=Double.parseDouble(cadena);
		}
		catch(NumberFormatException e) //Se intento convertir una cadena con un formato inapropiado de numero
		{
			System.out.println("Error:"+e.getMessage());
		}
	return dato;
	}
		
		
		
		
		
		
		
		
	public static float leerfloat()
		{
		float dato=0;
		try{
		
			String cadena=leercadena();
			dato=Float.parseFloat(cadena);
		}
		catch(NumberFormatException e) //Se intento convertir una cadena con un formato inapropiado de numero
		{
			System.out.println("Error:"+e.getMessage());
		}
	return dato;
	}
		
		
		
	public static int leerentero()
		{
		int dato=0;
		try{
		
			String cadena=leercadena();
			dato=Integer.parseInt(cadena);
		}
		catch(NumberFormatException e) //Se intento convertir una cadena con un formato inapropiado de numero
		{
			System.out.println("Error:"+e.getMessage());
		}
	return dato;
	}
	
	
	
	public static String leercadena()
	{
		
		String cadena="";
		try
			{
				InputStreamReader flujobyte=new InputStreamReader(System.in);
				BufferedReader flujocaracter=new BufferedReader(flujobyte);
				cadena=flujocaracter.readLine();
			}
		catch(IOException e) //execepciones ocurridas al ejecutar una operación de E/S
			{
				System.out.println("Error:"+e.getMessage());
			}
	return cadena;
	}
	
	
	
	public static char leerchar()
	{
		
		char caracter='\t'; //caracter de tabulador
		try
			{
				caracter=(char)System.in.read();
			}
		catch(IOException e) //execepciones ocurridas al ejecutar una operación de E/S
			{
				System.out.println("Error:"+e.getMessage());
			}
	return caracter;
	}
		
		
		
		
	
}