/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author stivenson rincon mora
 */
 import java.util.Scanner;
class Disco
{
	int numero;
	Disco siguiente;
	public Disco (int d)
	{
		numero=d;
		siguiente=null;

	}
}

class Torre
{
	Disco tope;

	public Torre()
	{
		tope=null;
	}

	public void insertainicio(int d)
	{
		Disco nuevo= new Disco(d);
		if(tope!=null)
		nuevo.siguiente=tope;
		tope=nuevo;

	}

	public int sacar()
	{
    int v=tope.numero;
    tope=tope.siguiente;
    return v;
    }
     public boolean  vacia()
     {
     if (tope==null)
     return true;
     else
     return false;
     }
      public void ImprimirTodos(char torre)
      {
      	String R=" ";
      	Disco aux=tope;
      	while(aux!=null){
      		R+=aux.numero;
      		aux=aux.siguiente;
      	}
      	System.out.print(torre+"-->\t");
      	for (int i = R.length()-1; i>-1; i--)
      	 System.out.print(R.charAt(i)); 
      System.out.print("\n");
      }
      
     public int ConsultarDisco()
	 {
	 if(tope==null)return 100;	
	  return tope.numero;
     }
     
     /*public boolean BuscarDisco(int num){
      	Disco aux=tope;
      	
      	while(aux!=null){
      		if(num==aux.numero)
      		return true;
      		aux=aux.siguiente;
      		}
      return false;			
     }*/
        
}



/*class ProvarPila
{
	public static void main(String yeniret[])
	{
		pila Barta=new pila();
		for (int i = 1; i<8; i++)
		Barta.insertainicio(i);
		for (int i = 1; i<8; i++)
		System.out.println(Barta.sacar());
		Barta.insertainicio(999);

		System.out.println(Barta.sacar());
	}

}*/



public class torredehanoi
{
   
  static Torre torres[]=new Torre[3];
   
   public static void main(String[] args)
    {
    
    for (int i = 0; i<3; i++)
   	 torres[i]=new Torre();
    	
    Scanner entrada=new Scanner(System.in);	
    System.out.println("Torre de hanoi");
     System.out.print("Numero de fichas: ");
     MeterFichas(entrada.nextInt()); 
     
     for (int i = 0; i<5; i++){
     
     ImprimirTorres();
     System.out.println("Ingrese el movimiento(mayusculas): ");
     String mov=entrada.next();
     int numficha=Integer.parseInt(String.valueOf(mov.charAt(0)));
     if(MovimientoValido(mov.charAt(1),numficha)){
     	BuscarYSacarDisco(numficha,mov.charAt(1));///problema
     	ingresar(mov.charAt(1),numficha);
     }
     else
     System.out.println("MOVIMIENTO INVÁLIDO");
    }
    }
    
 public static void MeterFichas(int cantidad){
    for (int i = cantidad; i>0; i--)
    torres[0].insertainicio(i);	
   }
    
 public static void BuscarYSacarDisco(int num,char torre){
    	
    	  for (int i = 0; i<3; i++)
    	  if(torres[i].ConsultarDisco()==num)
    	  torres[i].sacar();
   
	    }
 public static void ImprimirTorres(){
    for (int i = 0; i<3; i++)
    torres[i].ImprimirTodos((char)(65+i));	
    }
    
 public static void ingresar(char torre,int num){
    torres[torre-65].insertainicio(num);	
    }
    
 public static boolean MovimientoValido(char torre,int disco){
    	  boolean vale=false;
    	  
    	  for (int i = 0; i<3; i++)
          if((torres[i].ConsultarDisco()==disco)&&((i+65)!=torre))
          vale=true;
          if(torres[torre-65].ConsultarDisco()<disco)vale=false;
     return vale;	
    }

}
