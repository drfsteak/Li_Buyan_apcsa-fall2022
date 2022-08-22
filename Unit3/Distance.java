//(c) A+ Computer Science 
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner; 

import static java.lang.System.*;
import static java.lang.Math.*;

public class Distance
{
	private int xOne,yOne,xTwo,yTwo;
	private double distance;
	private double x, y;

	public Distance()
	{
	}

	public Distance(int x1, int y1, int x2, int y2)
	{
		xOne = x1;
		yOne = y1;
		xTwo = x2;
		yTwo = y2;
	}

	public void setCoordinates()
	{
		x = Math.pow(xTwo-xOne, 2);
		y = Math.pow(yTwo-yOne, 2);
		
		
	}

	public void calcDistance()
	{
		
		distance = Math.sqrt(x+y);
	}
	
	public double getDistance()
	{
		return distance;
	}
	
	public void print()
	{
		System.out.print("The distance is == ");
		System.out.printf("%.3f\n", distance);
	}
	
	//complete print or the toString

	public String toString()
	{
		return "";
	}
}