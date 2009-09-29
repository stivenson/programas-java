class segundos
{
  public static void main (String arg[])
  {
  int tsegundos,sigue;
  float hora,minutos,segundos;
  System.out.println("                SEGUNDOS EN HORAS, MINUTO Y SEGUNDOS          ");
  System.out.println("\n\n");
  do{
  	
  	  
  	  do{
      System.out.print("Ingrese el total de segundos: ");
      tsegundos=Leer.leerint();	
      }while(tsegundos==0);
  
    System.out.print("\n\n");
  	hora=(int)(tsegundos/3600);
  	minutos=(int)((tsegundos%3600)/60);
  	segundos=(int)(((tsegundos%3600)%60)%60);
  	System.out.print((int)hora+" : "+(int)minutos+" : "+(int)segundos);
  	System.out.print("\n\n");
  	System.out.println("1.continuar");
  	System.out.println("2.salir");
  	sigue=Leer.leerint();
  	}while(sigue==1);
  	
	
	
   }
 }