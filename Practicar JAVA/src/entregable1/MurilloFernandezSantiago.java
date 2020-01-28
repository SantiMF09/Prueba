package entregable1;

import java.util.Scanner;

public class MurilloFernandezSantiago 
{

	public static void main(String[] args) 
	{
		/*LOGIN*/
		int cont = 0;/*Contador*/
		int sol=0;
		
		do
		{
			/*USUARIO*/
			System.out.println("Introduzca su usuario:");
			
			Scanner teclado = new Scanner (System.in);
			String usuario;
			usuario= teclado.nextLine();
			
			/*PASS*/
			System.out.println("Introduzca su contraseña:");
			
			Scanner teclado2 = new Scanner (System.in);
			String pass;
			pass= teclado.nextLine();
			
			if(usuario.equals("Imhotep") && pass.equals("Saqqara")) /*Comprobamos si el usuario y contraseña son correctos*/
			{
				System.out.println("Para Salir pulse la letra: S");
				System.out.println("Para hacer el Checklist pulse la letra: L");				/*EL menu de selecion donde eligiremos que hacer*/
				System.out.println("Para hacer los cálculos pulse la letra: C");
				System.out.println("Para ver los planos de la piramide pulse la letra: P");
			
				Scanner teclado3 = new Scanner (System.in);
				String respuesta ;
				respuesta= teclado.nextLine();
				if(respuesta.equals("L") || respuesta.equals("l"));			/*Al teclear la l o l nos mostrará un */
				{
					System.out.println("¿Cuál es el centro del universo?");	/*Varia preguntas para responder*/
					String r1;
					r1= teclado.nextLine();
					if(r1.equals("Egipto"))
					{
						sol++;
						System.out.println("Correcto");
					}
					else 
					{
						System.out.println("Incorrecto");
					}
					
					System.out.println("¿Qué nombre le damos al cielo?");
					Scanner teclado7 = new Scanner (System.in);
					String r2;
					r2= teclado.nextLine();
					if(r2.equals("Nut"))
					{
						sol++;
						System.out.println("Correcto");
					}
					else 
					{
						System.out.println("Incorrecto");
					}
					
					System.out.println("¿Y al más allá?");
					Scanner teclado8 = new Scanner (System.in);
					String r3;
					r3= teclado.nextLine();
					if(r3.equals("Duat"))
					{
						sol++;
						System.out.println("Correcto");
					}
					else 
					{
						System.out.println("Incorrecto");
					}
					
					System.out.println("¿Nombre del padre del Rey Dyeser?");
					
					String r4;
					r4= teclado.nextLine();
					if(r4.equals("Sanajt"))
					{
						sol++;
						System.out.println("Correcto");
					}
					else 
					{
						System.out.println("Incorrecto");
					}
					
					System.out.println("¿Sobrenombre del Rey?");
					Scanner teclado10 = new Scanner (System.in);
					String r5;
					r5= teclado.nextLine();
					if(r4.equals("Necherjet"))
					{
						sol++;
						System.out.println("Correcto");
					}
					else 
					{
						System.out.println("Incorrecto");
					}
					
				}
				
			
				if(respuesta.equals("S") || respuesta.equals("s"));
				{
					System.out.println("Buen día");							/*Al teclear la S o s nos mostrará un mensaje de buenos dias y acabaráel programa*/
					System.exit(0);
				}
				
				
				
				
				if(respuesta.equals("C") || respuesta.equals("c"));
				{
					System.out.println("Usted ha elegido la opción de cálculos");
					System.out.println("Por favor, introduzaca los siguientes números:");
				
					System.out.println("La altura de la pirámide: h");							/*Al pulsara C o c*/
					Scanner teclado4 = new Scanner (System.in);									/*Hacemos el calculo matemático pidiendo las dos variable*/
					int altura;																	/*y usamos Math.sqrt para la raiz cuadrad*/
					altura= teclado.nextInt();
				
					System.out.println("La apotema de la base de la pirámide: apb");
					Scanner teclado5 = new Scanner (System.in);
					int base;
					base= teclado.nextInt();
				
					System.out.println("-------------------------------------------");
				
					float apotema = (float) Math.sqrt(altura*altura+base*base);
					System.out.println("El área de la piramide es: "+apotema+" m");
				
				}
				if(respuesta.equals("P") || respuesta.equals("p"));
				{
					System.out.println("Introduzca la alutura de la piramide");
					Scanner teclado11 = new Scanner (System.in);
					int h;
					h= teclado.nextInt();														/*Al pulsar P o p nos pide una altua y nos mostrara 3 piramides*/
					
					for(int i=0; i<h; i++)
					{
		                System.out.print("*");
		            }
		            System.out.println("");
				}
			}
			
			else
			{
				cont++;
			}
		}
		while(cont<=3); 
		{
			System.out.println("Lo siento ha falldo demasiadas veces");
			System.exit(0);
		}
		
			
	}
}
