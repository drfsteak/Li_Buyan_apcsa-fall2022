//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -


public class FirstLastVowel
{
   public static String go( String a )
	{
	    a= a.toLowerCase();
		char first = a.charAt(0);
		char last = a.charAt(a.length()-1);
		
		if(first == 'a' ||first == 'e' ||first == 'i' ||first == 'o' || first =='u') {
			return "yes";
		} else if (last == 'a' ||last == 'e' ||last == 'i' ||last == 'o' || last =='u') {
			return "yes";
		}
		return "no";
	}
}