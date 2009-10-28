class facturadecobro
{
    public static void main(String arg[])
 	{
 	byte estrato;
 	int usuarios,i,Ccontador,la,lan,consumomes=0,es1=0,es2=0,es3=0;
 	long valortotalpagado=0;
 	String dir;
 	System.out.print("cantidad de usuarios a liquidar: ");
 	usuarios=Leer.leerint();
 	
 	       for(i=1;i<=usuarios;i++)
 	       {
 	       		System.out.print("codigo del contador: ");
 	       	    Ccontador=Leer.leerint();
 	       	    
 	       	    System.out.print("Direccion: ");
 	       	    dir=Leer.leercadena();
 	       	    
 	       	    
 	       	    System.out.print("estrato: ");
 	       	    estrato=Leer.leerbyte();
 	       	    
 	       	    System.out.print("lectura actual(kw/h): ");
 	       	    la=Leer.leerint();
 	       	    
 	       	    System.out.print("lectura anterior(kw/h): ");
 	       	    lan=Leer.leerint();
 	       	   
 	       	          switch(estrato)
 	       	          {
 	       	    	     case 1:
 	       	    	     
 	       	    	     es1++;
 	       	    	      if((la-lan)<=100)
 	       	    	      {
 	       	    	      	System.out.println("consumo mes: "+(la-lan)*100);
 	       	    	        System.out.println("valor total a pagar: "+((la-lan)*100+2000));
 	       	    	        valortotalpagado=valortotalpagado+((la-lan)*100+2000);	
 	       	    	      }
 	       	    	      
 	       	    	      else
 	       	    	      {
 	       	    	      	consumomes=(la-lan)*100;
 	       	    	      System.out.println("consumo mes: "+consumomes);
 	       	    	      System.out.println("valor total a pagar: "+(consumomes+consumomes*5/100+2000));
 	       	    	      valortotalpagado=valortotalpagado+consumomes+(consumomes*5/100)+2000;
 	       	    	      }
 	       	    	      break;
 	       	    	      
 	       	    	      case 2:
 	       	    	      
 	       	    	      
 	       	    	       es2++;
 	       	    	      if((la-lan)<=100)
 	       	    	      {
 	       	    	      System.out.println("comsumo mes: "+(la-lan)*130);	
 	       	    	      System.out.println("valor total a pagar: "+((la-lan)*130+3500));	
 	       	    	      
 	       	    	      valortotalpagado=valortotalpagado+((la-lan)*130+3500);
 	       	    	      }
 	       	    	      else
 	       	    	      {
 	       	    	       consumomes=(la-lan)*130;
 	       	    	       System.out.println("consumo mes: "+consumomes);
 	       	    	       System.out.println("valor total a pagar: "+(consumomes+consumomes*5/100+3500));
 	       	    	       valortotalpagado=valortotalpagado+consumomes+(consumomes*5/100)+3500;	
 	       	    	      }
 	       	    	      
 	       	    	      break;
 	       	    	      
 	       	    	      case 3:
 	       	              
 	       	              
 	       	    	      es3++;
 	       	    	       if((la-lan)<=100)
 	       	    	      {
 	       	    	      System.out.println("consumo mes: "+(la-lan)*170);	
 	       	    	      System.out.println("valor total a pagar: "+((la-lan)*170+4500));	
 	       	    	      
 	       	    	      valortotalpagado=valortotalpagado+((la-lan)*170+4500);
 	       	    	      }
 	       	    	      else
 	       	    	      {
 	       	    	      consumomes=(la-lan)*170;
 	       	    	      System.out.println("consumo mes: "+consumomes);	
 	       	    	      System.out.println("valor total a pagar: "+(consumomes+consumomes*5/100+4500));
 	       	    	      valortotalpagado=valortotalpagado+consumomes+(consumomes*5/100)+4500;	
 	       	    	      }
 	       	    	       break;
 	       	    	  
 	       	    	      } 
 	       	    	     consumomes=0;
 	       	          }
 	       	    System.out.println("usuarios estrato 1: "+es1);  
 	       	    System.out.println("usuarios estrato 2: "+es2);  
 	       	     System.out.println("usuarios estrato 3: "+es3);
 	       	      System.out.println("valor total pagado: "+valortotalpagado);            
 	       }   
 		
 	}
