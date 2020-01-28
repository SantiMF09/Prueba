package p2;

import java.util.Scanner;

public class p1 {

	public static void main(String[] args) {
		System.out.println("Introduzaca el valor en euros para convertirlo a pesetas"); //Para que muestre por pantalla, un (cout)
		
		Scanner teclado = new Scanner (System.in);
		double n1;
		n1= teclado.nextInt();
		//teclado.close();
			
			double n2;
			n2=(double) (n1*166.386);
		
		System.out.println("La conversión de euros a pesetas deja un total de "+ n2 +" pesetas");
	}
}