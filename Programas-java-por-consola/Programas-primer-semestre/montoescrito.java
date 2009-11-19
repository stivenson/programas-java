class montoescrito
{
	public static void main(String arg[])
	{
	   
	 String numero,enletra="";
	 int cifras,i2;
	 int p,po=0,Entre5y1;
	 byte paseporaca=0;
	System.out.println("***************MONTO ESCRITO************ ");
	do{
	
	System.out.print("\n");
	System.out.print("ESCRIBA EL NUMERO: ");
 	numero=Leer.leercadena();
 	
 	cifras=numero.length()-1;
 	}while(cifras>=3);
 	
	      for(i2=cifras;i2>=0;i2--)
	      {
	       p=(int)numero.charAt(po)-48;	
	           switch(p)	
	           {
	           	case 0:
	           	if(paseporaca==0)
	           	enletra=enletra+" cero ";
	           	
	           	paseporaca++;
	            case 1:
	              if(i2==2)
	              {
	                  if((int)(numero.charAt(po+1)-48)>0)
	                  {
	                  enletra=enletra+" ciento ";	
	                  }
	                  else
	                  {
	           	      enletra=enletra+" cien ";
	           	      }
	              }
	              if(i2==1)
	              {
	                  if((int)(numero.charAt(po+1)-48)>0)
	                  {
	                     Entre5y1=(int)(numero.charAt(po+1)-48);
	                     switch(Entre5y1)
	                     {
	                     case 1:
	                     enletra=enletra+" once ";break;
	                     case 2:
	                     enletra=enletra+" doce ";break;
	                     case 3:
	                     enletra=enletra+" trece ";break;
	                     case 4:
	                     enletra=enletra+" catorce ";	break;		
	                     case 5:	
	                     enletra=enletra+" quince ";	break;
	                     default:
	                     enletra=enletra+" dieci";	break;
	                     }
	                    paseporaca++; 
	                  }
	                  else
	                  {
	                  paseporaca++;		
	                   enletra=enletra+" diez ";	
	                  }
	              }
	              if(i2==0)
	              {
	              	if(paseporaca==0)
	                enletra=enletra+"uno ";
	              }
	           break;
	           case 2:
	              if(i2==0)
	              {
	                 if(paseporaca==0)
	           	     enletra=enletra+"dos ";
	           	  }
	           
	              if(i2==1)
	              {
	                 if((int)(numero.charAt(po+1)-48)>0)
	                 {
	                 enletra=enletra+" veinti";
	                 }
	                 else
	                 {
	                 paseporaca++;	
	                 enletra=enletra+" veinte ";	
	                 }
	              }
	              if(i2==2)
	              enletra=enletra+" doscientos ";
	           break;
	           case 3:
	              if(i2==0)
	              {
	                 if(paseporaca==0)	
	           	     enletra=enletra+"tres ";
	           	  }
	           
	              if(i2==1)
	              {
	                 if((int)(numero.charAt(po+1)-48)>0)
	                 {
	                 enletra=enletra+" treintai";
	                 }
	                 else
	                 {
	                 paseporaca++;	
	                 enletra=enletra+" treinta ";	
	                 }	
	              }
	           
	           
	              if(i2==2)
	              enletra=enletra+" trescientos ";
	           break;
	           case 4:
	              if(i2==0)
	              {
	                 if(paseporaca==0)	
	           	     enletra=enletra+"cuatro ";
	           	  }
	           
	              if(i2==1)
	              {
	                 if((int)(numero.charAt(po+1)-48)>0)
	                 {
	                 enletra=enletra+" cuarentai"; 
	                 }
	                 else
	                 {
	                 paseporaca++;	
	                 enletra=enletra+" cuarenta "; 	
	                 }
	              }
	              if(i2==2)
	              enletra=enletra+" cuatrocientos ";
	           break;
	           case 5:
	              if(i2==0)
	              {
	       	         if(paseporaca==0)	
	                 enletra=enletra+"cinco ";	
	              }
	           	
	           
	              if(i2==1)
	              {
	                 if((int)(numero.charAt(po+1)-48)>0)
	                 {
	                 enletra=enletra+" cincuentai"; 
	                 }
	                 else
	                 {
	                 paseporaca++;	
	                 enletra=enletra+" cincuenta "; 	
	                 }	
	              }
	           
	           
	              if(i2==2)
	              enletra=enletra+" quinientos ";
	           break;
	           case 6:
	              if(i2==0)
	           	  enletra=enletra+"seis ";
	           
	              if(i2==1)
	              {
	            
	                 if((int)(numero.charAt(po+1)-48)>0)
	                 {
	                 enletra=enletra+" secentai"; 
	                 }
	                 else
	                 {
	                 paseporaca++;	
	                 enletra=enletra+" secenta "; 	
	                 }
	              }
	           
	              if(i2==2)
	              enletra=enletra+" seiscientos ";
	           break;
	           case 7:
	              if(i2==0)
	           	  enletra=enletra+"siete ";
	           
	              if(i2==1)
	               {
	                 if((int)(numero.charAt(po+1)-48)>0)
	                 {
	                  enletra=enletra+" setentai"; 
	                 }
	                 else
	                 {
	                 paseporaca++;	
	                  enletra=enletra+" setenta "; 	
	                 }
	               }
	           
	              if(i2==2)
	              enletra=enletra+" setecientos ";
	           break;
	           case 8:
	              if(i2==0)
	           	  enletra=enletra+"ocho ";
	           
	              if(i2==1)
	              {
	         
	                 if((int)(numero.charAt(po+1)-48)>0)
	                 {
	                 enletra=enletra+" ochentai"; 
	                 }
	                 else
	                 {
	                 paseporaca++;	
	                 enletra=enletra+" ochenta "; 	
	                 }
	              }
	           
	              if(i2==2)
	               enletra=enletra+" ochocientos ";
	           break;
	           case 9:
	              if(i2==0)
	           	  enletra=enletra+"nueve ";
	           
	              if(i2==1)
	              {
	           
	                 if((int)(numero.charAt(po+1)-48)>0)
	                 {
	                 enletra=enletra+" noventai"; 
	                 }
	                 else
	                 {
	                 paseporaca++;	
	                 enletra=enletra+" noventa "; 	
	                 }
	              }
	           
	              if(i2==2)
	              enletra=enletra+" novecientos ";
	           break;
	           }
	           po++;  
	        }
	        System.out.print("\n");
		System.out.println("en letra es : "+enletra);
     }

}