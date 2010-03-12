class Avion{
	public static void main (String s[]){
	 int v1[]= new  int[6];
	 int v2[]= new  int[6];
	 int v3[]= new  int[15];
	 int v4[]= new  int[15];
	 int v5[]= new  int[25];
	 int v6[]= new  int[25];
	 
	 int i1=5,i2=5,i3=14,i4=14,i5=24,i6=24,ok=0,c1f1=0,c1f2=0,c2f1=0,c2f2=0,c3f1=0,c3f2=0,c=0;
	 do{
	 	System.out.print("INGRESE LA CLASE: 1. 2. o 3.");
	 	c=Leer.leerint();
	 	switch(c){
	 		case 1:
	 		    if(c1f1<6)
	 		    {
	 			c1f1++;
	 			System.out.println("aciento "+(i1+1)+",fila 1 , clase 1");
	 			v1[i1]=1;
	 			i1--;
	 			}                              
	 			else
	 			{
	 			
	 			  if(c1f2<6)
	 			  {
	 			  	c1f2++;
	 			  	System.out.println("aciento "+(i2+1)+",fila 2 , clase 1");
	 			  	v2[i2]=1;
	 			    i2--;
	 			  }
	 			  else
	 			  {
	 			  
	 			    System.out.println("No hay cupo clase 1");
	 			  }	
	 			}
	 			break;
	 			case 2:
	 		    if(c2f1<15){
	 			c2f1++;
	 			System.out.println("aciento "+(i3+1)+",fila 1 , clase 2");
	 			v3[i3]=1;
	 			i3--;
	 			}
	 			else
	 			{
	 			
	 			  if(c2f2<15){
	 			  	c2f2++;
	 			  	System.out.println("aciento "+(i4+1)+",fila 2 , clase 2");
	 			  	v4[i4]=1;
	 			    i4--;
	 			  }
	 			  else
	 			  {
	 			  	
	 			    System.out.println("No hay cupo clase 2");
	 			  	
	 			  }	
	 			}
	 			break;
	 			case 3:
	 		    if(c3f1<25){
	 			c3f1++;
	 			System.out.println("aciento "+(i5+1)+",fila 1 , clase 3");
	 			v5[i5]=1;
	 			i5--;
	 			}
	 			else
	 			{
	 			
	 			  if(c3f2<25){
	 			  	c3f2++;
	 			  	System.out.println("aciento "+(i6+1)+",fila 2 , clase 3");
	 			  	v6[i6]=1;
	 			    i6--;
	 			  }
	 			  else
	 			  {
	 			  
	 			    System.out.println("No hay cupo clase 3");
	 			  	
	 			  }	
	 			}
	 			break;
	 			
	 		}
	 		
	 		System.out.print("Final del dia: 1.si 2.no");
	 		ok=Leer.leerint();
	 	}while(ok==2);
	 	
	 	
	 	System.out.println("Pasajeros clase 1: "+(c1f1+c1f2));	
	 	System.out.println("Pasajeros clase 2: "+(c2f1+c2f2));
	 	System.out.println("Pasajeros clase 3: "+(c3f1+c3f2));
	 
	 }
	}
