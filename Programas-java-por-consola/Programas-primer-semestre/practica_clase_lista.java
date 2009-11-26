class practica_clase_lista
{
public static void main(String arg[])
{
	    int[] valores={10, -4, 23, 12, 16};
        Lista lista=new Lista(valores);

       

//En el resto del código, el objeto lista llama a las funciones miembro

        System.out.println("Valor mayor "+lista.valorMayor());
        System.out.println("Valor menor "+lista.valorMenor());
        System.out.println("Valor medio "+lista.valorMedio());
        lista.imprimir();

}	
}




