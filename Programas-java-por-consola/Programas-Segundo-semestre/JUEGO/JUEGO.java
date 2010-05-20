
////no ejecutar este clase

class JUEGO {
  private StringBuffer FRASEaCOMPLETAR=new StringBuffer();
  private int OPORTUNIDADES,VAN=0;
  private String FRASE;
  private boolean LaCompleto=false;
  private boolean Adivino=false;
  private boolean SeRinde=false; 
  	
  	 
    public JUEGO(String frase,int oportunidades){ //constructor que pide datos al momento de crear el objeto,...
    for(int i=0;i<frase.length();i++)             //... para inicializar variables globales que se necesitan para empezar el juego.
     if(String.valueOf(frase.charAt(i)).equals(" ")==true)	
      FRASEaCOMPLETAR.append(' ');
      else
      FRASEaCOMPLETAR.append('_');
      OPORTUNIDADES=oportunidades;
      FRASE=frase.toLowerCase();			
    }
    
    
    public void EMPEZAR(){  ///unico metodo llamado desde la clase PRINCIPAL, se encarga de todo el juego.
    Mostrar_FRASEaCOMPLETAR();
    do{
    	
         VAN++;
         String letra=PedirLetra(); 	
         if(EstaLetra(letra)){
             ColocarLetra(letra);	
             Completo();
          }
         else
       	  {
          System.out.println("LA LETRA NO ESTA EN LA FRASE, OJO ! TE QUEDAN "+(OPORTUNIDADES-VAN)+" OPORTUNIDADES.\n");	
          }
          Mostrar_FRASEaCOMPLETAR();
          if(LaCompleto==false)
              LaSabe();
              
    }while( (Adivino==false)&& (OPORTUNIDADES-VAN>0)&&(LaCompleto==false)&& ( SeRinde==false));
    
    if((OPORTUNIDADES-VAN)==0){
    	System.out.println("SE TE ACABARON LAS OPORTUNIDADES !!PERDEDOR\n");
    	System.out.println("ES: "+FRASE);
    }
     	
   }
   
//////////////////METODOS UTILIZADOS POR  EMPEZAR()////////////////////////////////////////////////////////////
  
private void LaSabe(){
   System.out.println("ESCOJE: 1.YA SABES CUAL ES, 2.OTRA OPORTUNIDAD, 3.TE RINDES ");
   int v=Leer.leerint();
   if(v==1){
   	  v=VerficarSiSeLaSabe();
   	  if(v==1){
   	  System.out.println("LISTO ADIVINASTE\n");
   	  Adivino=true;
      }
      else
   	  System.out.println("NADA !! SIGUE INTENTANDO TE QUEDAN "+(OPORTUNIDADES-VAN)+" OPORTUNIDADES\n");  
      }
      else if(v==3){
      	      System.out.println("LA FRASE ERA: "+FRASE);
      	      System.out.println("Y TE QUEDABAN "+(OPORTUNIDADES-VAN)+" OPORTUNIDADES, PERDEDOR!!");
      	      SeRinde=true;
             }
     }

   
private int VerficarSiSeLaSabe(){
  	 System.out.print("DIGITALA ENTONCES : ");
  	 if(FRASE.equals(Leer.leercadena().toLowerCase()))
  	 	return 1;
  	 	else
  	 	return 2;	
  }
   
   
private void Completo(){
   	if(FRASE.equals(String.valueOf(FRASEaCOMPLETAR))){
   		System.out.println("LISTO COMPLETASTE LA FRASE\n");
   		LaCompleto=true;
   	   }
   		else
   	  	System.out.println("ENCONTRADA!!  TE QUEDAN "+(OPORTUNIDADES-VAN)+" OPORTUNIDADES\n");  	
   }
   

    
private boolean EstaLetra(String letra){
    	if(FRASE.indexOf(letra)>=0)
    		return true;
    		else
    		return false;	
    }
    
    
private String PedirLetra(){
    System.out.print("Letra: ");
    return (Leer.leercadena().toLowerCase());
  
   }
  
    
private void ColocarLetra(String letra){
	for(int i=0;i<FRASE.length();i++)
		if((int)(FRASE.charAt(i))==(int)(letra.charAt(0)))
			FRASEaCOMPLETAR.setCharAt(i,letra.charAt(0));
	}
    
 
    
private void Mostrar_FRASEaCOMPLETAR(){
    	  System.out.print("\t");
    		for(int i=0;i<FRASEaCOMPLETAR.length();i++)
    		System.out.print(FRASEaCOMPLETAR.charAt(i)+" ");	
    	  System.out.print("\n\n");	
     }
    
   
    
   
    
    
   
    
    
}