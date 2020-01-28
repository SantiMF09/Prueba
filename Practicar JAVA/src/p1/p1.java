package p1;

import java.util.Scanner;

public class p1 {
	public static void main (String[] args) {
		
	
		System.out.println("Hola, ¿Cómo te llamas?"); //Para que muestre por pantalla, un (cout)
		
		Scanner teclado = new Scanner (System.in);
		String nombre;
		nombre= teclado.nextLine();
		//teclado.close();
		
		System.out.println("Cual es tu calle?"); //Para que muestre por pantalla, un (cout)
		
		Scanner teclado2 = new Scanner (System.in);
		String calle;
		calle= teclado2.nextLine();
		//teclado.close();
		
		System.out.println("Cual es tu numero de telefono?");
		
		Scanner teclado3 = new Scanner (System.in);
		int numero;										//Para que meter datos, un (cin)
		numero= teclado3.nextInt();
		//teclado.close();
		
		System.out.println("Hola " + nombre );
		System.out.println("Vives en la calle " + calle );
		System.out.println("Tu telefono es: " + numero );
		
	}
}
