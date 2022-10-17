//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*; 

public class Skeleton implements Monster
{
	//add instance variables	
	private String name;
	private int size;

	//add a constructor
	public Skeleton(String a, int b) {
		name = a;
		size = b;
	}
	//add code to implement the Monster interface

	@Override
	public int getHowBig() {
		// TODO Auto-generated method stub
		return size;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public boolean isBigger(Monster other) {
		// TODO Auto-generated method stub
		return size>other.getHowBig();
	}

	@Override
	public boolean isSmaller(Monster other) {
		// TODO Auto-generated method stub
		return size<other.getHowBig();
	}

	@Override
	public boolean namesTheSame(Monster other) {
		// TODO Auto-generated method stub
		return name.equals(other.getName());
	}

	//add a toString
	public String toString() {
		return "" + name + " " + size + "\n";
	}
}