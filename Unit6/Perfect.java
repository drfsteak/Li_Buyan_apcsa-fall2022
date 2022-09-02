//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class Perfect
{
   private int number;

	//add constructors
   public Perfect() {
	   
   }
   public Perfect(int num) {
	   
	   setStuff(num);
   }

	//add a set method
   
   public void setStuff(int num) {
	   number = num;
   }

	public boolean isPerfect()
	{
		int count = 0;
		for(int i =1; i<number; i++) {
			if(number % i ==0) {
				count += i;
			}
			
		}
		if(number == count) {
			return true;
		}
		return false;
	}

	//add a toString	
	public String toString() {
		if(!isPerfect()) {
			return number + " is not perfect";
		}
		return number + " is perfect";
	}
}