//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*; 

class Rational implements Comparable<Rational>
{
	//add two instance variables
	private int num1, denom1;

	//write two constructors
	public Rational() {
		num1 = 0;
		denom1 = 0;
	}
	public Rational(int one, int two) {
		setRational(one,two);
	}

	//write a setRational method
	public void setRational(int one, int two) {
		setNumerator(one);
		setDenom(two);
	}

	//write  a set method for numerator and denominator
	public void setNumerator(int one) {
		num1 = one;
	}
	public void setDenom(int two) {
		denom1 = two;
	}
	
	public void add(Rational  other)
	{
		//num1/den1 + num2/den2 
		//new numerator = (num1 * den2 + num2 * den1)
		//new denominator = (den1 * den2)
		num1 = (num1*other.getDenom() + other.getNumer()*denom1);
		denom1 = (denom1*other.getDenom());
		


		reduce();
	}

	private void reduce()
	{
		int gcd = gcd(num1, denom1);
		num1 = num1/gcd;
		denom1 = denom1/gcd;

	}

	private int gcd(int numOne, int numTwo)
	{
		int divisor = 1;
		for(int i = 1; i<numOne; i++) {
			if(numOne%i ==0 && numTwo%i ==0) {
				divisor = i;
			}
		}

		return divisor;
	}

	public Object clone ()
	{
		return new Rational(num1,denom1);
	}


	//ACCESSORS

	//write get methods for numerator and denominator
	public int getDenom() {
		return denom1;
	}
	public int getNumer() {
		return num1;
	}
	
	
	public boolean equals( Rational obj)
	{
		
		obj.reduce();
		if(getNumer()==obj.getNumer() && getDenom() == obj.getDenom()) {
			return true;
		}
		return false;
	}

	public int compareTo(Rational other)
	{
		reduce();
		if(equals(other)) {
			return 0;
		}
		if((double)(num1/denom1)-(double)(other.getNumer()/other.getDenom())<0) {
			return -1;
		}

		return 1;
	}



	
	//write  toString() method
	public String toString() {
		return num1 + "/" + denom1;
	}
	
	
}