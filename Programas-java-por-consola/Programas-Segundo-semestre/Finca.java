class finca{
	public static void main(String arg[]){
		int p[]=new int[5];
		for(int b=0;b<5;b++){
			System.out.print("Cantidad plantas de la parcela "+(b+1)+" = ");
			p[b]=Leer.leerint();
		}
		
		for(int b=0;b<5;b++){
			System.out.println("Parcela "+b+":");
			System.out.println("Cantidad de Alimento= "+(p[b]*180)+" Gramos");
			System.out.println("Cantidad de Agua= "+(p[b]*24)+" Litros");
			System.out.println("Cantidad de Abono= "+(p[b]*6)+" Kilos");
			System.out.println("\n*******************************\n");
		}
		
	}
}