package U4;

import java.util.Random;
import java.util.Scanner;

public class T1 
{
	public static void main(String[] args) 
	{
		Random ran = new Random();
				
		int a,b,c;

		a = ran.nextInt(90-65+1)+65;
		b = ran.nextInt(90-65+1)+65;
		c = ran.nextInt(90-65+1)+65;

		System.out.println("a= " +a+ " b= " +b+ " c= " +c);
		
		System.out.println("Introduzaca la cantidad de números a introducir: ");
		Scanner teclado = new Scanner (System.in);
		int n0;
		n0= teclado.nextInt();
		
		System.out.println("-----------------------");
		
		System.out.println("Introduzaca el número");
		Scanner teclado1 = new Scanner (System.in);
		int n1;
		n1= teclado.nextInt();
	}

}
