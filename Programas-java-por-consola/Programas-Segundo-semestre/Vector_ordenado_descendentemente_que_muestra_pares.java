import java.util.*;

class Vector_ordenado_descendentemente_que_muestra_pares{
	public static void main(String s[]){
			int aux;
		int v1[]=new int[5];
		int v2[]=new int[5];
		
		for(int b=0;b<5;b++){
			System.out.print("valor vector indice "+b+" = ");
			v1[b]=Leer.leerint();
		}
		
		Arrays.sort(v1); // ordena ascendentemente
		int indice=0;
		
		for(int b=4;b>-1;b--){ // ordeno descentemente en otro vector
		v2[indice]=v1[b];
		indice++;	
		}
		
		for(int b=0;b<5;b++){
			if(v1[b]%2==0) /// imprimo vector ascendente
			System.out.println(v1[b]);
		}
		
		
	
		
	}
}