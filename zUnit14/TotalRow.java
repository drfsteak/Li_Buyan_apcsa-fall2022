//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.*;

public class TotalRow
{
    public static List<Integer> getRowTotals( int[][] m )
    {
    	//add code here
		List<Integer> rows= new ArrayList<Integer>();
		for(int[]row :m ) {
			int count = 0;
			for(int num: row) {
				count+=num;
			}
			rows.add(count);
		}
		return rows;
    }
}
