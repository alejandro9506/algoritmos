package algoritmos;

public class ciclos {

	
	
	
	
	public String adivinar(int n1,int n2)
	{
		String cadena2 = "";
		
			
			if(n1>n2)
			{
				cadena2 = "el numero es mayor";
			}else if(n2>n1)
			{
				cadena2 = "el numero es menor";
			}else
				cadena2 = "adivinaste";
			
		
		return cadena2;
	}
	
	public boolean esPrimo(int num)
	{
		int contador = 2;
		boolean primo = true;
		if(num == 1)
			return primo;
		while((primo)&&(contador != num))
		{
			if(num % contador == 0)
				primo = false;
			contador++;
		}
		return primo;
	}
	
	public String matriz(int num)
	{
		String valor ="";
		for(int i = 0; i < num; i++)
		{
			for(int j = 0; j < num; j++)
			{
				valor = valor + "*";
			}
			valor = valor +"\n";
		}
		return valor;
	}
	
}
