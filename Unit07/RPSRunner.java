//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import static java.lang.System.*;

public class RPSRunner
{
	public static void main(String args[])
	{
		Scanner keyboard = new Scanner(System.in);
		char response;
		
		//add in a do while loop after you get the basics up and running
		do {
			String player = "";
		
			out.print("type in your prompt [R,P,S] :: ");
			
			//read in the player value
		
			RockPaperScissors game = new RockPaperScissors(player);		
			
			player = keyboard.next();
			out.println(game);
			out.println("Do you want to play again? [y, n]");
			
		  } while (keyboard.next().equals("y"));
	}
}



