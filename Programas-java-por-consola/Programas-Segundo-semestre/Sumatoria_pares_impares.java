

class Sumatoria_pares_impares{
	public static void main(String s[]){
		int v[]=new int[5];
		int sp=0,sip=0;
		for(int b=0;b<5;b++){
			System.out.print("valor vector indice "+b+" = ");
			v[b]=Leer.leerint();
			
			if(v[b]%2==0)
			 sp= sp+v[b];
			 else
			 sip= sip+v[b];
		}
		
		System.out.println("Pares: "+sp+" Impares: "+sip);
		
		
		
	}
}