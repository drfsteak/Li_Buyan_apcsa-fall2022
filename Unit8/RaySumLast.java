import java.lang.reflect.Array;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RaySumLast
{
	public static int go(int[] ray)
	{
		int count = -1;
		for(int i = 0; i<ray.length; i++) {
			if(ray[i]>ray[ray.length-1]) {
				count += ray[i];
			}
				
		}
		if(count == -1) {
			return count;
		}
		return count+1;
	}
}