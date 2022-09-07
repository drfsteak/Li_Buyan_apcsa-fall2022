//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class TriangleFive
{
   private char letter;
   private int amount;

	public TriangleFive()
	{
	}

	public TriangleFive(char c, int amt)
	{
		setLetter('0');
		setAmount(0);
	}

	public void setLetter(char c)
	{
		letter = c;
	}

	public void setAmount(int amt)
	{
		amount = amt;
	}

	public String toString()
	{
		
		String output="";
		char setChar = '0';
		for(int i = 1; i<=amount; i++)
		{
			setChar = letter;
			
			for(int j = amount; j>=i; j--)
			{
				
				for(int k = j; k>=1; k--)
				{
					
					output+=setChar;
				}
				output += " ";
				
				if(setChar >= 90) {
					setChar = 65;
				}else {
					setChar++;
				}
					
				
			}
			output += "\n";
		}
		return output;
	}
}