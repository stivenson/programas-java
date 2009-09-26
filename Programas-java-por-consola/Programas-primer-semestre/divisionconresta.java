class divisionconresta
{
  public static void main(String arg[])
  {
   double d1,d2,cociente,resto;
   cociente=1;
   
   System.out.print("numero para dividir: ");
   d1=Leer.leerfloat();
   
   System.out.print("partes a dividirlo: ");
   d2=Leer.leerfloat();
   
   resto=d1-d2;
   
   do{
   	cociente++;
   	resto=resto-d2;
   	
   	}while(resto-d2>=0);
   	
   	System.out.println("cociente: "+cociente);
   	System.out.println("resto: "+resto);
    
   	
   	
   
   	
  }	
}