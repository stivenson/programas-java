/*
 *Utilizar listas para almacenas la informacion de los codigos y promerdios del semestre delos estudiantes de los
 *grupos 3ad y 3an de la unisimon bolivar.
 *Una ves la lista tenga informacion, imprimir el codigo, promedio y grupo del estudiante con mayor promedio del semestre.
 */

/**
 * @(#)Lista.java
 *
 *
 * @author Stivenson Rincon Mora
 * @version 1.00 2010/8/19
 */


 ////// Nodo ////////////////////////
  class Nodo
   {
   	int codigo;
   	float promedio;
   	Nodo siguiente;
   	  public Nodo(int c,float p)
   	  {
   	  codigo=c;
   	  promedio=p;
   	  siguiente=null;	
   	  }
   }
 //////////////////////////////////////

public class Lista {
   
    Nodo primero;
    Nodo actual;
    private int tamaño;
    private String ALERTA="posicion no existe en la lista";
    public Lista(){
    primero=null;
    actual=primero;
    tamaño=0;	
    }
    

 public int Tamaño(){return tamaño;}
 ////////////////////////////////////
  ////situar puntero de nombre: actual////////////////// 
  public void SituarmeEn(int sitio){
  	actual=primero;
  	for(int i=2;i<=sitio;i++)
  	actual=actual.siguiente;	
  }
 ///////////////////////////////////////////////////////
 public boolean ValidaPosicion(int pos){
 if(pos>0 && pos<=Tamaño())return true;
 return false;	
 }
  ///////////////////////////////////////////////////////
  public void InsertarInicio(int c,float p)
  {
  	Nodo nuevo=new Nodo(c,p);                                                                         
  	    if(primero!=null)
  	    nuevo.siguiente=primero;
    primero=nuevo;	
    tamaño++;
  }
 //////////////////////////////////////////////////////////
  public void InsertarFinal(int c,float p)
  {
  	Nodo nuevo=new Nodo(c,p);
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
  public String InsertarEn(int pos,int c,float p)
  {	
  if(!ValidaPosicion(pos)) return ALERTA;
  Nodo nuevo=new Nodo(c,p);	
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
 public void InsertarMitad(int c,float p)
  {
  if(Tamaño()==1 || Tamaño()==0)
  InsertarInicio(c,p);
  else
  {
  int pos=(int)(Tamaño()/2);
  InsertarEn(pos+1,c,p);
  }
  }
 /////////////////////////////////////////////////////// 

 ///////////////////////////////////////////////////////
 
  public int[] BuscarValor(int c,float p)
  {
  int Pos[]=new int [0];
   for(int i=1;i<=tamaño;i++){
   	   SituarmeEn(i);
   	   if(actual.codigo==c || actual.promedio==p){
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

  public int BuscarPosicion(int p)
  {
  if(!ValidaPosicion(p))return -1;
  	SituarmeEn(p);
  return actual.codigo;
  }

 public String EliminarPosicion(int pos)
 {
   if(ValidaPosicion(pos)==false) return ALERTA;	
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

 public String EliminarValor(int c,int p)
 {	
 if(BuscarValor(c,p).length==0) return "El valor no esta en la lista";
 int i=0;
 do
 {
 SituarmeEn(++i);
 if(actual.codigo==c)EliminarPosicion(i--);	
 }while(BuscarValor(c,p).length>0);
  
  
 return "Eliminados !!";
 }
 ///////////////////////////////////////////////////////
 public Nodo Mayor()
 {
 SituarmeEn(1);
 float mayor=actual.promedio;
 Nodo AMayor=actual;	
  while(actual.siguiente!=null)
  {
   actual=actual.siguiente;
   if(actual.promedio>mayor){
  mayor=actual.promedio;
  AMayor=actual;
   }
  }
 return AMayor;  
 }
 //////////////////////////////////////////////////////

  public void ImprimirLista()
  {
  	if(primero!=null){
 	   for(int i=1;i<=Tamaño();i++){
 	   SituarmeEn(i);
 	   System.out.println("Alumno con codigo: "+actual.codigo+", promedio: "+actual.promedio);
 	  }
  	}
 	else
  	System.out.println("LA LISTA ESTA VACIA");
    System.out.print("\n");			     
  }
 //////////////////////////////////////////////////

}

class Principal
{
    static Lista e3AD=new Lista();
	static Lista e3AN=new Lista();	



public static void main(String args[])
	{
	
	System.out.print("Cantidad de alumnos de 3AD: ");
    Aleatorios( 1, Leer.leerint());
    System.out.print("Cantidad de alumnos de 3AN: ");
    Aleatorios(  2, Leer.leerint());
    
    mostrarMayor();
    System.out.println("Alumnos de 3AD");
	e3AD.ImprimirLista();
	 System.out.println("Alumnos de 3An");
	e3AN.ImprimirLista();	
    }
    
  public static void Aleatorios(int nlista, int cantidad)
  {
   if(nlista==1)
   LLenarLista( cantidad,e3AD);
   else
   LLenarLista(cantidad,e3AN);    		
  }
  
  public static void LLenarLista(int cantidad ,Lista l)
  {
  	   for(int i=0;i<cantidad;i++){
  	int c=(int) ((Math.random()*999999)+100000);
  	float p=(float)(Math.random()*4)+1;
  	if(l.BuscarValor(c,p).length==0)
  	l.InsertarInicio(c,p);
 	else
 	i--;	
  }
  
 }
  
   public static void mostrarMayor()
   {
   Nodo alumnoDiurno=e3AD.Mayor();	
   Nodo alumnoNocturno=e3AN.Mayor();
   if(alumnoDiurno.promedio>alumnoNocturno.promedio)
   System.out.println("El alumno con mejor promedio fue de 3AD su codigo es "+alumnoDiurno.codigo+"  con promedio "+alumnoDiurno.promedio);	
   else
   System.out.println("El alumno con mejor promedio fue de 3AN su codigo es "+alumnoNocturno.codigo+"  con promedio "+alumnoNocturno.promedio);	
   }	
  }	
  
 
 
  	
 
    	
  	
   
    
    
    

