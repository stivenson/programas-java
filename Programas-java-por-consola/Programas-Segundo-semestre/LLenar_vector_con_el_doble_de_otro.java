class LLenar_vector_con_el_doble_del_otro{
	public static void main(String s[]){
		int v1[]=new int[5];
		int v2[]=new int[5];
		
		for(int b=0;b<5;b++){
			System.out.print("valor vector 1 indice "+b+" = ");
			v1[b]=Leer.leerint();
			v2[b]=v1[b]+v1[b];
		}
		
			for(int b=0;b<5;b++){
			System.out.println("Vector 1 indice "+ b +" = "+v1[b]);
			System.out.println("Vector 2 indice "+ b +" = "+v2[b]);
			
		}
	}
}