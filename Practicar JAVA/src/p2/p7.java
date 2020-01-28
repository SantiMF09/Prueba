package p2;

import java.util.Scanner;

public class p7 
{

	public static void main(String[] args) 
	{
		System.out.println("Si quiere pasar de Mb a Kb pulse 1 ");
		System.out.println("Si quiere pasar de Kb a Mb pulse 2 ");
		
		Scanner teclado = new Scanner (System.in);
		int s1;
		s1= teclado.nextInt();
		
		if(s1==1)
		{
			System.out.println("Escriba los Mb a convertir ");
			
			Scanner teclado2 = new Scanner (System.in);
			double Mb;
			Mb= teclado.nextInt();
			//teclado.close();
		
				double Kb;
				Kb=(double) (Mb*1024);
				
			System.out.println("Los Kb son: "+ Kb +"Kb");
		}
		else
		{
			System.out.println("Escriba los Kb a convertir ");
			
			Scanner teclado3 = new Scanner (System.in);
			double Kb;
			Kb= teclado.nextInt();
			//teclado.close();
				
				double Mb;
				Mb=(double) (Kb/1024);
				System.out.println("Los Mb son: "+ Mb +"Mb");
		}

	}
}

