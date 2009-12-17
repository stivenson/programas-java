class codigosascii
{
		public static void main(String arg[])
		{
		 
			int i,columnas=0;
			for (i=1;i<=255;i++)
			{
			columnas++;	
		      	switch(i)
		      	{
		      		
		      	
		         case 1:
			     if(columnas==5)
		             	{
		       	    	System.out.print("\n");
		       	     	columnas=0;
		            	}
		         System.out.print(i+""+"="+"esc "+"\t\t");
		            		
			     break;
			     
			     case 13:
			     if(columnas==5)
		             	{
		       	    	System.out.print("\n");
		       	     	columnas=0;
		            	}
		            		
			     System.out.print(i+"" + "=" + "ent "+"\t\t");
			     break;
			     
			     case 9:
			     if(columnas==5)
		             	{
		       	    	System.out.print("\n");
		       	     	columnas=0;
		            	}
		            		
			     System.out.print(i+""+"="+"tab "+"\t\t");
			     break;
			     
			     case 10:
		            		
			     System.out.print(i+""+"="+"salL. "+"\t\t");
			     if(columnas==5)
		             	{
		       	    	System.out.print("\n");
		       	     	columnas=0;
		            	}
			     break;
	
			     
			    
			     default:
			     
		         System.out.print(i+""+" = "+(char)i+"\t\t");
		         
		         if(columnas==5)
		             	{
		       	    	System.out.print("\n");
		       	     	columnas=0;
		            	}
		            	break;	
		         }
		          	
		          
}
}
}