package Programs;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) 
	{
		System.out.println("Swapping 2 Integers without using temp/3rd variable");
		int x,y;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter  x and y values");
		x=in.nextInt();
		y=in.nextInt();
		System.out.println("Before Swap: "+ "x: " + x + " y: "+y);
		x=x+y;
		y=x-y;   
		x=x-y;
		System.out.println("After Swap: "+ "x: " + x + " y: "+y);
		
	}

}
