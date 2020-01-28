package p2;

import java.util.Scanner;

public class p4 
{
	public static void main(String[] args) 
	{
		System.out.println("Introduzaca el número para realizar su cubo"); //Para que muestre por pantalla, un (cout)
			
		Scanner teclado = new Scanner (System.in);
		double n1;
		n1= teclado.nextInt();
		//teclado.close();
				
			double n2;
			n2=(double) (n1*n1*n1);
			
		System.out.println("El cubo de su número es: "+ n2);
	}

}
