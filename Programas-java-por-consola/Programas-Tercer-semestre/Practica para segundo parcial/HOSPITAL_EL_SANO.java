/**
 * @(#)HOSPITAL_EL_SANO.java
 *
 *
 * @author Stivenson Rincon Mora
 * @version 1.00 2010/9/14
 *1) LISTA:cedulas de todos los afiliados que sacaron citas el ultimo mes.
 *2) LISTA:cedulas de todos los afiliados.
 *3) LISTA:cedulas de los afiliados ordenadas descendentemente segun el numero de citas en el mes.
 *4) LISTA:cedulas de los afiliados que no sacaron citas.
 */


import java.util.Scanner;//
public class HOSPITAL_EL_SANO {
        
    static Cedulas Afiliados=new Cedulas();
    static Cedulas CitasMes=new Cedulas();
 
    public static void main(String[] args){
    	Scanner entrada=new Scanner(System.in);//
    	System.out.print("Ingrese el numero de Afiliados: ");
    	int v=entrada.nextInt();
      Afiliados.LLenarLista(entrada.nextInt()); 
      	System.out.print("Ingrese la cantidad de citas a distribuir\n aleatoriamente entre los afiliados: ");
       LLenarCitasMes(entrada.nextInt());
       
       Afiliados.ImprimirLista("Lista de Afiliados");	
       CitasMes.ImprimirLista("Lista de citas en el mes");
       
       CitasMes.CantidadCitasDescendente();
       CitasMes.ImprimirLista("Lista Descendente de citas en el mes");
       System.out.println("Lista de Cedulas sin citas en el mes: ");
       Afiliados.ImprimirCedulasSinCitas();
       
       Cedulas copiaListaDescendente=new Cedulas();
       }
    
    public static void LLenarCitasMes(int cantidad){
    	
         for(int i=0;i<cantidad;i++){
         int cedulaCita=Afiliados.CedulaAleatoria();
         int pos=CitasMes.BuscarValor(cedulaCita);
    	   if(pos==-1){
    	   	CitasMes.InsertarInicio(cedulaCita);
    	   	CitasMes.BuscarPosicion(1).citas++; 
    	   }	
           else
           CitasMes.BuscarPosicion(pos).citas++; 	
         }   		
    }
}

class Cedulas
{
	Nodo primero;
    Nodo actual;
    int tamaño,g;
    
    public Cedulas(){
    primero=null;
    actual=primero;
    tamaño=0;g=0;	
    }
     
 

  ////situar puntero de nombre: actual////////////////// 
  public void SituarmeEn(int sitio){
  	actual=primero;
  	for(int i=2;i<=sitio;i++)
  	actual=actual.siguiente;	
  }
  ///////////////////////////////////////////////////////
   public int CedulaAleatoria(){
  int pos=(int)((Math.random()*(tamaño-1))+1);
  SituarmeEn(pos);
  BuscarPosicion(pos).citas=1;
  return actual.valor;
  }
  
   public Nodo BuscarPosicion(int p){
  SituarmeEn(p);
  return actual;
  } 
  public int BuscarValor(int v){
    actual=primero;	
    for(int i=1;i<=tamaño;i++){
  	if(actual.valor==v)return i;
  	actual=actual.siguiente;
    }
  return -1; 	 
  }  
  public void InsertarInicio(int v){
  	Nodo nuevo=new Nodo(v);                                                                         
  	    if(primero!=null){
  	    nuevo.siguiente=primero;
  	    primero.anterior=nuevo;
  	    }
    primero=nuevo;	
    tamaño++;
  }
  ///////////////////////////////////////////////////////
  public void LLenarLista(int cantidad){
  	
    for(int i=0;i<cantidad;i++){
    int cedula=(int)((Math.random()*29)+1);	
    if(BuscarValor(cedula)==-1)	
      InsertarInicio(cedula);
      else
      i--;	
    }	
  }
 ////////////////////////////////////////////////////////
 public void CantidadCitasDescendente(){
 	actual=primero;
  OrdenamientoRecursivo(tamaño);
 }
 
//////////////////////////////////////////////////////////////////////// 
 private void OrdenamientoRecursivo(int t){
 	Nodo aux=new Nodo(0);
     if(t>1){
     	  
          if(actual.citas<actual.siguiente.citas){
          aux.citas=actual.citas;aux.valor=actual.valor;
          actual.citas=actual.siguiente.citas;actual.valor=actual.siguiente.valor;
   	      actual.siguiente.citas=aux.citas;actual.siguiente.valor=aux.valor;
   	      }
   	  actual=actual.siguiente;
 	  OrdenamientoRecursivo(--t);
     }
    if(++g<=tamaño){
    actual=primero;	
    OrdenamientoRecursivo(tamaño);		
    }
   }
 ////////////////////////////////////////////////////////////////////////
   public void ImprimirCedulasSinCitas(){
   	actual=primero;
   	while(actual!=null){
   		if(actual.citas==0)
   		System.out.println("  |CC: "+actual.valor+"| ");	
   		actual=actual.siguiente;
   	}
   }
   
   public void ImprimirLista(String Titulo)
  {
  	if(primero!=null){
  	    System.out.println(Titulo);
  	    SituarmeEn(1);
 	   for(int i=1;i<=tamaño;i++){
 	   	if(Titulo.charAt(9)=='A')
 	   System.out.println("  |CC: "+actual.valor+"| ");
 	   else
 	   System.out.println("  |CC: "+actual.valor+", Citas: "+actual.citas+"| ");
 	   actual=actual.siguiente;
 	  }
  	}
 	else
  	System.out.println("LA LISTA ESTA VACIA");
    System.out.print("\n");			     
  }
}

////// Nodo ////////////////////////
   class Nodo{
   	int valor;
   	int citas;
   	Nodo siguiente,anterior;
   	  public Nodo(int v)
   	  {
   	  valor=v;
   	  citas=0;
   	  siguiente=null;
   	  anterior=null;	
   	  }
   }


//System.out.println("tamaño: "+t+" Comparo: "+actual.citas+" con: "+actual.siguiente.citas);