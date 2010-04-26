class Practica_Segundo_Parcial{
	static int valorAbuscar;
	static int M[][]=new int[5][5];
	
	
//////////////////////////////////////////////////////////////////////////////////////////////////	
	public static void main(String arg[])
	{
	Practica_Segundo_Parcial obj=new Practica_Segundo_Parcial(); //<-- creacion objeto "Practica_Segundo_Parcial".	
	int LLenoMatriz=0;	//<-- variable que me abisara cuando llene la matriz. 
	int opc=obj.Menu();  //<-- llamo al metodo "menu" que se encarga de mostrar todas las opciones en pantalla para que escoja, y debuelve la opcion escojida que es guardada en "opc", todo eso en esta misma linea.  
	
	   while(opc!=16) // <-- mientras la opcion no sea 16 osea la de "salir" no me salgo del ciclo.
	   {
	      if(opc==1 || opc==2) //<-- si la opcion son las de llenar matriz, osea 1 ó 2,incremento contador "llenoMatriz".
	      LLenoMatriz++;
	      if((opc==1 || opc==2)  &&  (LLenoMatriz>=2)) //<-- si la opcion son las de llenar matriz pero "llenomatriz" es igual o mayor a 2 osea ya la llene, cambio el valor de "opc" a 000.
	      opc=000;			
	   opc=obj.Acciones(opc);//<--llamo al metodo "Acciones" y le paso como parametro la opcion escogida pues la necesita para funcionar. A la ves debuelve la nueva opcion escogida y asi sigue con el ciclo.
	   }
	}
//////////////////////////////////////////////////////////////////////////////////////////////////////		
	public int Acciones(int opc){
	switch(opc){
		case 1:LLenarPorFilas();break;
		case 2:LLenarPorColumnas();break;
		case 3:MostarPorFilas();break;
		case 4:MostarPorColumnas();break;
		case 5:MostarDiagonalPrincipal();break;
		case 6:MostarDiagonalSecundaria();break;
		case 7:MostarEPEDP();break;
		case 8:MostarEPDDP();break;
		case 9:MostarEPEDS();break;
		case 10:MostarEPDDS();break;
		case 11:Promedio();break;
		case 12:indiceMayor();break;	
		case 13:indiceMenor();break;	
		case 14:buscar(valorAbuscar);break;
		case 15:FilaMayorColumna();break;
		case 000:
		System.out.println("ya lleno la matriz \n");
		break;		
		
	  }
	  return Menu();//<-- llamo el metodo "menu" que nuevamente imprime la opciones y ala ves debuelve la nueva opcion que corresponde al valor que necesito retornar, por eso todo esta en la misma linea.
	}
/////////////////////////////////////////////////////////////////////////////////////////////////////////	
	public int Menu(){
	int opc=0;
	System.out.println("**** 1. LLenar por filas ***********************************************");	
	System.out.println("**** 2. LLenar por columnas ********************************************");
	System.out.println("**** 3. Mostrar por filas **********************************************");
	System.out.println("**** 4. Mostrar por columnas *******************************************");
	System.out.println("**** 5. Mostrar diagonal Principal *************************************");
	System.out.println("**** 6. Mostrar diagonal Secundaria ************************************");	
	System.out.println("**** 7. Mostrar elementos por encima de diagonal Principal *************");
	System.out.println("**** 8. Mostrar elementos por debajo de diagonal Principal *************");
	System.out.println("**** 9. Mostrar elementos por encima de diagonal secundaria ************");
	System.out.println("**** 10. Mostrar elementos por debajo de diagonal secundaria ***********");
	System.out.println("**** 11. Promedio ******************************************************");
	System.out.println("**** 12. Mostrar elemento mayor de la matriz y la posicion *************");
	System.out.println("**** 13. Mostrar elemento menor de la matriz y la posicion *************");
	System.out.println("**** 14. Buscar un valor N *********************************************");
	System.out.println("**** 15. Mostar elemetos donde fila es mayor ala columna****************");
	System.out.println("**** 16. Salir *********************************************************");
	System.out.print("Escoja: ");
	opc=Leer.leerint();
	if(opc==14){
	System.out.print("Valor a buscar: ");
	valorAbuscar=Leer.leerint();	
	}
	
	return(opc);
	}
////////////////////////////////////////////////////////////////////////////////////////////////////////////	
 public void LLenarPorFilas(){
   for(int b=0;b<5;b++)
     	for(int c=0;c<5;c++)
     	{
     	System.out.print("valor Matriz [ "+b+" ][ "+c+" ] = ");	
     	M[b][c]=Leer.leerint();	
     	}	
  }	
 public void LLenarPorColumnas(){
   for(int b=0;b<5;b++)
     	for(int c=0;c<5;c++)
     	{
     	System.out.print("valor Matriz [ "+c+" ][ "+b+" ] = ");	
     	M[c][b]=Leer.leerint();	
     	}	
  }
  
 public void MostarPorFilas(){
    for(int b=0;b<5;b++){
    	for(int c=0;c<5;c++)
     	System.out.print(M[b][c]+"\t");
     	}
     	System.out.print("\n");	
    }
    
 public void MostarPorColumnas(){
    for(int b=0;b<5;b++){
    	for(int c=0;c<5;c++)
     	System.out.print(M[c][b]+"\t");
     	}
     	System.out.print("\n");	
    }
    
 public void MostarDiagonalPrincipal(){
 	int A=0;
    for(int b=0;b<5;b++){
     	System.out.print(M[b][A]+"\t");
     	A++;
     	}
     	System.out.print("\n");	
    }
    
 public void MostarDiagonalSecundaria(){
 	int A=4;
    for(int b=4;b>-1;b--){
     	System.out.print(M[b][A]+"\t");
     	A--;
     	}
     	System.out.print("\n");	
    }
    
    
 public void MostarEPEDP(){ //metodo para Mostrar Elementos Por Encima de Diagonal Principal
 	int A=1;
    for(int b=0;b<4;b++){
    	for(int c=A;c<5;c++)
     	System.out.print(M[b][c]+"\t");
     	A++;
     	}
     	System.out.print("\n");	
    }   
        
 public void MostarEPDDP(){//metodo para Mostrar Elementos Por Debajo de Diagonal Principal
 	int A=1;
    for(int b=1;b<5;b++){
    	for(int c=0;c<A;c++)
     	System.out.print(M[b][c]+"\t");
     	A++;
     	}
     	System.out.print("\n");	
    }
    
  public void MostarEPEDS(){ //metodo para Mostrar Elementos Por Encima de Diagonal Secundaria
 	int A=4;
    for(int b=0;b<4;b++){
    	for(int c=0;c<A;c++)
     	System.out.print(M[b][c]+"\t");
     	A--;
     	}
     	System.out.print("\n");	
    }
    
  public void MostarEPDDS(){ //metodo para Mostrar Elementos Por Debajo de Diagonal Secundaria
 	int A=4;
    for(int b=1;b<5;b++){
    	for(int c=A;c<5;c++)
     	System.out.print(M[b][c]+"\t");
     	A--;
     	}
     	System.out.print("\n");	
    }
    
  
  public void Promedio(){
  	double prom=0;
    for(int b=0;b<5;b++){
    	for(int c=0;c<5;c++)
     	prom=prom+M[b][c];
     	}
    System.out.println(prom/25);	
    }
    
   public void indiceMenor(){
   	int menor=M[0][0];//menor es igual al primer elemento de la matriz
   	int fila=0,columna=0;
   	for(int b=0;b<5;b++)// indice de las filas
   	 for(int c=1;c<5;c++)// indice de las columnas
   	 {
   	 	if(M[b][c]<menor){ // si el elemento siguiente es menor, cambio posiciones para que la variable "menor"tenga ahora  el valor del "elemento siguiente". 
   	 		menor=M[b][c];
   	 		fila=b;
   	 		columna=c;
   	 	}
   	 	
   	 	
   	 }
   	System.out.println("VALOR MENOR : "+menor+", esta en fila "+fila+" y columna "+columna);
  	}
  
  public void indiceMayor(){
   	int mayor=M[0][0];
   	int fila=0,columna=0;
   	for(int b=0;b<5;b++)
   	 for(int c=1;c<5;c++)
   	 {
   	 	if(M[b][c]>mayor){
   	 		mayor=M[b][c];
   	 		fila=b;
   	 		columna=c;
   	 	}
   	 	
   	 	
   	 }
   	System.out.println("VALOR MAYOR : "+mayor+", esta en fila "+fila+" y columna "+columna);	
    }

public void buscar(int valor){
	int contador=0;
   	 for(int b=0;b<5;b++)
    	for(int c=0;c<5;c++)
     	if(M[b][c]==valor)
    	contador++;
    	System.out.println("Numero de veces que se encontro: "+contador);		
    }
    

  
       
    
   public void FilaMayorColumna(){
 	int A=4;
    for(int b=1;b<5;b++){
    	for(int c=A;c<5;c++)
     	System.out.print(M[b][c]+"\t");
     	A--;
     	}
     	System.out.print("\n");	
    }      
     
    
       
       
  
  	
}