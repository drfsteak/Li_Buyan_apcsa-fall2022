//(c) A+ Computer Science
//www.apluscompsci.com
//Name

import static java.lang.System.*;

public class Word
{
	private String word, char1;
	private char first, last;
	private int length;

	public Word()
	{
	}

	public Word(String s)
	{
		setString("");
		first = 0;
		last = 0;
		length = 0;
		char1 = "";
		
	}

	public void setString(String s)
	{
		word = s;
		first = word.charAt(0);
		length = word.length();
		last = word.charAt(length-1);
		
	}

	public char getFirstChar()
	{
	
		return first;
	}

	public char getLastChar()
	{
		
		return last;
	}

	public String getBackWards()
	{
		
		for (int i = (length-1); i>=0; i--) {
			char1 = char1 + word.charAt(i);	
		}
		return char1;
		
	}

 	public String toString()
 	{
 		return  first + "\n" + last + "\n" + word + "\n" + getBackWards();
	}
}