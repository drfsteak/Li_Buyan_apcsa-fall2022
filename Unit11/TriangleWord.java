//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class TriangleWord
{
	//instance variables and constructors could be present, but are not necessary
		
	public static void printTriangle(String word)
	{
		String output = "";
		for(int i = 0; i<word.length(); i++) {
			output+= "\n";
			for(int k = 0; k<=i; k++) {
				for(int j = 0; j<=i; j++) {				
					output+=word.charAt(j);
					
					
				}
			}
		}
		System.out.println(output);
	}
}