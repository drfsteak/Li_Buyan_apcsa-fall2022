//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import static java.lang.System.*;

public class Triples
{
   private int number;

	public Triples()
	{
		this(0);
	}

	public Triples(int num)
	{
		
		setNum(num);
	}

	public void setNum(int num)
	{

		number = num;
	}
	
	private boolean greatestCommonFactor(int a, int b, int c)
	{
		int max = 0;
		for(int i = 1; i<=a || i<=b || i<=c; i++) {
			if(a%i==0 && b%i == 0 && c%i ==0) {
				max = i;
			}
		}


		return max == 1;
	}

	public String toString()
	{
		String output="";

		for(int a =1; a<=number; a++) {
			for(int b = a+1; b<=number; b++) {
				for(int c = b+1; c<=number; c++) {
					if(Math.pow(a, 2)+Math.pow(b, 2)==Math.pow(c, 2) && greatestCommonFactor(a,b,c)) {
						output+= a + " " + b + " " + c + "\n";;
					}
				}
			}
		}




		return output+ "\n";
	}
}