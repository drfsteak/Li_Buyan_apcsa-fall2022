//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberShifter
{
	public static int[] makeLucky7Array( int size)
	{
		int[]nums = new int[size];
		for(int i = 0; i<size; i++) {
			nums[i] = (int)(Math.random()*11);
		}
		return nums;
	}
	public static int[] shiftEm(int[] array)
	{
		
		int count = 0;
		for(int i = 0; i<array.length; i++) {
			if(array[i]==7) {
				int temp = array[i];
				array[i] = array[count];
				array[count] = temp;
				count++;
				
			}
		}
		return array;
	}
}