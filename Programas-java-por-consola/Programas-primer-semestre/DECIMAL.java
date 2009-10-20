class DECIMAL
{
   public static void main(String arg[])
   {
   
    float decimal;
   	String  Enhexadecimal="";
   	
   	System.out.println("************************NUMERO DECIMAL A HEXADECIMAL************************** ");
   	System.out.println("\n");
   	System.out.print("escriba el numero decimal: ");
   	
    decimal=Leer.leerfloat();
    System.out.println("\n");
   
    
   
     do{
     	if((int)decimal%16==10)
     	{
       Enhexadecimal=Enhexadecimal+"A";
        }
       decimal=(int)decimal/16;
       
       }while((int)decimal>16);
        
         
	     System.out.println("SU NUMERO EN HEXADECIMAL ES: "+Enhexadecimal);
	}
		
}
    
 	

