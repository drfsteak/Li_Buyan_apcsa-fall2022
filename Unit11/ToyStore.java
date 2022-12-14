//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class ToyStore
{
	private ArrayList<Toy> toyList;

	public ToyStore()
	{
		toyList= new ArrayList<Toy>();
	}

	public void loadToys( String toys )
	{
		for( String name: toys.split( " " )) {
			Toy t = getThatToy(name);
			if(t==null) {
				toyList.add(new Toy(name));
			}
			else
				t.setCount(t.getCount()+1);
		}
	}
  
  	public Toy getThatToy( String nm )
  	{
  		for(Toy t: toyList) {
  			if(t.getName().equals(nm)) {
  				return t;
  			}
  		}
  		return null;
  	}
  
  	public String getMostFrequentToy()
  	{
  		String name = "";
  		int max = Integer.MIN_VALUE;
  		for(Toy t: toyList) {
  			if(t.getCount()>max) {
  				max = t.getCount();
  				name = t.getName();
  			}
  		}
  		return name;
  	}  
  
  	public void sortToysByCount()
  	{
  		
  		for(int i =0; i<toyList.size(); i++ ) {
  			for(int j = 0; j<toyList.size()-i-1; j++) {
  				if(toyList.get(j).getCount()>toyList.get(j+1).getCount()) {
  					Toy temp = toyList.get(j);
  					toyList.set(j, toyList.get(j+1));
  					toyList.set(j+1, temp);
  				}
  			}
  		}
  	}  
  	  
	public String toString()
	{
	   return "" + toyList;
	}
}