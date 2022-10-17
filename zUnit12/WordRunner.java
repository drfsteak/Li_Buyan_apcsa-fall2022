//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.File; 
import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;
import static java.lang.System.*;

public class WordRunner
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File("words.dat"));

		int size = file.nextInt();
		file.nextLine();
		
		Word[] sort = new Word[size];
		
		for(int i = 0; i<size; i++) {
			sort[i] = new Word(file.nextLine()); 
		}
		
		for (int i = 0; i<size-1; i++) {
			for(int j = 0; j<size-1; j++) {
				if(sort[j].compareTo(sort[j+1])>1) {
					Word temp = sort[j];
					sort[j] = sort[j+1];
					sort[j+1] = temp;
					
				}
			}
		}
		for(int k = 0; k<size; k++) {
			out.println(sort[k].toString());
		}










	}
}