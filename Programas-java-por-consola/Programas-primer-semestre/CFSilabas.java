class CFSilabas
{
	
	public CFSilabas(){}
	
	
	 String[] ContarSilabas(StringBuffer frase){
	 	boolean paro;
		CFSilabas objeto= new CFSilabas();
	    String[] silabas=new String[60];
	    int indice=0,i;
	    int van=frase.length();
	   for(i=0;i<1;i++)
	   {
	   paro=false;
	   if(objeto.Consonante_O_Vocal(frase.charAt(i))=='C')
	   {
	   		        
	   	 if(objeto.Consonante_O_Vocal(frase.charAt(i+1))=='C')
	   	 {
	   	 	char UnaAdelante=frase.charAt(i+1);	
	   	    if( UnaAdelante=='l' || UnaAdelante=='L' || UnaAdelante=='H'|| UnaAdelante=='h'|| UnaAdelante=='R'|| UnaAdelante=='r')
	   	 	{
	   	       
	   	 	   if(objeto.Consonante_O_Vocal(frase.charAt(i+2))=='V')
	   	 	   	{
	   	 	   	    if(objeto.Consonante_O_Vocal(frase.charAt(i+3))=='C' && objeto.Consonante_O_Vocal(frase.charAt(i+4))=='C')
	   	 	   	     {
	   	 	   	     
	   	 	   	     silabas[indice]=frase.substring(i,i+5);
	   	 	   	     indice++;
	   	 	   	     van=van+5;
	   	 	   	     }
	   	 	   	     else
	   	 	   	     {
	   	 	   	        if(objeto.Consonante_O_Vocal(frase.charAt(i+3))=='C')
	   	 	   	        {	
	   	 	   	        silabas[indice]=frase.substring(i,i+4);
	   	 	   	        indice++;
	   	 	   	        van=van+4;	
	   	 	   	        }
	   	 	   	        else
	   	 	   	        {
	   	 	   	        silabas[indice]=frase.substring(i,i+3);
	   	 	   	        indice++;
	   	 	   	        van=van+3;	
	   	 	   	        }
	   	 	   	    }	
	   	 	   	}
	   	 	}
	   	 	else
	   	 	{
	   	 	 UnaAdelante=frase.charAt(i);
	         char DosAdelante=frase.charAt(i+1);
	                   if(UnaAdelante=='b'|| UnaAdelante=='B'|| UnaAdelante=='d' || UnaAdelante=='D' ||UnaAdelante=='c'|| UnaAdelante=='C'|| UnaAdelante=='F' || UnaAdelante=='f' ||UnaAdelante=='G'|| UnaAdelante=='g'|| UnaAdelante=='T' || UnaAdelante=='t' ||UnaAdelante=='P' || UnaAdelante=='p')
	                   {
	           	          if(DosAdelante=='L'|| DosAdelante=='l' ||DosAdelante=='R'|| DosAdelante=='r')
	           	           {
	           	       	     if (objeto.Consonante_O_Vocal(frase.charAt(i+2))=='V')
	           	       	       {
	           	       	       silabas[indice]=frase.substring(i,i+3);
	           	       	       indice++;
	           	       	       van=van+3;		
	                           }
	                       }
	                   }
	                   else
	                   {
	                   	silabas[indice]=frase.substring(i,i+2);
	           	       	indice++;
	           	       	van=van+2;	
	                   }
	                }          
	   	         }
	   	        else
	   	         {
	   	   
	   	         if(objeto.Consonante_O_Vocal(frase.charAt(i+1))=='V')
	   	          {
	   	   	
	   	   	      if (frase.charAt(i+1)=='U'|| frase.charAt(i+1)=='u')
	   	   	       {
	   	   	 	     if(objeto.Consonante_O_Vocal(frase.charAt(i+2))=='V')
	   	   	 	     {
	   	             silabas[indice]=frase.substring(i,i+3);
	           	     indice++;
	           	     van=van+3;	
	   	   	 	     }
	   	   	       }
	   	   	     else
	   	   	      {
	   	   	      	 if(objeto.Consonante_O_Vocal(frase.charAt(i+1))=='C')
	   	   	      	 {
	   	   	         silabas[indice]=frase.substring(i,i+3);
	           	     indice++;
	           	     van=van+3;	
	           	     }	
	   	   	      }	
	   	   	 }
	   	  } 
	 }
	 else
	 {
	   if(frase.length()==1)
	   {
	   silabas[indice]=String.valueOf(frase);
	   indice++;
	   van=van+1;
	   }
	   else
	   {
	   	if(objeto.Consonante_O_Vocal(frase.charAt(i+1))=='C')
	   	{
	   	String B="";
	   	B=B+frase.charAt(i);
	   	 silabas[indice]=B;
	     indice++;
	    van=van+1;	
	   	}
	   	else
	   	{
	   	
	   	  if(objeto.Consonante_O_Vocal(frase.charAt(i))=='V')
	   	  {
	   		  if(objeto.Consonante_O_Vocal(frase.charAt(i+1))=='C')
	   		    {
	   		    	silabas[indice]=frase.substring(i,i+3);
	                indice++;
	                van=van+3;
	                	
	   		    	
	   		        if(objeto.Consonante_O_Vocal(frase.charAt(i+2))=='C')
	   		         {
	   		         	if(objeto.Consonante_O_Vocal(frase.charAt(i+3))=='C')
	   		         	{
	   		         	   if(frase.charAt(i+3)!='L' && frase.charAt(i+3)!='l' && frase.charAt(i+3)!='R' && frase.charAt(i+3)!='r')
	   		         	   {
	   		         	   	silabas[indice]=frase.substring(i,i+3);
	                        indice++;
	                        van=van+3;	
	   		         	   }
	   		         	   else
	   		         	   {
	   		         	   	silabas[indice]=frase.substring(i,i+2);
	                        indice++;
	                        van=van+2;	
	   		         	   }	
	   		         	}
	   		         	else
	   		         	{
	   		         	silabas[indice]=frase.substring(i,i+2);
	                    indice++;
	                    van=van+2;	
	   		         	}
	   		         	
	   		         }
	   		         else
	   		         {
	   		         silabas[indice]=frase.substring(i,i+2);
	                 indice++;
	                 van=van+2;	
	   		         }	
	   		    	
	   		    }
	   		    else
	   		    {
	   		      if(objeto.Consonante_O_Vocal(frase.charAt(i+1))=='V')
	   		       {
	   		       silabas[indice]=frase.substring(i,i+2);
	               indice++;
	               van=van+2;
	               }
	            }	
	   		 }
	   	  }
	   	 }
	   	}
	  }
	   return(silabas);
	 }
	
	
char Consonante_O_Vocal(char letra){	
	if(letra == 'a' || letra == 'A' || letra == 'e' || letra == 'E' || letra == 'i' || letra == 'I'|| letra == 'o' || letra == 'O' || letra == 'u' || letra == 'U')	
	return('V');
	else
	   {
	   if(letra>='A' && letra<='Z' || letra>='a' && letra<='z')
	    return('C');
	    else
	    return('O');	
	    }
	   }
	 }
	   
	   
		
	
