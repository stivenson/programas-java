class ExamenFinal
{
	public static int Casas[][]=new int[4][4];	
	
	
public void LLenadoConValores(int valor){ ///metodo utilizado por ValorPorFila() y ValorPorFila().
		Casas[0][0]=(22*4)*valor;
        Casas[0][1]=(22*5)*valor;
        Casas[0][2]=(22*6)*valor;
        Casas[0][3]=(22*4)*valor;
        
        Casas[1][0]=(18*4)*valor;
        Casas[1][1]=(18*5)*valor;
        Casas[1][2]=(18*6)*valor;
        Casas[1][3]=(18*4)*valor;
        
        Casas[2][0]=(20*4)*valor;
        Casas[2][1]=(20*5)*valor;
        Casas[2][2]=(20*6)*valor;
        Casas[2][3]=(20*4)*valor;
        
        Casas[3][0]=(25*4)*valor;
        Casas[3][1]=(25*5)*valor;
        Casas[3][2]=(25*6)*valor;
        Casas[3][3]=(25*4)*valor;
        }
	
	
	
public static void main(String arg[])
	{
	   ExamenFinal obj=new ExamenFinal();	
	   obj.ValorPorFila();	
	   obj.CasaMasAltoValor();
	   obj.CasaMasBajoValor();
	   obj.ValorTotalLotesArmando();
	   obj.ValorPorColumna();
	   obj.planos();
	}
	

        
public  void ValorPorFila()
     {
     	LLenadoConValores(2000);
     	int s=0;	
  	    for(int i=0;i<4;i++)
  	    {
  	    	 for(int a=0;a<4;a++)
  	         {
  	         s=s+Casas[i][a];	
  	         }
  	         
  	      System.out.println("VALOR FILA "+i+" = "+s);
  	      s=0;   
  	    }
  	      
     }
     
     
public void CasaMasAltoValor(){
        int N=1,indiceCasaMayor=1,permuto=0;	
        int FilaCasaMayor=0;
        int ColumnaCasaMayor=0;	
        for(int i=0;i<4;i++)
         {
     	for(int a=0;a<4;a++)
     	   {
     		 if(Casas[FilaCasaMayor][ColumnaCasaMayor]<Casas[a][i])
     		 {
     		 permuto=Casas[a][i];
     		 Casas[a][i]=Casas[FilaCasaMayor][ColumnaCasaMayor];
     		 Casas[FilaCasaMayor][ColumnaCasaMayor]=permuto;
     		 indiceCasaMayor=N;
     		 }
     		N++;	 
     	  }
         
        }
      System.out.println("CASA MAYOR LA C"+indiceCasaMayor);   	
     }
     
     
public void CasaMasBajoValor(){
     int N=1,indiceCasaMenor=1,permuto=0;	
     int FilaCasaMayor=0;
     int ColumnaCasaMayor=0;	
     for(int i=0;i<4;i++)
     {
     	for(int a=0;a<4;a++)
     	{
     		 if(Casas[FilaCasaMayor][ColumnaCasaMayor]>Casas[a][i])
     		 {
     		 permuto=Casas[a][i];
     		 Casas[a][i]=Casas[FilaCasaMayor][ColumnaCasaMayor];
     		 Casas[FilaCasaMayor][ColumnaCasaMayor]=permuto;
     		 indiceCasaMenor=N;
     		 }
     	N++;	 
     	}
         
     }
      System.out.println("CASA MENOR LA C"+indiceCasaMenor);   	
     }
     
     
public void ValorTotalLotesArmando(){
	LLenadoConValores(2000);
     int Total=0;
      for(int i=0;i<4;i++)
       for(int a=0;a<4;a++)
       Total=Total + Casas[i][a];
     System.out.println("VALOR TOTAL CASAS POR DON ARMANDO "+Total);     	
     }
     
     
public  void ValorPorColumna()
     {
     	LLenadoConValores(2200);
     	int s=0;	
  	    for(int i=0;i<4;i++)
  	    {
  	    	 for(int a=0;a<4;a++)
  	         {
  	         s=s+Casas[a][i];	
  	         }
  	         
  	      System.out.println("VALOR COLUMNA "+i+" = "+s);
  	      s=0;   
  	    }
  	  }
     
     
public void planos()
     {
     LLenadoConValores(1);	
   	
     	     for(int a=0;a<4;a++)
  	         {
  	          System.out.println("***************************************");
  	          System.out.println("**  "+Casas[a][0]+"  **  "+Casas[a][1]+"  **  "+Casas[a][2]+"  **  "+Casas[a][3]+"  *****");	
  	          }	
        System.out.println("***************************************");
     }
     
   }

