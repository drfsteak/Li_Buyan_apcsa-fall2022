//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.*;
import java.io.*; 

public class WordSearch
{
    private String[][] m;

    public WordSearch( int size, String str )
    {
    	int count = 0;
    	m = new String[size][size];
    	
    	for(int i = 0; i<size; i++) {
    		for(int j = 0; j<size; j++) {
    			m[i][j] = str.substring(count, count+1);
    			count++;
    		}
    	}
    	
    }

    public boolean isFound( String word )
    {
    	for(int i = 0; i<m.length; i++) {
    		for(int j = 0; j<m[i].length; j++) {
    			if(checkRight(word,i,j)|| checkLeft(word,i,j)||checkUp(word,i,j)||checkDown(word,i,j)) {
    				return true;
    				
    			}
    		}
    	}
    	return false;
    }

	public boolean checkRight(String w, int r, int c)
   {
		
		for(int i = c; i<c+w.length(); i++) {
			if(i>m.length-1) {
				return false;
			}
			if(!(w.substring(i-c,i-c+1).equals(m[r][i]))) {
				return false;
			}
		
		}
		return true;
	}

	public boolean checkLeft(String w, int r, int c)
	{
		
		for(int i = c; i>=c-w.length(); i--) {
			if(i<0) {
				return false;
			}
			if(!(m[r][i].equals(w.substring(c-i,c-i+1)))) {
				return false;
			}
		}
		return true;
	}

	public boolean checkUp(String w, int r, int c)
	{
		
		for(int i = r; i>=r-w.length(); i--) {
			if(i<0) {
				return false;
			}
			if(!(m[i][c].equals(w.substring(r-i, r-i+1)))){
				return false;
			}
		}
		return true;
	}

	public boolean checkDown(String w, int r, int c)
   {
		
		for(int i = r; i<r+w.length(); i++) {
			if(i>w.length()-1) {
				return true;
			}
			if(!(m[i][c].equals(w.substring(i-r,i-r+1)))) {
				return false;
			}
		}
	   return true;
	}

	public boolean checkDiagUpRight(String w, int r, int c)
	{
		return false;
	}

	public boolean checkDiagUpLeft(String w, int r, int c)
	{
		return false;
	}

	public boolean checkDiagDownLeft(String w, int r, int c)
   {
		return false;
	}

	public boolean checkDiagDownRight(String w, int r, int c)
	{
		return false;
	}

    public String toString()
    {
 		String output = "";
 		for(int i = 0; i<m.length; i++) {
 			for(int j = 0; j<m[i].length; j++) {
 				output+=m[i][j] + " ";
 			}
 			output+="\n";
 		}
 		return output;
    }
}
