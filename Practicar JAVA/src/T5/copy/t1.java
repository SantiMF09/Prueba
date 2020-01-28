package T5.copy;
import java.util.*;
import java.io.*;
public class t1 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
        int n, cifras;
        char car;
        
            System.out.print("Introduce un número entero: ");
            n = sc.nextInt();
            cifras= 0;    			
            while(n!=0);
            {            
                    n = n/10;         
                   cifras++;          
            }
            System.out.println("El número tiene " + cifras+ " cifras");
       
    }
}