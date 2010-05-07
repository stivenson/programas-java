/*la empresa xyz tiene 30 empleados, los cuales
trabajan 20 dias al mes. Cada dia es cancelado segun el % del trabajo realizado asi: 

si realiza 100 o mas productos diarios se le cancela 80 x c/u
si realiza mas de 60 hasta 99 se le cancela 60  x c/u
si realiza mas de 30 hasta 59 se le cancela 40  x c/u
por menos de 29 solo se cancela 20 x c/u
- se debe mostrar el total realizado por cada 5 dias, y el valor a cancelar
, el valor total cancelado por empleado,el total de empleados que por semana(5 dias)
realizan o llegan al valor maximo de pago(80 x c/u); Al final del mes (20 dias) se bonificara
 altrabajador con mas unidades realizadas con el valor de la semana que mas gano.
Mostrar la matriz completa por semana.*/


class Practica_Tercer_Parcial
{
public static int[][] M=new int[5][20];
public static int[][] SemanasT=new int[5][4];
public static int[][] SemanasTG=new int[5][4];
public static int c1=0,c2=0,c3=0,c4=0;
public static boolean SeConto=false;
	
public static void main(String arg[])//////////metodo principal///////////
	{
	Practica_Tercer_Parcial objeto=new Practica_Tercer_Parcial();	
	objeto.llenadoAleatorioDeMatriz();
	objeto.ProductosPorSemanaPorTrabajador();
	objeto.TrabajoTotalPorSemana();	
	objeto.GananciaTotalPorEmpleado();
	objeto.MostrarAlcanzaronValorMaximo();
	objeto.MostrarMatrizYBonificacion();	
	}
	
public void LLenadoPorTrabajador(){///// metodo para llenar la matriz por filas///////
   for(int b=0;b<5;b++)
     	for(int c=0;c<20;c++)
     	{
     	System.out.print("Trabajador[ "+(b+1)+" ]Dia [ "+(c+1)+" ] = ");	
     	M[b][c]=Leer.leerint();	
     	}	
  }



////////////////////////////////////////////////////////////////////////////////////////////////////////////////////  
  public void TrabajoTotalPorSemana(){
  	int s=0;
  	for(int c=0;c<4;c++){
     	for(int b=0;b<5;b++)
          s=s+SemanasT[b][c];
          System.out.println("En la Semana "+(c+1)+" se hicieron "+s+" productos y el valor a cancelar fue "+GananciaTotalPorSemana(c));
          s=0;
     }
  } 
 public int GananciaTotalPorSemana(int Semana){
    int s=0;
    for(int b=0;b<5;b++)
    s=s+SemanasTG[b][Semana];
  	return s;	    
  }
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////  
  public void GananciaTotalPorEmpleado(){
  int GananciaMes;
  for(int c=0;c<5;c++){
  	  GananciaMes=0;
      for(int b=0;b<4;b++)	
      GananciaMes=GananciaMes+SemanasTG[c][b];
    System.out.println("Trabajador "+(c+1)+" se gano en el mes "+GananciaMes);	
   	
  }
    
  }
  
  public void MostrarMatrizYBonificacion(){
  int indice= EmpleadoConMasProduccionDelMes();
  int ValorMejorSemana= MejorSemanaEmpleadoConMasProduccion(indice);
  	for(int b=0;b<5;b++){
  		for(int c=0;c<4;c++){
  		System.out.println("Trabajador "+(b+1)+" en semana  "+(c+1)+" se gano "+SemanasTG[b][c]);
  		}
  		if(indice==b)
  		System.out.println(" Y SE GANO UNA BONIFICACION DE "+ ValorMejorSemana);
  	}
  }
  
   public int EmpleadoConMasProduccionDelMes(){
   	int ProduccionMayor=0;
   	int  ProduccionSiguiente=0;
   	int indiceMayor=0;
   	for(int b=0;b<4;b++)	
     ProduccionMayor=ProduccionMayor+SemanasT[0][b];
     for(int c=1;c<5;c++){
       for(int b=0;b<4;b++)	
        ProduccionSiguiente=ProduccionSiguiente+SemanasT[c][b];   
   	     if(ProduccionMayor<ProduccionSiguiente){
   	     ProduccionMayor=ProduccionSiguiente;	
   	     indiceMayor=c;	
   	     }
   	   }
   	return indiceMayor;
   }
   
 public int MejorSemanaEmpleadoConMasProduccion(int indice){
 	int MejorSemana=SemanasTG[indice][0];
 	 for(int b=1;b<4;b++)
 	 	if(MejorSemana<SemanasTG[indice][b])
 	 	MejorSemana=SemanasTG[indice][b];
 	 		
   return MejorSemana;	 			
 }
  
 public void LLegariaAlMaximo(int valor, boolean b,int semana){
    if((valor >= 100)&&(b==false))
 	{
 	   switch(semana)
 	   {
 	     case 0:c1++;break;
 	     case 1:c2++;break;
 	     case 2:c3++;break;
 	     case 3:c4++;break;
 	   }
 	 SeConto=true;  
    }	
 }
 public void MostrarAlcanzaronValorMaximo(){
 	 System.out.println("Alcanzaron valor maximo semana 1: "+c1);
 	 System.out.println("Alcanzaron valor maximo semana 2: "+c2);
     System.out.println("Alcanzaron valor maximo semana 3: "+c3);
     System.out.println("Alcanzaron valor maximo semana 4: "+c4);	
    }   
  
   
 public void llenadoAleatorioDeMatriz(){
 	  for(int b=0;b<5;b++)
     	for(int c=0;c<20;c++){
     		M[b][c]=(int)(Math.random()*300)+1;	
     		System.out.println("Trabajador[ "+(b+1)+" ]Dia [ "+(c+1)+" ] = "+M[b][c]);
     	}
     	
     }  
    
  public void ProductosPorSemanaPorTrabajador(){   ///// metodo para llenar la matriz de los productos por semana por trabajador////  
	int Aquiboy=0;
	int s=0;
   for(int b=0;b<5;b++){  ///recorrido por todos los trabajadores.
        for(int c=0;c<4;c++){  ///recorrido por las semanas del respectivo trabajador.
     	   for(int f=Aquiboy;f<Aquiboy+5;f++){   ////recorrido por dias de la respectiva semana.
     	   	      GananciaPorSemanaPorTrabajador(M[b][f],b,c);   /////metodo encargado de acumular ganancias en la respectiva semana del respectivo trabajador,osea llenar la tercera matriz.. 
     	   	      s=s+M[b][f];   ////sumatoria de productos hechos por dia.
     	   	      LLegariaAlMaximo(M[b][f], SeConto,c); ////verifica si la produccion de ese dia fue mayor a 100 para contarlo en su respectiva semana, tambien se encarga de contar solo una ves al trabajador. 
                 }       
     	SemanasT[b][c]=s;  ///se asigna la cantidad de productos en la respectiva semana del respectivo trabajador.
        Aquiboy=Aquiboy+5;  //incremento para continuar con los proximos 5 dias o semana.
     	s=0;  ///dejo listo el acumulador para la siguiente semana.
     	SeConto=false;
     	}
    Aquiboy=0;  ///dejo listo el contador para las semanas del siguiente trabajador.	
    }
  }
  
   public void GananciaPorSemanaPorTrabajador(int CantidadProductos, int indicefila, int indiceColumna){
	if(CantidadProductos >=100)
	SemanasTG[indicefila][indiceColumna]=SemanasTG[indicefila][indiceColumna]+CantidadProductos*80;	
	else if((CantidadProductos>60) && (CantidadProductos<=99) )
	SemanasTG[indicefila][indiceColumna]=SemanasTG[indicefila][indiceColumna]+CantidadProductos*60;
	 else if((CantidadProductos>30) && (CantidadProductos<=59) )
	 	SemanasTG[indicefila][indiceColumna]=SemanasTG[indicefila][indiceColumna]+CantidadProductos*40;
	 	else
	 	SemanasTG[indicefila][indiceColumna]=SemanasTG[indicefila][indiceColumna]+CantidadProductos*20;
}
  	
	
	
}