package algoritmos;
import java.util.Random;
import java.util.Scanner;

public class algoritmosapp {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n1,n2,num = 0;
		ciclos ci = new ciclos();
		/*programa 1
		 * String respuesta = "";
		Random rdn = new Random(System.nanoTime());
		n1 = rdn.nextInt(100);
		System.out.println(n1);
		System.out.println("adivina el numero");
		do
		{
			System.out.println("ingresa el numero");
			n2 = sc.nextInt();
			respuesta = ci.adivinar(n1, n2);
			System.out.println(respuesta);
		}while(!respuesta.equalsIgnoreCase("adivinaste"));*/
		
		/*programa2
		System.out.println("ingrse numero");
		num = sc.nextInt();
		System.out.println("resultado"+ ci.esPrimo(num));*/
		
		System.out.println("ingresa el tamaño de la matriz");
		n1 = sc.nextInt();
		System.out.println(ci.matriz(n1));
		
		
	}

}
