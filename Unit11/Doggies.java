//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;

public class Doggies
{
	private Dog[] pups;
	

	public Doggies(int size)
	{
		//point pups at a new arry of Dog
		pups = new Dog[size];
	}
	
	public void set(int spot, int age, String name)
	{
		//put a new Dog in the array at spot 
		//make sure spot is in bounds
		pups[spot] = new Dog(age, name);
	}

	public String getNameOfOldest()
	{
		int j = 0;
		
		for (int i = 0; i<pups.length-1; i++) {
			if(pups[i+1].getAge()> pups[i].getAge()) {
				j = i+1;
			}
		}
		String dogold = pups[j].getName();
		return dogold;
	}

	public String getNameOfYoungest()
	{
		int j = 0;
		
		for (int i = 0; i<pups.length-1; i++) {
			if(pups[i+1].getAge()< pups[i].getAge()) {
				j = i+1;
			}
		}
		String dogold = pups[j].getName();
		return dogold;
	}

	public String toString()
	{
		return ""+Arrays.toString(pups);
	}
}