class multiplicar
{

  public static void main(String arg[])
  {
   int n1,n2,producto,i;
   producto = 0;
   System.out.println("---------------------MULTIPLICACION CON SUMAS---------------------------");
   
    
   System.out.print("escriba el multiplicando: ");
   n1=Leer.leerint();
   
   System.out.print("escriba el multiplicador: ");
   n2=Leer.leerint();
   
   for(i=1;i<=n2;i++)
     {
     producto = producto + n1;	
     }
     
    System.out.println("resultado: "+producto );	
  }
}