//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.ArrayList;
import java.util.List;

public class ListOddToEven
{
	public static int go( List<Integer> ray )
	{
		int odd1 = -1;
		int even1 = -1;
		for(int i = 0; i<ray.size(); i++) {
			if(ray.get(i) % 2 ==1) {
				odd1 = i;
				break;
			}
		} if(odd1 ==-1) {
			return -1;
		}
		for(int j = odd1; j<ray.size(); j++) {
			if(ray.get(j) % 2 == 0) {
				even1 = j;
			}
		}if(even1 == -1) {
			return -1;
		}
		return even1 - odd1;
	}
}