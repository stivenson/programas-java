class Compu_All{
	public static void main(String arg[]){
		
		int t,c,ct1=0,ct2=0,ct3=0,LimiteT1=0,LimiteT2=0,LimiteT3=0;
		int ct1g=0,ct1n=0,ct1a=0,ct2g=0,ct2n=0,ct2a=0,ct3g=0,ct3n=0,ct3a=0,ok=0;
		
		do{
			System.out.println("TIPO DE PORTATIL: ");
			System.out.println("1. PC PORTATILES");
			System.out.println("2. MESAS HORIZONTALES");
			System.out.println("3. MESAS VERTICALES");
			t=Leer.leerint();
			System.out.println("Ahora elija su color: ");
			System.out.println("1.gris ");
			System.out.println("2. negro");
			System.out.println("3. azul");
			c=Leer.leerint();
			switch(t){
				case 1:
				if(LimiteT1<25){
				ct1++;
				LimiteT1++;
				  switch(c){
					case 1:ct1g++;break;
					case 2:ct1n++;break;
					case 3:ct1a++;break;
				   }
				}
				else
				{
				System.out.println("limite de pedido para portatiles");	
				}
			    break;
			
			    case 2:
				if(LimiteT2<25)
				{
				ct2++;
				LimiteT2++;
				  switch(c){
					case 1:ct2g++;break;
					case 2:ct2n++;break;
					case 3:ct2a++;break;
				   }
				}
				else
				{
				System.out.println("limite de pedido para mesas horizontales");	
				}
			    break;
			
			  case 3:
				if(LimiteT3<25)
				{
				ct3++;
				LimiteT3++;
				  switch(c){
					case 1:ct3g++;break;
					case 2:ct3n++;break;
					case 3:ct3a++;break;
				   }
				}
				else
				{
				System.out.println("limite de pedido para mesas verticales");	
				}
			    break;
			
			
			
			
				
			}
			System.out.println("Ya es final del mes: 1. si 2. no");
			ok=Leer.leerint();
			
			
			
		}while(ok==2);
		
		System.out.println("cantidad PC portatiles: "+ct1);
		System.out.println("de los cuales "+ct1g+" son grises ,"+ct1n+" son negros y "+ct1a+" son azules");
		
		System.out.println("cantidad mesas horizontales: "+ct2);
		System.out.println("de los cuales "+ct2g+" son grises ,"+ct2n+" son negros y "+ct2a+" son azules");
		
		System.out.println("cantidad mesas verticales: "+ct3);
		System.out.println("de los cuales "+ct3g+" son grises ,"+ct3n+" son negros y "+ct3a+" son azules");
		
		double A=((ct1n*(350*0.2))+(ct1n*350))+((ct1a*(350*0.3))+(ct1a*350))+(ct1g*350);
		double B=((ct2n*(320*0.2))+(ct2n*320))+((ct2a*(320*0.3))+(ct2a*320))+(ct2g*320);
		double C=((ct3n*(330*0.2))+(ct3n*330))+((ct3a*(330*0.3))+(ct3a*330))+(ct3g*330);
		
		System.out.println("proveedor A: "+A);
		System.out.println("proveedor B: "+B);
		System.out.println("proveedor C: "+C);
		
		System.out.println("Valor total de la compra: "+(A+B+C));
		
	}
}