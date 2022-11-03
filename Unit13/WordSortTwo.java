//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;

public class WordSortTwo
{
	private String[] wordRay;

	public WordSortTwo(String sentence)
	{
		wordRay = sentence.split(" ");
//		int count = 0;
//		for(String word:sentence.split(" ")) {
//			count++;
//		}
//		wordRay = new String[count];
//		int i = 0;
//		for(String word:sentence.split(" ")) {
//			wordRay[i] = word;
//			i++;
//		}
	}

	public void sort()
	{
		for(int i = 0; i<wordRay.length-1; i++) {
			for(int j = 0; j<wordRay.length-1-i; j++) {
				if(wordRay[j].charAt(0)>(wordRay[j+1]).charAt(0)) {
					String temp = wordRay[j];
					wordRay[j] = wordRay[j+1];
					wordRay[j+1] = temp;
				}
			}
		}
	}

	public String toString()
	{
		String output="";
		for(String word: wordRay) {
			output+=word;
			output+="\n";
		}
		return output+"\n\n";
	}
}