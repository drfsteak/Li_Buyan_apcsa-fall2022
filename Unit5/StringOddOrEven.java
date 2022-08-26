//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date - 
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class StringOddOrEven
{
	private String word;
	private int length;

	public StringOddOrEven()
	{
		
	}

	public StringOddOrEven(String s)
	{
		setString(s);
	}

	public void setString(String s)
	{
		word = s;
		length = word.length();
	}

 	public boolean isEven()
 	{
		return length % 2 ==0;
	}

 	public String toString()
 	{
 		if(!isEven()) {
 			return word + " is odd";
 		}
 		return word + " is even";
	
	}
}