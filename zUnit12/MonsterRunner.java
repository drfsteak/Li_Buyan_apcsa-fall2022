//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class MonsterRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
	
		//ask for name and size
		out.print("What is first monster name :: ");
		String name = keyboard.next();
		out.print("What is first monster size :: ");
		int size = keyboard.nextInt();
		//instantiate monster one
		Skeleton test = new Skeleton(name,size);
		out.println("Monster1 - " + test);
		//ask for name and size
		out.print("What is second monster name :: ");
		String name1 = keyboard.next();
		out.print("What is second monster size :: ");
		int size1 = keyboard.nextInt();
		//instantiate monster two
		Skeleton test2 = new Skeleton(name1, size1);
		out.println("Monster2 - " + test2);
		
		if(test.isBigger(test2)) {
			out.println("Monster 1 is bigger than Monster 2");
		}else if(test.isSmaller(test2)){
			out.println("Monster 2 is bigger than Monster 1");
		}else {
			out.println("They are the same size");
		}
		
		if(test.namesTheSame(test2)) {
			out.println("Monster 1 has the same name as Monster 2");
		}else {
			out.println("Monster 1 does not have the same name as Monster 2");
		}
		
	}	
}