package p2;

import java.util.Scanner;

public class p2 
{

	public static void main(String[] args) 
	{
		System.out.println("Introduzaca su a�o de nacimnto para saber si es mayor de edad o no"); //Para que muestre por pantalla, un (cout)
		
		Scanner teclado = new Scanner (System.in);
		double a�o;
		a�o= teclado.nextInt();
		//teclado.close();
			
			if (a�o<=2002) 
			{
				System.out.println("Eres mayor de edad");
			}
			else
			{
				System.out.println("Eres menor de edad");
			}
			
		
	}
}
