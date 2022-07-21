import java.util.Scanner;

public class actividad10
{
	private Scanner teclado;
	private int[] valor;
	private int suma;
	
	public void cargar()
	{
		teclado=new Scanner(System.in);
		System.out.print("Cuantos vectores cargará:");
		int cant;
		cant=teclado.nextInt();
		valor=new int[cant];
		for(int f=0;f<valor.length;f++)
		{
			System.out.print("Ingrese valor:");
			valor[f]=teclado.nextInt();
		}
	}
	public void sumar()
	{
		suma=0;
		for(int f=0;f<valor.length;f++)
		{
			suma= suma + valor[f];
		}
	}
	
	public void imprimir()
	{
		System.out.println("La suma de los componentes del vector es:");
		System.out.println(suma);
		for(int f=0;f<valor.length;f++)
		{
			System.out.println(valor[f]);
		}
	}
	
	public static void main(String[] ar)
	{
		actividad10 pv; 
		pv=new actividad10();
		pv.cargar();
		pv.sumar();
		pv.imprimir();
	}
} 

