package p2;

import java.util.Scanner;

public class p5 
{

	public static void main(String[] args) 
	{
		System.out.println("Introduzaca el Precio del producto SIN IVA");
		
		Scanner teclado = new Scanner (System.in);
		double n1;
		n1= teclado.nextInt();
		//teclado.close();
		
		System.out.println("Introduzaca el porcentaje de IVA");
		
		Scanner teclado2 = new Scanner (System.in);
		double IVA;
		IVA= teclado.nextInt();
				
			double n2;
			n2=(double) (n1*IVA/100);
			double n3;
			n3=n1+n2;
			
		System.out.println("El precio sin IVA "+ n1 +" €");
		System.out.println("El IVA es un "+ IVA +" %");
		System.out.println("El incremento del IVA "+ n2+" €");
		System.out.println("El precio TOTAL "+ n3+" €");

	}

}
