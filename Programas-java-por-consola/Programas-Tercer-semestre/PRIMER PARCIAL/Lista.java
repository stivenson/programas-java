/**
 * @(#)Lista.java
 *
 *
 * @author Stivenson Rincon Mora
 * @version 1.00 2010/8/19
 */


class Lista {
   
    Nodo primero;
    Nodo actual;
    int tamaño;
    int va;
    private String ALERTA="posicion no existe en la lista";
    public Lista(){
    primero=null;
    actual=primero;
    tamaño=0;	
    }
    
 ////// Nodo ////////////////////////
   class Nodo
   {
   	int grado;
   	int valor;
   	Nodo siguiente;
   	  public Nodo(int v,int g)
   	  {
   	  valor=v;
   	  grado=g;
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
  public void InsertarInicio(int v,int g)
  {
  	Nodo nuevo=new Nodo(v,g);                                                                         
  	    if(primero!=null)
  	    nuevo.siguiente=primero;
    primero=nuevo;	
    tamaño++;
  }
 //////////////////////////////////////////////////////////
  public void InsertarFinal(int v,int g)
  {
  	Nodo nuevo=new Nodo(v,g);
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
  public String InsertarEn(int pos,int v,int g)
  {	
  if(!ValidaPosicion(pos)) return ALERTA;
  Nodo nuevo=new Nodo(v,g);	
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
 public void InsertarMitad(int v,int g)
  {
  if(tamaño==1 || tamaño==0)
  InsertarInicio(v,g);
  else
  {
  int pos=(int)(tamaño/2);
  InsertarEn(pos+1,v,g);
  }
  }
 /////////////////////////////////////////////////////// 

 ///////////////////////////////////////////////////////
 ///devuelve vector con las posiciones en donde se encontro el valor pedido como parametro/////
  public int[] BuscarValor(int v,int g)
  {
  int Pos[]=new int [0];
   for(int i=1;i<=tamaño;i++){
   	   SituarmeEn(i);
   	   if(actual.valor==v){////mirar que se necesita buscar
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
 
  public Double ResultadoEcuacion(int valor ){
  	va=valor;
  	double sumatoria=0;
   	actual=primero;
   	while(actual!=null){
   		sumatoria=sumatoria+(Math.pow(valor,actual.grado)*actual.valor); 
   	    actual=actual.siguiente;
   	   	
   	}
   	  
   	 return sumatoria;  	
   	}
 //////////////////////////////////////////////////////
 ///Elimina las posiciones en donde se encontro el valor pedido como parametro////
///el do while se termina cuando no hay mas valores que coincidan con el que se va a eliminar
///al eliminar un valor, se tiene en cuenta el cambio de posiciones de las demas coincidencias en ese momento ///
 public String EliminarValor(int v,int g)//mirarque valor necesito eliminar
 {	
 if(BuscarValor(v,g).length==0) return "El valor no esta en la lista";
 int i=0;
 
 do
 {	
 SituarmeEn(++i);
 if(actual.valor==v)EliminarPosicion(i--);
 //System.out.println("valor indice: "+i);
 }while(BuscarValor(v,g).length>0);
 
  
 return "Eliminados !!";
 }
 //////////////////////////////////////////////////////

  public void ImprimirLista()
  {
  	if(primero!=null){
  	    System.out.print("ECUACION--> ");
  	    SituarmeEn(1);
 	   for(int i=1;i<=tamaño;i++){
 	   	if(actual.valor!=0){
 	   	
 	   	if(i>1 && actual.valor>0)
 	   System.out.print("+");
 	   	if(actual.valor!=0)
 	   	System.out.print(actual.valor);
 	   	if(actual.grado!=0)
 	   System.out.print("X^");
 	   if(actual.grado>1)
 	   System.out.print(actual.grado);
 	   }
 	 actual=actual.siguiente;
 	  }
  	}
 	else
  	System.out.println("LA LISTA ESTA VACIA");
    System.out.print("\n");			     
  }
 
 //////////////////////////////////////////////////

}

class ProvarLista
{
	
  static Lista A=new Lista();	
public static void main(String args[])
	{
	
     System.out.print("Ingrese el grado de la ecuacion:");
     LLenarLista(Leer.leerint());
     A.ImprimirLista();
     System.out.print("Ahora ingrese el valor de X:");
     System.out.print(A.ResultadoEcuacion(Leer.leerint()));	
    
   	}
   	
   	public static void LLenarLista(int cantidad){
   		int a=1;
   		for(int i=cantidad;i>=0;i--){
   			System.out.print("Valor de la parte numerica del termino "+(a++)+" : ");
   			A.InsertarFinal(Leer.leerint(),i);
   		}
   		
   	}
   	
  

	

}