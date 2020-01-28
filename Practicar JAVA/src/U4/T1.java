package U4;

import java.util.Random;

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
	}

}
