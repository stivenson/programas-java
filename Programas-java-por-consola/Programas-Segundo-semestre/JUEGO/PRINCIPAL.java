import java.io.*;

class PRINCIPAL{ ////Metodo a ejecutar
	public static String YO;
	public static String TU;
	public static String FRASE;
	public static int OPORTUNIDADES;
	
	
	public static void main(String arg[]){ //main
	PRINCIPAL p=new PRINCIPAL();
	p.Jugadores();
	p.DigitarFrase();
	p.Oportunidades();
	p.Informacion();
	JUEGO juego=new JUEGO(FRASE,OPORTUNIDADES); /// creo objeto de la clase JUEGO
	juego.EMPEZAR(); ///todo este metodo se encarga del desarrollo dle juego, todo eso en la otra clase	
	}
//////////////////////////////////////////////////////////////////////////////////////////////	
	public void Jugadores(){ ///metodo llamado por el main
	System.out.println("**********************| EL AHORCADO |**********************");
	System.out.println("        ********** Stivenson Rincon Mora *************     ");	
	System.out.println("           ********* Nelio gonzalez ****************       ");
	System.out.print("YO: ");	
	YO=Leer.leercadena();
	System.out.print("TU: ");	
	TU=Leer.leercadena();
	Espacios(25);
	}
///////////////////////////////////////////////////////////////////////////////////////////////	
	
	public void DigitarFrase(){///metodo llamado por el main
		
	System.out.print( YO+" por favor digite su frase: ");
	FRASE=Leer.leercadena();
	}

////////////////////////////////////////////////////////////////////////////////////////////////	
     
     public void Oportunidades(){////metodo llamado por el main
		
	System.out.print( YO+" y ahora digita la cantidad de oportunidades: ");
	OPORTUNIDADES=Leer.leerint();
	Espacios(25);
	}
	
////////////////////////////////////////////////////////////////////////////////////////////////	
	
	 public void Informacion(){ ///metodo llamado por el main
		
	System.out.println("hola "+TU+", "+YO+" te puso para adivinar una frase de "+(FRASE.length()-EspaciosEnlaFrase())+" letras.");
	System.out.println("Tiene "+ContarVocales(FRASE.toUpperCase())+" vocales");
	System.out.println("Tiene "+ContarConsonantes(FRASE.toUpperCase())+" consonantes\n");
	String ENTER=" ";
	System.out.println("PULSA ENTER PARA EMPEZAR A JUGAR !!!");
    ENTER=Leer.leercadena();
     }
     
 ////////////////////////////////////////////////////////////////////////////////////////////////	    
     
public int EspaciosEnlaFrase(){ ///metodo utilizado por Informacion() y por ContarConsonantes(String frase).
    int con=0;
    for(int c=0;c<FRASE.length();c++)
    	if(String.valueOf(FRASE.charAt(c)).equals(" ")==true)
    	   con++;
    	   return con;		
    }
    
////////////////////////////////////////////////////////////////////////////////////////////////    
    
    public int ContarVocales(String frase){ ///metodo llamado por Informacion()
    int CodigoAnsiActual,con=0;	
    
    	for(int c=0;c<FRASE.length();c++){
    	CodigoAnsiActual=(int)(frase.charAt(c));
    	if(EsVocal(CodigoAnsiActual)==true)
    	  con++;
    	}
     return con;
    }
    
     
///////////////////////////////////////////////////////////////////////////////////////////////////      
    
    public boolean EsVocal(int codigoAnsi){/////metodo utilizado solo por ContarVocales(String frase).
    if((codigoAnsi==65)||(codigoAnsi==69)||(codigoAnsi==73)||(codigoAnsi==79)||(codigoAnsi==85))
    return true;
    else
    return false;
    }
    
 //////////////////////////////////////////////////////////////////////////////////////////////////////////////   
   
 public int ContarConsonantes(String frase){ //metodo llamado por Informacion()
      int CodigoAnsiActual,con=0;	
    
    	for(int c=0;c<frase.length();c++){
    	CodigoAnsiActual=(int)(frase.charAt(c));
    	if(EsConsonante(CodigoAnsiActual))
    	  con++;
    	}
    return (con- EspaciosEnlaFrase());	
   }
   
///////////////////////////////////////////////////////////////////////////////////////////////////////////////   
    
    public boolean EsConsonante(int codigoAnsi){  ////metodo utilizado solo por  ContarConsonantes(String frase).
    if((codigoAnsi!=65)&&(codigoAnsi!=69)&&(codigoAnsi!=73)&&(codigoAnsi!=79)&&(codigoAnsi!=85))
    return true;
    else
    return false;
    }
    
 ////////////////////////////////////////////////////////////////////////////////////////////////////////////////  
    public void Espacios(int c){// solo es un metodo para la apariencia 	
	for(int i=0;i<c;i++)
	System.out.print("\n");	
	}


	
}