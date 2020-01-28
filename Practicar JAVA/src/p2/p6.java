package p2;

import java.util.Scanner;

public class p6 
{
	public static void main(String[] args) 
	{
		System.out.println("Escriba el numero de horas trabajados en la semana"); //Para que muestre por pantalla, un (cout)
			
		Scanner teclado = new Scanner (System.in);
		double n1;
		n1= teclado.nextInt();
		//teclado.close();
				
			double n2;
			n2=(double) (n1*12);
			
		System.out.println("El dinero total ganado al cabo de la semana es de "+ n2 +"€");
		
	}

}
