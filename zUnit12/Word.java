//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class Word implements Comparable<Word>
{
	private String word;

	public Word( String s )
	{
		word = s;
	}

	public int compareTo( Word rhs )
	{		
		if(rhs.word.length() == word.length()) {
			return word.compareTo(rhs.word);
		}
		return word.length()-rhs.word.length();
	}
	

	public String toString()
	{
		return word;
	}
}