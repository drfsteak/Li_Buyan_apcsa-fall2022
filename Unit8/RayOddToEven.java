//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RayOddToEven
{
	public static int go(int[] ray)
	{
		int odd1 = -1;
		int even1=-1;
		for(int i = 0; i<ray.length; i++) {
			if(ray[i] % 2 == 1) {
				odd1 = i;
				break;
			} 
		}
		if(odd1 ==-1) {
			return -1;
		}
		for(int j = odd1; j<ray.length; j++) {
			if(ray[j] %2 ==0) {
				even1 = j;
				break;
			} 
		}
		if(even1 == -1) {
			return -1;
		}
		return even1-odd1;
	}
}