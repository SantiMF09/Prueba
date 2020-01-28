package p2;

import java.util.Scanner;
public class p8 {

public static void main(String[] args) {

Scanner teclado = new Scanner (System.in);
Scanner teclado1 = new Scanner (System.in);
Scanner teclado2 = new Scanner (System.in);

int preciobase,calculoiva=0,calculopromo=0;
String iva,promocion = null;



System.out.print("Introduzca el precio base-> ");
preciobase = teclado.nextInt();
System.out.print("Introduzca el tipo de IVA que se le va a aplicar, existen el general, reducido y superreducido. Escriba cual es el suyo-> ");
iva = teclado1.nextLine();

if(iva.equalsIgnoreCase("general")) {

calculoiva = (int) (preciobase*0.21);
System.out.println("El iva aplicado es-> "+ calculoiva);
calculoiva=calculoiva+preciobase;
System.out.println("Su precio con IVA es-> "+calculoiva);
System.out.print("Introduzca ahora su codigo promocional (nopro, mitad, meno5, 5porc) : ");
promocion = teclado2.nextLine();

}

else if(iva.equalsIgnoreCase("reducido")) {

calculoiva = (int) (preciobase*0.10);
System.out.println("El iva aplicado es-> "+ calculoiva);
calculoiva=calculoiva+preciobase;
System.out.println("Su precio con IVA es-> "+calculoiva);
System.out.print("Introduzca ahora su codigo promocional (nopro, mitad, meno5, 5porc) : ");
promocion = teclado2.nextLine();

}

else if(iva.equalsIgnoreCase("superreducido")) {

calculoiva = (int) (preciobase*0.4);
System.out.println("El iva aplicado es-> "+ calculoiva);
calculoiva=calculoiva+preciobase;
System.out.println("Su precio con IVA es-> "+calculoiva);
System.out.print("Introduzca ahora su codigo promocional (nopro, mitad, meno5, 5porc) : ");
promocion = teclado2.nextLine();

}

if(promocion.equalsIgnoreCase("nopro")) {

System.out.println("No se aplica promo su total es: "+calculoiva);

}

if(promocion.equalsIgnoreCase("mitad")) {

calculopromo=calculoiva/2;
System.out.println("Su precio total con el descuento aplicado es de: "+calculopromo+ " Euros");

}

if(promocion.equalsIgnoreCase("meno5")) {

calculopromo=calculoiva-5;
System.out.println("Su precio total con el descuento aplicado es de: "+calculopromo+ " Euros");

}

if(promocion.equalsIgnoreCase("5porc")) {

calculopromo = (int) ((calculoiva*0.5)/100);
System.out.println("Su precio total con el descuento aplicado es de: "+calculopromo+ " Euros");

}

}
}