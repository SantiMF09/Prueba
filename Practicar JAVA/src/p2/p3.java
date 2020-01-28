package p2;

import java.util.Scanner;

public class p3 
{
	public static void main(String[] args) 
	{
		System.out.println("Introduzaca el primer numero para las operaciones"); //Para que muestre por pantalla, un (cout)
			
		Scanner teclado = new Scanner (System.in);
		double n1;
		n1= teclado.nextInt();
		//teclado.close();
		
		System.out.println("Introduzaca el segundo numero para las operaciones"); //Para que muestre por pantalla, un (cout)
		
		Scanner teclado2 = new Scanner (System.in);
		double n2;
		n2= teclado.nextInt();
			
			double mul;
			mul=(double) (n1*n2);
			
			double sum;
			sum=(double) (n1+n2);
			
			double res;
			res=(double) (n1-n2);
			
			double div;
			div=(double) (n1/n2);
			
			
		System.out.println("El resustado de la multiplicaión es\t "+ mul);
		System.out.println("El resustado de la suma es\t\t "+ sum);
		System.out.println("El resustado de la resta es\t\t "+ res);
		System.out.println("El resustado de la división es\t\t "+ div);
		
	}
	

}
