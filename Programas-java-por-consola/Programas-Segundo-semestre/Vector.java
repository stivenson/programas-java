
class Vector{
	public static void main(String arg[]){
		int aux=0;
		double prom=0;
		
		System.out.print("Ingrese el tamaño del vector: ");
		int p=Leer.leerint();
		int v[]=new int[p];
		
		for(int i=0;i<p;i++){
		System.out.print(" Valor vector [ "+i+" ] = ");
		v[i]=Leer.leerint();
		prom=prom+v[i];	
		}
		
		prom=prom/p;
		
		System.out.println("El promedio es: "+prom+" entonces :");
		for(int i=0;i<p;i++)
		if(v[i]>prom)	
		System.out.println("Mayor que el promedio, el vector en la posicion: "+i);
		



		for(int i=0;i<p;i++){
			
			for(int a=i+1;a<p;a++){
			
			if(v[i]<v[a]){
			aux=v[i];
			v[i]=v[a];
			v[a]=aux;
			}
				
			}
         }
		
	
		
		System.out.println("Mayor :"+v[0]+" , menor: "+v[p-1]);
		
	}
}