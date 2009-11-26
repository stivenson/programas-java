import java.io.*;
class trabajo
{
	static int op=0,ok=0,xg=0;
	
	    public static void menu()
    	{
	   	
	    do
		{
	    menuprincipal();
	    op=Leer.leerentero();
	    
		int h=0,j=0;
		
		switch(op)
		{
			case 1:
			menuvectores();
			vector();
			break;
			
			case 2:
			menumatrices();
			matriz();
			break;
			
			case 3:
			menumetodos();
			metodo();
			break;
			
			case 4:
			menucadenas();
			cadena();
			break;			
			
			
			case 5:
			borrar();
			salir();
		    break;
			
			
			default:
		    error();
		   	break;
    	}
    
    	
        }
  		while (op != 5);
   		}
  		
  		public static void presentacion()
  		{
  		System.out.print("\n");
        System.out.print("\t======================================================\n");
        System.out.print("\t\t\t PROGRAMA MULTIFUNCIONES \n");
        System.out.print("\t======================================================\n\n\n");
		
	    System.out.print("\t======================================================\n");
        System.out.print("\t\t\t  INGENIERIA DE SISTEMAS   \n");
        System.out.print("\t======================================================\n\n\n");
		System.out.print("\t\t************************************\n");
		System.out.print("\t\t***   DEISY YURLEY LEAL MORENO   ***\n");
		System.out.print("\t\t*                                  *\n ");
		System.out.print("\t\t***   UNIVERSIDAD SIMON BOLIVAR  ***\n");
		System.out.print("");
        System.out.print("\t\t***********     2009     ***********   \n");
        System.out.print("\t======================================================\n\n\n");
		System.out.print("\n");
		
		pulse();
		
  		}
  		
  		
  		public static void salir()
  		{
  			System.out.println("**********************************************");
  			System.out.println("**********************************************");	
			System.out.println("**********        HASTA PRONTO     ***********");	
			System.out.println("**********************************************");
			System.out.println("**********************************************");
			System.out.print("\n");
  		}
  		
  		public static void pulse()
  		{
  			System.out.println("PULSE UNA TECLA PARA CONTINUAR...");
  			int a=0,h=0;
  			a=Leer.leerentero();
  			
  		}
  		
  		public static void borrar()
  		{
  			int d=0;
  			for(d=0;d<6;d++)
			{
				System.out.println("\n");
			}
  		}
  		
  		public static void menuprincipal()
  		{
  	   
  	    System.out.println("\n");
  	    System.out.println("\t======================================================\n");
        System.out.println("\t\t\t**   MENU PRINCIPAL   **\n");
        System.out.println("\t======================================================\n");	
        System.out.println("\t======================================================\n");	
		System.out.println("\t******************************************************");
		System.out.println("\t**                                                  **");
		System.out.println("\t**   1. VECTORES                                    **");
		System.out.println("\t**   2. MATRICES                                    **");
		System.out.println("\t**   3. METODOS                                     **");
		System.out.println("\t**   4. CADENAS                                     **");
		System.out.println("\t**   5. SALIR                                       **");
		System.out.println("\t**	                                            **");
		System.out.println("\t******************************************************");
		System.out.print("\n");
		System.out.print("\n");
		System.out.println("DIGITE OPCION <<1-5>> -->");
		System.out.print(" ");
		
  		}  	
  		
  		public static void error()
   		{
  			int d=0;
  			long h=0,j=0,o=0;
  			for(d=0;d<12;d++)
			{
				System.out.println("\n");
			}
  			System.out.println("**********************************************");	
			System.out.println("* ERROR...HAZ COLOCADO UNA OPCION NO VALIDA  *");	
			System.out.println("**********************************************");
			
			
			
			for(h=0;h<999;h++)
			{
				for(j=0;j<999;j++)
				{
				  for(o=0;o<999;o++)
				  {
				  	
				  }
				}
			}
		
		}
		
		
		
		
		
  		public static void menuvectores()
  		{
  		System.out.print("\n");
  	    System.out.print("\t======================================================\n");
        System.out.print("\t\t\t MENU VECTORES \n");
        System.out.print("\t======================================================\n\n\n");	
        System.out.print("\t======================================================\n\n\n");	
		System.out.println("\t********************************************************");
		System.out.println("\t**                                                    **");
		System.out.println("\t**  1. SUMA                                           **");
		System.out.println("\t**  2. MAYOR                                          **");
		System.out.println("\t**  3. BUSCAR                                         **");
		System.out.println("\t**  4. MULTIPLICAR                                    **");
		System.out.println("\t**  5. SALIR                                          **");
		System.out.println("\t**                                                    **");
		System.out.println("\t********************************************************");
		System.out.print("\n");
		System.out.print("\n");
		System.out.println("DIGITE OPCION <<1-5>> -->");
		System.out.print(" ");
		
		
  		}	
  		
  		public static void vector()
  		{
  		menuvectores();
  		do
		{
	    ok=Leer.leerentero();
	    switch(ok)
		{
			
			case 1:
			sumar();
			menuvectores();
			break;
			
			case 2:
			ordenar();
			menuvectores();
			break;
			
			case 3:
			buscar();
			menuvectores();
			break;
			
			case 4:
			multiplicar();
			menuvectores();
			break;			
			
			
			case 5:
			borrar();
			salir();
		    break;
			
			
			default:
		    error();
		   	break;
    	}
    
    	
        }
  		while (ok != 4);
  		}
  		
  		public static void sumar()
		{
		int i,a;
		int suma=0;
		System.out.println("\n");
		System.out.println("****************************************************");
		System.out.println("**              SUMA DE VECTORES                  **");
		System.out.println("****************************************************");
		System.out.println("\n");
		System.out.println("(*) DIGITE NUMEROS DEL VECTOR : ");
		a=Leer.leerentero();
	    int [] dato=new int [a];
		System.out.println("\n");
		System.out.println("(*)DIGITE LOS NUMEROS PARA SUMAR :\n\n");
		for (i=0;i<a;i++)
		{
			System.out.print("    ");
			dato[i]=Leer.leerentero();
		}	
	
		for (i=0;i<a;i++)
		{
			suma=suma+dato[i];	 
		}
		
		System.out.println("  "); 
		System.out.println("            ................");   
		System.out.println("La SUMA es:->       "+suma   );
		System.out.println("            ................");
		pulse();
		borrar();
		
		
		}
		
		public static void buscar()
		{
			System.out.println("\t***********************************\n");
			System.out.println("\t*****          BUSCAR         *****\n"); 
			System.out.println("\t***********************************\n");	
 			System.out.println(" ");
 			System.out.println("\n");
	 	int f,x;
		int [] vector1=new int [5];
    		System.out.println("**************************");
 			System.out.println("  Digite valores  vector  ");
 			System.out.println("**************************");
 			System.out.println("\n");
 		
 		for (f=0;f<5;f++)
		{
			System.out.println("  ");
			vector1[f]=Leer.leerentero();
		}
		
			System.out.print("NUMERO A BUSCAR--> ");
			x=Leer.leerentero();
		int y=0;
		for (f=0;f<5;f++)
		{
			if (vector1[f]==x)
			y=1;
		
		}
		if (y==1)
		{
			System.out.println("*********************");
			System.out.println("  Busqueda Acertada  ");
			System.out.println("*********************");
		}
		else
		{
			System.out.println("********************");
			System.out.println("  Busqueda Errada   ");
			System.out.println("********************");
		} 
		pulse();
		borrar();
		}
		
		public static void multiplicar()
		{
		System.out.println("\t************************************");	
		System.out.println("\t*****      MULTIPLICACION      *****");
		System.out.println("\t************************************");
 		System.out.println(" ");
		int f,c;
		System.out.println("DIGITE NUMEROS PARA MULTIPLICAR\n\n");
						
		int [] vector1=new int [5]; 
		int [] vector2=new int [5];
		int [] vector3=new int [5];
	    System.out.println("Digite valores del vector A --->");
		for (f=0;f<5;f++)
		{
		vector1[f]=Leer.leerentero();
		
		}
		
		System.out.println("Digite valor del vector B --->");
		
		for (f=0;f<5;f++)
		{
			vector2[f]=Leer.leerentero();
		}
		
		for (f=0;f<5;f++)
		{
			vector3[f]=vector1[f]*vector2[f];
		}
		
		System.out.println("Resultado  =");
		for (f=0;f<5;f++)
		{
		System.out.print("  "+vector3[f]+"  ");
		System.out.println("\n");
		
		}
		
		pulse();
		borrar();
		}
		
		public static void ordenar()
		{
		System.out.println("\t\t*****************************************" );
		System.out.println("\t\t*******  ORDENAR DE MENOR A MAYOR *******" );	
		System.out.println("\t\t*****************************************" );			 
 	    System.out.println("  ");
 	
		int h []=new int [5];
		int a=0,s=0,aux=0;
		System.out.println("Digite Numeros a Ordenar");
		
		
		for (a=0;a<5;a++)
		{
			System.out.println("  ");
			h[a]=Leer.leerentero();
			
		}
		System.out.println("  ");
		for (a=0;a<5;a++)
		{
			for(s=a+1;s<5;s++)
			{
				if (h[a]>h[s])
				{
					aux=h[a];
					h[a]=h[s];
					h[s]=aux;
				}
				
			}
			System.out.println(h[a]);
		
			
		}
		pulse();
		borrar();
		}
		
		
		
		public static void menumatrices()
  		{
  		System.out.print("\n");
  	    System.out.print("\t======================================================\n");
        System.out.print("\t\t\t MENU MATRICES \n");
        System.out.print("\t======================================================\n\n\n");	
        System.out.print("\t======================================================\n\n\n");	
		System.out.println("\t********************************************************");
		System.out.println("\t**                                                    **"); 
		System.out.println("\t**  1. SUMA                                           **");
		System.out.println("\t**  2. MENOR Y MAYOR                                  **");
		System.out.println("\t**  3. BUSCAR                                         **");
		System.out.println("\t**  4. MULTIPLICAR                                    **");
		System.out.println("\t**  5. SALIR                                          **");
		System.out.println("\t**                                                    **");
		System.out.println("\t********************************************************");
		System.out.print("\n");
		System.out.print("\n");
		System.out.println("DIGITE OPCION <<1-5>> -->");
		System.out.print(" ");
		
  		}
  		
  		public static void matriz()
  		{
  		menumatrices();
  		do
		{
	    xg=Leer.leerentero();
	    switch(xg)
		{
			
			case 1:
			sumarmatriz();
			menumatrices();
			break;
			
			case 2:
			mayorymenor();
			menumatrices();
			break;
			
			case 3:
			buscarmatriz();
			menumatrices();
			break;
			
			case 4:
			multiplicarmatriz();
			menumatrices();
			break;			
			
			
			case 5:
			borrar();
			salir();
		    break;
			
			
			default:
		    error();
		   	break;
    	}
    
    	
        }
  		while (ok != 4);
  			
  			
  		}
  		
  		public static void sumarmatriz()
  		{
  			System.out.println("\t**********************************************\n");
			System.out.println("\t************  SUMA DE MATRICES  **************\n");
			System.out.println("\t**********************************************\n");
  			System.out.println("   ");
 
 				int [][] X=new int[3][3],Y=new int[3][3],Z=new int[3][3];
   				int a=0, b=0,c=0, d, f1=0, f2=0, c1=0, c2=0, m=0, e=0,o=0,f=0;
  				int q=0,r=0,u=0,h=0,g=0;
 			 System.out.println(" ");

 			 System.out.println("Digite el tamaño de la Matriz A:");
  		     System.out.print("Fila:->  ");
  				f1=Leer.leerentero();
  			 System.out.print("Columna:->  ");
  				c1=Leer.leerentero();
  				int k[]= new int [c1];
  				int j[]= new int [f1];
  
  			 System.out.println("Numeros de  Matriz A" );
  				for (a=0;a<f1;a++)
  				{
    				for (b=0;b<c1;b++)
    				{     
     					X[a][b]=Leer.leerentero();
    				}
  				}
  
  
 			 System.out.println("MATRIZ A:");
 				for (a=0;a<f1;a++)
   				{
    				System.out.println(" ");
   					 for (b=0;b<c1;b++)
    					{
   	 						for(a=0;a<f1;a++)
   	 						{
   	 							System.out.print( X[a][b] + " ");
   	 						}
   								System.out.println(" ");
    					}
  				 }
   
    		 System.out.println(" ");
    		 System.out.println("---------------------------------------");
 			 System.out.println("- SUMADO POR COLUMNAS <1> O FILAS <0> -");
 			 System.out.println("---------------------------------------");
 				d=Leer.leerentero();
 	 		 System.out.println(" ");
 				switch(d)
 				{
 				case 0:
 				for(f=0;f<f1;f++)
 				{
 					for(c=0;c<c1;c++)
 					{
 						k[c]=k[c]+X[f][c];
 					}
 		 		}
 				for (a=0;a<f1;a++)
   				{
       				for (b=0;b<c1;b++)
    				{
   	 					for(a=0;a<f1;a++)
   	 					{
   	 						System.out.print( X[a][b] + " ");
   	 					}
     						System.out.println(" ");
    				}
     						System.out.println(" ");
    		    }
 				for(h=0;h<c;h++)
 				{
 					 System.out.println(k[h]+   " "  );	
 		 		}
 				break;
 	 
 	  			case 1:
 	   			for(q=0;q<c1;q++)
 	   			{
 	   				for(r=0;r<f1;r++)
 	   				{
 	   					j[u]=j[u]+X[q][r];
 	   				}
 	   				u++;
 	   			}
 	   
 	    
    			for (b=0;b<c1;b++)
    			{
   	 				for(a=0;a<f1;a++)
   	 				{
   	 					System.out.print( X[a][b] +" ");
   	 				}
     					System.out.println(" ");
    			}
      			System.out.println(" ");
     			for(g=0;g<u;g++)
     			{
     				System.out.print(j[g]+   " "  );	
     			}
 				}
  		
  		pulse();
  		borrar();	
  		}
  		
  		public static void mayorymenor()
  		{
  		
  		System.out.println("\n");
		System.out.println("\t********************************************************");
		System.out.println("\t***         ORDENAR ELEMENTOS EN LA MATRIZ           ***");
		System.out.println("\t********************************************************");
        System.out.println("   ");
      	int [][] m=new int[3][3];	
      	int [] tm = new int[9];
		int x=0,f=0,c=0,t=0;
		int d;
		
	  
		System.out.println("Digite Numeros ");		
		for(f=0;f<3;f++)
		{
		   	for(c=0;c<3;c++)			
			 {			 			
			m[c][f]=Leer.leerentero();
			tm[x]=m[c][f];
			x=x+1;
			 }
				
		}
		
		for (f=0;f<3;f++)
		{
			for (c=0;c<3;c++)
			{
				
				System.out.print("  "+m[f][c]+"  ");
				
			}
				System.out.println(" ");
		}	
			
		System.out.println("\n\n\n ");
		System.out.println("---------------------------------------");
		System.out.println("DIGITE OPCION: MENOR<<1>>; MAYOR<<2>>>:");
		System.out.println("---------------------------------------");
		d=Leer.leerentero();
		System.out.println(" ");
		
		switch(d)
		{
		 case 1:
		
		for (f=0;f<9;f++)
		{
			for (c=f+1;c<9;c++)
			{
				if(tm[c]<tm[f])
				 {
				  t=tm[c];
				  tm[c]=tm[f];
				  tm[f]=t;
				 }
			}
		
		}		
		
		x=0;
		
		for (f=0;f<3;f++)
		{
			for (c=0;c<3;c++)
			{
				m[f][c]=tm[x];
				x=x+1;
				System.out.print("  "+m[f][c]+"  ");
			}
			System.out.println(" ");
		}		
		
		x=Leer.leerentero();
		break; 
	
	  	case 2:
	  
		for (f=0;f<9;f++)
		{
			for (c=f+1;c<9;c++)
			{
				if(tm[c]>tm[f])
				 {
				  t=tm[c];
				  tm[c]=tm[f];
				  tm[f]=t;
				 }
			}
		
		}		
		
		x=0;
		
		for (f=0;f<3;f++)
		{
			for (c=0;c<3;c++)
			{
				m[f][c]=tm[x];
				x=x+1;
				System.out.print("  "+m[f][c]+"  ");
			}
			System.out.println(" ");
		}		
		
		x=Leer.leerentero();
		break; 
	  	
      	}
		
  		}
  		
  		public static void buscarmatriz()
  		{
  			System.out.println("\t*************************************************\n");
			System.out.println("\t*****        BUSQUEDA ELEMENTO EN MATRIZ    *****\n");
			System.out.println("\t*************************************************\n");
			System.out.println("   ");
	
		
		int x,f=0,c=0;
		int f1=0,c1=0;
		System.out.println("...............");
		System.out.println("DIGITE FILA--->");
		System.out.println("...............");
		f1=Leer.leerentero();
		System.out.println("DIGITE COLUMNA-->");
		System.out.println(".................");
		c1=Leer.leerentero();
		int [][] m=new int[c1][f1];
		System.out.println(".   DIGITE NUMEROS  .");		
		
		System.out.println("\n");
		for(f=0;f<f1;f++)
		{
		   	for(c=0;c<c1;c++)			
			 {			 			
				m[c][f]=Leer.leerentero();
			 }
				
		}
			
		for (f=0;f<f1;f++)
		{
			for (c=0;c<c1;c++)
			{
				
				System.out.print("  "+m[f][c]+"  ");
			}
			System.out.println(" ");
		}		
		System.out.println("....................................");		
		System.out.println("DIGITE EL NUMERO QUE DESEA BUSCAR-->");
		System.out.println("....................................");
		x=Leer.leerentero();
		int r=0,h=0,v=0;
		
		for(f=0;f<f1;f++)		
		{
			for(c=0;c<c1;c++)
			{
			   if(m[f][c]==x)
			{
				
				h=f;
			  	r=1;
			  	v=c;
			}
	
			}
	
		}		
		
		
		if(r==1)
		{
			System.out.println("**********************************************");
			System.out.println("**            Busqueda Acertada             **");
			System.out.println("**********************************************");
			System.out.println("\n");
			System.out.println("el numero esta en la posicion:");
			System.out.println("fila-->"+ h);
			System.out.println("columna-->"+v);
		}
		else
		{
			System.out.println("**********************************************");
			System.out.println("**            Busqueda Erronea              **");
			System.out.println("**********************************************");
		}
	   
	    pulse();
	    borrar();
  		}
  		
  		public static void multiplicarmatriz()
  		{
  		System.out.println("***********************************************");
		System.out.println("*****      MULTIPLICACION DE MATRICES      ****");
		System.out.println("***********************************************");
    	System.out.println("\n"); 
    
    		int [][] X=new int [3][3],Y=new int[3][3],Z=new int[3][3];
 	   		int a=0,b=0,S=0,M=0,f1=0,f2=0,c1=0,c2=0,c=0,e=0,m=0;
 		 System.out.println(" ");
	 	 System.out.println(" Digite el tamaño de la Matriz A:"); 
		 System.out.print("Fila:->  ");
 			 f1=Leer.leerentero();
 			 System.out.print("Columna:->  ");
 			 c1=Leer.leerentero();
 			 System.out.println("\n"); 
   
  		System.out.println(" Digite el tamaño de la Matriz B:");
 		System.out.print("Fila:->  ");
 			 f2=Leer.leerentero();
 			 System.out.print("Columna:->  ");
 			 c2=Leer.leerentero();
 			 System.out.println("\n");
  
 		System.out.println(" Numeros de  Matriz A"); 
 		 for (a=0;a<f1;a++)
  		{
    		for (b=0;b<c1;b++)
    		{
 			     X[a][b]=Leer.leerentero();
   			}
  		}
    
  	    System.out.println("Numeros de  Matriz B");
  		for (a=0;a<f2;a++)
  			{
   			 for (b=0;b<c2;b++)
   			 {  
   			  Y[a][b]=Leer.leerentero();
   			 }
  			}
  
 		System.out.println("Matriz A:");
 		for (a=0;a<f1;a++)
   		{
  			System.out.println("");
    		for (b=0;b<c1;b++)
   		 	{
   				if (X[a][b]<3)
   		 		{
  					System.out.print(" " + X[a][b] + " ");
   	 			}
     			else 
     			{
  					System.out.print(X[a][b] + " ");
     			}
    	 	}
      		System.out.println(" ");
       	}
  
    	 System.out.println("Tamaño:->" + f1 + "x" + c1);
    	 System.out.println(" ");
     	 System.out.println("Matriz B:");
     	 for (a=0;a<f2;a++)
  		 {
  			System.out.println("");
    		for (b=0;b<c2;b++)
    		{
   				if (Y[a][b]<3)
   	 			{
  				System.out.print(" " + Y[a][b] + " ");
   	 			}
     			else 
     			{
  				System.out.print(Y[a][b] + " ");
     			}
    		}
    			System.out.println(" ");
    
   	     }
  		System.out.println("\n");
  		System.out.println("Tamaño:->" + f2 + "x" + c2);
   		System.out.println("\n"); 
   
   			if (c1==f2)
   			{
   
   			System.out.println("Matriz Resultante:->" + f1 + "x" + c2);
    		for (a=0;a<c1;a++)
    		{
     			for (b=0;b<f2;b++)
     			{
       				S=0;
       				M=0;
      				for (c=0;c<f2;c++)
     				{
      					 M=X[a][c]*Y[c][b];
       					 S=S+M;
      				} 
      
       				Z[a][b]=S;
      			}
    		}
   
    		for (a=0;a<f1;a++)
    		{
   				System.out.println(" ");
     			for (b=0;b<c2;b++)
     			{
   	  				if (Z[a][b]<10)
   	  				{
  						System.out.print("   " + Z[a][b] + " ");
   	  				}
   	   				else
       				{
        
        				if (Z[a][b]>=10 && Z[a][b]<100)
        				{
   							System.out.print("  " + Z[a][b] + " ");
        				}
         				else
         				{
          				if (Z[a][b]>=100 && Z[a][b]<1000)
         		          {
   							System.out.print(" " + Z[a][b] + " ");
          				  }
          				else
          				{
           
           					System.out.print(" " + Z[a][b] + " ");
          				}
         				}
        			}
       			}
      	  } 
     	}
     		else
     		{
      			System.out.println("** NO SE PUEDE REALIZAR LA OPERACION **");
     		} 
     		
     		pulse();
     		borrar();
  	}
  	
  	
  	
  		
  		public static void menumetodos()
  		{
  	    System.out.print("\n");
  	    System.out.print("\t======================================================\n");
        System.out.print("\t\t\t MENU METODOS \n");
        System.out.print("\t======================================================\n\n\n");	
        System.out.print("\t======================================================\n\n\n");	
		System.out.println("\t********************************************************");
		System.out.println("\t**                                                    **"); 
		System.out.println("\t**  1. void - nombre  (vacio)                         **");
		System.out.println("\t**  2. void - nombre  (parametros)                    **");
		System.out.println("\t**  3. tipo - nombre  (vacio)                         **");
		System.out.println("\t**  4. tipo - nombre  (parametros)                    **");
		System.out.println("\t**  5. salir                                          **");
		System.out.println("\t**                                                    **");
		System.out.println("\t********************************************************");
		System.out.print("\n");
		System.out.print("\n");
		System.out.println("DIGITE OPCION <<1-5>> -->");
		System.out.print(" ");
  	    

  		}
  		
  		public static void metodo()
  		{
  		menumetodos();
  		do
		{
	    xg=Leer.leerentero();
	    switch(xg)
		{
			
			case 1:
			vacio();
			menumetodos();
			break;
			
			case 2:
			vacioparametros();
			menumetodos();
			break;
			
			case 3:
			tipovacio();
			menumetodos();
			break;
			
			case 4:
			tipoparametros();
			menumetodos();
			break;			
			
			
			case 5:
			borrar();
			salir();
		    break;
			
			
			default:
		    error();
		   	break;
    	}
    
    	
        }
  		while (ok != 4);
  		
  			
  		}
  		
  		public static void vacio()
  		{
  				
		System.out.println("\n");
		System.out.println("********************************");
		System.out.println("*  METODO VOID SIN PARAMETROS  *");
		System.out.println("********************************");
		System.out.println("\n");
		
		System.out.println("ES AQUEL METODO QUE NO RETORNA NINGUN TIPO DE DATO");
		System.out.println("\n");
		System.out.println("se declara asi:");
		System.out.println("void nombre (vacio)");
		System.out.println("int  saltar ( )    ");
  		System.out.println("\n");
  		pulse();
  		borrar();	
  		}
  		
  		public static void vacioparametros()
  		{
  				
		System.out.println("\n");
		System.out.println("*********************************");
		System.out.println("*  METODO VOID CON PARAMETROS  *");
		System.out.println("*********************************");
		System.out.println("\n");
		
		System.out.println("NO RETORNA DATOS PERO RECIBE UNA VARIABLE");
		System.out.println("\n");
		System.out.println("se declara asi:");
		System.out.println("void nombre (parametros)");
		System.out.println("sumar(a , b)      ");
		System.out.println("\n");
		pulse();
		borrar();
		
  		}
  		
  		public static void tipovacio()
  		{
  		System.out.println("\n");
		System.out.println("*********************************");
		System.out.println("*        METODO TIPO VOID       *");
		System.out.println("*********************************");
		System.out.println("\n");
		
		System.out.println("no recive datos como parametro pero si retorna un tipo de dato");
		System.out.println("\n");
		System.out.println("se declara asi:");
		System.out.println("tipo nombre ( )");
		System.out.println("int rest= leerentero(); ");
		System.out.println("\n");
		pulse();
		borrar();
		
  		}
  		
  		public static void tipoparametros()
  		{
  		System.out.println("\n");
		System.out.println("**********************************");
		System.out.println("*   METODO TIPO CON PARAMETROS   *");
		System.out.println("**********************************");
		System.out.println("\n");
		
		System.out.println("retorna un tipo de dato y recibe ");
		System.out.println("una o varias variables como parametro");
		System.out.println("\n");
		System.out.println("se declara asi:");
		System.out.println("tipo nombre (parametros)");
		System.out.println("int rest=  sumar(a , b) ");
		System.out.println("\n");
		pulse();
		borrar();
  		}
  		
  		
  		
  		public static void menucadenas()
  		{
  		System.out.print("\n");
  	    System.out.print("\t======================================================\n");
        System.out.print("\t\t\t MENU CADENAS \n");
        System.out.print("\t======================================================\n\n\n");	
        System.out.print("\t======================================================\n\n\n");	
		System.out.println("\t********************************************************");
		System.out.println("\t**                                                    **");
		System.out.println("\t**  1. COMPARAR                                       **");
		System.out.println("\t**  2. ORDENAR                                        **");
		System.out.println("\t**  3. ELIMINAR                                       **");
		System.out.println("\t**  4. INVERTIR                                       **");
		System.out.println("\t**  5. SALIR                                          **");
		System.out.println("\t**                                                    **");
		System.out.println("\t********************************************************");
		System.out.print("\n");
		System.out.print("\n");
		System.out.println("DIGITE OPCION <<1-5>> -->");
		System.out.print(" ");
  	
  	    
  		}
  		
  		public static void cadena()
  		{
  		menucadenas();
  		do
		{
	    xg=Leer.leerentero();
	    switch(xg)
		{
			
			case 1:
			comparacadenas();
			menucadenas();
			break;
			
			case 2:
			ordenarcadenas();
			menucadenas();
			break;
			
			case 3:
			eliminarcadenas();
			menucadenas();
			break;
			
			case 4:
			invertircadenas();
			menucadenas();
			break;			
			
			
			case 5:
			borrar();
			salir();
		    break;
			
			
			default:
		    error();
		   	break;
  		}
  		
  		}
  		while (ok != 4);
  			
  		
  		}
  	
  		public static void comparacadenas()
  		{
  		String c1,c2;
		int cont=0;
		System.out.println("\n");
		System.out.println("*********************************");
		System.out.println("  DIGITE VALOR PRIMERA CADENA-->");
		System.out.println("*********************************");
		c1=Leer.leercadena();
		System.out.println("\n");
		System.out.println("*********************************");
		System.out.println("  DIGITE VALOR SEGUNDA CADENA-->");
		System.out.println("*********************************");
		c2=Leer.leercadena();
		int h;
		if(c1.length()==c2.length())
		{
			for(h=0;h<c1.length();h++)
			{
				if(c1.charAt(h)==c2.charAt(h))
				{
					cont++;
				}
			}
			
			if (c1.length()==cont)
			{
				System.out.println("-----------------------------");
				System.out.println("...LAS CADENAS SON IGUALES   ");
				System.out.println("-----------------------------");
			}
			else
			{
				System.out.println("---------------------------------");
				System.out.println("...LAS CADENAS NO SON IGUALES    ");
				System.out.println("---------------------------------");
			}
		}
  			
  		pulse();
  		borrar();
  			
  		}
  	
  		public static void ordenarcadenas()
  		{
  			
  		}
  		
 		public static void eliminarcadenas()
 		{
 			int n1=0,n2=0,r=0,c=0;
 			String cad="";
 			char x;
 			char [] k=new char[20];
 
  			System.out.println("DIGITE UN NOMBRE:");
  			cad=Leer.leercadena();
  			System.out.println("DIGITE UNA LETRA:");
  			n2=cad.length();
  			x=Leer.leerchar();
    		n1=cad.length();
  			k=cad.toCharArray();
  
  			/*for (c=0;c<n1;c++)
  				{
  					System.out.print(k[c]);
 				 }
  
 					 System.out.println("");*/
  
  			for (c=0;c<n1;c++)
  			{
  				if (k[c]==x)
    			System.out.print("*");
    	
				else
				System.out.print(k[c]);
 		    }
  
  				System.out.println(" ");
  				r=n1-n2;
  				System.out.println("Numero de letras:" + r);
 			
  		}		
  			
  						
  			
  		public static void invertircadenas()
  		{
 			int x=0,n=0;
 			String cad="";
 			String cadr="";
 			char [] k=new char[20];
  			System.out.println("\n"); 
  			System.out.println("****************");	
  			System.out.println("DIGITE UN NOMBRE");
  			System.out.println("****************");
  			System.out.println("\n");
  			cad=Leer.leercadena();
  
  			x=cad.length();
 			k=cad.toCharArray();
  
  			System.out.println("");
  
 
 	
  			System.out.println("");
   			System.out.println("----------------------");
  			System.out.println("EN FORMA INVERTIDA ES:");
   			System.out.println("----------------------");
   			System.out.println("");
  
  			for (n=x-1;n>=0;n--)
  			{
   				System.out.print(k[n]);
  			}
  				System.out.println("");
  			
  			pulse();
  			borrar();
  		}
  	
  		
  	
  	 	
  		public static void main(String arg[])
	   {
	   	presentacion();
	   	menu();
	  
	   }
  	
  	
  	
 }