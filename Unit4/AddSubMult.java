//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*; 
import java.util.Scanner;

public class AddSubMult
{
	public static double check( double a, double b )
	{
		if(a>b) {
			return Math.round((a-b)*100)/100.0;
		} else if (b>a) {
			return b-a;
		} else if (a == b) {
			return a*b;
		}
		return 0;
		
		
	}
}
