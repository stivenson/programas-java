class exa{
	
	public static void main (String arg[]){
		
		String num = "";
	    
	    int i, j;
	    char aux;
	    int suma=0;
	    
	    System.out.print("ESCRIBA SUS 4 NUMEROS: ");
	   
	    num=Leer.leercadena();

	    
	    String numes = "";

	    
	    for (int x=0; x < num.length(); x++) 
	    {
	    	if (num.charAt(x) != ' ')
	    	{
	    		numes += num.charAt(x);
	    	}
	    }

	    
	    
	   
	    
	   
	    int x;
	    x=numes.length();
	    
	    
	   
	    char[] cac = new char[numes.length()];
	    
	    
	   
        System.out.print("  ");
        for ( i = 0; i < numes.length(); i++) 
        {
        	cac[i] = (char)numes.charAt(i);
            System.out.print(cac[i]);
        }
      
        
        
        for (i=0;i< x-1; i++ ) 
        {
            for ( j = 0 ; j < x-1-i ; j++ ) 
            {
                if ( cac[j] > cac[j+1] ) 
                {
                    aux = cac[j];
                    cac[j] = cac[j+1];
                    cac[j+1] = aux;
                }
            }
        }
        
       
        System.out.println("   ORDENADO SU NUMERO ES: ");
        
       
        for (i = 0; i < x; i++) 
        {
        	System.out.print(" "+cac[i] + " ");
        }
        
        
        
      
       
  		}
        
	}
