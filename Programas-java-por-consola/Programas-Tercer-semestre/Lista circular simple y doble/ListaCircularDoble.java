/**
 * @(#)Lista.java
 *
 *
 * @author Stivenson Rincon Mora
 * @version 1.00 2010/8/19
 */

import java.util.Scanner;
class ListaCircularDoble {
   
    Nodo primero,actual;
    int tamaño;
    private String ALERTA="Posicion no existe en la lista";
    
    public ListaCircularDoble(){
    primero=null;
    actual=primero;
    tamaño=0;	
    }
     
 ////// Nodo ////////////////////////
   class Nodo{
   	int valor;
   	Nodo siguiente,anterior;
   	  public Nodo(int v)
   	  {
   	  valor=v;
   	  siguiente=null;
   	  anterior=null;	
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
  public void RetrocederUno(){
 actual=actual.anterior;	
 }
  //////////////////////////////////////////////////////
 public boolean ValidaPosicion(int pos){
 if(pos>0 && pos<=tamaño)return true;
 return false;	
 }
  ///////////////////////////////////////////////////////
  public void InsertarInicio(int v){
  	Nodo nuevo=new Nodo(v);                                                                         
  	    if(primero!=null){
  	    	nuevo.siguiente=primero;
  	    	nuevo.anterior=null;
  	    	primero.anterior=nuevo;
  	    	}
  	    
    primero=nuevo;	
    tamaño++;
  }
 //////////////////////////////////////////////////////////
  public void InsertarFinal(int v)
  {
  	Nodo nuevo=new Nodo(v);
  	if(primero==null)
  	{
  	primero=nuevo;	
  	primero.siguiente=primero.anterior=primero;
  	}
  	else
    {
    primero.anterior.siguiente=nuevo;
    nuevo.siguiente=primero;
    nuevo.anterior=primero.anterior;
    primero.anterior=nuevo;	
    }
    tamaño++;	
  }
 //////////////////////////////////////////////////////
  public void ImprimirLista()
  {
  	if(primero!=null){
  	    System.out.println("LISTA CIRCULAR DOBLE --> ");
  	    SituarmeEn(1);
 	   for(int i=1;i<=tamaño;i++){
 	   System.out.println("valor Nodo: "+actual.valor+" anterior: "+actual.anterior.valor+" siguiente: "+actual.siguiente.valor);
 	   actual=actual.siguiente;
 	  }
  	}
 	else
  	//System.out.println("LA LISTA ESTA VACIA");
    System.out.println("\n");			     
  }
 
}

class ProvarLista
{


public static void main(String args[])
	{
	ListaCircularDoble	A=new ListaCircularDoble();	
	
		
		for (int i = 1; i<8; i++)
		A.InsertarFinal(i);
	    A.ImprimirLista();
	}
    

}