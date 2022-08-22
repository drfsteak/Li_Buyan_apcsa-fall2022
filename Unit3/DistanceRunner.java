//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner; 

import static java.lang.System.*;

public class DistanceRunner
{
	public static void main( String[] args )
	{
		//add test cases	
		Scanner keyboard = new Scanner(in);
		int x1, y1, x2, y2;
		System.out.print("Enter X1:: ");
		x1=keyboard.nextInt();
		System.out.print("Enter Y1:: ");
		y1=keyboard.nextInt();
		System.out.print("Enter X2:: ");
		y2=keyboard.nextInt();
		System.out.print("Enter X2:: ");
		x2=keyboard.nextInt();
		
		Distance test = new Distance(x1,y1,x2,y2);
		test.setCoordinates();
		test.calcDistance();
		test.print();
		
	}
}