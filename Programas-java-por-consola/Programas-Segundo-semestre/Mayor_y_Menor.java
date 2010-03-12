import java.util.*;

class Mayor_y_Menor{
	public static void main(String s[]){
		int v[]=new int[15];
		
		for(int b=0;b<15;b++){
			System.out.print("valor vector indice "+b+" = ");
			v[b]=Leer.leerint();
		}
		
		
		Arrays.sort(v);
		System.out.println("Menor: "+v[0]+" Mayor: "+v[14]);
		
	}
}