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
        
            System.out.print("Introduce un n�mero entero: ");
            n = sc.nextInt();
            cifras= 0;    			
            while(n!=0);
            {            
                    n = n/10;         
                   cifras++;          
            }
            System.out.println("El n�mero tiene " + cifras+ " cifras");
       
    }
}