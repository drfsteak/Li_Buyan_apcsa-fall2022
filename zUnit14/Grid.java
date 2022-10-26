//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class Grid
{
   private String[][] grid;

   //load vals into the rows x cols grid randomly
	public Grid(int rows, int cols, String[] vals)
	{
		grid = new String[rows][cols];
		for(int i = 0; i<rows; i++) {
			for(int j = 0; j<cols; j++) {
				grid[i][j] = vals[(int)(Math.random()*vals.length)];
			}
		}
	}

	//find out which of the vals occurs the most
	public String findMax(String[] vals)
	{
		int[]scount = new int[vals.length];
		for(int i = 0; i<vals.length; i++) {
			scount[i] = countVals(vals[i]);
		}
		int max = 0;
		for(int j = 0; j<scount.length; j++) {
			if(scount[j]>max) {
				max = scount[j];
			}
		}
		for(int i = 0; i< vals.length; i++) {
			if(countVals(vals[i]) == max) {
				return vals[i] + " occurs the most";
			}
		}
		return "";
	}

	//returns a count of how many times val occurs in the matrix
	private int countVals( String val )
	{
		int count = 0;
		for(String[] rows1:grid) {
			for(String s:rows1) {
				if (s.equals(val)) {
					count++;
				}
			}
		}
		return count;
	}

	//display the grid
	public String toString()
	{
		String output="";
		for(String[]row:grid) {
			for(String s:row) {
				output+=s + " ";
			}
			output+="\n";
		}
		return output;
	}
}