/**
 * @(#)Lista.java
 *
 *
 * @author Stivenson Rincon Mora
 * @versiofor n 1.00 2010/8/19
 */

import java.util.Scanner;
class Lista {
   
    Nodo primero;
    Nodo actual;
    int tamaño;
    private String ALERTA="posicion no existe en la lista";
    public Lista(){
    primero=null;
    actual=primero;
    tamaño=0;	
    }
     
 ////// Nodo ////////////////////////
   class Nodo{
   	int valor;
   	Nodo siguiente;
   	  public Nodo(int v)
   	  {
   	  valor=v;
   	  siguiente=null;	
   	  }
   }

  ////situar puntero de nombre: actual////////////////// 
  public void SituarmeEn(int sitio){
  	actual=primero;
  	for(int i=2;i<=sitio;i++)
  	actual=actual.siguiente;	
  }
 ///////////////////////////////////////////////////////
 public void AvanzarUno(){
 actual=actual.siguiente;	
 }
  //////////////////////////////////////////////////////
 public boolean ValidaPosicion(int pos){
 if(pos>0 && pos<=tamaño)return true;
 return false;	
 }
  ///////////////////////////////////////////////////////
  public void InsertarInicio(int v)
  {
  	Nodo nuevo=new Nodo(v);                                                                         
  	    if(primero!=null)
  	    nuevo.siguiente=primero;
    primero=nuevo;	
    tamaño++;
  }
 //////////////////////////////////////////////////////////
  public void InsertarFinal(int v)
  {
  	Nodo nuevo=new Nodo(v);
  	if(primero!=null)
  	{
  	
  	SituarmeEn(tamaño);
  	actual.siguiente=nuevo;
  	}
  	else
  	primero=nuevo;
  	tamaño++;	
  }
 //////////////////////////////////////////////////////
  public String InsertarEn(int pos,int v)
  {	
  if(!ValidaPosicion(pos)) return ALERTA;
  Nodo nuevo=new Nodo(v);	
    if(tamaño==1) 
    {
    nuevo.siguiente=primero;
    primero=nuevo;	
    }
    else
    {
    SituarmeEn(pos);
    nuevo.siguiente=actual;
    SituarmeEn(pos-1);	
    actual.siguiente=nuevo;
    }
  tamaño++;
  return "insertado con exito !!";	
  }
 ///////////////////////////////////////////////////////
 public void InsertarMitad(int v)
  {
  if(tamaño==1 || tamaño==0)
  InsertarInicio(v);
  else
  {
  int pos=(int)(tamaño/2);
  InsertarEn(pos+1,v);
  }
  }
 /////////////////////////////////////////////////////// 

 ///////////////////////////////////////////////////////
 ///devuelve vector con las posiciones en donde se encontro el valor pedido como parametro/////
  public int[] BuscarValor(int v)
  {
  int Pos[]=new int [0];
   for(int i=1;i<=tamaño;i++){
   	   SituarmeEn(i);
   	   if(actual.valor==v){
   	   	Pos=RedimencionarV(Pos,Pos.length);
   	   	Pos[Pos.length-1]=i;
   	   }	
   }
   return Pos;
  }
  ///redimenciona vector de posiciones////
   public int[] RedimencionarV(int actual[],int t)
   	{
   	 t++;	
      int V[]=new int[t];
      for(int i=0;i<t-1;i++)
      	V[i]=actual[i];	
     return V; 		
    }
 //////////////////////////////////////////////////////
 ///devuelbe valor de la posicion pedida como parametro//// 
  public int BuscarPosicion(int p)
  {
  if(!ValidaPosicion(p))return -1;
  	SituarmeEn(p);
  return actual.valor;
  }
  ///////////////////////////////////////////////////////

  /////////////////////////////////////////////////////
   ///Elimina la posicion pedida como parametro////
 public String EliminarPosicion(int pos)
 {
   if(!ValidaPosicion(pos)) return ALERTA;	//cambio reciente
   if(tamaño==1 || pos==1) primero=primero.siguiente;		
   else {
         SituarmeEn(pos);
         Nodo Dir=actual;	
         SituarmeEn(pos-1);
         actual.siguiente=Dir.siguiente;
         Dir=null;	
         }	
   tamaño--;
 return "Eliminado !!";
 }
 //////////////////////////////////////////////////////
 ///Elimina las posiciones en donde se encontro el valor pedido como parametro////
///el do while se termina cuando no hay mas valores que coincidan con el que se va a eliminar
///al eliminar un valor, se tiene en cuenta el cambio de posiciones de las demas coincidencias en ese momento ///
 public String EliminarValor(int v)
 {	
 if(BuscarValor(v).length==0) return "El valor no esta en la lista";
 int i=0;
 
 do
 {	
 SituarmeEn(++i);
 if(actual.valor==v)EliminarPosicion(i--);
 //System.out.println("valor indice: "+i);
 }while(BuscarValor(v).length>0);
 
  
 return "Eliminados !!";
 }
 //////////////////////////////////////////////////////

  public void ImprimirLista()
  {
  	if(primero!=null){
  	    System.out.print("LISTA --> ");
  	    SituarmeEn(1);
 	   for(int i=1;i<=tamaño;i++){
 	   System.out.print(actual.valor+", ");
 	   actual=actual.siguiente;
 	  }
  	}
 	else
  	System.out.println("LA LISTA ESTA VACIA");
    System.out.print("\n");			     
  }
 
 //////////////////////////////////////////////////
 //Los siguientes metodos son solo para optimizar codigo en la clase principal///
   /////////******************************************///
 public int[] Buscar(int opc,int v,int pos){
 	int s[]=new int[1];
 	
 	switch(opc)
 	{
 		case 1:s=BuscarValor(v); break;
 		case 2:s[0]=BuscarPosicion(pos);break;
 	}
 return s;	
 }
  /////////******************************************/// 
   /////////******************************************///
 public String Eliminar(int opc,int v,int pos){
 	String s=" ";
 	switch(opc)
 	{
 		case 1:s=EliminarValor(v); break;
 		case 2:s=EliminarPosicion(pos);break;
 	}
 return s;	
 }
  /////////******************************************///    
   public String Insertar(int opc, int v,int pos)
 {
 	String s=" ";
 	switch(opc)
 	{
 		case 1: InsertarInicio(v);break;
 		case 2: InsertarFinal(v);break;
 		case 3: InsertarMitad(v);break;
 		case 4: s= InsertarEn(pos,v);break;
 	}
 return s;	
 }
 //*******************************************/////////
}

class ProvarLista
{
	private static String m[]={"1.Insertar ","2.Buscar ","3.Eliminar ","4.Tamaño","5.Salir"};
	private static String sm1[]={"1.por valor ","2.por posicion "};
	private static String sm2[]={"1.primero ","2.ultimo ","3.En la mitad","4.En la posicion: "};
	private static int valor=-1,pos=-1;
public static void main(String args[])
	{
	Lista A=new Lista();	
	int opc1,opc2=0;
      do{
   	  opc1=MostarMenu(m);
   	    switch(opc1)
   	    {
   	    	case 1: System.out.println(A.Insertar(MostarMenu(sm2),valor,pos));break;
   	    	case 2: int b=MostarMenu(sm1);
   	    		    ImprimirVector(A.Buscar(b,valor,pos),b);break;
   	    	case 3: System.out.println(A.Eliminar(MostarMenu(sm1),valor,pos));break;
   	    	case 4: System.out.println("Tamaño: "+A.tamaño);break; 
   	    	case 5: break;
   	    	default:System.out.println("Opcion invalida !!");break;     
   	    }
   	    A.ImprimirLista();
   	  }while(opc1!=5);
    	
	}
public static int MostarMenu(String V[])
	 {
    Scanner entrada=new Scanner(System.in);
	   int opc;
	   for(int i=0;i<V.length;i++)
	   System.out.println (V[i]);
	   System.out.print ("Escoja: ");
	   opc=entrada.nextInt();
	   if((opc==4  && V.length==4)||(V.length==2 && opc==2)){
	   	System.out.println ("DIGITE LA POSICION: ");
	    pos=entrada.nextInt();
	   }
	   if(V.length==4 ||(V.length==2 && opc==1)){
	   System.out.println ("DIGITE EL VALOR: ");
	   valor=entrada.nextInt();
	   }
	 return opc;
	 }
	
public static void ImprimirVector(int v[],int Pos_o_val)
       {
	 	if(Pos_o_val==1 )
	 		if(v.length==0)
	 	     System.out.print("no hay posiciones en la lista ");
	 	     else
	 	     System.out.print("El valor fue encontrado en las posiciones: ");	
	 	else
	 	System.out.print("El valor de esta posicion es: ");	
	    for(int i=0;i<v.length;i++)System.out.print(v[i]+", ");
	 	System.out.print("\n");	
	 		
	 }

}